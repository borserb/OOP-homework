package com.gmail.borserb;

import java.io.File;

import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFilter mFF = new MyFilter("txt", "zip");
		File folder1 = new File("A");
		File folder2 = new File("B");

		folder2.mkdirs();
		
		try {
			StreamWork.copyFilesToFolder(folder1, folder2, mFF);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
