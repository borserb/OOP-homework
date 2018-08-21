package com.gmail.borserb;

import java.io.File;

public class Main {
	
	public static void main(String[] args) {
		MyFileFilter mFF = new MyFileFilter("doc", "pdf");
		File folder = new File("A");
		File[] fileList = folder.listFiles(mFF);
		for (File file : fileList) {
			System.out.println(file);
		}
	}
}