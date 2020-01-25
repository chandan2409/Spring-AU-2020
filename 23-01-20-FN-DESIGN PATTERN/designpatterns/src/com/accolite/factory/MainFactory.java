package com.accolite.factory;

public class MainFactory {

public static void main(String args[])
{
	CarFactory carfactory=new CarFactory();
	Car car=carfactory.getInstance("bmw");
	car.making();
}
}
