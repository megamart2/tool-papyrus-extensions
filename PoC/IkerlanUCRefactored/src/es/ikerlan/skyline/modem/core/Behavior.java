package es.ikerlan.skyline.modem.core;
import java.util.Date;
import java.util.Timer;
import java.util.Vector;

import org.json.me.JSONArray;
import org.json.me.JSONException;
import org.json.me.JSONObject;

import es.ikerlan.skyline.communications.AtManager;
import es.ikerlan.skyline.communications.RadioSignalStrength;
import es.ikerlan.skyline.communications.http.HTTPManager;
import es.ikerlan.skyline.communications.mqtt.MqttManager;
import es.ikerlan.skyline.communications.network.NetworkManager;
import es.ikerlan.skyline.communications.tsl.HighLevelAPI;
import es.ikerlan.skyline.communications.tsl.linklayer.LinkLayer;
import es.ikerlan.skyline.communications.tsl.parameter.Parameter;
import es.ikerlan.skyline.message.BufferDescription;
import es.ikerlan.skyline.message.ErrorWarningEvent;
import es.ikerlan.skyline.message.MessageCodes;
import es.ikerlan.skyline.message.MessageCreator;
import es.ikerlan.skyline.message.MessageManager;
import es.ikerlan.skyline.message.MessageType;
import es.ikerlan.skyline.message.ParameterUpdate;
import es.ikerlan.skyline.message.TidyUpMessage;
import es.ikerlan.skyline.modem.ConfigJad;
import es.ikerlan.skyline.modem.Statistics;
import es.ikerlan.skyline.modem.filesystem.FileReadResult;
import es.ikerlan.skyline.modem.filesystem.FileSystemCache;
import es.ikerlan.skyline.modem.filesystem.FileSystemManager;
import es.ikerlan.skyline.modem.otap.Fota;
import es.ikerlan.skyline.modem.otap.MachineFwUpdate;
import es.ikerlan.skyline.modem.otap.OtapManager;
import es.ikerlan.skyline.modem.security.CertificateManager;
import es.ikerlan.skyline.modem.security.Certificates;
import es.ikerlan.skyline.modem.security.Cryptography;
import es.ikerlan.skyline.modem.timer.Timers;
import es.ikerlan.skyline.modem.timer.Timers.timerTimeoutEOACK;
import es.ikerlan.skyline.utils.ArraysUtils;
import es.ikerlan.skyline.utils.LedUtils;
import es.ikerlan.skyline.utils.NetworkUtils;
import es.ikerlan.skyline.utils.PrintUtils;
import es.ikerlan.skyline.utils.ResultACK;
import es.ikerlan.skyline.utils.StringUtils;
import es.ikerlan.skyline.utils.SystemUtils;

public class Behavior {

	/* Shared instances */
	public static MqttManager mqttManager = null;

	/* General Constant values */
	public static final int WATCHDOG_TIMEOUT = 120;
	public static final int WATCHDOG_INTERVAL = 30;
	static final long WAIT_SEND_TELEMETRY = 120;
	static final int MINIMUM_BACKEND_RESPONSE_TIME = 300;
	static final int MAX_TIME_WITHOUT_TLM = 86400;
	static final int CONNECTIVITY_TIMEOUT = 120;
	static final int TEMPERATURE_POLLING = 60;
	static final int PROTOCOL_VERSION = 2;
	public static final long MIN_TIME_SMS_POLLING = 250;
	static final int MAX_DOWNLOAD_ATTEMPTS = 3;

	/* Synchronized variables */
	public static ResultACK receivedConnectivityAck = new ResultACK(-1);
	public static ResultACK receivedOnboardingAck = new ResultACK(-1);
	public static ResultACK receivedEOAck = new ResultACK(-1);	
	public static ResultACK startPolling = new ResultACK(-1);
	public static ResultACK receivedFotaAck = new ResultACK(-1);

	/* Global */
	static int polling_cycles = 0;
	public static long lastTelemetryTimestamp = 0;

	/* Variables shared among states */
	static boolean moreTelemetry = false;

	/* Flags */
	static boolean urgentDetected = false;
	static boolean noWaitforReboot = false;

	/* Fota */
	public static Fota fotaRequest = new Fota();
	public static Fota fotaResponse = new Fota();

	/****************** INITIALIZATION ******************/

	public static int stateMachine_InitialSettings() {

		PrintUtils.step("InitialSettings");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int initialSettingsOk = -1;

		// Autostart delay
		PrintUtils.info("Autostart delay (5s)");
		SystemUtils.sleepThread(5000);
		
		// Clean memory
		PrintUtils.step("Clean Modem Flash");
		FileSystemManager.cleanMemory();

		// Activate Serial Port
		PrintUtils.step("Activate Serial Port");
		SystemUtils.activateSerialPort();

		// Create and load event profile table
		PrintUtils.step("Load File System Information");
		// Create and load event profile table
		Modem.loadEventProfileTable();
		// Create and load configuration table
		Modem.loadConfigTable();		
		// Create and load version table
		Modem.loadVersionTable();

		PrintUtils.step("CONFIG TABLE INFORMATION");
		PrintUtils.info("Sending Mode: " + FileSystemCache.getConfigValue(FileSystemCache.getSendingModeName()));
		PrintUtils.info("Polling Time (Active): " + FileSystemCache.getConfigValue(FileSystemCache.getPollingIntervalActiveName()));
		PrintUtils.info("Polling Time (Sleep): " + FileSystemCache.getConfigValue(FileSystemCache.getPollingIntervalSleepName()));
		PrintUtils.info("Polling Time (Deep Sleep): " + FileSystemCache.getConfigValue(FileSystemCache.getPollingIntervalDeepName()));
		PrintUtils.info("After Onboarding Period: " + FileSystemCache.getConfigValue(FileSystemCache.getAfterOnboardingPeriodName()));
		PrintUtils.info("APN: " + FileSystemCache.getConfigValue(FileSystemCache.getApnName()));
		PrintUtils.info("Max Events: " + FileSystemCache.getConfigValue(FileSystemCache.getMaxEventsName()));
		PrintUtils.info("Safe Reboot Interval: " + FileSystemCache.getConfigValue(FileSystemCache.getSafeRebootName()));
		PrintUtils.info("Send Raw Data: " + FileSystemCache.getConfigValue(FileSystemCache.getSendRawDataName()));

		// Install default certificates
		if (!Modem.onboardingDone()) {
			PrintUtils.step("Install Certificate Authorities");
			CertificateManager.enableCertificateValidation();
			if (CertificateManager.install("BaltimoreCyberTrustRoot", Certificates.baltimoreCert) == -1) {
				PrintUtils.error("Error installing BaltimoreCyberTrustRoot certificate");
				return -2;
			}				
			if (CertificateManager.install("Starfield-Class2-Certification-Authority", Certificates.starfieldCert) == -1) {
				PrintUtils.error("Error installing Starfield-Class2-Certification-Authority certificate");
				return -2;
			}
		}

		// Initialize LED
		PrintUtils.step("Activate LED");
		LedUtils.initLed();
		
		// Initial modem settings
		PrintUtils.step("Modem Information");
		ModemCache.setProtocol(PROTOCOL_VERSION);
		ModemCache.setGwmod(SystemUtils.getGWMOD());
		ModemCache.setGwv(SystemUtils.getGWV());
		ModemCache.setGwsv(SystemUtils.getGWSV());
		ModemCache.setIccid(NetworkUtils.getIccid());
		ModemCache.setImei(NetworkUtils.getImei());

		// Send Connectivity KPIs to machine
		if (Modem.onboardingDone()) {
			PrintUtils.step("Send Connectivity Information");
			Modem.sendKpis("-");
		}
		
		// Enable URCs
		AtManager.addListener();

		// Network registration
		PrintUtils.step("Network Registration");
		NetworkUtils.enableSor();
		
		int nConAttempts = NetworkUtils.register();
		
		if (nConAttempts >= NetworkManager.MAX_CON_ATTEMPTS) {
			ErrorWarningEvent.storeError(NetworkManager.MAX_CON_ATTEMPTS, ErrorWarningEvent.ERROR_GPRS_REGIS);
			return -2;
		}
		else if (nConAttempts > 0) {
			ErrorWarningEvent.storeWarning(nConAttempts,ErrorWarningEvent.ERROR_GPRS_REGIS);
		}
		
		NetworkUtils.enableRegNotifications();

		// Configure network
		NetworkManager.configureNetwork(FileSystemCache.getConfigValue(FileSystemCache.getApnName()), ConfigJad.getUser(), ConfigJad.getPwd(), NetworkManager.NETWORK_TIMEOUT);

		// Update Connectivity KPIs to machine
		if (Modem.onboardingDone()) {
			PrintUtils.step("Update Signal Strength");
			Modem.sendKpis("-");
		}

		// SMS Configuration
		PrintUtils.step("Configure SMS");
		AtManager.enableSms();
		PrintUtils.info("SMS configured");

		// Configure Remote OTAP
		PrintUtils.step("Configure remote OTAP");
		OtapManager smsOtapManager = new OtapManager(Cryptography.generateRandom(32), "", "", "", "", "");
		smsOtapManager.configureSmsOtap();

		// Time Synchronization (NTP Deactivates the watchdog)
		int sendingMode = Integer.parseInt(FileSystemCache.getConfigValue(FileSystemCache.getSendingModeName()));
		if (Modem.onboardingDone()) {
			PrintUtils.step("NTP Time Request");
			
			boolean forceMachineTime = false;
			if (sendingMode == Modem.SENDING_MODE_SMS)
				forceMachineTime = true;
			Modem.timeSynchronization(forceMachineTime);
		}
		
		// Default machine settings
		MachineCache.setChasisSerialNumber(ModemCache.getImei() + "-c");
		MachineCache.setModuleOneSerial(ModemCache.getImei() + "-m1");
		MachineCache.setModuleTwoSerial(ModemCache.getImei() + "-m2");
		MachineCache.setPrid(MachineCache.PRID_MACHINE_1);
		MachineCache.resetJsonFields();

		// Parameter Update list
		ParameterUpdate.fillParameterUpdateList();

		// Temperature readings
		PrintUtils.step("Configure Periodic Temperature Reading");
		Timers x = new Timers();
		Timers.timerModemTemperature = new Timer();
		Timers.timerModemTemperature.schedule(x.new timerModemTemperatureTask(), 0, TEMPERATURE_POLLING*1000);

		// Enqueue initial tasks
		MessageManager.clearQueue();
		if (sendingMode == Modem.SENDING_MODE_SMS)
			Modem.enqueueTask(MessageCodes.waitSMS);
		else
			Modem.enqueueTask(MessageCodes.swUpdateMsgCode);

		initialSettingsOk = 0;

		return initialSettingsOk;
	}

	public static int stateMachine_ConnectivityTestFlagRead() {

		PrintUtils.step("ConnectivityTestFlagRead");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int connectivityTestDone = -1;

		FileSystemManager fileSystemManager = new FileSystemManager(FileSystemCache.getOnboardingTableName());
		PrintUtils.info("Current ICCID: " + ModemCache.getIccid());

		FileReadResult readResult = fileSystemManager.readVar("ICCID", 19);

		if (readResult.getResultCode() == 0) {
			String newIccid = readResult.getResultContent();

			if (ModemCache.getIccid().equalsIgnoreCase(newIccid)) {
				connectivityTestDone = 1;
				PrintUtils.info("Connectivity test already done");
				LedUtils.turnOnLed();
			} else {
				connectivityTestDone = 0;
				PrintUtils.info("Connectivity test not done");
			}
		} else {
			PrintUtils.error("Error reading " + FileSystemCache.getOnboardingTableName());
		}

		return connectivityTestDone;
	}

