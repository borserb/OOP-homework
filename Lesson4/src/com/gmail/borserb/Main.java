package com.gmail.borserb;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comp myComp = new Comp("I7", 8, "1050ti");
		USBFlash usbFlashOne = new USBFlash(16, "Samsung", "Travel");
		USBFlash usbFlashTwo = new USBFlash(64, "Apach", "Travel");
		USBFlash usbFlashThree = new USBFlash(4, "Apple", "Travel");
		USBFlash usbFlashFour = new USBFlash(8, "Toshiba", "Travel");
		USBFlash usbFlashFive = new USBFlash(32, "Dell", "Travel");
		myComp.connectUSB(usbFlashOne);
		
		
		USBFlash[] flashArray = new USBFlash[] {
				usbFlashOne,usbFlashTwo,usbFlashThree,usbFlashFour,usbFlashFive
		};
		
		for (USBFlash usbFlash : flashArray) {
			System.out.println(usbFlash);
		}
		
		
		Arrays.sort(flashArray);
		System.out.println();
		
		for (USBFlash usbFlash : flashArray) {
			System.out.println(usbFlash);
		}
		
		

	}

}
