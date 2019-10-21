package es.ikerlan.skyline.modem.timer;

import java.util.Timer;
import java.util.TimerTask;

public class Timers{

	public class timerTimeoutFotaACK extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}

	}
	public class timerTimeoutPolling extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}

	}
	public class timerRebootTask extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}

	}
	public class timerTimeoutEOACK extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}

	}
	public class timerTimeoutConnectivityACK extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}

	}
	public class timerModemTemperatureTask extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}
	}
	public class timerTimeoutOnboardingACK extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}
	}

	public static Timer timerModemTemperature;
	public static Timer timerTimeoutConnectivity;
	public static Timer timerTimeoutOnboarding;
	public static Timer timerTimeoutEO;
	public static Timer timerReboot;
	public static Timer timerPolling;
	public static Timer timerFotaAck;


}
