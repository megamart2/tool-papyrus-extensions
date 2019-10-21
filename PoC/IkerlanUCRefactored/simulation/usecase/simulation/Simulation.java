package usecase.simulation;

import org.json.me.JSONException;
import org.json.me.JSONObject;

import es.ikerlan.skyline.message.MessageManager;
import es.ikerlan.skyline.message.MessageType;

public class Simulation {

	public static void main(String[] args) {

		try {
			
			JSONObject message;
			String topic = "a/a/" + MessageType.eoMsgType;
			
			String json = "{\"P\":2, \"T\":11, \"M\" : {\n" + 
					"\"ST\":\"0\",\"FID\":\"11111111\",\n" + 
					"\"FRES\":[\n" + 
					"{\"EO\":{\"s1\":-1, \"s2\":-1}}, {\"opt-in\":3}, {\"opt-in-start\":1540000000}, {\"opt-in-end\": 1545000000}]\n" + 
					"}\n" + 
					"}";
			
			message = new JSONObject(json);
			
			MessageManager.handleMessage(message,topic);
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
	
	}
}