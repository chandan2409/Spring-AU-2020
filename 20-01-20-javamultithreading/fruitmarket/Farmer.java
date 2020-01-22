package fruitmarket;

import java.util.Random;

import locks.Flipkart;

public class Farmer implements Runnable{
	public static String[] fruittypes= {"apple","orange","grape","watermelon"};

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true)
		{
		synchronized (Market.fruit_inventory) {
			
			Random r=new Random();
			int randomNumber=r.nextInt(fruittypes.length);	
			if(Market.fruit_inventory.size()<10)
			{
			Market.fruit_inventory.add(fruittypes[randomNumber]);
			System.out.println(Thread.currentThread().getName()+" Fruit Inventory "+Market.fruit_inventory);
			Market.fruit_inventory.notifyAll();
			}
			else
			{
				try
				{
					Market.fruit_inventory.wait();
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
				System.out.println("Market Full");
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}

}
