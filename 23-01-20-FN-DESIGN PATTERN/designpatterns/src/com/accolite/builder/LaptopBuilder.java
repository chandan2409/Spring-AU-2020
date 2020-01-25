package com.accolite.builder;

public class LaptopBuilder {
	String manufacturer;
	int ram;
	String diskspace;
	boolean graphicsCard;
	String Os;
	
	public LaptopBuilder setDiskspace(String diskspace) {
		this.diskspace = diskspace;
		return this;
	}

	
	public LaptopBuilder setGraphicsCard(boolean graphicsCard) {
		this.graphicsCard = graphicsCard;
		return this;

	}

	public LaptopBuilder setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;

	}

	public LaptopBuilder setRam(int ram) {
		this.ram = ram;
		return this;

	}

	public LaptopBuilder setOs(String os) {
		Os = os;
		return this;
	}
	 
	public Laptop Builder()
	{
		return new Laptop (this.manufacturer,this.ram,this.diskspace,this.graphicsCard,this.Os);
	}
	
}
