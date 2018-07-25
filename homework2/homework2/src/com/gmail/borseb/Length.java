package com.gmail.borseb;

public class Length {
	private Point a;
	private Point b;
	private Double length;
	public Length(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
	
	public double length() {
		return Math.sqrt(Math.pow(b.getY() - a.getY(), 2) + Math.pow(b.getX() - a.getX(), 2));// |AB|² = (y2 - y1)² + (x2 - x1)²
	}
	
	
	

}
