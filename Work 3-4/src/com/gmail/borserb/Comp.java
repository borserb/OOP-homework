package com.gmail.borserb;

public class Comp {
	private String cpuModel;
	private int ram;
	private String gpuModel;

	public Comp(String cpuModel, int ram, String gpuModel) {
		super();
		this.cpuModel = cpuModel;
		this.ram = ram;
		this.gpuModel = gpuModel;
	}

	public Comp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCpuModel() {
		return cpuModel;
	}

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getGpuModel() {
		return gpuModel;
	}

	public void setGpuModel(String gpuModel) {
		this.gpuModel = gpuModel;
	}

	@Override
	public String toString() {
		return "Comp [cpuModel=" + cpuModel + ", ram=" + ram + ", gpuModel=" + gpuModel + "]";
	}

	public void connectUSB(USBDivece usbDev) {
System.out.println("Connect" + usbDev.getDiviceID());
	}
}
