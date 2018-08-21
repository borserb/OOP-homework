package com.gmail.borserb;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Action action = new Action();
		Work pullTask = new Work("pull", action, true);
		Work pushTask = new Work("push", action, true);
		



		Thread pullTheader = new Thread(pullTask);
		Thread pushTheader = new Thread(pushTask);
		
		pullTheader.start();
		pushTheader.start();

	}

}
