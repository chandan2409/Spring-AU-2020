package com.accolite.factory;

public class CarFactory {

	public Car getInstance(String choice)
	{
		if(choice.equalsIgnoreCase("bmw"))
		{
			BMW bmw=new BMW();
			System.out.println(bmw.cost());
			return bmw;

		}
		return null;
		
	}
}
