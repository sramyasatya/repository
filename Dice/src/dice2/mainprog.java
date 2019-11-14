package dice2;
import java.util.Scanner;

public class mainprog {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int integer1=sc.nextInt();
	int integer2=sc.nextInt();
	int points;
	if(integer1>=0&&integer1<=6&&integer2>=0&&integer2<=6)
	{
			integer1=integer1+integer2;
		if(integer1>8)
		{
			points=8-integer1;
			System.out.println("Points"+Math.abs(points));
		}
		else
		{
			points=2*(8-integer1);
			System.out.println("Points"+Math.abs(points));
		}
	}
	else
	{
		System.out.println("Invalid input");
	}
	}
}