	public static int stateMachine_ConnectivityNetworkConnection() {

		PrintUtils.step("ConnectivityNetworkConnection");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int isConnected = -1;

		String broker = ConfigJad.getBroker();
		String clientId = "5_" + ModemCache.getImei();

		mqttManager = new MqttManager(broker, clientId, MqttManager.MQTT_TIMEOUT, MqttManager.MQTT_KEEPALIVE);

		PrintUtils.info("Connecting");
		if (mqttManager.connect()) {
			isConnected = 0;
			PrintUtils.info("Connected");
		} else {
			PrintUtils.error("Error connecting MQTT client");
		}

		return isConnected;
	}

	public static int stateMachine_ConnectivityMessageSent() {

		PrintUtils.step("ConnectivityMessageSent");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		receivedConnectivityAck.result = -1;
		int connectivityMessageSentOk = -1;

		// Subscribe to topic
		String topic2subscribe = MqttManager.createSubTopic("10", ModemCache.getImei());

		if (mqttManager.subscribe(topic2subscribe, 0)) {

			// Connectivity Message
			MessageCreator jsonWrapperConnectivity = new MessageCreator(PROTOCOL_VERSION, ModemCache.getImei(), MessageType.connectivityMsgType);
			JSONObject jsonconnTestMessage = jsonWrapperConnectivity.createConnectivtyTestMessage();

			// Publish message
			PrintUtils.info("Sending ConnectTestMessage");
			try {

				String topic2send = MqttManager.createPubTopic("10", ModemCache.getImei());
				if (mqttManager.publish(jsonconnTestMessage.toString(), topic2send, 0) == 0) {

					Timers x = new Timers();
					Timers.timerTimeoutConnectivity.cancel();
					Timers.timerTimeoutConnectivity = new Timer();
					Timers.timerTimeoutConnectivity.schedule(x.new timerTimeoutConnectivityACK(), CONNECTIVITY_TIMEOUT*1000);
					synchronized (receivedConnectivityAck) {
						try {
							PrintUtils.info("Start Connectivity ACK Wait"+ new Date().toString());
							receivedConnectivityAck.wait();
							PrintUtils.info("Exit Wait" + new Date().toString());

						} catch (InterruptedException e) {
							PrintUtils.error("Failed synchronizing receivedConnectivityAck: "+ e.getMessage());
						}
					}
					Timers.timerTimeoutConnectivity.cancel();
					connectivityMessageSentOk = receivedConnectivityAck.result;
				}
			} catch (Exception e) {
				PrintUtils.error("Error sending ConnectTestMessage: "+ e.getMessage());
			}
		}
		if (receivedConnectivityAck.result == -1) {
			ErrorWarningEvent.storeError(0,ErrorWarningEvent.ERROR_ACK_LOST_CONNECT);
		}

		PrintUtils.info("Response:" + connectivityMessageSentOk);

		return connectivityMessageSentOk;
	}

	public static int stateMachine_ConnectivityNetworkDisconnect() {

		PrintUtils.step("Disconnect");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int disconnectOk = -1;

		if (mqttManager == null) {
			PrintUtils.warning("Client does not exist");
		} else {
			if (mqttManager.disconnect() == 0) {
				PrintUtils.info("Client correctly disconnected");
				disconnectOk = 0;
			}
		}

		return disconnectOk;
	}

	public static int stateMachine_ConnectivityTestFlagSetting() {

		PrintUtils.step("ConnectivityTestFlagSetting");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int saved = -1;

		FileSystemManager fileSystemManager = new FileSystemManager(FileSystemCache.getOnboardingTableName());
		fileSystemManager.writeVar("ICCID", ModemCache.getIccid());
		FileReadResult readResult = fileSystemManager.readVar("ICCID", 19);

		if (readResult.getResultCode() != -1) {
			String newIccid = readResult.getResultContent();
			if (ModemCache.getIccid().equalsIgnoreCase(newIccid)) {
				saved = 0;
				PrintUtils.info("Connectivity test flag succesfully saved in file system");
				LedUtils.turnOnLed();

			} else {
				saved = -1;
				PrintUtils.warning("Connectivity test flag was not saved in file system");
			}
		}

		return saved;
	}

	public static int stateMachine_LedStatusChecking() {

		PrintUtils.step("LedStatusChecking");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		int ledStatusOk = -1;

		if (LedUtils.isModemControlsLed()) {
			PrintUtils.info("LED configured as ALWAYS ON. Rebooting");
			LedUtils.ledToSystem();
			ledStatusOk = -1;
		} else {
			PrintUtils.info("LED blinking according to connectivity");
			ledStatusOk = 0;
		}

		return ledStatusOk;
	}

	public static int stateMachine_MachineInfoRetrieval() {

		PrintUtils.step("MachineInfoRetrieval");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int machineIdRetrievalOk = -1;

		byte chassisAddress = LinkLayer.CHASSIS_ADDRESS;
		byte mmi1Address = LinkLayer.MMI_1_ADDRESS;
		byte mmi2Address = LinkLayer.MMI_2_ADDRESS;
		HighLevelAPI serialApi = HighLevelAPI.getInstance();

		PrintUtils.info("MODEM VERSIONS");
		FileSystemCache.setVersionValue("MODEM", "MIDLET", ConfigJad.getMidletVersion());
		PrintUtils.info("MIDlet: " + FileSystemCache.getVersionValue("MODEM", "MIDLET"));
		PrintUtils.info("Certificates: " + FileSystemCache.getVersionValue("MODEM", "PLATFORM-CERTIFICATES"));

		if (serialApi.openStreamAndSession()) {

			MachineCache.setChasisMachineModel(serialApi.requestModuleModel(chassisAddress));
			MachineCache.setChasisHwRevision(serialApi.requestHwRevision(chassisAddress));
			MachineCache.setFwrChassis(serialApi.requestFirmwareVersion(chassisAddress));

			MachineCache.setPrid(serialApi.requestChassisProductId());
			if (!MachineCache.getPrid().equals(MachineCache.PRID_MACHINE_1) &&  !MachineCache.getPrid().equals(MachineCache.PRID_MACHINE_2) &&  !MachineCache.getPrid().equals(MachineCache.PRID_MACHINE_3)) {
				MachineCache.setPrid(MachineCache.PRID_MACHINE_1);
			}

			MachineCache.setFwrMM1(serialApi.requestFirmwareVersion(mmi1Address));
			MachineCache.setModuleOneSerial(serialApi.requestModuleSerialNumber(mmi1Address));
			MachineCache.setModuleOneMhbu(serialApi.requestMHBUFirmwareVersion(mmi1Address));
			MachineCache.setModuleOneCfwr(serialApi.requestMachinePRIDMainFirmwareVersion(mmi1Address));
			MachineCache.setModuleOneCrfwr(serialApi.requestMachine4PRIDFirmwareVersion(mmi1Address));

			if (MachineCache.getPrid().equals(MachineCache.PRID_MACHINE_2)) {				
				MachineCache.setFwrMM2(serialApi.requestFirmwareVersion(mmi2Address));
				MachineCache.setModuleTwoSerial(serialApi.requestModuleSerialNumber(mmi2Address));
				MachineCache.setModuleTwoMhbu(serialApi.requestMHBUFirmwareVersion(mmi2Address));
				MachineCache.setModuleTwoCfwr(serialApi.requestMachinePRIDMainFirmwareVersion(mmi2Address));
				MachineCache.setModuleTwoCrfwr(serialApi.requestMachine4PRIDFirmwareVersion(mmi2Address));
			}

			if (MachineCache.getPrid().equals(MachineCache.PRID_MACHINE_3)) {
				MachineCache.setMfwr(serialApi.requestMachine3FirmwareVersion(mmi1Address));
			}

			MachineCache.setChasisSerialNumber(serialApi.requestChassisSerialNumber());
			MachineCache.setpVersion(serialApi.requestProtocolVersion());

			PrintUtils.info("Initial Modem Temperature: "+ SystemUtils.getTemperature());
			ModemCache.setModemTemperature(SystemUtils.getTemperature());
			ModemCache.setModemTemperatureTimestamp(new Date().getTime());

			MachineCache.setAgid(serialApi.requestAgentId());

			// Fill version table
			FileSystemCache.setVersionValue("0", "AHC", MachineCache.getFwrChassis());
			FileSystemCache.setVersionValue("1", "IMM", MachineCache.getFwrMM1());
			FileSystemCache.setVersionValue("1", "FOC", MachineCache.getModuleOneCfwr());
			FileSystemCache.setVersionValue("1", "CER", MachineCache.getModuleOneCrfwr());
			FileSystemCache.setVersionValue("1", "KLM", MachineCache.getMfwr());
			FileSystemCache.setVersionValue("2", "IMM", MachineCache.getFwrMM2());
			FileSystemCache.setVersionValue("2", "FOC", MachineCache.getModuleTwoCfwr());
			FileSystemCache.setVersionValue("2", "CER", MachineCache.getModuleTwoCrfwr());

			PrintUtils.info("MACHINE FW VERSIONS");
			PrintUtils.info("Chassis: " + FileSystemCache.getVersionValue("0", "AHC"));
			PrintUtils.info("MMI 1: " + FileSystemCache.getVersionValue("1", "IMM"));
			PrintUtils.info("MMI 2: " + FileSystemCache.getVersionValue("2", "IMM"));
			PrintUtils.info("Machine 4 Recognition 1: " + FileSystemCache.getVersionValue("1", "CER"));
			PrintUtils.info("Machine 4 Recognition 2: " + FileSystemCache.getVersionValue("2", "CER"));
			PrintUtils.info("Machine Main 1: " + FileSystemCache.getVersionValue("1", "FOC"));
			PrintUtils.info("Machine Main 2: " + FileSystemCache.getVersionValue("2", "FOC"));
			PrintUtils.info("Video 1: " + FileSystemCache.getVersionValue("1", "DIV"));
			PrintUtils.info("Video 2: " + FileSystemCache.getVersionValue("2", "DIV"));
			PrintUtils.info("Machine 3: " + FileSystemCache.getVersionValue("1", "KLM"));

			FileSystemCache.storeTable(FileSystemCache.getVersionTableName(), FileSystemCache.getVersionTable());

			serialApi.closeStreamAndSession();

		}

		machineIdRetrievalOk = 0;

		return machineIdRetrievalOk;
	}

	public static int stateMachine_MachineIdChangeChecking() {

		PrintUtils.step("MachineIdChangeChecking");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int onboardingDone = -1;

		FileSystemManager fileSystemManager = new FileSystemManager(FileSystemCache.getOnboardingTableName());
		PrintUtils.info("Current MID: " + MachineCache.getChasisSerialNumber());
		FileReadResult readResult = fileSystemManager.readVar("MID", 19);
		if (readResult.getResultCode() == 0) {
			String newMid = readResult.getResultContent();
			if (MachineCache.getChasisSerialNumber().equalsIgnoreCase(newMid)) {
				onboardingDone = 1;
				PrintUtils.info("Onboarding message already sent");
			} else {
				onboardingDone = 0;
				PrintUtils.info("Onboarding message not sent");
			}
		}

		return onboardingDone;
	}

