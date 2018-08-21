package com.gmail.borserb;

public class AnyClass <T extends Number > {
	
	private T someField;

	public AnyClass(T someField) {
		super();
		this.someField = someField;
	}

	public T getSomeField() {
		return someField;
	}

	public void setSomeField(T someField) {
		this.someField = someField;
	}

	@Override
	public String toString() {
		return "AnyClass [someField=" + someField + "]";
	}
	
	

}
