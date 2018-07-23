package com.gmail.borserb;

public class Cat {
	private String name;
	private String color;
	private double weight;
	private int year;
	private String male;
	public int age;

	public Cat(String name, String color, double weight, int year, String male) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.year = year;
		this.male = male;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getMale() {
		return male;
	}


	public void setMale(String male) {
		this.male = male;
	}


	public void catAge() {
		age = 2018 - year;

	}

	@Override
	public String toString() {
		return "Cat [name=" + name + " color=" + color + ", weight=" + weight + ", year=" + year + ", male=" + male
				+ "]";
	}

	Cat renameCat(Cat a, String newname) {
		a.color = newname;
		return a;
	}

}
