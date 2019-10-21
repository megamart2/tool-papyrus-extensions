package es.ikerlan.skyline.utils;

import es.ikerlan.skyline.modem.ConfigJad;

public class PrintUtils {

	public static void log(String text) {
		System.out.println("\n--------LOG----------");
		System.out.println(text);
		System.out.println("--------END LOG----------\n");
	}

	public static void step(String text) {
		System.out.println("\n----------------------------------------  ");
		System.out.println(text);
		System.out.println("----------------------------------------  ");
	}

	public static void start(String text) {
		System.out.println("\n");
		System.out.println("----------------------------------------  ");
		System.out.println("----------------------------------------  ");
		System.out.println(text);
		System.out.println("----------------------------------------  ");
		System.out.println("----------------------------------------  ");
	}

	public static void debug(String text) {
		if (ConfigJad.getDebug())
			System.out.println("[debug] " + text);
	}

	public static void info(String text) {
		if (ConfigJad.getInfo())
			System.out.println("[info] " + text);
	}

	public static void io(String text) {
		System.out.println("[I/0] " + text);
	}

	public static void warning(String text) {
		System.out.println("[WARNING] " + text);
	}

	public static void error(String text) {
		System.out.println("\n");
		System.out.println("[ERROR] " + text);
		System.out.println("\n");
	}

	public static void emptyLine() {
		System.out.println("\n");
	}
	
	public static void printByteArray(byte[] array, int offset, int num){
//		int convertedByte;
//		if (num > 0){
//			try{
//				System.out.print("[serial] ");
//				for(int i=0;i < num;i++){
//					convertedByte=(int)array[offset+i] & 0xFF;
//					System.out.print(Integer.toHexString(convertedByte) + " ");
//				}
//
//			}catch (ArrayIndexOutOfBoundsException e){
//				System.out.println("ArrayIndexOutOfBoundsException in setATCommandForProcessing");
//			}
//			System.out.println("");
//		}
	}

}
