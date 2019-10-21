package es.ikerlan.skyline.modem.otap;

import org.json.me.JSONArray;
import org.json.me.JSONObject;

public class Fota {

	public static final int FOTA_PROTOCOL = 0;
	public static final int MAX_FOTA_ASSETS = 0;

	public String generateNonce() {
		// TODO Auto-generated method stub
		return null;
	}

	public static JSONArray sortAssets(JSONArray files) {
		// TODO Auto-generated method stub
		return null;
	}

	public void ParseJsonMessage(JSONObject file) {
		// TODO Auto-generated method stub
		
	}

	public String getDT() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getNonce() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNonce(Object nonce) {
		// TODO Auto-generated method stub
		
	}

	public void setMtdModule(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getMtdModule() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isNewVersion() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getMtdVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	public JSONArray getCt() {
		// TODO Auto-generated method stub
		return null;
	}

	public JSONArray getCsha() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean verifySha(byte[] bytes, String csha) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getSHA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getSIG() {
		// TODO Auto-generated method stub
		return null;
	}

	public JSONArray getMSIG() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getMTD() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean verifySignature(Object sig, Object nonce, String dt, String sha, Object mtd, JSONArray msig,
			boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifySignature(JSONArray msig, String nonce, String dt, String sha, Object mtd, String string,
			boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifySignature(Object sig, Object nonce, String dt, String sha, Object mtd, String string,
			boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getCH() {
		// TODO Auto-generated method stub
		return null;
	}

	public String GetFileNameWithoutPath(String chunkUrl) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getMtdEnc() {
		// TODO Auto-generated method stub
		return null;
	}

	public byte[] decipherFile(byte[] fileContent) {
		// TODO Auto-generated method stub
		return null;
	}

	public String GetFileNameWithoutPath() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getMtdChecksum() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean verifyMd5(byte[] decipheredFile, byte[] md5) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getMtdOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
