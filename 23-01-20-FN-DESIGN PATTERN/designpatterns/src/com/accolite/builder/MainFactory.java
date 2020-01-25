package com.accolite.builder;

public class MainFactory {

	public static void main(String[] args)
	{
		LaptopBuilder lb=new LaptopBuilder();
		lb.setDiskspace("1TB");
		Laptop lp=lb.Builder();
		System.out.println(lp);
	}
}