	public static int stateMachine_OnboardingNetworkConnection() {

		PrintUtils.step("OnboardingNetworkConnection");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		int isConnected = -1;
		String clientId = "5_" + MachineCache.getChasisSerialNumber();
		NetworkManager.configureNetwork(FileSystemCache.getConfigValue(FileSystemCache.getApnName()),ConfigJad.getUser(), ConfigJad.getPwd(), NetworkManager.NETWORK_TIMEOUT);
		String broker = ConfigJad.getBroker();
		mqttManager = new MqttManager(broker, clientId, MqttManager.MQTT_TIMEOUT, MqttManager.MQTT_KEEPALIVE);

		PrintUtils.info("Connecting");

		if (mqttManager.connect()) {
			isConnected = 0;
			PrintUtils.info("Connected");
		} else {
			PrintUtils.error("Error connecting MQTT client");
		}

		return isConnected;

	}

	public static int stateMachine_OnboardingMessageSent() {

		PrintUtils.step("OnboardingMessageSent");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		receivedOnboardingAck.result = -1;

		// Subscribe to topic
		String topic2subscribe = MqttManager.createSubTopic("3", MachineCache.getChasisSerialNumber());
		mqttManager.subscribe(topic2subscribe, 0);
		MessageCreator jsoncommonwrapper = null;
		jsoncommonwrapper = new MessageCreator(PROTOCOL_VERSION,MachineCache.getChasisSerialNumber(), MessageType.onboardingMsgType);
		JSONObject jsonMachineOnboardMessage = jsoncommonwrapper.createMachineOnboardingMessage();

		// Send to broker
		String topic = MqttManager.createPubTopic("3", MachineCache.getChasisSerialNumber());
		PrintUtils.info("Sending MachineOnBoardMessage");
		if (mqttManager.publish(jsonMachineOnboardMessage.toString(), topic, 0) == 0) {
			Timers.timerTimeoutOnboarding.cancel();
			Timers.timerTimeoutOnboarding = new Timer();
			Timers x = new Timers();
			Timers.timerTimeoutOnboarding.schedule(x.new timerTimeoutOnboardingACK(), CONNECTIVITY_TIMEOUT*1000);
	
			synchronized (receivedOnboardingAck) {
				try {
					PrintUtils.info("Start Onboarding ACK Wait" + new Date().toString());
					receivedOnboardingAck.wait();
					Timers.timerTimeoutOnboarding.cancel();
					PrintUtils.info("End Wait" + new Date().toString());
				} catch (InterruptedException e) {
					PrintUtils.error("Failed synchronizing receivedOnBoardAck");
				}
			}
			if (receivedOnboardingAck.result == -1) {
				ErrorWarningEvent.storeError(0,ErrorWarningEvent.ERROR_ACK_LOST_ONBOARDING);
			}
		}

		mqttManager.disconnect();

		return receivedOnboardingAck.result;
	}

	public static int stateMachine_OnboardingNetworkDisconnect() {

		PrintUtils.step("Disconnect");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		if (mqttManager == null) {
			PrintUtils.warning("Client does not exist");
		} else {
			mqttManager.disconnect();
			PrintUtils.info("Client correctly disconnected");
		}
		return 0;
	}

	public static int stateMachine_MachineIdUpdateInMemory() {

		PrintUtils.step("MachineIdUpdateInMemory");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int saved = -1;

		FileSystemManager fileSystemManager = new FileSystemManager(FileSystemCache.getOnboardingTableName());
		fileSystemManager.writeVar("MID", MachineCache.getChasisSerialNumber());
		FileReadResult readResult = fileSystemManager.readVar("MID", 19);

		if (readResult.getResultCode() != -1) {
			String newMid = readResult.getResultContent();
			if (MachineCache.getChasisSerialNumber().equalsIgnoreCase(newMid)) {
				saved = 0;
				PrintUtils.info("Machine ID succesfully saved in file system");
			} else {
				saved = -1;
				PrintUtils.warning("Machine ID not saved in file system");
			}
		}

		return saved;
	}

	public static int stateMachine_InitialNetworkConnection() {
		
		PrintUtils.step("InitialNetworkConnection");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int sendingMode = Integer.parseInt(FileSystemCache.getConfigValue(FileSystemCache.getSendingModeName()));
		if (sendingMode == Modem.SENDING_MODE_SMS) {
			PrintUtils.debug("Skipping InitialNetworkConnection");
			return 0;
		}

		int isConnected = -1;

		NetworkManager.configureNetwork(FileSystemCache.getConfigValue(FileSystemCache.getApnName()),ConfigJad.getUser(), ConfigJad.getPwd(), NetworkManager.NETWORK_TIMEOUT);
		String broker = ConfigJad.getBroker();
		String clientId = "5_" + MachineCache.getChasisSerialNumber();

		mqttManager = new MqttManager(broker, clientId, MqttManager.MQTT_TIMEOUT, MqttManager.MQTT_KEEPALIVE);

		PrintUtils.info("Connecting");

		if (mqttManager.connect()) {
			isConnected = 0;
			PrintUtils.info("Connected");
		} else {
			PrintUtils.error("Error connecting MQTT client");
		}

		return isConnected;
	}

	public static int stateMachine_SubscriptionMQTT() {
		
		PrintUtils.step("SubscriptionMQTT");
		PrintUtils.step("InitialNetworkConnection");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int sendingMode = Integer.parseInt(FileSystemCache.getConfigValue(FileSystemCache.getSendingModeName()));
		if (sendingMode == Modem.SENDING_MODE_SMS) {
			PrintUtils.debug("Skipping SubscriptionMQTT");
			return 0;
		}

		int isSubscribed = -1;

		String topic2subscribe = MqttManager.createSubTopic("+", MachineCache.getChasisSerialNumber());

		if (mqttManager.subscribe(topic2subscribe, 0)) {
			isSubscribed = 0;
		} else {
			PrintUtils.error("Error subscribing to topic " + topic2subscribe);
		}

		return isSubscribed;
	}

	/****************** MESSAGE READING ******************/

	public static String stateMachine_MessageReading() {

		PrintUtils.step("MessageReading");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		AtManager.release();
		AtManager.enableSms();

		MessageManager.waitQueueMessage();
		PrintUtils.info("Scheduled Actions: " + MessageManager.getQueue().size());
		JSONObject message = MessageManager.readNextMessage();
		String messageCode = MessageCodes.noMsgCode;
		try {
			messageCode = message.getString(MessageCodes.msgCodeKey);
		} catch (NumberFormatException e) {
			PrintUtils.error("Error formatting the number messageType");
		} catch (JSONException e) {
			PrintUtils.error("Error reading the JSON");
		}

		return messageCode;

	}

	/****************** ACTIONS ******************/

	public static int stateMachine_MIChassisMessageSent() {

		PrintUtils.step("MIChassisMessageSent");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		MessageManager.removeNextMessage();

		int MIChassisSentOk = -1;

		MessageCreator jsoncommonwrapper = new MessageCreator(PROTOCOL_VERSION, MachineCache.getChasisSerialNumber(), MessageType.machineInfoMsgType);
		JSONObject jsonMachineInformationMessage = jsoncommonwrapper.createMachineInformationMessage();
		String topic = MqttManager.createPubTopic("1", MachineCache.getChasisSerialNumber());
		if (mqttManager.publish(jsonMachineInformationMessage.toString(), topic, 0) == 0) {
			
			MIChassisSentOk = 0;
			
			// Enqueue telemetry retrieval
			Modem.enqueueTask(MessageCodes.afterOnboardingPhase2MsgCode);
			
		} else {
			PrintUtils.error("Error publishing Machine Information Message");
		}

		moreTelemetry = true;

		return MIChassisSentOk;
	}

	public static int stateMachine_EOMessageSent() {
		
		PrintUtils.step("EOMessageSent");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		receivedEOAck.result = -1;
		MachineCache.setEoModuleOne(-2);
		MachineCache.setEoModuleTwo(-2);

		moreTelemetry = false;

		MessageManager.removeNextMessage();
		String FID = SystemUtils.generateUUID();
		MessageManager.lastFid = FID;

		MessageCreator jsoncommonwrapper = new MessageCreator(PROTOCOL_VERSION, MachineCache.getChasisSerialNumber(), MessageType.eoMsgType);
		JSONObject jsonReverseRemoteControlMessage = jsoncommonwrapper.createEOMessage(FID);
		String topic = MqttManager.createPubTopic(String.valueOf(MessageType.eoMsgType), MachineCache.getChasisSerialNumber());
		PrintUtils.info("Sending ReverseRemoteControlMessage");
		if (mqttManager.publish(jsonReverseRemoteControlMessage.toString(), topic, 0) == 0) {
			Timers.timerTimeoutEO.cancel();
			Timers.timerTimeoutEO = new Timer();
			Timers x = new Timers();
			Timers.timerTimeoutEO.schedule(x.new timerTimeoutEOACK(), CONNECTIVITY_TIMEOUT*1000);
	
			synchronized (receivedEOAck) {
				try {
					PrintUtils.info("Start EO ACK Wait " + new Date().toString());
					receivedEOAck.wait();
					Timers.timerTimeoutEO.cancel();
					PrintUtils.info("End Wait " + new Date().toString());
				} catch (InterruptedException e) {
					PrintUtils.debug("An Exception ocurred waiting for EO response");
				}
			}
	
			if (receivedEOAck.result == -1) {
				ErrorWarningEvent.storeError(0, ErrorWarningEvent.ERROR_ACK_LOST_EO);
				PrintUtils.error("Failed synchronizing receivedEOAck");
			}
		}
		
		return receivedEOAck.result;
	}

	public static int stateMachine_ModuleOneTelemetryRetrieval() {

		PrintUtils.step("ModuleOneTelemetryRetrieval");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		return telemetryRetrieval(1);
	}

	public static int stateMachine_ModuleOneTelemetrySent() {

		PrintUtils.step("ModuleOneTelemetrySent");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		return telemetrySent(1);
	}

	public static int stateMachine_ModuleTwoTelemetryRetrieval() {

		PrintUtils.step("ModuleTwoTelemetryRetrieval");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		return telemetryRetrieval(2);
	}

	public static int stateMachine_ModuleTwoTelemetrySent() {

		PrintUtils.step("ModuleTwoTelemetrySent");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		return telemetrySent(2);
	}

	public static int stateMachine_ExtraTelemetryChecking() {

		PrintUtils.step("ExtraTelemetryChecking");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int extraTelemetryCheckingOk = -1;

		String task = "";
		long timeoutTask = 0;

		if (moreTelemetry) {

			PrintUtils.info("More events to be sent");

			timeoutTask = Long.parseLong(FileSystemCache.getConfigValue(FileSystemCache.getAfterOnboardingPeriodName()));
			task = MessageCodes.afterOnboardingPhase2MsgCode;
			Modem.enqueueNextTask(task, timeoutTask);
			PrintUtils.info("Retrieving next events in " + timeoutTask + "s");

		} else {

			int sendingMode = Integer.parseInt(FileSystemCache.getConfigValue(FileSystemCache.getSendingModeName()));

			if (sendingMode == Modem.SENDING_MODE_ON) {
				task = MessageCodes.swUpdateMsgCode;
				timeoutTask = Long.parseLong(FileSystemCache.getConfigValue(FileSystemCache.getAfterOnboardingPeriodName()));
				Modem.enqueueNextTask(task, timeoutTask);
				PrintUtils.info("Next After Onboarding in " + timeoutTask + "s");				

			} else if (sendingMode == Modem.SENDING_MODE_BOOT_DAY_SMS) {
				Modem.enqueueTask(MessageCodes.pollingMsgCode);
				PrintUtils.info("Entering Polling Mode");

			} else if (sendingMode == Modem.SENDING_MODE_BOOT_SMS || sendingMode == Modem.SENDING_MODE_SMS) {
				Modem.enqueueTask(MessageCodes.waitSMS);
				PrintUtils.info("Entering WaitSMS Mode");

			} else {
				PrintUtils.error("Unknown Sending Mode");
			}
		}

		extraTelemetryCheckingOk = 0;

		return extraTelemetryCheckingOk;
	}

