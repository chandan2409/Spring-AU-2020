package fruitmarket;


public class fruitconsumer implements Runnable{
	@Override
	public void run() {
		while(true)
		{
			synchronized (Market.fruit_inventory) {
				if(!Market.fruit_inventory.isEmpty())
				{
					System.out.println(Thread.currentThread().getName()+" "+Market.fruit_inventory.poll());
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
					System.out.println("I am Notified");
				}
				
			}
		
		}
	}
}
