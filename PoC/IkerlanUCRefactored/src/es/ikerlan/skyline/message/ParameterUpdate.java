package es.ikerlan.skyline.message;

import java.util.Vector;

import org.json.me.JSONArray;

import es.ikerlan.skyline.modem.filesystem.FileSystemCache;

public class ParameterUpdate {
	
	public static final int MAX_POLLING_INTERVAL = 86400;
	
	private static Vector parametersAbleToBeUpdated = new Vector(13);	
	private static JSONArray fparTriplesArray;
	private static String fid = "";
	private static JSONArray parametersValueArray = new JSONArray();
	
	public static void fillParameterUpdateList() {
		
		parametersAbleToBeUpdated.addElement(FileSystemCache.getAfterOnboardingPeriodName());
		parametersAbleToBeUpdated.addElement(FileSystemCache.getSendRawDataName());
		parametersAbleToBeUpdated.addElement(FileSystemCache.getMaxEventsName());
		parametersAbleToBeUpdated.addElement(FileSystemCache.getSafeRebootName());
		parametersAbleToBeUpdated.addElement(FileSystemCache.getApnName());
		parametersAbleToBeUpdated.addElement(FileSystemCache.getSendingModeName());
		parametersAbleToBeUpdated.addElement(FileSystemCache.getPollingIntervalActiveName());
		parametersAbleToBeUpdated.addElement(FileSystemCache.getPollingIntervalSleepName());
		parametersAbleToBeUpdated.addElement(FileSystemCache.getPollingIntervalDeepName());
		parametersAbleToBeUpdated.addElement(FileSystemCache.getResetConfigname());
		parametersAbleToBeUpdated.addElement("bufferUpdate");
		parametersAbleToBeUpdated.addElement("eventProfile");
		parametersAbleToBeUpdated.addElement("invalidParameter");
		
	}

	public static Vector getParametersAbleToBeUpdated() {
		return parametersAbleToBeUpdated;
	}

	public static String getFid() {
		return fid;
	}

	public static void setFid(String fid) {
		ParameterUpdate.fid = fid;
	}

	public static JSONArray getFparTriplesArray() {
		return fparTriplesArray;
	}

	public static void setFparTriplesArray(JSONArray fparTriplesArray) {
		ParameterUpdate.fparTriplesArray = fparTriplesArray;
	}

	public static JSONArray getParametersValueArray() {
		return parametersValueArray;
	}

	public static void setParametersValueArray(JSONArray parametersValueArray) {
		ParameterUpdate.parametersValueArray = parametersValueArray;
	}

}