	public static int stateMachine_ParametersReading() {

		PrintUtils.step("ParametersReading");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int parametersReadingOk = -1;

		try {
			JSONObject message = MessageManager.readNextMessage();
			ParameterUpdate.setFid(message.getJSONObject("M").getString("FID"));
			JSONArray fparArray = message.getJSONObject("M").getJSONArray("FPAR");
			if (fparArray.length() % 3 != 0){		
				MessageCreator jsoncommonwrapper = null;
				jsoncommonwrapper = new MessageCreator(PROTOCOL_VERSION,MachineCache.getChasisSerialNumber(), MessageType.remoteParametersUpdateMsgType);
				JSONObject json2send = jsoncommonwrapper.createErrorUpdateParameterMessage(ParameterUpdate.getFid(), "ERROR");
				String topic2reply = MqttManager.createPubTopic(String.valueOf(MessageType.remoteParametersUpdateMsgType), MachineCache.getChasisSerialNumber());
				mqttManager.publish(json2send.toString(), topic2reply, 0);

			} else {
				ParameterUpdate.setFparTriplesArray(new JSONArray());
				for (int i = 0; i < fparArray.length(); i += 3) {
					JSONObject fparTriple = new JSONObject();
					fparTriple.put("PID", fparArray.getString(i));
					fparTriple.put("PrevPValue", fparArray.getString(i + 1));
					fparTriple.put("NewPValue", fparArray.getString(i + 2));
					ParameterUpdate.getFparTriplesArray().put(fparTriple);
				}

				parametersReadingOk = 0;
			}

		} catch (Exception e) {
			parametersReadingOk = -1;
			PrintUtils.error("Error reading Remote Parameters Update message");
		}

		MessageManager.removeNextMessage();

		return parametersReadingOk;
	}

	public static int stateMachine_ParametersUpdate() {

		PrintUtils.step("ParametersUpdate");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		// Avoid reboot if parameter update fails
		int parametersUpdateOk = 0;

		String parameterUpdateStatus = "OK";
		boolean globalSuccess = true;

		ParameterUpdate.setParametersValueArray(new JSONArray());

		for (int i = 0; i < ParameterUpdate.getFparTriplesArray().length(); i++) {

			String reportValue = "ERROR";

			String key = "";
			JSONObject triplet = new JSONObject();
			String pidValue = "";
			String prevValue = "";
			String newValue = "";

			boolean success = false;

			try {
				triplet = ParameterUpdate.getFparTriplesArray().getJSONObject(i);
				pidValue = triplet.getString("PID");
				prevValue = triplet.getString("PrevPValue");
				newValue = triplet.getString("NewPValue");

				if (StringUtils.isNumeric(pidValue)) {
					if (Integer.parseInt(pidValue) >= 100 && Integer.parseInt(pidValue) <= 200) {
						key = pidValue;
					} else if (Integer.parseInt(pidValue) >= 10000 && Integer.parseInt(pidValue) <= 20100) {
						key = "bufferUpdate";
					} else {
						key = "invalidParameter";
					}
				} else {
					if (MessageManager.checkUpdateEventProfile(pidValue)) {
						key = "eventProfile";
					} else {
						key = "invalidParameter";
					}
				}

			} catch (Exception e) {
				PrintUtils.error("Error parsing parameters");
			}

			switch (ParameterUpdate.getParametersAbleToBeUpdated().indexOf(key)) {

			/* timerAfterOnboarding */
			case 0:

				if (Long.parseLong(newValue) >= MINIMUM_BACKEND_RESPONSE_TIME && Long.parseLong(newValue) <= Long.MAX_VALUE)
					success = FileSystemCache.updateParameter(triplet);
				reportValue = FileSystemCache.getConfigValue(FileSystemCache.getAfterOnboardingPeriodName());
				break;

				/* sendRawData */
			case 1:
				if (newValue.equalsIgnoreCase("true") || newValue.equalsIgnoreCase("false"))
					success = FileSystemCache.updateParameter(triplet);
				reportValue = FileSystemCache.getConfigValue(FileSystemCache.getSendRawDataName());
				break;

				/* Maximum events per message */
			case 2:

				if (Long.parseLong(newValue) >= 0 && Long.parseLong(newValue) <= Long.MAX_VALUE)
					success = FileSystemCache.updateParameter(triplet);
				reportValue = FileSystemCache.getConfigValue(FileSystemCache.getMaxEventsName());
				break;

				/* Reboot state duration */
			case 3:
				if (Long.parseLong(newValue) >= 0 && Long.parseLong(newValue) <= Long.MAX_VALUE)
					success = FileSystemCache.updateParameter(triplet);
				reportValue = FileSystemCache.getConfigValue(FileSystemCache.getSafeRebootName());
				break;

				/* APN */
			case 4:
				if (newValue.length() > 0)
					success = FileSystemCache.updateParameter(triplet);
				reportValue = FileSystemCache.getConfigValue(FileSystemCache.getApnName());
				break;

				/* Sending Mode */
			case 5:

				if (Long.parseLong(newValue) >= Modem.SENDING_MODE_ON && Long.parseLong(newValue) <= Modem.SENDING_MODE_SMS)
					success = FileSystemCache.updateParameter(triplet);
				reportValue = FileSystemCache.getConfigValue(FileSystemCache.getSendingModeName());
				break;

				/* Polling Timer Active */
			case 6:

				if (Long.parseLong(newValue) >= 0 && Long.parseLong(newValue) <= ParameterUpdate.MAX_POLLING_INTERVAL)
					success = FileSystemCache.updateParameter(triplet);
				reportValue = FileSystemCache.getConfigValue(FileSystemCache.getPollingIntervalActiveName());
				break;

				/* Polling Timer Sleep */
			case 7:

				if (Long.parseLong(newValue) >= 0 && Long.parseLong(newValue) <= ParameterUpdate.MAX_POLLING_INTERVAL)
					success = FileSystemCache.updateParameter(triplet);
				reportValue = FileSystemCache.getConfigValue(FileSystemCache.getPollingIntervalSleepName());
				break;

				/* Polling Timer Deep Sleep */
			case 8:

				if (Long.parseLong(newValue) >= 0 && Long.parseLong(newValue) <= ParameterUpdate.MAX_POLLING_INTERVAL)
					success = FileSystemCache.updateParameter(triplet);
				reportValue = FileSystemCache.getConfigValue(FileSystemCache.getPollingIntervalDeepName());
				break;
				
				/* Reset configuration */
			case 9:
				
				if (newValue.equalsIgnoreCase("true")) {
					FileSystemCache.deletePersistentConfiguration();
					success = true;
					reportValue = "true";
					PrintUtils.info("Rebooting in 30s");
					Timers.timerReboot = new Timer();
					Timers x = new Timers();
					Timers.timerReboot.schedule(x.new timerRebootTask(), 30000);					
				} else if (newValue.equalsIgnoreCase("false")) {
					success = true;
					reportValue = "false";
				} else {
					success = false;
					reportValue = "false";
				}
				break;

				/* UpdateBufferData */
			case 10:
				try {
					int bufferAddress = Integer.parseInt(pidValue);
					long oldMachineValue = -1;
					long newMachineValue = -1;

					PrintUtils.info("Update Buffer Data: " + bufferAddress);

					HighLevelAPI serialAPI = HighLevelAPI.getInstance();
					Vector params = new Vector(0);

					if (serialAPI.openStreamAndSession()) {
						params = serialAPI.requestParameters(LinkLayer.MMI_1_ADDRESS);

						if (BufferDescription.getInstance().isValid(pidValue,newValue)) {
							if (prevValue.equals("FORCE")) {
								PrintUtils.info("Ignoring previuos data due to FORCE");
								PrintUtils.info("Checking current value");

								for (int j = 0; j < params.size() && oldMachineValue == -1; j++) {
									Parameter param = (Parameter) params.elementAt(j);
									if (param.getTID() == bufferAddress) {
										oldMachineValue = param.getValue();
										success = true;
									}
								}

								if (StringUtils.isNumeric(newValue)) {
									long valueToWrite = Long.parseLong(newValue);
									PrintUtils.info("Value to write "+ valueToWrite);
									serialAPI.setParameter(LinkLayer.MMI_1_ADDRESS,bufferAddress, valueToWrite);
								}

							} else {
								PrintUtils.info("Checking previous value");

								for (int j = 0; j < params.size() && oldMachineValue == -1; j++) {
									Parameter param = (Parameter) params.elementAt(j);
									if (param.getTID() == bufferAddress) {
										oldMachineValue = param.getValue();
									}
								}
								if (Long.parseLong(prevValue) == oldMachineValue) {
									PrintUtils.info("Changing machine value");
									long valueToWrite = Long.parseLong(newValue);
									if (StringUtils.isNumeric(newValue)) {
										PrintUtils.info("Write into "+ LinkLayer.MMI_1_ADDRESS+ " buffer address "+ bufferAddress+ " value to write "+ valueToWrite);
										serialAPI.setParameter(LinkLayer.MMI_1_ADDRESS,bufferAddress, valueToWrite);
										success = true;
									}
								} else {
									PrintUtils.error("Previous value not valid");
								}
							}
						}

						params = serialAPI.requestParameters(LinkLayer.MMI_1_ADDRESS);

						for (int j = 0; j < params.size() && newMachineValue == -1; j++) {
							Parameter param = (Parameter) params.elementAt(j);
							if (param.getTID() == bufferAddress) {
								newMachineValue = param.getValue();

								if ((bufferAddress == 10001 || bufferAddress == 10002) && newMachineValue == 65535) {
									PrintUtils.warning("Machine value for buffer " + bufferAddress + " not valid: " + newMachineValue + ". Reporting -1 instead");
									reportValue = "-1";
								} else
									reportValue = Long.toString(newMachineValue);
							}
						}

						serialAPI.closeStreamAndSession();
					}

					PrintUtils.info("Previous Machine value: " + oldMachineValue);
					PrintUtils.info("Reported Machine value: " + reportValue);

				} catch (Exception e) {
					PrintUtils.error("Parsing error");
				}


				break;

				/* Event profile Table */
			case 11:
				try {
					PrintUtils.debug("Update Event Profile Table");
					JSONObject eventProfileTable = FileSystemCache.getEventProfileTable();

					String currentValue = "";
					String generalEventProfile = "";
					String specificEventProfile = "";

					if (pidValue.startsWith("GB_")) {
						generalEventProfile = pidValue;
						specificEventProfile = "SB_default";
						if (Integer.parseInt(newValue) >= 0 && Integer.parseInt(newValue) <= 2) {
							currentValue = eventProfileTable.getJSONObject(generalEventProfile).getString(specificEventProfile);
							if (eventProfileTable.has(generalEventProfile)) {
								if (prevValue.equals("FORCE")|| prevValue.equals(currentValue)) {
									eventProfileTable.getJSONObject(generalEventProfile).put(specificEventProfile, newValue);
									PrintUtils.info("New value for event profile "+ generalEventProfile+ " modified to "+ newValue);
									success = true;
								} else {
									PrintUtils.error("Event profile does not exist");
								}
							} else {
								PrintUtils.error("GB does not exist");
							}
						} else {
							PrintUtils.error("Value out of range");
						}

					} else if (pidValue.startsWith("SB_")) {
						generalEventProfile = "GB_"+ StringUtils.Split(pidValue, "_")[1];
						specificEventProfile = "SB_"+ StringUtils.Split(pidValue, "_")[2];

						// Add Specific Behaviour
						if (Integer.parseInt(newValue) >= 0 && Integer.parseInt(newValue) <= 2) {
							if (eventProfileTable.has(generalEventProfile)) {
								if (eventProfileTable.getJSONObject(generalEventProfile).has(specificEventProfile)) {
									currentValue = eventProfileTable.getJSONObject(generalEventProfile).getString(specificEventProfile);
									if (prevValue.equals(currentValue) || prevValue.equals("FORCE")) {
										eventProfileTable.getJSONObject(generalEventProfile).put(specificEventProfile, newValue);
										PrintUtils.info("New value for event profile "+ specificEventProfile+ " modified to "+ newValue);
										success = true;
									} else {
										PrintUtils.error("Previous value not valid");
									}
								} else if (prevValue.equals("FORCE")) {
									eventProfileTable.getJSONObject(generalEventProfile).put(specificEventProfile, newValue);
									PrintUtils.info("New event profile added "+ specificEventProfile+ " with value " + newValue);
									success = true;
								} else {
									PrintUtils.error("FORCE flag was not set");
								}
							} else {
								PrintUtils.error("Event profile does not exist");
							}

							// Remove Specific Behaviour
						} else if (Integer.parseInt(newValue) == 9) {
							if (eventProfileTable.has(generalEventProfile)) {
								if (!specificEventProfile.equals("SB_default")) {
									if (eventProfileTable.getJSONObject(generalEventProfile).has(specificEventProfile)) {
										currentValue = eventProfileTable.getJSONObject(generalEventProfile).getString(specificEventProfile);
										if (prevValue.equals(currentValue) || prevValue.equals("FORCE")) {
											eventProfileTable.getJSONObject(generalEventProfile).remove(specificEventProfile);
											PrintUtils.info("Event profile "+ specificEventProfile+ " succesfully removed");
											reportValue = "";
											success = true;
										} else {
											PrintUtils.error("Previous value not valid");
										}
									} else {
										PrintUtils.error("Specific event profile does not exist");
									}
								} else {
									PrintUtils.error("Default event profile cannot be deleted");
								}
							} else {
								PrintUtils.error("Event profile does not exist");
							}

						} else {
							PrintUtils.error("Value out of range");
						}
					} else {
						PrintUtils.error("PID not valid");
					}

					/* Store new event profile table */
					if (success) {
						FileSystemManager eventTableFile = new FileSystemManager(FileSystemCache.getEventProfileTableName());
						if (eventTableFile.newFile(eventProfileTable.toString().getBytes())) {
							PrintUtils.info("Event Profile Table succesfully stored in File System");
						} else {
							PrintUtils.error("Error storing new Event Profile Table in File System");
						}
					}

					/* Report stored value */
					if (eventProfileTable.getJSONObject(generalEventProfile).has(specificEventProfile))
						reportValue = FileSystemCache.getEventProfileValue(generalEventProfile, specificEventProfile);

				} catch (Exception e) {
					PrintUtils.error("Parsing error");
				}

				break;

			default:
				ErrorWarningEvent.storeError(0,ErrorWarningEvent.ERROR_PARAM_NOT_RECOG);
				PrintUtils.error("Parameter update not valid");
			}

			if (!success)
				globalSuccess = false;

			ParameterUpdate.getParametersValueArray().put(reportValue);

		}

		if (globalSuccess)
			parameterUpdateStatus = "OK";
		else
			parameterUpdateStatus = "ERROR";

		// Publish ACK
		try {
			MessageCreator jsoncommonwrapper = null;
			jsoncommonwrapper = new MessageCreator(PROTOCOL_VERSION,MachineCache.getChasisSerialNumber(), MessageType.remoteParametersUpdateMsgType);
			PrintUtils.debug("ST: " + parameterUpdateStatus);
			JSONObject jsonRemoteParametersUpdateMessage = jsoncommonwrapper.createRemoteParametersUpdateMessage(ParameterUpdate.getFid(), parameterUpdateStatus, ParameterUpdate.getParametersValueArray());
			String topic = MqttManager.createPubTopic(String.valueOf(MessageType.remoteParametersUpdateMsgType), MachineCache.getChasisSerialNumber());
			mqttManager.publish(jsonRemoteParametersUpdateMessage.toString(),topic, 0);
			parametersUpdateOk = 0;
		} catch (Exception e) {
			PrintUtils.error("Error sending Remote Parameters Update message ACK");
		}

		// Reboot if necessary
		if (ModemCache.getRebootFlag()) {
			PrintUtils.debug("Reboot due to modem parameters changed");
			parametersUpdateOk = -1;
			noWaitforReboot = true;
		}

		return parametersUpdateOk;
	}

