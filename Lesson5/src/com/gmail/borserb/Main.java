package com.gmail.borserb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("A.txt");
		try (InputStream is = new FileInputStream("A.txt")) {
			// System.out.println(is.available() );
			byte[] buffer = new byte[7];

			int readBuffer = is.read(buffer);

			System.out.println(Arrays.toString(buffer));
			System.out.println(readBuffer);
		} catch (IOException e) { 

		}
	}

}
