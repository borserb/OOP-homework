package com.gmail.borseb;

public class Circle extends Shape {

	private Point centr = new Point(5, 5);
	private Point pointTwo = new Point(10, 5);
	private double p;
	private double s;
	private Length pointToPoint = new Length(centr, pointTwo);
	private double r = pointToPoint.length();

	public Circle(Point centr, Point pointTwo) {
		super();
		this.centr = centr;
		this.pointTwo = pointTwo;
	}

	public Circle() {
	}

	public Point getCentr() {
		return centr;
	}

	public void setCentr(Point centr) {
		this.centr = centr;
	}

	public Point getPointTwo() {
		return pointTwo;
	}

	public void setPointTwo(Point pointTwo) {
		this.pointTwo = pointTwo;
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

	public Length getPointToPoint() {
		return pointToPoint;
	}

	public void setPointToPoint(Length pointToPoint) {
		this.pointToPoint = pointToPoint;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	double getPerimetr() {
		p = 2 * Math.PI * r;
		return p;
	}

	@Override
	double getArea() {
		s = Math.PI * Math.pow(r, 2);
		return s;
	}
}