	public static int stateMachine_PollingChecking() {

		PrintUtils.step("PollingChecking");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		AtManager.release();
		AtManager.enableSms();

		MessageManager.removeNextMessage();

		PrintUtils.info("Disconnecting from MQTT broker ");
		mqttManager.disconnect();

		int pollingCheckingOk = -1;

		// Request machine state to configure polling timer
		HighLevelAPI serialApiPollingTime = HighLevelAPI.getInstance();
		int timeout = Integer.parseInt(FileSystemCache.getConfigValue(FileSystemCache.getPollingIntervalActiveName()));
		if (serialApiPollingTime.openStreamAndSession()) {

			int machineState = serialApiPollingTime.requestMachineState(LinkLayer.MMI_1_ADDRESS);
			switch (machineState) {
			case 0:
				PrintUtils.info("Machine is in Active State");
				timeout = Integer.parseInt(FileSystemCache.getConfigValue(FileSystemCache.getPollingIntervalActiveName()));
				break;
			case 1:
				PrintUtils.info("Machine is in Sleep State");
				timeout = Integer.parseInt(FileSystemCache.getConfigValue(FileSystemCache.getPollingIntervalSleepName()));
				break;
			case 2:
				PrintUtils.info("Machine is in Deep Sleep State");
				timeout = Integer.parseInt(FileSystemCache.getConfigValue(FileSystemCache.getPollingIntervalDeepName()));
				break;
			default:
				PrintUtils.info("Machine State is unknown");
				timeout = Integer.parseInt(FileSystemCache.getConfigValue(FileSystemCache.getPollingIntervalActiveName()));				
			}

			serialApiPollingTime.closeStreamAndSession();
		}

		PrintUtils.info("Next polling in "+ timeout + "s");
		Timers.timerPolling.cancel();
		Timers.timerPolling = new Timer();
		Timers x = new Timers();
		Timers.timerPolling.schedule(x.new timerTimeoutPolling(), timeout*1000);

		AtManager.setSmsStart(false);

		try {
			PrintUtils.info("Waiting for SMS or periodic Polling");
			synchronized (startPolling) {
				startPolling.wait();
			}

		} catch (Exception e) {
			PrintUtils.error("Error waiting for next polling");
		}
		Timers.timerPolling.cancel();

		if (!AtManager.isSmsStart()) {

			HighLevelAPI serialApi = HighLevelAPI.getInstance();
			// Check events module one
			try {
				if (serialApi.openStreamAndSession()) {

					PrintUtils.info("Get events from module one");
					serialApi.setStartPointer(LinkLayer.MMI_1_ADDRESS, MachineCache.getEoModuleOneCached());
					Vector events1 = serialApi.requestEventsBuffer(LinkLayer.MMI_1_ADDRESS);
					MachineCache.setEoModuleOneCached(serialApi.getEOPointer(LinkLayer.MMI_1_ADDRESS));
					PrintUtils.debug("Updated EoModule One Cached "+ MachineCache.getEoModuleOneCached());
					urgentDetected = MachineCache.detectUrgency(events1, FileSystemCache.URGENT_EVENT);
					PrintUtils.info("Detected Urgent Events: " + urgentDetected);

					// Check events from module two if there are not urgent events detected in module one
					if (MachineCache.getPrid().equalsIgnoreCase(MachineCache.PRID_MACHINE_2) && urgentDetected == false) {
						PrintUtils.info("Get events from module two");
						serialApi.setStartPointer(LinkLayer.MMI_2_ADDRESS, MachineCache.getEoModuleTwoCached());
						Vector events2 = serialApi.requestEventsBuffer(LinkLayer.MMI_2_ADDRESS);
						MachineCache.setEoModuleTwoCached(serialApi.getEOPointer(LinkLayer.MMI_2_ADDRESS));
						PrintUtils.debug("Updated EoModule Two Cached "+ MachineCache.getEoModuleTwoCached());
						urgentDetected = MachineCache.detectUrgency(events2, FileSystemCache.URGENT_EVENT);
						PrintUtils.info("Detected Urgent Events: "+ urgentDetected);
					}

					serialApi.closeStreamAndSession();

				} else {
					PrintUtils.error("Machine communication error");
				}

			} catch (Exception e) {
				PrintUtils.error("Error getting urgent events");
			}

			// Check if modem events are urgent
			try {
				JSONObject profileTable = FileSystemCache.getEventProfileTable();
				if (Integer.parseInt(profileTable.getJSONObject("GB_101").getString("SB_default")) == FileSystemCache.URGENT_EVENT) {
					PrintUtils.debug("Temperature is set as urgent");
					urgentDetected = true;
				} else {
					//PrintUtils.debug("Temperature is  NOT URGENT");
				}
			} catch (Exception e) {
				PrintUtils.error("Error getting modem profile table");
			}
		}

		if (AtManager.isSmsStart() || urgentDetected == true || (polling_cycles* timeout > MAX_TIME_WITHOUT_TLM)) {
			PrintUtils.info("Telemetry will be sent");

			polling_cycles = 0;

			// Enqueue FOTA and Telemetry
			long timeSinceLastTelemetry = System.currentTimeMillis() - lastTelemetryTimestamp;
			long remainingTime = MIN_TIME_SMS_POLLING - timeSinceLastTelemetry/1000;
			if (remainingTime>0) {
				PrintUtils.warning("Minimum time from last telemetry not reached");
				PrintUtils.info("Software Update request in " + Math.max(0, remainingTime) + "s");
				Modem.enqueueNextTask(MessageCodes.swUpdateMsgCode, remainingTime);
			} else {
				PrintUtils.info("Enqueuing Software Update request");
				Modem.enqueueTask(MessageCodes.swUpdateMsgCode);
			}

			// Reconnect Client
			if (mqttManager.reconnect()) {
				pollingCheckingOk = 0;
			} else {
				pollingCheckingOk = -1;
			}

		} else {
			// Enqueue polling message
			PrintUtils.debug("Continue Polling");
			polling_cycles++;
			PrintUtils.debug("Remaining time for next telemetry: " + (MAX_TIME_WITHOUT_TLM - polling_cycles* timeout) + "s");
			Modem.enqueueTask(MessageCodes.pollingMsgCode);
			pollingCheckingOk = 0;
		}

		return pollingCheckingOk;
	}

