package com.gmail.borserb;

import java.math.BigInteger;

public class FactorialTask implements Runnable {
	private int number;

	public FactorialTask(int number) {
		this.number=number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public BigInteger calculateFactorial(int n) {
		BigInteger factorial = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			factorial = factorial.multiply(new BigInteger("" + i));

		}
		return factorial;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread th = Thread.currentThread();
		for (int i = 1; i <= number; i++) {
			System.out.println(th.getName() + " ->" + i + "! = " + calculateFactorial(i));

			if(th.isInterrupted()) {
				System.out.println(th.getName()+" interrupted");
				return;
			}
		}
	}

}
