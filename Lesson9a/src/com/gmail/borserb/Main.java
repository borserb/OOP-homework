package com.gmail.borserb;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a = new Integer[] { 10, 3, 7, -2, 8 };
		Integer minOne = getMin(a);
		System.out.println(minOne);

		String[] b = new String[] { "aa", "bb", "cc", "cc" };
		String minTwo = getMin(b);
		System.out.println(minTwo);
	}

	public static <T extends Comparable<T>> T getMin(T[] array) {
		T min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(min) < 0) {
				min = array[i];
			}

		}
		return min;
	}

}
