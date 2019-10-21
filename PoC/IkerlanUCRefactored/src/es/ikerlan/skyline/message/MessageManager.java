package es.ikerlan.skyline.message;

import java.util.Map;
import java.util.Vector;

import org.json.me.JSONArray;
import org.json.me.JSONException;
import org.json.me.JSONObject;

import es.ikerlan.skyline.message.json.JSONVerificationFactory;
import es.ikerlan.skyline.modem.core.Behavior;
import es.ikerlan.skyline.modem.core.ModemCache;
import es.ikerlan.skyline.modem.otap.Fota;
import es.ikerlan.skyline.utils.PrintUtils;
import es.ikerlan.skyline.utils.StringUtils;

public class MessageManager {

	private static Vector queue = new Vector();

	private static String did = "";
	private static String[] dt;
	private static JSONArray files = new JSONArray();

	public static String lastFid = "";

	static String responseStatus = "";
	static int protocol = -1;
	static int type = -1;
	static String Fid = "";

	public static void handleMessage(JSONObject message, String topic) {

		// FIXME Aspect - inject logging traces describing the message type received,
		// using PrintUtils advice

		int messageType = -1;
		try {
			String messageTypeStr = topic.split("/")[2];
			messageType = Integer.parseInt(messageTypeStr);
		} catch (Exception e) {
			PrintUtils.error("Error parsing message type");
		}

		PrintUtils.step("Message Received with Type: " + messageType);

		switch (messageType) {
		case MessageType.connectivityMsgType: // Connectivity test
			processConnectivityMsg(message, messageType);
			break;
		case MessageType.onboardingMsgType: // Onboarding
			processOnboardingMsg(message, messageType);
			break;
		case MessageType.remoteParametersUpdateMsgType: // Remote Parameters Updating
			processRemoteParametersUpdateMsg(message, messageType);
			break;
		case MessageType.eoMsgType: // After onboarding
			try {
				processEoMsg(message, messageType);
			} catch (JSONException e) {
				e.printStackTrace();
			}
			break;
		case MessageType.fotaMsgType: // FOTA v2 message
			processFotaMsg(message, messageType);
			break;
		default:
			PrintUtils.warning("Message type not recognized");
		}

		// FIXME Aspect - inject logging traces successful processing of the message
		// type received, using PrintUtils advice
	}

	private static void processConnectivityMsg(JSONObject message, int messageType) {
		// PrintUtils.info("Connectivity Test ACK Message");
		// FIXME Aspect - inject logging traces describing the processing of this
		// message, using PrintUtils advice

		// FIXME Aspect - inject verification advice
		// Advice
//		Map<String, Object> values;
//		try {
//			values = JSONVerificationFactory.getVerifier(MessageType.connectivityMsgType).verify(message);
//			responseStatus = (String) values.get("ST");
//			protocol = (int) values.get("P");
//			type = (int) values.get("T");
//		} catch (JSONException e) {
//			PrintUtils.error("Error parsing Connectivity Test ACK");
//		}

		synchronized (Behavior.receivedConnectivityAck) {
			if (responseStatus.equals("OK") && protocol == ModemCache.getProtocol() && type == messageType) {
				Behavior.receivedConnectivityAck.result = 0;
				Behavior.receivedConnectivityAck.notify();
			} else {
				PrintUtils.warning("ACK not valid");
			}
		}

		// FIXME Aspect - inject logging traces describing the successful processing of
		// this message, using PrintUtils advice

	}

	private static void processOnboardingMsg(JSONObject message, int messageType) {
//		PrintUtils.info("Onboarding ACK Message");
		// FIXME Aspect - inject logging traces describing the processing of this
		// message, using PrintUtils advice

		// FIXME Aspect - inject verification advice
		// Advice
//		Map<String, Object> values;
//		try {
//			values = JSONVerificationFactory.getVerifier(MessageType.onboardingMsgType).verify(message);
//			responseStatus = (String) values.get("ST");
//			protocol = (int) values.get("P");
//			type = (int) values.get("T");
//		} catch (JSONException e) {
//			PrintUtils.error("Error parsing Onboarding ACK");
//		}
		synchronized (Behavior.receivedOnboardingAck) {
			if (responseStatus.equals("OK") && protocol == ModemCache.getProtocol() && type == messageType) {
				Behavior.receivedOnboardingAck.result = 0;
				Behavior.receivedOnboardingAck.notify();
			} else {
				PrintUtils.warning("ACK not valid");
			}
		}
		// FIXME Aspect - inject logging traces describing the successful processing of
		// this message, using PrintUtils advice
	}