	public static int stateMachine_WaitSMS() {
		
		PrintUtils.step("WaitSMS");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		AtManager.release();
		AtManager.enableSms();
		
		int waitSMSOk = -1;
		
		/* Craate client if not existent (For sending mode 4)*/
		if (mqttManager == null) {
			String clientId = "5_" + MachineCache.getChasisSerialNumber();
			String broker = ConfigJad.getBroker();
			mqttManager = new MqttManager(broker, clientId, MqttManager.MQTT_TIMEOUT, MqttManager.MQTT_KEEPALIVE);
		}

		PrintUtils.info("Disconnecting from MQTT broker");			
		mqttManager.disconnect();

		boolean smsReceived = false;

		MessageManager.removeNextMessage();

		try {
			while (!smsReceived) {
				PrintUtils.info("Waiting for SMS");
				synchronized (startPolling) {
					startPolling.wait();			
				}

				// Enqueue FOTA and Telemetry
				long timeSinceLastTelemetry = System.currentTimeMillis() - lastTelemetryTimestamp;
				long remainingTime = MIN_TIME_SMS_POLLING - timeSinceLastTelemetry/1000;
				if (remainingTime>0) {
					PrintUtils.warning("Minimum time from last telemetry not reached");
					PrintUtils.info("Software Update request in " + Math.max(0, remainingTime) + "s");
					Modem.enqueueNextTask(MessageCodes.swUpdateMsgCode, remainingTime);
				} else {
					PrintUtils.info("Enqueuing Software Update request");
					Modem.enqueueTask(MessageCodes.swUpdateMsgCode);
				}

				smsReceived = true;
				waitSMSOk = 0;
			}

		} catch (Exception e) {
			PrintUtils.error("Error receiving Start SMS");
		}

		// Reconnect Client
		if (mqttManager.reconnect()) {
			waitSMSOk = 0;
		} else {
			waitSMSOk = -1;
		}

		return waitSMSOk;
	}

	public static int stateMachine_SoftwareRequest() {

		PrintUtils.step("SoftwareRequest");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		MessageManager.removeNextMessage();

		int softwareRequestOk = -1;

		MessageCreator jsoncommonwrapper = new MessageCreator(Fota.FOTA_PROTOCOL, MachineCache.getChasisSerialNumber(), MessageType.fotaMsgType);
		JSONObject jsonfotaRequestMessage = jsoncommonwrapper.createSoftwareRequestMessage(fotaRequest.generateNonce());
		String topic = MqttManager.createPubTopic(String.valueOf(MessageType.fotaMsgType), MachineCache.getChasisSerialNumber());

		if (mqttManager.publish(jsonfotaRequestMessage.toString(), topic, 0) == 0) {
			Timers.timerFotaAck.cancel();
			Timers.timerFotaAck = new Timer();
			Timers x = new Timers();
			Timers.timerFotaAck.schedule(x.new timerTimeoutFotaACK(), CONNECTIVITY_TIMEOUT * 1000);
			receivedFotaAck = new ResultACK(-1);
			synchronized (receivedFotaAck) {
				try {
					PrintUtils.info("Start Fota Request ACK Wait "+ new Date().toString()); 
					receivedFotaAck.wait();
					Timers.timerFotaAck.cancel();
					PrintUtils.info("Exit Wait " + new Date().toString());
				} catch (InterruptedException e) {
					PrintUtils.error("Failed synchronizing receivedFotaAck: "+ e.getMessage());
					ErrorWarningEvent.storeWarning(0, ErrorWarningEvent.ERROR_ACK_LOST_CONNECT);
					receivedFotaAck.result = -1;
				}
			}
			softwareRequestOk = receivedFotaAck.result;
		}

		// Update connectivity KPIs
		if (receivedFotaAck.result == 0)
			Modem.sendKpis("OK");
		else
			Modem.sendKpis("NO");

		// Store Last telemetry timestamp
		lastTelemetryTimestamp = System.currentTimeMillis();

		// Enqueue next task
		int sendingMode = Integer.parseInt(FileSystemCache.getConfigValue(FileSystemCache.getSendingModeName()));
		if (sendingMode == Modem.SENDING_MODE_ON) {
			PrintUtils.info("Enqueuing next telemetry");
			Modem.enqueueTask(MessageCodes.afterOnboardingPhase1MsgCode);
		} else {
			Modem.enqueueNextTask(MessageCodes.afterOnboardingPhase1MsgCode, WAIT_SEND_TELEMETRY);
			PrintUtils.info("Waiting " + WAIT_SEND_TELEMETRY + "s before sending telemetry");
		}

		return softwareRequestOk;
	}

