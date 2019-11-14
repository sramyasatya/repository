package dicedemo;
import java.util.Scanner;
public class Mainprog {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int integer1=sc.nextInt();
int integer2=sc.nextInt();
if(integer1==integer2)
{
	integer1=integer1+integer2;
	System.out.println("The point scored is"+2*integer1);
}
else if(integer1>=0&&integer1<=6&&integer2>=0&&integer2<=6)
{
		integer1=integer1+integer2;
	System.out.println("The point scored is"+integer1);
}
else
{
	System.out.println("Invalid input");
}
}
}
