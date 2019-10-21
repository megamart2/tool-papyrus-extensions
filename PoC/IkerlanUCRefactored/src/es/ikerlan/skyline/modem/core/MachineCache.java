package es.ikerlan.skyline.modem.core;

import java.util.Vector;

import org.json.me.JSONArray;
import org.json.me.JSONObject;

public class MachineCache {

	public static final String PRID_MACHINE_2 = null;
	public static final String PRID_MACHINE_1 = null;
	public static final String PRID_MACHINE_3 = null;
	public static final int OPTIN_SEND_ALL = 0;
	public static final int OPTIN_OVERWRITE_ACTION1 = 1;
	public static final int OPTIN_DO_NOT_SEND_ACTION2 = 2;
	public static final int OPTIN_DO_NOT_SEND = 3;

	public static void addWarningErrorEvents(JSONObject eventEvent) {
		// TODO Auto-generated method stub
		
	}

	public static Vector getMarket() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getBrand() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getModuleOneSerial() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getModuleTwoSerial() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getChasisMachineModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getChasisHwRevision() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getFwrChassis() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getpVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getAgid() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void setPsf(JSONObject jsonObject) {
		// TODO Auto-generated method stub
		
	}

	public static JSONArray getPsf() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getFwrMM1() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getModuleOneMhbu() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getModuleOneCfwr() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getModuleOneCrfwr() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getMfwr() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getEv() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getCns() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getTlm() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getFwrMM2() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getModuleTwoMhbu() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getModuleTwoCfwr() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector getModuleTwoCrfwr() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void setChasisSerialNumber(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void setModuleOneSerial(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void setModuleTwoSerial(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void setPrid(String pridMachine1) {
		// TODO Auto-generated method stub
		
	}

	public static void resetJsonFields() {
		// TODO Auto-generated method stub
		
	}

	public static void setChasisMachineModel(Object requestModuleModel) {
		// TODO Auto-generated method stub
		
	}

	public static void setChasisHwRevision(Object requestHwRevision) {
		// TODO Auto-generated method stub
		
	}

	public static void setFwrChassis(Object requestFirmwareVersion) {
		// TODO Auto-generated method stub
		
	}

	public static String getPrid() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void setFwrMM1(Object requestFirmwareVersion) {
		// TODO Auto-generated method stub
		
	}

	public static void setModuleOneMhbu(Object requestMHBUFirmwareVersion) {
		// TODO Auto-generated method stub
		
	}

	public static void setModuleOneCfwr(Object requestMachinePRIDMainFirmwareVersion) {
		// TODO Auto-generated method stub
		
	}

	public static void setModuleOneCrfwr(Object requestMachine4PRIDFirmwareVersion) {
		// TODO Auto-generated method stub
		
	}

	public static void setFwrMM2(Object requestFirmwareVersion) {
		// TODO Auto-generated method stub
		
	}

	public static void setModuleTwoMhbu(Object requestMHBUFirmwareVersion) {
		// TODO Auto-generated method stub
		
	}

	public static void setModuleTwoCfwr(Object requestMachinePRIDMainFirmwareVersion) {
		// TODO Auto-generated method stub
		
	}

	public static void setModuleTwoCrfwr(Object requestMachine4PRIDFirmwareVersion) {
		// TODO Auto-generated method stub
		
	}

	public static void setMfwr(Object requestMachine3FirmwareVersion) {
		// TODO Auto-generated method stub
		
	}

	public static void setpVersion(Object requestProtocolVersion) {
		// TODO Auto-generated method stub
		
	}

	public static void setAgid(Object requestAgentId) {
		// TODO Auto-generated method stub
		
	}

	public static String getChasisSerialNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void setEoModuleOne(int i) {
		// TODO Auto-generated method stub
		
	}

	public static void setEoModuleTwo(int i) {
		// TODO Auto-generated method stub
		
	}

	public static Object getEoModuleTwoCached() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void setEoModuleOneCached(Object eoPointer) {
		// TODO Auto-generated method stub
		
	}

	public static Object getEoModuleOneCached() {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean detectUrgency(Vector events1, String urgentEvent) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void setEoModuleTwoCached(Object eoPointer) {
		// TODO Auto-generated method stub
		
	}

	public static boolean detectUrgency(Vector events1, Integer urgentEvent) {
		// TODO Auto-generated method stub
		return false;
	}

	public static JSONObject addErrorWarningEvents(JSONObject jsonTelemetryMessage, boolean b) {
		return jsonTelemetryMessage;
		// TODO Auto-generated method stub
		
	}

	public static int getEoModuleOne() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int getEoModuleTwo() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void processParams(Vector params, byte mmiAddress) {
		// TODO Auto-generated method stub
		
	}

	public static void processEvents(Vector events) {
		// TODO Auto-generated method stub
		
	}

	public static void setEoModuleCached(int module, int lastEORead) {
		// TODO Auto-generated method stub
		
	}

	public static int getOptInValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int getOptInStart() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int getOptInEnd() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void setOptInValue(int optInReceived) {
		// TODO Auto-generated method stub
		
	}

	public static void setOptInStart(long optInStartReceived) {
		// TODO Auto-generated method stub
		
	}

	public static void setOptInEnd(long optInEndReceived) {
		// TODO Auto-generated method stub
		
	}

}
