package es.ikerlan.skyline.message.json;

import java.util.List;
import java.util.Map;

import org.json.me.JSONException;
import org.json.me.JSONObject;

public interface JSONVerifier {
	void verify (JSONObject jsonMessage) throws JSONException;
	void verify (JSONObject jsonMessage, List<String> labels) throws JSONException;
	Map<String, Object> getValues(JSONObject jsonMessage);
}
