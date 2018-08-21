package com.gmail.borserb;

public class Work implements Runnable {
	private String txt;
	private Action action;
	private boolean turn;

	


	public Work(String txt, Action action, boolean turn) {
		super();
		this.txt = txt;
		this.action = action;
		this.turn = turn;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			action.printText(txt, turn);
			
		}
	}

	
	
}


