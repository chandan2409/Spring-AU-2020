package com.accolite.builder.building;

import com.accolite.builder.Laptop;

public class BuildingBuilder {
	private int windows;
	private int doors;
	private int rooms;
	private boolean hasGarage;
	private boolean hasSwimmingPool;
	private boolean hasGarden;
	public BuildingBuilder setWindows(int windows) {
		this.windows = windows;
		return this;

	}
	public BuildingBuilder setDoors(int doors) {
		this.doors = doors;
		return this;

	}
	public BuildingBuilder setRooms(int rooms) {
		this.rooms = rooms;
		return this;

	}
	public BuildingBuilder setHasGarage(boolean hasGarage) {
		this.hasGarage = hasGarage;
		return this;

	}
	public BuildingBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
		return this;
	}

	public BuildingBuilder setHasGarden(boolean hasGarden) {
		this.hasGarden = hasGarden;
		return this;
	}
	public Building Builder()
	{
		return new Building(this.windows, this.doors, this.rooms, this.hasGarage, this.hasSwimmingPool, this.hasGarden); 
	}
	
	
}