	private static void processRemoteParametersUpdateMsg(JSONObject message, int messageType) {
		int protocol = -1;
		int type = -1;
		String Fid = "";
		String Fx = "";
//		PrintUtils.info("Remote Parameter Update Message");
		// FIXME Aspect - inject logging traces describing the processing of this
		// message, using PrintUtils advice

		// FIXME Aspect - inject verification advice
		// Advice
//		Map<String, Object> values;
//		try {
		// Parsing
//			values = JSONVerificationFactory.getVerifier(MessageType.remoteParametersUpdateMsgType).verify(message);
//			protocol = (int) values.get("P");
//			ModemCache.setLastProtocolRemoteParametersUpdate(protocol);
//			type = (int) values.get("T");
//			Fid = (String) values.get("FID");
//			Fx = (String) values.get("FX");
//		} catch (JSONException e) {
//			PrintUtils.error("Error parsing Onboarding ACK");
//		}
		// Enqueue message
		try {
			if ((protocol == ModemCache.PROTOCOL_ONE || protocol == ModemCache.PROTOCOL_TWO)
					&& (type == MessageType.remoteParametersUpdateMsgType) && (Fx.equals("set"))) {
				JSONObject enrichedMessage = message.put(MessageCodes.msgCodeKey,
						MessageCodes.remoteParamUpdateMsgCode);
				MessageManager.enqueueMessage(enrichedMessage);

			} else {
				PrintUtils.warning("Parameter update message not valid");
			}

		} catch (Exception e) {
			PrintUtils.error("Error adding Message Code to the Remote Parameters Updating message");
			ErrorWarningEvent.storeError(0, ErrorWarningEvent.ERROR_MALFORMED_JSON);
			PrintUtils.error("Error parsing Parameter update message");
		}
		// FIXME Aspect - inject logging traces describing the successful processing of
		// this message, using PrintUtils advice
	}

	private static void processFotaMsg(JSONObject message, int messageType) {
		String responseStatus = "";
		int protocol = -1;
		int type = -1;
//		PrintUtils.info("Software Update Message");
		// FIXME Aspect - inject logging traces describing the processing of this
		// message, using PrintUtils advice

		// FIXME Aspect - inject verification advice
		// Advice
//		Map<String, Object> values;
//		try {
//			values = JSONVerificationFactory.getVerifier(MessageType.fotaMsgType).verify(message);
//			responseStatus = (String) values.get("STR");
//			protocol = (int) values.get("P");
//			type = (int) values.get("T");
//			did = (String) values.get("DID");
//			files = (JSONArray)values.get("AL");
//		} catch(Exception e) {
//			PrintUtils.error("Error parsing message");
//		}
		try {
			synchronized (Behavior.receivedFotaAck) {
				if (responseStatus.equals("OK") && protocol == Fota.FOTA_PROTOCOL && type == messageType
						&& did.length() > 0) {
					Behavior.receivedFotaAck.result = 0;
					Behavior.receivedFotaAck.notify();

					PrintUtils.info("FOTA message succesfully processed");

				} else {
					PrintUtils.warning("ACK not valid");
				}
			}

		} catch (Exception e) {
			PrintUtils.error("Error parsing message");
		}
		// FIXME Aspect - inject logging traces describing the successful processing of
		// this message, using PrintUtils advice
	}

	private static void processEoMsg(JSONObject message, int messageType) throws  JSONException {
//		PrintUtils.info("After Onboarding Response Message");
		// FIXME Aspect - inject logging traces describing the processing of this
		// message, using PrintUtils advice

		// FIXME Aspect - inject verification advice
		// Advice

		Map<String, Object> values;
		synchronized (Behavior.receivedEOAck) {
			if (responseStatus.equals("OK") && protocol == ModemCache.getProtocol() && type == messageType
					&& Fid.equals(lastFid)) {
//				try {
//					JSONVerificationFactory.getVerifier(MessageType.eoMsgType).verify(message);
//				} catch (JSONException e) {
//					PrintUtils.error("Error getting status from JSON");
//					throw e;
//				}
				
				values = JSONVerificationFactory.getVerifier(MessageType.eoMsgType).getValues(message);
				
				responseStatus = (String) values.get("ST");
				protocol = (int) values.get("P");
				type = (int) values.get("T");
				Fid = (String) values.get("FID");
			} else {
				PrintUtils.warning("ACK not valid");
			}
		}
		// FIXME Aspect - inject logging traces describing the successful processing of
		// this message, using PrintUtils advice
	}

	public static JSONObject readNextMessage() {
		PrintUtils.debug("Reading next message");
		JSONObject message = null;
		if (queue.size() > 0) {
			message = (JSONObject) queue.firstElement();
		}
		return message;
	}

	public static void enqueueMessage(JSONObject message) {
		synchronized (queue) {
			queue.addElement(message);
			queue.notify();
		}
	}

	public static void removeNextMessage() {
		PrintUtils.debug("Removing next message");
		if (queue.size() > 0) {
			queue.removeElementAt(0);
		}
	}

	public static void waitQueueMessage() {
		PrintUtils.debug("Waiting for a message");
		synchronized (MessageManager.queue) {
			if (queue.size() == 0) {
				try {
					queue.wait();
				} catch (InterruptedException e) {
					PrintUtils.error("Error waiting for queue message");
				}
			}
		}
	}

	public static void clearQueue() {
		queue.removeAllElements();
	}

	public static boolean checkUpdateEventProfile(String parameter) {
		boolean isEventProfile = false;
		if (parameter.startsWith("GB_") || parameter.startsWith("SB_"))
			isEventProfile = true;

		return isEventProfile;
	}

	public static Vector getQueue() {
		return queue;
	}

	public static String getDid() {
		return did;
	}

	public static String[] getDt() {
		return dt;
	}

	public static JSONArray getFiles() {
		return files;
	}

	public static void setFiles(JSONArray files) {
		MessageManager.files = files;
	}
}