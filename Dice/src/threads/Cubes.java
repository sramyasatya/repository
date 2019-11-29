package threads;

public class Cubes extends Thread{
	public void cubes() throws InterruptedException
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("Cube of"+i+"is:"+i*i*i);
			Thread.sleep(10);
		}
	}
		public void run() 
		{
			try {
				cubes();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
