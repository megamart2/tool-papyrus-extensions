package es.ikerlan.skyline.message.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.me.JSONArray;
import org.json.me.JSONException;
import org.json.me.JSONObject;

import es.ikerlan.skyline.message.ErrorWarningEvent;
import es.ikerlan.skyline.modem.core.Behavior;
import es.ikerlan.skyline.modem.core.MachineCache;
import es.ikerlan.skyline.utils.PrintUtils;

public class EoMsgVerifier implements JSONVerifier {
	
	Map<String, Object> values;

	@Override
	public void verify(JSONObject message) throws JSONException {
		values = new HashMap<>();
		
		String responseStatus = message.getJSONObject("M").getString("ST");
		values.put("ST", new Integer(responseStatus));
		int protocol = message.getInt("P");
		values.put("P", new Integer(protocol));
		int type = message.getInt("T");
		values.put("T", new Integer(type));
		String Fid = message.getJSONObject("M").getString("FID");
		values.put("FID", new Integer(Fid));
		
		JSONObject eoJson;
		JSONObject mJson;
		JSONObject optInJson;
		JSONObject optInStartJson;
		JSONObject optInEndJson;
		
		mJson = message.getJSONObject("M");
		JSONArray fresJsonArray = mJson.getJSONArray("FRES");
		eoJson = fresJsonArray.getJSONObject(0).getJSONObject("EO");
		optInJson = fresJsonArray.getJSONObject(1);
		optInStartJson = fresJsonArray.getJSONObject(2);
		optInEndJson = fresJsonArray.getJSONObject(3);
		PrintUtils.debug("optInJson: " + optInJson.toString());
		PrintUtils.debug("optInStartJson: " + optInStartJson.toString());
		PrintUtils.debug("optInEndJson: " + optInEndJson.toString());
		if (optInJson.has("opt-in")) {
			int optInReceived = optInJson.getInt("opt-in");
			PrintUtils.info("Set opt in to: " + optInReceived);
			MachineCache.setOptInValue(optInReceived);
			values.put("opt-in", new Integer(optInReceived));
		}
		if (optInStartJson.has("opt-in-start")) {
			long optInStartReceived = optInStartJson.getLong("opt-in-start");
			PrintUtils.info("Set opt in start to: " + optInStartReceived);
			MachineCache.setOptInStart(optInStartReceived);
			values.put("opt-in-start", new Long(optInStartReceived));
		}
		if (optInEndJson.has("opt-in-end")) {
			long optInEndReceived = optInEndJson.getLong("opt-in-end");
			PrintUtils.info("Set opt in end to: " + optInEndReceived);
			MachineCache.setOptInEnd(optInEndReceived);
			values.put("opt-in-end", new Long(optInEndReceived));
		}
		if (eoJson.has("s1")) {
			int eoModuleOne = fresJsonArray.getJSONObject(0).getJSONObject("EO").getInt("s1");
			MachineCache.setEoModuleOne(eoModuleOne);
			MachineCache.setEoModuleOneCached(eoModuleOne);
			ErrorWarningEvent.storeEvent(eoModuleOne, ErrorWarningEvent.EVENT_RECEIVED_EO_MODULE_ONE);
			values.put("s1", new Integer(eoModuleOne));

			if (eoJson.has("s2")) {
				int eoModuleTwo = fresJsonArray.getJSONObject(0).getJSONObject("EO").getInt("s2");
				MachineCache.setEoModuleTwo(eoModuleTwo);
				MachineCache.setEoModuleTwoCached(eoModuleTwo);
				ErrorWarningEvent.storeEvent(eoModuleTwo, ErrorWarningEvent.EVENT_RECEIVED_EO_MODULE_TWO);
				values.put("s2", new Integer(eoModuleTwo));
			}
			
			Behavior.receivedEOAck.result = 0;
			//Behavior.receivedEOAck.notify();
		}
		
	}

	@Override
	public void verify(JSONObject jsonMessage, List<String> labels) throws JSONException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Map<String, Object> getValues(JSONObject message) {
		if (values == null || values.isEmpty())
			try {
				verify(message);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return values;
	}

}
