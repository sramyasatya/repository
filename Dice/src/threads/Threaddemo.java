package threads;

public class Threaddemo extends Thread {
//	public void Threaddemo() throws InterruptedException
//	{
//		
//	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Inside run method");
//			try
//			{
//			Thread.sleep(10);
//			}
//			catch()
//			{
//			e.printStackTrace();	
//			}
		}
	}
public static void main (String args[])throws InterruptedException
{
	Threaddemo t1=new Threaddemo();
	Threaddemo t2=new Threaddemo();
	t1.start();//internally calls run method becas run() is inside threads then it calls thye method inside that
	t2.start();//internally calls run method becas run() is inside threads
	System.out.println(Thread.activeCount());
	t1.join();
	t2.join();
	System.out.println(Thread.activeCount());
	System.out.println(Thread.currentThread().getId());
	System.out.println(Thread.currentThread().getPriority());
	System.out.println(Thread.currentThread().MAX_PRIORITY);
	System.out.println(Thread.currentThread().NORM_PRIORITY);
	System.out.println(Thread.currentThread().MIN_PRIORITY);
	
	for(int i=0;i<10;i++)
	{
		System.out.println("Inside main method");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		Thread.sleep(1000);
		System.out.println("");
	}
}
}