	public static int stateMachine_SoftwareDownloading() {

		PrintUtils.step("SoftwareDownloading");		
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int downloaded = -1;

		// MIDlet assets
		boolean jarDownloaded = false;
		boolean jadDownloaded = false;
		boolean modemReboot = false;
		
		byte[] decipheredFile = new byte[0];

		// Machine FW assets
		boolean doFlashing = true;
		String[][] flashList0 = new String[Fota.MAX_FOTA_ASSETS][2];
		String[][] flashList1 = new String[Fota.MAX_FOTA_ASSETS][2];
		String[][] flashList2 = new String[Fota.MAX_FOTA_ASSETS][2];

		// Create ordered asset list
		JSONArray assets = Fota.sortAssets(MessageManager.getFiles());

		// Process all received assets prior to reboot or flashing
		JSONObject file = new JSONObject();
		String dt = "";	
		for (int i=0; i<assets.length(); i++) {
			try {				
				file = assets.getJSONObject(i);
				if (file.has("DT")) {
					fotaResponse.ParseJsonMessage(file);
					fotaResponse.setNonce(fotaRequest.getNonce());
					dt = fotaResponse.getDT();
				} else {
					continue;
				}
			} catch (Exception e) {
				PrintUtils.error("Error parsing FOTA message");
			}

			PrintUtils.step("Processing " + dt);
			PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

			// TODO Remove testing filters
//			if (dt.equals("CER") || dt.equals("IMM")) {
//				//if (dt.equals("PLATFORM-CERTIFICATES") || dt.equals("CER") || dt.equals("IMM")) {				
//				PrintUtils.info("Skip");
//				continue;
//			}

			boolean verified = false;

			// Apply rules for machine assets
			if (dt.equals("IMM") || dt.equals("FOC") || dt.equals("CER") || dt.equals("KLM") || dt.equals("AHC") || dt.equals("DIV")) {

				if (!HighLevelAPI.checkMachineCommunication())
					continue;

				// Only for Machine 3 models
				if (dt.equals("KLM") && !MachineCache.getPrid().equals(MachineCache.PRID_MACHINE_3)) {
					PrintUtils.info("Machine 3 module not present");
					continue;
				}

				// Machine 3 is processed as a module 1 component
				if (dt.equals("KLM"))
					fotaResponse.setMtdModule("1");

				// Only for Machine 2 models
				if (fotaResponse.getMtdModule().equals("2") && !MachineCache.getPrid().equals(MachineCache.PRID_MACHINE_2))
					continue;

				// Substitute A assets by 1 in machine 1 and 3 machines
				if (fotaResponse.getMtdModule().equals("A") && !MachineCache.getPrid().equals(MachineCache.PRID_MACHINE_2))
					fotaResponse.setMtdModule("1");

				// Chassis fw updates must be always 0
				if (dt.equals("AHC"))
					fotaResponse.setMtdModule("0");
			}

			// Check asset version
			if (!fotaResponse.isNewVersion()) {
				PrintUtils.info("Version of " + dt + " already instaled: " + fotaResponse.getMtdVersion());
				continue;
			}

			if (dt.equals("PLATFORM-CERTIFICATES")) {

				boolean allCertsVerified = true;
				String allCsha1 = "";

				// Verify Certificate command signatures
				JSONArray ctArray = fotaResponse.getCt();
				JSONArray cshaArray = fotaResponse.getCsha();
				try {
					PrintUtils.info("Certificate Commands: " + ctArray.length());
					for (int c=0; c<ctArray.length(); c++) {
						String cert = ctArray.getString(c);
						String csha = cshaArray.getString(c);
						if (fotaResponse.verifySha(cert.getBytes(), csha)) {
							PrintUtils.info("Security verification of Certificate Command " + c + " OK");
							allCsha1 = allCsha1.concat(csha);
						}
						else {
							PrintUtils.error("Error in Certificate Command " + c + " verification");
							allCertsVerified = false;
							break;
						}
					}
				} catch (Exception e) {
					PrintUtils.error("Error parsing CSHA in " + dt);
				}

				try {
					if (allCertsVerified) {
						if (fotaResponse.verifySha(allCsha1.getBytes(), fotaResponse.getSHA())){
							PrintUtils.info("File digest SHA-1 OK");

							// Signature and Manufacturer Signature verification
							if (fotaResponse.verifySignature(fotaResponse.getSIG(), fotaResponse.getNonce(), dt, fotaResponse.getSHA(), fotaResponse.getMTD(), fotaResponse.getMSIG(), false)) {
								PrintUtils.info("Signature OK");
								if (fotaResponse.getMSIG().length()>0) {									
									if (fotaResponse.verifySignature(fotaResponse.getMSIG(), "", "", fotaResponse.getSHA(), fotaResponse.getMTD(), "", true)) {
										PrintUtils.info("Manufacturer Signature OK");
										verified = true;
									} else {
										PrintUtils.error("Manufacturer signature verification failed");
										break;
									}								
								} else {
									verified = true;
								}
							} else {
								PrintUtils.error("Signature verification failed");
								break;
							}
						}
					} else {
						PrintUtils.error("Platform certificate version " + fotaResponse.getMtdVersion() + " not fully verified");
						break;
					}
				} catch (Exception e) {
					PrintUtils.info("Error Verifying " + dt);
					break;
				}


			} else if (dt.equals("MOD_JAD") || dt.equals("MOD_JAR") || dt.equals("IMM") || dt.equals("FOC") || dt.equals("CER") || dt.equals("KLM") || dt.equals("AHC") || dt.equals("DIV")) {

				// Signature Verification
				try {
					if (fotaResponse.verifySignature(fotaResponse.getSIG(), fotaResponse.getNonce(), dt, fotaResponse.getSHA(), fotaResponse.getMTD(), "", false)) {
						PrintUtils.info("Signature verification OK");
					} else {
						PrintUtils.warning("Verification failed");
						doFlashing = false;
						break;
					}	
				} catch (Exception e) {
					PrintUtils.error("Error verifying signature");
					doFlashing = false;
					break;
				}

				PrintUtils.info("Version of " + dt + " " + fotaResponse.getMtdVersion() + " will be installed");

				String chunkUrl = fotaResponse.getCH(); // FOTA v2 only has one chunk
				String fileName = fotaResponse.GetFileNameWithoutPath(chunkUrl);

				// Download asset
				HTTPManager httpManager = new HTTPManager();
				boolean downloadOk = false;
				int downloadAttempts = 0;
				while (!downloadOk && downloadAttempts < MAX_DOWNLOAD_ATTEMPTS) {
					FileSystemManager.deleteFile(fileName);
					PrintUtils.info("Requesting file "+ fileName);
					downloadOk = httpManager.getFile(chunkUrl, fileName);
					downloadAttempts++;
					
					if (!downloadOk) {
						NetworkUtils.treatPdpError(downloadAttempts);
					}
				}
				
				// Check download
				if(downloadOk) {
					PrintUtils.info("File downloaded succesfully");
				} else {
					PrintUtils.error("Error downloading file " + fileName);
					doFlashing = false;
					break;
				}
				
				// Read asset
				FileSystemManager fs = null;
				byte[] fileContent = new byte[0];				
				try {
					fs = new FileSystemManager(fileName);
					fileContent = fs.readAllFile();
				} catch (Exception e) {
					PrintUtils.error("Error reading file " + fileName);
					doFlashing = false;
					break;
				}

				// Verify and decode asset
				PrintUtils.info("Security checkings of file: " + fileName);
				if (fotaResponse.verifySha(fileContent, fotaResponse.getSHA())) {
					PrintUtils.info("SHA-1 verification OK");
					if (fotaResponse.getMtdEnc().equals("1")) {
						try {
							decipheredFile = fotaResponse.decipherFile(fileContent);
							fileContent = null;
						} catch (Exception e) {
							PrintUtils.error("Error decyphering file");
							doFlashing = false;
							break;
						}
						if (decipheredFile.length > 0) {
							PrintUtils.info("Decyphered OK");
							PrintUtils.debug("Storing deciphered file: " + fileName +" of length: " + decipheredFile.length);
							PrintUtils.debug("File System available space: " + FileSystemManager.getAvailableMemory());
							verified = true;
						}
						else {
							PrintUtils.error("File could not be decyphered");
							doFlashing = false;
							break;
						}
					}
					else {
						PrintUtils.info("File is not ciphered");
						decipheredFile = new byte[fileContent.length];
						System.arraycopy(fileContent, 0, decipheredFile, 0, fileContent.length);
						fileContent = null;
						verified = true;
					}
				} else {
					PrintUtils.error("Error in " + fileName + " verification");
					doFlashing = false;
					break;
				}
			}

			else {
				PrintUtils.error("Unknown asset " + dt);
				break;
			}

			if (verified) {

				// Create MIDlet JAD file
				if (dt.equals("MOD_JAD")) {
					try {
						PrintUtils.debug("Current MIDlet version: " + ConfigJad.getMidletVersion());
						PrintUtils.debug("New MIDlet version: " + fotaResponse.getMtdVersion());
						FileSystemManager fsNew = new FileSystemManager(ConfigJad.getMidletName() + ".jad");
						fsNew.newFile(decipheredFile);
						jadDownloaded = true;
					} catch (Exception e) {
						PrintUtils.error("Error getting MIDlet JAD");
						doFlashing = false;
						break;
					}

					if (jarDownloaded && jadDownloaded) {
						PrintUtils.info("MIDlet files downloaded, skipping the rest of FOTA process");
						break;
					}
				}

				// Create MIDlet JAR file
				else if (dt.equals("MOD_JAR")) {			
					try {
						PrintUtils.info("New MIDlet JAR version");
						PrintUtils.info("New MIDlet Name: " + ConfigJad.getMidletName() + ".jar");
						FileSystemManager fsNew = new FileSystemManager(ConfigJad.getMidletName() + ".jar");
						fsNew.newMidlet(decipheredFile);
						jarDownloaded = true;
					} catch (Exception e) {
						PrintUtils.error("Error downloading MIDlet JAR");
						doFlashing = false;
						break;
					}

					if (jarDownloaded && jadDownloaded) {
						PrintUtils.info("MIDlet files downloaded, skipping the rest of FOTA process");
						break;
					}					
				}

				// Apply certificate Commands
				else if (dt.equals("PLATFORM-CERTIFICATES")) {
					boolean allCertsApplied = true;			
					try {
						JSONArray ct = fotaResponse.getCt();
						for (int c=0; c<ct.length(); c++) {
							PrintUtils.step("Applying certificate command " + c);
							String cmd = ct.getString(c);
							if (CertificateManager.isDirect(cmd)) {
								PrintUtils.debug("Direct mode");
								if (CertificateManager.applyFromText(cmd)) {
									PrintUtils.info("Certificate command succesfully applied");
								} else {
									PrintUtils.warning("Certificate command not applied");
									allCertsApplied = false;
								}
							} else if (CertificateManager.isIndirect(cmd)) {
								PrintUtils.debug("Indirect mode");
								if (CertificateManager.applyFromFile(cmd)) {
									PrintUtils.info("Certificate command succesfully applied");
								} else {
									PrintUtils.warning("Certificate command not applied");
									allCertsApplied = false;
								}
							} else {
								PrintUtils.error("Unknown command");
								allCertsApplied = false;
							}
						}						
					} catch (Exception e) {
						PrintUtils.error("Error parsing platform certificates");
						allCertsApplied = false;
					}

					// Store certificate version
					if (allCertsApplied) {
						PrintUtils.info("Storing new platform certificates version");
						FileSystemCache.setVersionValue("MODEM", "PLATFORM-CERTIFICATES", fotaResponse.getMtdVersion());
						modemReboot = true;
						break;
					} else {
						PrintUtils.error("Platform Certificate version " + fotaResponse.getMtdVersion() + " could not be fully applied");
						break;
					}
				}

				// Transfer Machine files
				else if (dt.equals("IMM") || dt.equals("FOC") || dt.equals("CER") || dt.equals("KLM") || dt.equals("AHC") || dt.equals("DIV")) {

					PrintUtils.info("Transfering "+ dt);

					String fileName = fotaResponse.GetFileNameWithoutPath();
					boolean doTransferToMachine = false;

					byte[] md5 = new byte[16];
					boolean md5Verified = false;				

					try{

						String moduleId = fotaResponse.getMtdModule();

						md5 = StringUtils.hexStringToByteArray(fotaResponse.getMtdChecksum());
						md5Verified = fotaResponse.verifyMd5(decipheredFile, md5);
						PrintUtils.info("MD5 verification " + md5Verified);

						if (md5Verified) {
							PrintUtils.info("MD5 check OK");
							doTransferToMachine = MachineFwUpdate.transfer(fileName, decipheredFile, dt, moduleId, md5);
							if (doTransferToMachine){
								if (dt.equals("DIV")) {
									PrintUtils.info(dt + " does not need flashing");
									if(moduleId.equals("A")) {
										FileSystemCache.setVersionValue("1", "DIV", fotaResponse.getMtdVersion());
										FileSystemCache.setVersionValue("2", "DIV", fotaResponse.getMtdVersion());
									} else {
										FileSystemCache.setVersionValue(moduleId, "DIV", fotaResponse.getMtdVersion());
									}
								} else {
									PrintUtils.debug("Order in metadata: " + fotaResponse.getMtdOrder());
									int order = Integer.parseInt(fotaResponse.getMtdOrder());
									if (moduleId.equals("A")){
										flashList1[order][0] = dt;
										flashList1[order][1] = fotaResponse.getMtdVersion();
										flashList2[order][0] = dt;
										flashList2[order][1] = fotaResponse.getMtdVersion();
									}else if (moduleId.equals("0")){
										flashList0[order][0] = dt;
										flashList0[order][1] = fotaResponse.getMtdVersion();
									}else if (moduleId.equals("1")){
										flashList1[order][0] = dt;
										flashList1[order][1] = fotaResponse.getMtdVersion();
									}else if (moduleId.equals("2")) {
										flashList2[order][0] = dt;
										flashList2[order][1] = fotaResponse.getMtdVersion();
									} else {
										PrintUtils.error("Module not recognized");
									}
								}

								PrintUtils.info("Transfer of " + dt + " was succesful");
								PrintUtils.debug("Waiting for module to reboot (60s)");
								SystemUtils.sleepThread(60000);

							}else{
								PrintUtils.debug("Transfer failed for file"+ fileName);
								doFlashing = false;
								break;
							}
						} else {
							PrintUtils.error("MD5 verification failed");
							doFlashing = false;
							break;
						}

					}catch (Exception e){
						PrintUtils.error("Error transferring file "+ fileName);
						doFlashing = false;
						break;
					}

					PrintUtils.info("Deleting file " + fileName);
					FileSystemManager.deleteFile(fileName);					
				}
				else {
					PrintUtils.error("DT " + dt + " not defined");
					doFlashing = false;
					break;
				}
			} else {
				PrintUtils.error("Asset DT \"" + dt +"\" was not verified");
				doFlashing = false;
				break;
			}
		}

		// Install new MIDlet
		if (jarDownloaded && jadDownloaded) {
			PrintUtils.info("Installing new MIDlet");
			String otapName = ConfigJad.getMidletName();
			OtapManager otapManager = new OtapManager("",FileSystemCache.getConfigValue(FileSystemCache.getApnName()), ConfigJad.getUser(), ConfigJad.getPwd(), "", otapName);

			// Send current Error/Warning/Events
			MessageCreator jsoncommonwrapper = new MessageCreator(PROTOCOL_VERSION, MachineCache.getChasisSerialNumber(), MessageType.machineInfoMsgType);
			JSONObject jsonTelemetryMessage = jsoncommonwrapper.createEventMessage();
			MachineCache.addErrorWarningEvents(jsonTelemetryMessage, false);
			PrintUtils.info("Message: " + jsonTelemetryMessage.toString());
			String topic = MqttManager.createPubTopic("1", MachineCache.getChasisSerialNumber());
			mqttManager.publish(jsonTelemetryMessage.toString(), topic, 0);

			PrintUtils.info("Starting OTAP in 30s");
			SystemUtils.sleepThread(30000);

			if (otapManager.startOtap()) {
				PrintUtils.step("Waiting for automatic reboot");
				SystemUtils.sleepThread(10000);
			} else {
				PrintUtils.error("OTAP could not start");
			}
		}

		// Start Flashing process
		if (doFlashing) {

			for(int i=0; i<Fota.MAX_FOTA_ASSETS; i++) {

				String asset2Flash = "";
				char module2flash = '0';
				String expectedVersion = "";

				if (flashList0[i][0] != null) {
					asset2Flash = flashList0[i][0];
					expectedVersion = flashList0[i][1];
					module2flash = '0';
					PrintUtils.step("Flashing " + asset2Flash + " in " + module2flash);
					if (!MachineFwUpdate.flashing(asset2Flash, module2flash, expectedVersion)) {
						PrintUtils.error("Error flashing " + asset2Flash + " in " + module2flash);
						break;
					} else {
						PrintUtils.info("Flashing " + asset2Flash + " in " + module2flash + " successful");
						PrintUtils.debug("Waiting for module to reboot (30s)");
						SystemUtils.sleepThread(30000);
					}
				}

				if (flashList1[i][0] != null) {
					asset2Flash = flashList1[i][0];
					expectedVersion = flashList1[i][1];
					module2flash = '1';
					PrintUtils.step("Flashing " + asset2Flash + " in " + module2flash);
					if (!MachineFwUpdate.flashing(asset2Flash, module2flash, expectedVersion)) {
						PrintUtils.error("Error flashing " + asset2Flash + " in " + module2flash);
						break;
					} else {
						PrintUtils.step("Flashing " + asset2Flash + " in " + module2flash + " successful");
						PrintUtils.debug("Waiting for module to reboot (30s)");
						SystemUtils.sleepThread(30000);
					}
				}

				if (flashList2[i][0] != null) {
					asset2Flash = flashList2[i][0];
					expectedVersion = flashList2[i][1];
					module2flash = '2';
					PrintUtils.step("Flashing " + asset2Flash + " in " + module2flash);
					if (!MachineFwUpdate.flashing(asset2Flash, module2flash, expectedVersion)) {
						PrintUtils.error("Error flashing " + asset2Flash + " in " + module2flash);
						break;
					} else {
						PrintUtils.step("Flashing " + asset2Flash + " in " + module2flash + " successful");
						PrintUtils.debug("Waiting for module to reboot (30s)");
						SystemUtils.sleepThread(30000);
					}
				}
			}
		}

		// Reset FOTA messages
		MessageManager.setFiles(new JSONArray());
		fotaRequest = new Fota();
		fotaResponse = new Fota();

		FileSystemCache.storeTable(FileSystemCache.getVersionTableName(), FileSystemCache.getVersionTable());
		
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		// Reboot if necessary (Apply certificate commands)
		if (modemReboot) {
			PrintUtils.info("Rebooting modem in 10s to apply changes");
			SystemUtils.sleepThread(10000);
			SystemUtils.rebootModem();
		}

		return downloaded;
	}

