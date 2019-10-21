package es.ikerlan.skyline.message;

import org.json.me.JSONArray;
import org.json.me.JSONException;
import org.json.me.JSONObject;

import es.ikerlan.skyline.communications.tsl.event.AllEventsEvent;
import es.ikerlan.skyline.modem.Statistics;
import es.ikerlan.skyline.modem.core.MachineCache;
import es.ikerlan.skyline.utils.PrintUtils;

public class TidyUpMessage {

	private static final int MASK_VALUE = 30;


	public static JSONObject filterAction2Events(JSONObject jsonToSend){
		Statistics.cns.setIgnored(Statistics.getEntries(jsonToSend, "CNS"));
		JSONObject jsonFiltered = removeEventTypeFromJson(jsonToSend,AllEventsEvent.ACTION2_HISTORY_EVENT);
		Statistics.cns.setRead(0);
		return jsonFiltered;		
	}

	public static JSONObject overwriteAction1Value(JSONObject jsonToSend){

		try {
			JSONArray cnsJsonField = ((JSONObject) jsonToSend.get("M")).getJSONArray("CNS");				
			for (int eventIndex = 0; eventIndex < cnsJsonField.length(); eventIndex++) {
				JSONArray fieldPAR = ((JSONObject)cnsJsonField.getJSONObject(eventIndex)).getJSONArray("PAR");
				((JSONObject)fieldPAR.getJSONObject(0)).put("PVI",MASK_VALUE);
			}
		} catch (JSONException e) {
			PrintUtils.error("Error changing blend value to mask");
			e.printStackTrace();
		}

		return jsonToSend;
	}

	public static JSONObject filterByOptIn(JSONObject jsonToSend){

		PrintUtils.debug("Opt-In Start: " + MachineCache.getOptInStart());
		PrintUtils.debug("Opt-In End: " + MachineCache.getOptInEnd());

		JSONObject message = new JSONObject();
		try {
			message = jsonToSend.getJSONObject("M");
		} catch (JSONException e) {
			PrintUtils.error("Error parsing message");
		}

		// Check CNS
		JSONArray cnsJsonAux = new JSONArray();
		try {
			JSONArray cnsJson = message.getJSONArray("CNS");
			for (int eventIndex = 0; eventIndex < cnsJson.length(); eventIndex++) {
				long ts = cnsJson.getJSONObject(eventIndex).getLong("TS");
				if(MachineCache.getOptInStart() < ts && ts < MachineCache.getOptInEnd()){
					//PrintUtils.debug("CNS inside opt-in-start and opt-in-end range");
					cnsJsonAux.put(cnsJson.getJSONObject(eventIndex));
					Statistics.cns.addRead(1);
				} else {
					Statistics.cns.addIgnored(1);
					//PrintUtils.debug("CNS out of opt-in-start and opt-in-end range");
				}
			}
			if (cnsJsonAux.length()>=0){
				message.remove("CNS");
				message.put("CNS", cnsJsonAux);
			}
		} catch (JSONException e) {
			PrintUtils.error("Error Checking CNS Json field");
		}

		// Check TLM 
		JSONArray tlmJsonAux = new JSONArray();
		try {
			JSONArray tlmJsonField = jsonToSend.getJSONObject("M").getJSONArray("TLM");
			for (int eventIndex = 0; eventIndex < tlmJsonField.length(); eventIndex++) {
				long ts = tlmJsonField.getJSONObject(eventIndex).getLong("TS");
				if(MachineCache.getOptInStart() < ts && ts < MachineCache.getOptInEnd()){
					//PrintUtils.debug("TLM inside opt-in-start and opt-in-end range");
					tlmJsonAux.put(tlmJsonField.getJSONObject(eventIndex));
					Statistics.tlm.addRead(1);
				} else {
					//PrintUtils.debug("TLM out of opt-in-start and opt-in-end range");
					Statistics.tlm.addIgnored(1);
				}
			}
			if (tlmJsonAux.length()>=0){
				message.remove("TLM");
				message.put("TLM", tlmJsonAux);
			}
		} catch (JSONException e) {
			PrintUtils.error("Error Checking TLM Json field");
		}
		// Check EV 
		JSONArray evJsonAux = new JSONArray();
		try {
			JSONArray evJsonField = jsonToSend.getJSONObject("M").getJSONArray("EV");
			for (int eventIndex = 0; eventIndex < evJsonField.length(); eventIndex++) {
				JSONObject event = evJsonField.getJSONObject(eventIndex);
				long ts = event.getLong("TS");
				int type = event.getInt("EID");
				int issue = 0;
				if (type == AllEventsEvent.EVENT_EVENT || type == AllEventsEvent.WARNING_EVENT || type == AllEventsEvent.ERROR_EVENT) {
					issue = event.getJSONArray("PAR").getJSONObject(1).getInt("PVI");	
				}
				if(Statistics.isModemEvent(type, issue) || (MachineCache.getOptInStart() < ts && ts < MachineCache.getOptInEnd())){					
					//PrintUtils.debug("EVENT " + issue + " inside opt-in-start and opt-in-end range");
					evJsonAux.put(event);	
					Statistics.ev.addRead(1);
				} else {
					//PrintUtils.debug("EVENT " + issue + " out of opt-in-start and opt-in-end range");
					Statistics.ev.addIgnored(1);
				}
			}
			if (evJsonAux.length()>=0){
				message.remove("EV");
				message.put("EV", evJsonAux);
			}
		} catch (JSONException e) {
			PrintUtils.error("Error Checking EV Json field");
		}	

		return jsonToSend;
	}



	private static JSONObject removeEventTypeFromJson(JSONObject jsonToSend, int eventType) {

		JSONArray cnsJsonAux = new JSONArray();
		PrintUtils.debug("Checking CNS Json field");
		try {
			JSONArray cnsJsonField = ((JSONObject) jsonToSend.get("M")).getJSONArray("CNS");
			for (int eventIndex = 0; eventIndex < cnsJsonField.length(); eventIndex++) {
				if(((JSONObject)cnsJsonField.getJSONObject(eventIndex)).getInt("S") != eventType){
					cnsJsonAux.put((JSONObject)cnsJsonField.getJSONObject(eventIndex));
				}else{
					PrintUtils.info("Filtered Event from CNS with type: " + eventType);
				}				
			}
			if (cnsJsonAux.length()>=0){
				JSONObject fieldM = (JSONObject) jsonToSend.get("M");
				fieldM.remove("CNS");
				fieldM.put("CNS", cnsJsonAux);
			}
		} catch (JSONException e) {
			PrintUtils.error("Error filtering CNS");
		}
		PrintUtils.debug("Checking EV Json field");
		JSONArray evJsonAux = new JSONArray();
		try {
			JSONArray evJsonField = ((JSONObject) jsonToSend.get("M")).getJSONArray("EV");
			for (int eventIndex = 0; eventIndex < evJsonField.length(); eventIndex++) {
				if(((JSONObject)evJsonField.getJSONObject(eventIndex)).getInt("EID") != eventType){
					evJsonAux.put((JSONObject)evJsonField.getJSONObject(eventIndex));
				}else{
					PrintUtils.info("Filtered Event from EV with type: " + eventType);
					Statistics.ev.addRead(-1);
					Statistics.ev.addIgnored(1);
				}
			}
			if (evJsonAux.length()>=0){
				JSONObject fieldM = (JSONObject) jsonToSend.get("M");
				fieldM.remove("EV");
				fieldM.put("EV", evJsonAux);
			}
		} catch (JSONException e) {
			PrintUtils.error("Error filtering EV");
		}

		return jsonToSend;
	}

}
