package com.accolite.factory;

public class BMW implements Car {

	public int cost() {
		return 150;
	}

	public void making() {
		System.out.println("Making....");
	}

	public void description() {
		System.out.println("BMW....");
		
	}

}
