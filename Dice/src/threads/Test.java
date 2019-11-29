package threads;

public class Test {
public static void main(String args[]) throws InterruptedException
{
	Cubes c=new Cubes();
	Thread t1=new Thread(c);
	Squares s=new Squares();
	Thread t2=new Thread(s);
	t1.start();
	t2.start();
	
//	Calc c=new Calc();
//	c.start();
////	System.out.println(c.sum);
////	Thread.sleep(100);
//	//c.join();
//	synchronized(c)
//	{
//		c.wait();//wait until notification comes
//		//c.wait(100);
//	}
//	
//	//}
//	//c.total();
//	System.out.println(c.sum);
	
	}
}
