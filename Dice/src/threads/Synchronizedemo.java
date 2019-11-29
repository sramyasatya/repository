package threads;

public class Synchronizedemo {
public static void main(String args[])
{
	Display d=new Display();
	MyThread t1=new MyThread(d,"ram");
	MyThread t2=new MyThread(d,"gbvgh");
	MyThread t3=new MyThread(d,"fdgch");
	MyThread t4=new MyThread(d,"stre");
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	
}}
