package es.ikerlan.skyline.message.json;

import es.ikerlan.skyline.message.MessageType;

public class JSONVerificationFactory {
	public static JSONVerifier getVerifier (int type) {
		JSONVerifier verifier = null;
		if (type == MessageType.eoMsgType) {
			verifier = new EoMsgVerifier();
		}else if (type == MessageType.machineInfoMsgType) {
			verifier = new MachineInfoMsgVerifier();
		}else if (type == MessageType.onboardingMsgType) {
			verifier = new OnboardingMsgVerifier();
		}else if (type == MessageType.fotaMsgType) {
			verifier = new FotaMsgVerifier();
		}else if (type == MessageType.remoteParametersUpdateMsgType) {
			verifier = new RemoteParametersUpdateMsgVerifier();
		}else if (type == MessageType.connectivityMsgType) {
			verifier = new ConnectivityMsgVerifier();
		}else if (type == MessageType.debugModeMsgType) {
			verifier = new DebugModeMsgVerifier();
		}
		
		return verifier;
		
	}
}
