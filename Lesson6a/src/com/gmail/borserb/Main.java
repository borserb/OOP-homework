package com.gmail.borserb;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactorialTask taskOne = new FactorialTask(10);
		FactorialTask taskTwo = new FactorialTask(10);
		FactorialTask taskThree = new FactorialTask(10);

		Thread threadOne = new Thread(taskOne);
		Thread threadTwo = new Thread(taskTwo);
		Thread threadThree = new Thread(taskThree);

		threadOne.start();
		threadTwo.start();
		threadThree.start();


		threadOne.interrupt();
		threadTwo.interrupt();
		threadThree.interrupt();

		Thread th = Thread.currentThread();
		System.out.println(th.getName() + " Stop");
	}

}
