package com.accolite.builder.building;

import com.accolite.builder.Laptop;
import com.accolite.builder.LaptopBuilder;

public class MainFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuildingBuilder builder=new BuildingBuilder();
		builder.setDoors(1);
		builder.setRooms(4);
		builder.setHasGarage(true);
		builder.setWindows(3);
		Building building=builder.Builder();
		System.out.println(building);
	}

}
