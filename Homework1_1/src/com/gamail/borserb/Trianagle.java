package com.gamail.borserb;

public class Trianagle {
	private double sideA;
	private double sideB;
	private double sideC;
	private double P;
	private double area;

	public Trianagle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public void area() {
		if (sideA + sideB > sideC & sideA + sideC > sideB & sideB + sideC > sideA) {
			P = (sideA + sideB + sideC) / 2;
			area = Math.sqrt(P * (P - sideA) * (P - sideB) * (P - sideC));
			System.out.println(area);
		} else {
			System.out.println("Error");

		}

	}

}
