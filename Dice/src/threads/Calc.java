package threads;

public class Calc extends Thread{
int sum=0;
public int total() throws InterruptedException
{
for(int i=1;i<100;i++)
{
	sum = sum+i;	
}
return sum;
}
//System.out.println(sum);
public void run()
{
	synchronized(this)
	{
		try
		{
			total();
			this.notify();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
}

