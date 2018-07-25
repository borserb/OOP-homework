package com.gmail.borseb;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trianagle triOne = new Trianagle();
		Circle circleOne = new Circle();
		Rectangle regOne = new Rectangle();
		

		System.out.println("P trianagle=" + triOne.getPerimetr());
		System.out.println("S triangle="+triOne.getArea());
		
		System.out.println("P circle="+circleOne.getPerimetr());
		System.out.println("S circle="+circleOne.getArea());
		
		System.out.println("P Rectangle="+regOne.getPerimetr());
		System.out.println("S Rectangle="+regOne.getArea());
	}
	

}