	public static int stateMachine_PrepareForSafeReboot() {

		PrintUtils.step("PrepareSafeReboot");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		MessageCreator jsoncommonwrapper = new MessageCreator(PROTOCOL_VERSION, MachineCache.getChasisSerialNumber(), MessageType.machineInfoMsgType);
		JSONObject jsonTelemetryMessage = jsoncommonwrapper.createEventMessage();

		MachineCache.addErrorWarningEvents(jsonTelemetryMessage, false);
		PrintUtils.info("Message: " + jsonTelemetryMessage.toString());

		String topic = MqttManager.createPubTopic("1", MachineCache.getChasisSerialNumber());
		mqttManager.publish(jsonTelemetryMessage.toString(), topic, 0);

		return 0;
	}

	public static int stateMachine_SafeReboot() {
		
		PrintUtils.step("SafeReboot");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");

		int time2reboot = 0;

		if (noWaitforReboot) {
			time2reboot = 5000;
			PrintUtils.info("Rebooting immediately (5s)");
		} else {
			time2reboot = 1000 * Integer.parseInt(FileSystemCache.getConfigValue(FileSystemCache.getSafeRebootName()));
		}

		PrintUtils.step("Rebooting in " + time2reboot / 1000 + " seconds");

		Timers.timerReboot = new Timer();
		Timers x = new Timers();
		Timers.timerReboot.schedule(x.new timerRebootTask(), time2reboot);

		int rebootOk = -1;

		while(rebootOk < 0) {
			PrintUtils.info("Waiting for reboot");
			SystemUtils.sleepThread(3000);
		}

		return rebootOk;
	}

	public static void stateMachine_InstantReboot() {
		
		PrintUtils.step("InstantReboot");
		PrintUtils.debug("Memory: " + SystemUtils.getAvailableMemory() + "\n");
		
		int time2reboot = 1000 * Integer.parseInt(FileSystemCache.getConfigValue(FileSystemCache.getSafeRebootName()));
		PrintUtils.step("Rebooting in " + time2reboot/1000 + "s");
		SystemUtils.sleepThread(time2reboot);
		SystemUtils.rebootModem();
	}

	public static int telemetryRetrieval(int module) {

		int telemetryRetrievalOk = -1;

		byte mmiAddress = 0x00;
		int eo = -2;

		switch (module) {
		case 1:
			mmiAddress = LinkLayer.MMI_1_ADDRESS;
			eo = MachineCache.getEoModuleOne();
			break;

		case 2:
			mmiAddress = LinkLayer.MMI_2_ADDRESS;
			eo = MachineCache.getEoModuleTwo();
			break;

		default:
			PrintUtils.error("Module " + module + " does not exist");
		}

		// Reset events, consumption, telemetry and psf
		MachineCache.resetJsonFields();

		HighLevelAPI serialApi = HighLevelAPI.getInstance();

		if (eo >= -1) {

			if (serialApi.openStreamAndSession()) {

				serialApi.setStartPointer(mmiAddress, eo);

				Vector events = serialApi.requestEventsBuffer(mmiAddress);
				Vector params = serialApi.requestParameters(mmiAddress);
				int lastEORead = serialApi.getEOPointer(mmiAddress);

				if (serialApi.areAvailableData(mmiAddress)) {
					moreTelemetry = true;
					PrintUtils.info("There are more events to send of Module " + module);

					if (module == 1)
						ErrorWarningEvent.storeEvent(serialApi.getEOPointer(mmiAddress), ErrorWarningEvent.EVENT_M1_MORE_EVENTS_REMAINING);
					else if (module == 2)
						ErrorWarningEvent.storeEvent(serialApi.getEOPointer(mmiAddress),ErrorWarningEvent.EVENT_M2_MORE_EVENTS_REMAINING);
				}

				serialApi.closeStreamAndSession();

				if (events == null || params == null) {
					if (events == null)
						PrintUtils.error("Events can not be read");
					if (params == null)
						PrintUtils.error("Params can not be read");
				} 

				else {

					// Reset statistics
					Statistics.tlm.reset();
					Statistics.cns.reset();
					Statistics.ev.reset();
					Statistics.modem.reset();

					MachineCache.processParams(params, mmiAddress);
					MachineCache.processEvents(events);

					try {
						MachineCache.getPsf().put("EO".hashCode(), lastEORead);
						MachineCache.getPsf().put("PAV".hashCode(), 1);
						MachineCache.setEoModuleCached(module, lastEORead);
						telemetryRetrievalOk = 0;
					} catch (Exception e) {
						PrintUtils.error("Error adding PSF to JSON");
					}
				}
			}
			
			telemetryRetrievalOk = 0;
		} 

		else {
			
			PrintUtils.error("EO value not valid: " + eo);		
			moreTelemetry = false;
		}

		return telemetryRetrievalOk;
	}

	public static int telemetrySent(int module) {

		int telemetrySentOk = -1;

		boolean sendTelemetry = true;

		// Create Current message
		MessageCreator jsoncommonwrapper = new MessageCreator(PROTOCOL_VERSION, MachineCache.getChasisSerialNumber(), MessageType.machineInfoMsgType);
		JSONObject jsonTelemetry = jsoncommonwrapper.createTelemetryMessage(module);

		// Filter by opt in		
		switch (MachineCache.getOptInValue()) {

		case MachineCache.OPTIN_SEND_ALL:
			PrintUtils.info("Opt-in value : " + MachineCache.getOptInValue() + " send all events");
			break;

		case MachineCache.OPTIN_OVERWRITE_ACTION1:
			PrintUtils.info("Opt-in value : " + MachineCache.getOptInValue() + " overwrite action1 value");
			jsonTelemetry = (TidyUpMessage.overwriteAction1Value(jsonTelemetry));
			break;

		case MachineCache.OPTIN_DO_NOT_SEND_ACTION2:
			PrintUtils.info("Opt-in value : " + MachineCache.getOptInValue() + " remove action2 events");
			jsonTelemetry = (TidyUpMessage.filterAction2Events(jsonTelemetry));
			break;

		case MachineCache.OPTIN_DO_NOT_SEND:
			PrintUtils.info("Opt-in value : " + MachineCache.getOptInValue() + " data won't be send");
			sendTelemetry = false;
			break;

		default:
			PrintUtils.info("Opt-in value : " + MachineCache.getOptInValue() + " not recognized");
			sendTelemetry = false;
		}

		if (sendTelemetry) {

			// Add Temperature and Radio Signal Strength to Module 1 telemetry
			if (module == 1) {
				if (ModemCache.getModemTemperature() != 0 && ModemCache.getModemTemperatureTimestamp() != 0) {
					MachineCache.getEv().add(ModemCache.eventModemTemperature());
					ModemCache.resetModemTemperature();
					Statistics.modem.addRead(1);
				}
				ErrorWarningEvent.storeEvent(RadioSignalStrength.getRadioSignalStrength(), ErrorWarningEvent.EVENT_SIGNAL_STRENGHT);
			}

			jsonTelemetry = MachineCache.addErrorWarningEvents(jsonTelemetry, true);

			Statistics.compute(jsonTelemetry);

			ErrorWarningEvent.storeEvent(Statistics.cns.getRead(), ErrorWarningEvent.EVENT_CNS_READ);
			ErrorWarningEvent.storeEvent(Statistics.cns.getIgnored(), ErrorWarningEvent.EVENT_CNS_IGNORED);
			ErrorWarningEvent.storeEvent(Statistics.ev.getRead(), ErrorWarningEvent.EVENT_EV_READ);
			ErrorWarningEvent.storeEvent(Statistics.ev.getIgnored(), ErrorWarningEvent.EVENT_EV_IGNORED);
			ErrorWarningEvent.storeEvent(Statistics.tlm.getRead(), ErrorWarningEvent.EVENT_TLM_READ);
			ErrorWarningEvent.storeEvent(Statistics.tlm.getIgnored(), ErrorWarningEvent.EVENT_TLM_IGNORED);
			ErrorWarningEvent.storeEvent(Statistics.modem.getRead(), ErrorWarningEvent.EVENT_EV_MODEM_PRODUCED);
			ErrorWarningEvent.storeEvent(Statistics.modem.getIgnored(), ErrorWarningEvent.EVENT_EV_MODEM_IGNORED);

			jsonTelemetry = MachineCache.addErrorWarningEvents(jsonTelemetry, false);

			PrintUtils.debug("CNS events read: " + Statistics.cns.getRead());
			PrintUtils.debug("CNS events ignored: " + Statistics.cns.getIgnored());
			PrintUtils.debug("EV events read: " + Statistics.ev.getRead());
			PrintUtils.debug("EV events ignored: " + Statistics.ev.getIgnored());
			PrintUtils.debug("TLM events read: " + Statistics.tlm.getRead());
			PrintUtils.debug("TLM events ignored: " + Statistics.tlm.getIgnored());
			PrintUtils.debug("Modem events read: " + Statistics.modem.getRead());
			PrintUtils.debug("Modem events ignored: " + Statistics.modem.getIgnored());

			JSONObject jsonTelemetryOptIn = TidyUpMessage.filterByOptIn(jsonTelemetry);

			String topic = MqttManager.createPubTopic("1", MachineCache.getChasisSerialNumber());

			if (jsonTelemetryOptIn.has("M")) {				

				lastTelemetryTimestamp = System.currentTimeMillis();

				PrintUtils.info("Message: " + jsonTelemetryOptIn.toString());
				mqttManager.publish(jsonTelemetryOptIn.toString(), topic, 0);
				PrintUtils.debug("Consumptions: " + Statistics.getEntries(jsonTelemetryOptIn, "CNS"));
				PrintUtils.debug("Events: " + Statistics.getEntries(jsonTelemetryOptIn, "EV"));
			}

			if ((FileSystemCache.getConfigValue(FileSystemCache.getSendRawDataName())).equalsIgnoreCase("true")) {

				PrintUtils.info("Raw data");
				String debugTopic = MqttManager.createPubTopic("12", MachineCache.getChasisSerialNumber());
				jsoncommonwrapper = new MessageCreator(PROTOCOL_VERSION, MachineCache.getChasisSerialNumber(), MessageType.debugModeMsgType);
				String jsonRawDataMessage = jsoncommonwrapper.createRawDataMessage(ArraysUtils.byteArrayToString(HighLevelAPI.getInstance().getRawData().get()), jsonTelemetry).toString();
				mqttManager.publish(jsonRawDataMessage, debugTopic, 0);
				HighLevelAPI.getInstance().cleanSerialRawData();
			}
		}

		MachineCache.resetJsonFields();

		telemetrySentOk = 0;

		return telemetrySentOk;
	}
}