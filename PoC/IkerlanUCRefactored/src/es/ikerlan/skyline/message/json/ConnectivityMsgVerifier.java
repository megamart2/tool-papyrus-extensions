package es.ikerlan.skyline.message.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.me.JSONException;
import org.json.me.JSONObject;

public class ConnectivityMsgVerifier implements JSONVerifier {

	Map<String, Object> parse;
	
	@Override
	public void verify(JSONObject jsonMessage) throws JSONException {
Map<String, Object> parse = new HashMap<>();
		
		parse.put("P",  jsonMessage.getInt("P"));
		parse.put("T",  jsonMessage.getInt("T"));
		parse.put("ST",  jsonMessage.getJSONObject("M").getString("ST"));
		
		//return parse;
	}

	@Override
	public void verify(JSONObject jsonMessage, List<String> labels) throws JSONException{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Map<String, Object> getValues(JSONObject jsonMessage) {
		if(parse == null || parse.isEmpty()) try {
				verify(jsonMessage);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		return parse;
	}

}
