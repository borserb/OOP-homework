package com.gmail.borserb;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		Cat catOne = new Cat("Vasya", 4, "white");
		Cat catTwo = new Cat("Vasya", 4, "white");

		Cat catThree = null;
		try {
			catThree = catOne.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(catOne == catThree);

		// System.out.println(catOne);

		System.out.println(catOne.hashCode());
		System.out.println(catTwo.hashCode());
		System.out.println(catThree.hashCode());

		// System.out.println(catOne==catTwo);

		System.out.println(catOne.equals(catTwo));
		System.out.println(catOne.equals(catThree));

		Class catClass = Cat.class;

		Field[] catField = catClass.getDeclaredFields();
		for (int i = 0; i < catField.length; i++) {
			Field field = catField[i];
			System.out.println(catField[i]);

		}

		Method[] catMethod = catClass.getDeclaredMethods();
		for (int i = 0; i < catMethod.length; i++) {
			Method method = catMethod[i];
			System.out.println(catMethod[i]);

		}
		System.out.println();

		Constructor[] catConstr = catClass.getDeclaredConstructors();

		for (int i = 0; i < catConstr.length; i++) {
			Constructor constructor = catConstr[i];
			System.out.println(catConstr[i]);
		}
		
		Field catAges;


		
		try {
			catAges=catClass.getDeclaredField("age");
			catAges.setAccessible(true);
			catAges.setInt(catOne, 10500);
		} catch(NoSuchFieldException|SecurityException|IllegalArgumentException e){
			e.printStackTrace();
		}
		
		System.out.println(catOne.getAge());

	}

}
