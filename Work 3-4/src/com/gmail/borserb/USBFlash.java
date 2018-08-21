package com.gmail.borserb;

public class USBFlash implements USBDivece, Comparable{
	private int size;
	private String vendor;
	private String model;
	public USBFlash() {
		super();
		// TODO Auto-generated constructor stub
	}
	public USBFlash(int size, String vendor, String model) {
		super();
		this.size = size;
		this.vendor = vendor;
		this.model = model;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public int getDiviceID() {
		// TODO Auto-generated method stub
		return hashCode();
	}
	@Override
	public String getDiviceDescription() {
		// TODO Auto-generated method stub
		return toString();
	}
	@Override
	public int compareTo(Object o) {
	USBFlash anotherUSBFlash =(USBFlash)o;
	
	if(this.size>anotherUSBFlash.size) {
		return -1;
	}
	if(this.size<anotherUSBFlash.size) {
		return 1;
	}
	return 0;
	}
	
	


}
