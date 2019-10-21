package es.ikerlan.skyline.communications.tsl;

import java.util.Vector;

public class HighLevelAPI {

	public static final boolean DEFAULT_AGENTID = false;

	public static HighLevelAPI getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean openStreamAndSession() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object requestModuleModel(byte chassisAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object requestHwRevision(byte chassisAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object requestFirmwareVersion(byte chassisAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	public String requestChassisProductId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String requestModuleSerialNumber(byte mmi1Address) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object requestMHBUFirmwareVersion(byte mmi1Address) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object requestMachinePRIDMainFirmwareVersion(byte mmi1Address) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object requestMachine4PRIDFirmwareVersion(byte mmi1Address) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object requestMachine3FirmwareVersion(byte mmi1Address) {
		// TODO Auto-generated method stub
		return null;
	}

	public String requestChassisSerialNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object requestProtocolVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object requestAgentId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeStreamAndSession() {
		// TODO Auto-generated method stub
		
	}

	public Vector requestParameters(byte mmi1Address) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setParameter(byte mmi1Address, int bufferAddress, long valueToWrite) {
		// TODO Auto-generated method stub
		
	}

	public int requestMachineState(byte mmi1Address) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setStartPointer(byte mmi2Address, Object eoModuleTwoCached) {
		// TODO Auto-generated method stub
		
	}

	public Vector requestEventsBuffer(byte mmi2Address) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getEOPointer(byte mmi2Address) {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean checkMachineCommunication() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean areAvailableData(byte mmiAddress) {
		// TODO Auto-generated method stub
		return false;
	}

	public Data getRawData() {
		// TODO Auto-generated method stub
		return null;
	}

	public void cleanSerialRawData() {
		// TODO Auto-generated method stub
		
	}

}
