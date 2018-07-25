package com.gmail.borseb;

public class Trianagle extends Shape {

	private Point xy1 = new Point(1, 1);
	private Point xy2 = new Point(5, 5);
	private Point xy3 = new Point(1, 10);
	private Length ab =new Length(xy1, xy2);
	private Length bc =new Length(xy2, xy3);
	private Length ca =new Length(xy3, xy1);
	private double a=ab.length();
	private double b=bc.length();
	private double c=ca.length();
	private double p;
	private double ar;

	public Trianagle(Point xy1, Point xy2, Point xy3) {
		super();
		this.xy1 = xy1;
		this.xy2 = xy2;
		this.xy3 = xy3;
	}
	
	
	
	public Trianagle() {
		}


	public Point getXy1() {
		return xy1;
	}


	public void setXy1(Point xy1) {
		this.xy1 = xy1;
	}


	public Point getXy2() {
		return xy2;
	}


	public void setXy2(Point xy2) {
		this.xy2 = xy2;
	}


	public Point getXy3() {
		return xy3;
	}


	public void setXy3(Point xy3) {
		this.xy3 = xy3;
	}


	public Length getAb() {
		return ab;
	}


	public void setAb(Length ab) {
		this.ab = ab;
	}


	public Length getBc() {
		return bc;
	}


	public void setBc(Length bc) {
		this.bc = bc;
	}


	public Length getCa() {
		return ca;
	}


	public void setCa(Length ca) {
		this.ca = ca;
	}


	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public double getC() {
		return c;
	}


	public void setC(double c) {
		this.c = c;
	}


	public double getP() {
		return p;
	}


	public void setP(double p) {
		this.p = p;
	}


	public double getAr() {
		return ar;
	}


	public void setAr(double ar) {
		this.ar = ar;
	}


	@Override
	double getPerimetr(){		 	
		 p=a+b+c;
	return p;
	}

	@Override
	double getArea(){
		double polP=p/2;
		ar=Math.sqrt((polP*(polP-a))*(polP-b)*(polP-c));	
	return ar;
	}
}
