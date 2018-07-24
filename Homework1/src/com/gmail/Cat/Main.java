package com.gmail.Cat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cate1 = new Cat("Ogurec", "Black", 5, 2006, "male");
		Cat cate2 = new Cat("Barsik", "Red", 3, 2016, "male");

		System.out.println(cate1.toString());
		System.out.println(cate2.toString());

		cate1.renameCat(cate1, "Puh");
		System.out.println(cate1.toString());
		cate1.catAge();
		cate2.catAge();
		System.out.println("Cate 1 age = " + cate1.age);
		System.out.println("Cate 2 age = " + cate2.age);
		System.out.println(cate2.catAgeReturn());

	}

}
