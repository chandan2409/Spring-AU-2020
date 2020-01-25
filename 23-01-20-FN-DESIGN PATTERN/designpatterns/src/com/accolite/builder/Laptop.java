package com.accolite.builder;

public class Laptop {

	String manufacturer;
	int ram;
	String diskspace;
	boolean graphicsCard;
	String Os;
	
	public Laptop(String manufacturer, int ram, String diskspace, boolean graphicsCard, String os) {
		super();
		this.manufacturer = manufacturer;
		this.ram = ram;
		this.diskspace = diskspace;
		this.graphicsCard = graphicsCard;
		Os = os;
	}

	@Override
	public String toString() {
		return "Laptop [manufacturer=" + manufacturer + ", ram=" + ram + ", diskspace=" + diskspace + ", graphicsCard="
				+ graphicsCard + ", Os=" + Os + "]";
	}
	
}
