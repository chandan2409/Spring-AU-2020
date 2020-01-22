package fruitmarket;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

import locks.consumer;

public class Market {
	public static Queue<String> fruit_inventory=new ConcurrentLinkedQueue<String>();
public static void main(String[] args)
{
	System.out.println("Market Sale Started");
	
	for(int i=0;i<10;i++)
	{
	new Thread(new fruitconsumer(),"Consumer_"+i).start();;
	}
    for(int i=0;i<10;i++)
    {
    new Thread(new Farmer(),"Farmer_"+i).start();
    }
   
}
}
