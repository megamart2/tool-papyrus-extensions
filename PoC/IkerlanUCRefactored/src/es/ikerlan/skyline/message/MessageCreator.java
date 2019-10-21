package es.ikerlan.skyline.message;

import org.json.me.JSONArray;
import org.json.me.JSONException;
import org.json.me.JSONObject;

import es.ikerlan.skyline.communications.tsl.HighLevelAPI;
import es.ikerlan.skyline.modem.ConfigJad;
import es.ikerlan.skyline.modem.core.MachineCache;
import es.ikerlan.skyline.modem.core.ModemCache;
import es.ikerlan.skyline.utils.PrintUtils;

public class MessageCreator {

	JSONObject json = new JSONObject();

	public MessageCreator(int protocolVersion, String mid, int typeMessage) {

		try {
			// Protocol version
			json.put("P", protocolVersion);
			// IMEI
			json.put("MID", mid);
			// Market Country
			json.put("MK", MachineCache.getMarket());
			// Brand
			json.put("B", MachineCache.getBrand());
			// type
			json.put("T", typeMessage);

		} catch (JSONException e) {
			PrintUtils.error("Error creating generic Json Wrapper");
		}

	}

	public JSONObject createConnectivtyTestMessage() {

		JSONObject jsonConnTestMessage = this.json;

		try {

			// Message Body
			JSONObject messageBody = new JSONObject();
			messageBody.put("S", ModemCache.getImei() + ";" + ModemCache.getImei());
			// Add message to JSON template
			jsonConnTestMessage.put("M", messageBody);
			PrintUtils.info("Connectivity est Message: " + jsonConnTestMessage.toString());

		} catch (JSONException e) {
			PrintUtils.error("Error creating Connectivty Test Message");
		}

		return jsonConnTestMessage;
	}

	public JSONObject createEOMessage(String fid) {
		
		JSONObject jsonReverseRemoteControlMessage = this.json;
		try {

			// Create FPAR JSON Array
			JSONArray fpar = new JSONArray();
			// Create JSON EO
			JSONObject jsonEOinner = new JSONObject();
			jsonEOinner.put("s1", MachineCache.getModuleOneSerial());
			PrintUtils.info("Machine PRID:" + MachineCache.getBrand());
			if (MachineCache.getBrand().equalsIgnoreCase(MachineCache.PRID_MACHINE_2) ){
				jsonEOinner.put("s2", MachineCache.getModuleTwoSerial());
			}
			JSONObject jsonEO = new JSONObject();
			jsonEO.put("EO", jsonEOinner);
			// Fill FPAR Array
			fpar.put(jsonEO);
			fpar.put("opt-in");
			fpar.put("opt-in-start");
			fpar.put("opt-in-end");

			// Create message Body
			JSONObject messageBody = new JSONObject();
			messageBody.put("FPAR", fpar);
			messageBody.put("FX", "get");
			messageBody.put("FID", fid);
			jsonReverseRemoteControlMessage.put("M", messageBody);
			PrintUtils.info("EO Message: " + jsonReverseRemoteControlMessage.toString());
			
		} catch (JSONException e) {
			PrintUtils.error("Error creating EOMessage Message");
		}

		return jsonReverseRemoteControlMessage;
	}

	public JSONObject createMachineInformationMessage() {
		
		JSONObject jsonMachineInformationMessage = this.json;
		
		try {
			// Create MI message part
			JSONObject jsonMI = new JSONObject();
			jsonMI.put("MMOD", MachineCache.getChasisMachineModel());
			jsonMI.put("HWR", MachineCache.getChasisHwRevision());
			jsonMI.put("FWR", MachineCache.getFwrChassis());
			jsonMI.put("PRV", MachineCache.getpVersion());
			jsonMI.put("PRID", MachineCache.getBrand());

			// Create GWI message part
			JSONObject jsonGWI = new JSONObject();
			jsonGWI.put("GWID", ModemCache.getImei());
			jsonGWI.put("GWMOD", ModemCache.getGwmod());
			jsonGWI.put("GWV", ModemCache.getGwv());
			jsonGWI.put("ICCID", ModemCache.getImei());
			// Create GWSV message part
			jsonGWI.put("GWSV", ModemCache.getGwsv());
			JSONObject jsonApp = new JSONObject();
			jsonApp.put("APPV", ConfigJad.getMidletVersion());
			jsonGWI.put("APP", jsonApp);

			// Create PSF part
			JSONObject jsonPSF = new JSONObject();
			jsonPSF.put("AGID", MachineCache.getAgid());

			// Create message Body
			JSONObject messageBody = new JSONObject();
			messageBody.put("MI", jsonMI);
			messageBody.put("GWI", jsonGWI);
			messageBody.put("PSF", jsonPSF);
			jsonMachineInformationMessage.put("M", messageBody);
			PrintUtils.info("Machine Information Message: " + jsonMachineInformationMessage.toString());

		} catch (JSONException e) {
			PrintUtils.error("Error creating Machine Information Message");
		}

		return jsonMachineInformationMessage;
	}

