package com.gmail.borserb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fDictionary = new File("dictionary.txt");
		File fileIn = new File("English.in");
		File fileOut = new File("Ukranian.out");
		Map<String, String> mapDictionary = loadDictionary(fDictionary);

		// loadDictionary(dictionary);

		System.out.println(mapDictionary);

	}

	String translate(File in, File out, File dict) {
		String b = " ";

		return b;
	}

	public static Map<String, String> loadDictionary(File f) {
		Map<String, String> dictMap = new HashMap();

		try (BufferedReader fread = new BufferedReader(new FileReader("dictionary.txt"))) {
			String str = "";
			for (; (str = fread.readLine()) != null;) {
				String[] words = new String[1];
				words = str.split(" ");
				// System.out.println(words[0]+" "+words[1]);
				dictMap.put(words[0], words[1]);
			}

		}

		catch (IOException e) {
			System.out.println("ERROR");
		}

		return dictMap;
	}

}
