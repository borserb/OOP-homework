package com.gmail.borserb;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array = new Integer[100];

		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(11);
		}

		Map<Integer, Integer> result = getStatic(array);

		System.out.println(result);
		

	}

	public static Map<Integer, Integer> getStatic(Integer[] array) {
//
		Map<Integer, Integer> result = new HashMap<>();
//		for (int i = 0; i < array.length; i++) {
//			if (result.get(array[i]) == null) {
//				result.put(array[i], 1);
//			} else {
//				result.put(array[i], result.get(array[i])+1);
//			}
//		}
		return result;
	}

}
