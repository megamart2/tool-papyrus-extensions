package es.ikerland.skyline.message.aspects;

import org.json.me.JSONException;
import org.json.me.JSONObject;

import es.ikerlan.skyline.message.MessageManager;
import es.ikerlan.skyline.message.json.JSONVerificationFactory;
import es.ikerlan.skyline.utils.PrintUtils;
/**
 * this aspect makes the verification work when a process method of MessageManager
 *  is called
 */
privileged aspect VerificationAspect {
/**
 * this pointcut picks out all the process... methods in MessageManager
 * @param message : the JSONObject
 * @param messageType : an integer flag for the message type
 */
pointcut verification(JSONObject message,int messageType) : 
	call(void MessageManager.process*(JSONObject,int)) && args(message,messageType);

void around(JSONObject message,int messageType) : verification(message,messageType){
    try {
    	//System.out.println("Verifiying");
		JSONVerificationFactory.getVerifier(messageType).verify(message);
		proceed(message,messageType);
	} catch (JSONException e) {
		// Error during verification
		PrintUtils.error(" JSONException throwed during verification");
		e.printStackTrace();
	}
}
}
