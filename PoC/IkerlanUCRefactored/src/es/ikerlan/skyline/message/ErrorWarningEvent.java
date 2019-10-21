package es.ikerlan.skyline.message;

import org.json.me.JSONArray;
import org.json.me.JSONException;
import org.json.me.JSONObject;

import es.ikerlan.skyline.modem.core.MachineCache;
import es.ikerlan.skyline.utils.PrintUtils;



public class ErrorWarningEvent{
	
	// EVENT codes
	public final static int EVENT_ISSUE_NUMBER_EQUAL_ZERO = 90002;
	public final static int EVENT_M1_MORE_EVENTS_REMAINING = 90005;
	public final static int EVENT_M2_MORE_EVENTS_REMAINING = 90006;
	public final static int EVENT_RECEIVED_EO_MODULE_ONE = 90007;
	public final static int EVENT_RECEIVED_EO_MODULE_TWO = 90008;
	public final static int MACHINE_CLOCK_SET_UP = 90013;
	//public final static int EVENT_TALKTIME = 90060;
	public final static int EVENT_CNS_READ = 90061;
	public final static int EVENT_CNS_IGNORED = 90062;
	public final static int EVENT_EV_READ = 90065;
	public final static int EVENT_EV_IGNORED = 90066;
	public final static int EVENT_EV_MODEM_PRODUCED = 90067;
	public final static int EVENT_EV_MODEM_IGNORED = 90068;
	public final static int EVENT_TLM_READ = 90069;
	public final static int EVENT_TLM_IGNORED = 90070;
	public final static int EVENT_SIGNAL_STRENGHT = 90071;

	// WARNING codes
	public final static int WARNING_M1_BUFFER_20_NR = 91000;
	public final static int WARNING_M2_BUFFER_20_NR = 91001;
	public final static int WARNING_ISSUE_NUMBER_EQUAL_ZERO = 91002;
	public final static int TIMESTAMP_EQUAL_ZERO = 91003;
	public final static int EO_STORED_LOWER_RECEIVED = 91004;
	public final static int WARNING_CHASSIS_NR = 91010;
	public final static int WARNING_M1_NR = 91011;
	public final static int WARNING_M2_NR = 91012;
	public final static int WARNING_GPRS_REGIS = 91020;
	public final static int WARNING_GSM_REGIS = 91021;
	public final static int WARNING_REQ_NET_TIME = 91022;
	public final static int WARNING_CHASSIS_FILE_TRANSFERRING = 91080;
	public final static int WARNING_M1_FILE_TRANSFERRING = 91081;
	public final static int WARNING_M2_FILE_TRANSFERRING = 91082;
	public final static int WARNING_CHASSIS_FILE_FLASHING = 91083;
	public final static int WARNING_M1_FILE_FLASHING = 91084;
	public final static int WARNING_M2_FILE_FLASHING = 91085;

	// ERROR codes
	public final static int ERROR_M1_BUFFER_20_NR = 92000;
	public final static int ERROR_M2_BUFFER_20_NR = 92001;
	public final static int ERROR_ISSUE_NUMBER_EQUAL_ZERO = 92002;
	public final static int ERROR_CHASSIS_NR = 92010;
	public final static int ERROR_M1_NR = 92011;
	public final static int ERROR_M2_NR = 92012;
	public final static int ERROR_MACHINE_CLOCK_SET_UP = 92014;
	public final static int ERROR_GPRS_REGIS = 92020;
	public final static int ERROR_GSM_REGIS = 92021;
	public final static int ERROR_ACT_SER_PORT = 92023;
	public final static int ERROR_SET_MQTT_CONECT = 92025;
	public final static int ERROR_PUBLISH_TOPIC = 92026;
	public final static int ERROR_SUBS_TOPIC = 92027;
	public final static int ERROR_GET_MODEM_TEMPERATURE = 92031;
	public final static int ERROR_PARAM_NOT_RECOG = 92041;
	public final static int ERROR_MALFORMED_JSON = 92042;
	public final static int ERROR_ACK_LOST_CONNECT = 92051;
	public final static int ERROR_ACK_LOST_ONBOARDING = 92052;
	public final static int ERROR_ACK_LOST_EO = 92053;
	public final static int ERROR_CHASSIS_FILE_TRANSFERRING = 92080;
	public final static int ERROR_M1_FILE_TRANSFERRING = 92081;
	public final static int ERROR_M2_FILE_TRANSFERRING = 92082;
	public final static int ERROR_CHASSIS_FILE_FLASHING = 92083;
	public final static int ERROR_M1_FILE_FLASHING = 92084;
	public final static int ERROR_M2_FILE_FLASHING = 92085;
	public final static int ERROR_NOT_SIGNAL_RSP = 92054;
	
	

	public static void storeEvent(int paramZero, int errorCode){
		JSONObject eventEvent = createEventPayload(0, paramZero, errorCode);
		MachineCache.addWarningErrorEvents(eventEvent);
	}
	
	public static void storeEvent(float paramZero, int errorCode){
		JSONObject eventEvent = createEventPayload(0, paramZero, errorCode);
		MachineCache.addWarningErrorEvents(eventEvent);
	}
	
	public static void storeError(int paramZero, int errorCode){
		JSONObject errorEvent = createEventPayload(4, paramZero, errorCode);
		MachineCache.addWarningErrorEvents(errorEvent);
		
	}
	
	public static void storeWarning(int paramZero, int errorCode){
		JSONObject warningEvent = createEventPayload(5, paramZero, errorCode);
		MachineCache.addWarningErrorEvents(warningEvent);
	}
	
	private static JSONObject createEventPayload (int eventType, float paramZero, int errorCode){
		JSONObject event = new JSONObject();
		JSONArray parametersJson = new JSONArray();	
		try {
			//Create PAR array
			JSONObject paramZeroJson = new JSONObject();
			paramZeroJson.put("PID", 0);
			paramZeroJson.put("PVI", paramZero);
			parametersJson.put(paramZeroJson);
			JSONObject paramErrorCode = new JSONObject();
			paramErrorCode.put("PID", 1);
			paramErrorCode.put("PVI", errorCode);
			parametersJson.put(paramErrorCode);
			event.put("EID", eventType);
			event.put("TS", System.currentTimeMillis()/1000);
			event.put("PAR",parametersJson);
		} catch (JSONException e) {
			PrintUtils.error("Error creating event with PVI: "+ errorCode );
			e.printStackTrace();
		}
		return event;	
	}
	
	private static JSONObject createEventPayload (int eventType, int paramZero, int errorCode){
		JSONObject event = new JSONObject();
		JSONArray parametersJson = new JSONArray();	
		try {
			//Create PAR array
			JSONObject paramZeroJson = new JSONObject();
			paramZeroJson.put("PID", 0);
			paramZeroJson.put("PVI", paramZero);
			parametersJson.put(paramZeroJson);
			JSONObject paramErrorCode = new JSONObject();
			paramErrorCode.put("PID", 1);
			paramErrorCode.put("PVI", errorCode);
			parametersJson.put(paramErrorCode);
			event.put("EID", eventType);
			event.put("TS", System.currentTimeMillis()/1000);
			event.put("PAR",parametersJson);
		} catch (JSONException e) {
			PrintUtils.error("Error creating event with PVI: "+ errorCode );
			e.printStackTrace();
		}
		return event;	
	}
	
}