	public JSONObject createMachineOnboardingMessage() {

		JSONObject jsonMachineOnboardMessage = this.json;

		// Type of message: 3
		try {
			jsonMachineOnboardMessage.put("T", 3);
			JSONObject messageBodyGWI = new JSONObject();
			messageBodyGWI.put("GWID", ModemCache.getImei());
			JSONObject messageBody = new JSONObject();
			messageBody.put("GWI", messageBodyGWI);
			jsonMachineOnboardMessage.put("M", messageBody);
			PrintUtils.info("Machine On Boarding Message: "+ jsonMachineOnboardMessage.toString());
		} catch (JSONException e) {
			PrintUtils.error("Error creating Machine Onboarding Message");
		}

		return jsonMachineOnboardMessage;

	}
	
	public JSONObject createEventMessage() {
		JSONObject jsonTelemetryMessage = this.json;
		
		MachineCache.setPsf(new JSONObject());
		try {
			MachineCache.getPsf().put("AGID".hashCode(), HighLevelAPI.DEFAULT_AGENTID);
			MachineCache.getPsf().put("PAV".hashCode(), 1);
		} catch (JSONException e) {
			PrintUtils.error("Error creating PSF field before Modem reboot");
		}
		
		try {
			// Add MMID
			jsonTelemetryMessage.put("MMID", MachineCache.getModuleOneSerial());
			// Message Body creation
			JSONObject messageBody = new JSONObject();
			// Create MI part
			JSONObject jsonTelemetryMI = new JSONObject();
			jsonTelemetryMI.put("MMOD", "N/A");
			jsonTelemetryMI.put("HWR", "N/A");
			jsonTelemetryMI.put("FWR", MachineCache.getFwrMM1());
			jsonTelemetryMI.put("MHBU", MachineCache.getModuleOneMhbu());
			jsonTelemetryMI.put("CFWR", MachineCache.getModuleOneCfwr());
			jsonTelemetryMI.put("CRFWR", MachineCache.getModuleOneCrfwr());
			jsonTelemetryMI.put("MFWR", MachineCache.getMfwr());
			messageBody.put("MI", jsonTelemetryMI);

			// Create CNS part
			messageBody.put("CNS", new JSONArray());
			messageBody.put("EV", MachineCache.getEv());
			messageBody.put("PSF", MachineCache.getPsf());
			messageBody.put("TLM", new JSONArray());

			jsonTelemetryMessage.put("M", messageBody);
			
			PrintUtils.info("Event Message: "+ jsonTelemetryMessage.toString());

		} catch (JSONException e1) {
			PrintUtils.error("Error generating Event Message");
		}
		
		return jsonTelemetryMessage;		
	}

