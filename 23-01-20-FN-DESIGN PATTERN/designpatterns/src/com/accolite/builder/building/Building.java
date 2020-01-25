package com.accolite.builder.building;

public class Building {
	private int windows;
	private int doors;
	private int rooms;
	private boolean hasGarage;
	private boolean hasSwimmingPool;
	private boolean hasGarden;
	public Building(int windows, int doors, int rooms, boolean hasGarage, boolean hasSwimmingPool, boolean hasGarden) {
		super();
		this.windows = windows;
		this.doors = doors;
		this.rooms = rooms;
		this.hasGarage = hasGarage;
		this.hasSwimmingPool = hasSwimmingPool;
		this.hasGarden = hasGarden;
	}
	@Override
	public String toString() {
		return "Building [windows=" + windows + ", doors=" + doors + ", rooms=" + rooms + ", hasGarage=" + hasGarage
				+ ", hasSwimmingPool=" + hasSwimmingPool + ", hasGarden=" + hasGarden + "]";
	}
	
	
}
