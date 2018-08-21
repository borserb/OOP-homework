package com.gmail.borserb;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in = new File("C:\\Users\\Admin\\Desktop\\Java Star\\JavaOOP\\Lesson5b\\A.txt");
		File out = new File(in.getName());

		try {
			StreamWork.copyFile(in, out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