	public JSONObject createTelemetryMessage(int model) {
		
		JSONObject jsonTelemetryMessage = this.json;
		
		switch (model) {
		
		case 1:
		{
			try {
				// Add MMID
				jsonTelemetryMessage.put("MMID", MachineCache.getModuleOneSerial());
				// Message Body creation
				JSONObject messageBody = new JSONObject();
				// Create MI part
				JSONObject jsonTelemetryMI = new JSONObject();
				jsonTelemetryMI.put("MMOD", "N/A");
				jsonTelemetryMI.put("HWR", "N/A");
				jsonTelemetryMI.put("FWR", MachineCache.getFwrMM1());
				jsonTelemetryMI.put("MHBU", MachineCache.getModuleOneMhbu());
				jsonTelemetryMI.put("CFWR", MachineCache.getModuleOneCfwr());
				jsonTelemetryMI.put("CRFWR", MachineCache.getModuleOneCrfwr());
				jsonTelemetryMI.put("MFWR", MachineCache.getMfwr());
				messageBody.put("MI", jsonTelemetryMI);

				messageBody.put("CNS", MachineCache.getCns());
				messageBody.put("EV", MachineCache.getEv());
				messageBody.put("PSF", MachineCache.getPsf());
				messageBody.put("TLM", MachineCache.getTlm());

				jsonTelemetryMessage.put("M", messageBody);

			} catch (JSONException e1) {
				PrintUtils.error("Error generating Telemetry Message");
			}
			
			break;
		}
		case 2:
			
			try {
				// Add MMID
				jsonTelemetryMessage.put("MMID", MachineCache.getModuleTwoSerial());
				// Message Body creation
				JSONObject messageBody = new JSONObject();
				// Create MI part
				JSONObject jsonTelemetryMI = new JSONObject();
				jsonTelemetryMI.put("MMOD", "N/A");
				jsonTelemetryMI.put("HWR", "N/A");
				jsonTelemetryMI.put("FWR", MachineCache.getFwrMM2());
				jsonTelemetryMI.put("MHBU", MachineCache.getModuleTwoMhbu());
				jsonTelemetryMI.put("CFWR", MachineCache.getModuleTwoCfwr());
				jsonTelemetryMI.put("CRFWR", MachineCache.getModuleTwoCrfwr());
				jsonTelemetryMI.put("MFWR", MachineCache.getMfwr());
				messageBody.put("MI", jsonTelemetryMI);

				messageBody.put("CNS", MachineCache.getCns());
				messageBody.put("EV", MachineCache.getEv());
				messageBody.put("PSF", MachineCache.getPsf());
				messageBody.put("TLM", MachineCache.getTlm());

				jsonTelemetryMessage.put("M", messageBody);

			} catch (JSONException e1) {
				PrintUtils.error("Error generating Telemetry Message");
			}
			
			break;			
		}
		

		return jsonTelemetryMessage;

	}

	public JSONObject createRemoteParametersUpdateMessage(String fid, String st, JSONArray fres) {

		JSONObject jsonRemoteParametersUpdateMessage = this.json;
		try {
			JSONObject messageBody = new JSONObject();
			messageBody.put("FID", fid);
			messageBody.put("ST", st);
			messageBody.put("FRES", fres);

			jsonRemoteParametersUpdateMessage.put("M", messageBody);
			
			PrintUtils.info("Remote Parameters Update Message: "+ jsonRemoteParametersUpdateMessage.toString());

		} catch (JSONException e) {
			PrintUtils.error("Error generating Remote Parameters Update Message");
		}
 
		return jsonRemoteParametersUpdateMessage;
	}
	
	public JSONObject createErrorUpdateParameterMessage(String fid, String st){
		JSONObject jsonErrorUpdateParameterMessage = this.json;
		try{
			JSONObject messageBody = new JSONObject();
			messageBody.put("FID", fid);
			messageBody.put("ST", st);
			
			jsonErrorUpdateParameterMessage.put("M", messageBody);
			
			PrintUtils.info("Error Update Parameter Message: "+ jsonErrorUpdateParameterMessage.toString());
					
		} catch (JSONException e) {
			PrintUtils.error("Error generating Error Update Parameter Message");
		}		
		return jsonErrorUpdateParameterMessage;
	}
	
	public JSONObject createRawDataMessage(String rawData, JSONObject telemetry){
		
		JSONObject jsonRawDataMessage = this.json;
		JSONObject jsonDebugMessage = new JSONObject();
		try {
			jsonDebugMessage.put("raw-data", rawData);
			jsonDebugMessage.put("telemetry-json", telemetry);
			
			jsonRawDataMessage.put("M", jsonDebugMessage);
			
			PrintUtils.info("Raw Data Message: "+ jsonRawDataMessage.toString());
			
		} catch (JSONException e) {
			PrintUtils.error("Error creating RawData Message");
		}
		
		return jsonRawDataMessage;
	}
	
public JSONObject createSoftwareRequestMessage(String nonce){
		
		JSONObject jsonSoftwareUpdateMessage = this.json;
		JSONObject messageBody = new JSONObject();
		try {
			messageBody.put("DM", 0);
			messageBody.put("N", nonce);
			
			jsonSoftwareUpdateMessage.put("M", messageBody);
			
			PrintUtils.info("Software Request Message: "+ jsonSoftwareUpdateMessage.toString());
			
		} catch (JSONException e) {
			PrintUtils.error("Error creating Software Request Message");
			
		}
		
		return jsonSoftwareUpdateMessage;
	}

}