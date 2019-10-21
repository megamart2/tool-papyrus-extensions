package es.ikerlan.skyline.message.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.me.JSONException;
import org.json.me.JSONObject;

public class FotaMsgVerifier implements JSONVerifier {

	Map<String, Object> parse;
	
	@Override
	public void verify(JSONObject jsonMessage) throws JSONException {
		parse = new HashMap<>();
		
		parse.put("P",  jsonMessage.getInt("P"));
		parse.put("T",  jsonMessage.getInt("T"));
		parse.put("STR",  jsonMessage.getJSONObject("M").getString("STR"));
		parse.put("AL",  jsonMessage.getJSONObject("M").getJSONArray("AL"));
		
       //return parse;
	}

	@Override
	public void verify(JSONObject jsonMessage, List<String> labels) throws JSONException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Map<String, Object> getValues(JSONObject jsonMessage) {
		if(parse == null || parse.isEmpty())
			try {
				verify(jsonMessage);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		return parse;
	}

}
