package com.gmail.borserb;

import java.util.Iterator;

public class Action {

	private boolean turn = true;

	public Action() {
		super();
	}

	public synchronized void printText(String txt, boolean turn) {
		for(;this.turn!=turn;) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		System.out.print(" " + txt);
		this.turn = !this.turn;
		notifyAll();
	}

}