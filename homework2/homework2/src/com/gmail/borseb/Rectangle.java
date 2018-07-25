package com.gmail.borseb;

public class Rectangle extends Shape {
	Point p1 = new Point(0, 0);
	Point p2 = new Point(0, 10);
	Point p3 = new Point(10, 0);
	Point p4 = new Point(10, 10);
	Length a = new Length(p1, p2);
	Length b = new Length(p1, p3);
	double p;
	double s;

	public Rectangle(Point p1, Point p2, Point p3, Point p4) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	public Point getP4() {
		return p4;
	}

	public void setP4(Point p4) {
		this.p4 = p4;
	}

	public Length getA() {
		return a;
	}

	public void setA(Length a) {
		this.a = a;
	}

	public Length getB() {
		return b;
	}

	public void setB(Length b) {
		this.b = b;
	}

	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

	@Override
	double getPerimetr() {
		p = (a.length() + b.length()) * 2;
		return p;
	}

	@Override
	double getArea() {
		s = a.length() * b.length();
		return s;
	}

}
