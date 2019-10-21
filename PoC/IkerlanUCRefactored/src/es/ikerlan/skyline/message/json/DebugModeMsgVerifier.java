package es.ikerlan.skyline.message.json;

import java.util.List;
import java.util.Map;

import org.json.me.JSONException;
import org.json.me.JSONObject;

public class DebugModeMsgVerifier implements JSONVerifier {

	Map<String, Object> parse;
	
	@Override
	public void verify(JSONObject jsonMessage) throws JSONException{
		// TODO Auto-generated method stub
		//return null;
	}

	@Override
	public void verify(JSONObject jsonMessage, List<String> labels) throws JSONException{
		// TODO Auto-generated method stub
		//return null;
	}

	@Override
	public Map<String, Object> getValues(JSONObject jsonMessage) {
		return parse;
	}

}
