package com.gmail.borserb;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat catOne = new Cat(5, 8, true, "Milk", "Vaska", "Home cat");
		System.out.println(catOne);
		//System.out.println(catOne.hashCode());
		catOne.getVoice();
		makeVoice(catOne);

	}
	
	public static void makeVoice(Animals an) {
		an.getVoice();
	}

}
