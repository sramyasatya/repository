package threads;

//public class Squares {
//public void run()
//{
//	for(int i=0;i<10;i++)
//	System.out.println("Square of "+i+"");
//}
//}

public class Squares extends Thread {
	public void squares() throws InterruptedException
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("Square of"+i+"is:"+i*i);
			Thread.sleep(10);
		}
	}
		public void run()
		{
			try {
				squares();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
