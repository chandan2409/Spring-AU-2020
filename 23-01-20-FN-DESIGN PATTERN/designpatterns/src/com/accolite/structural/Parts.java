package com.accolite.structural;

import java.util.List;

interface Component
{
	 int showprice();
}

public class Parts implements Component{

	private int price;
	private String name;

	public Parts(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	

	@Override
	public int showprice() {
		return price;
		
	}
	
	
	

}

class composite implements Component
{
	String name;
	int price;
	List<Component> list;

	public composite(String name) {
		super();
		this.name = name;
	
	}

	public void addcomponent(List<Component> list)
	{
		this.list=list;
	}
	@Override
	public int showprice() {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
}


