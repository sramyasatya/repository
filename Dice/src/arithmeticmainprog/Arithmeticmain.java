package arithmeticmainprog;
import java.util.Scanner;
public class Arithmeticmain {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	if(a+b==c)
	{
		System.out.println("Add");
	}
	if(a-b==c)
	{
		System.out.println("Subtract");
	}	
	if(a*b==c)
	{
		System.out.println("multiply");
	}
	if(a/b==c)
	{
		System.out.println("Divide");
	}
	if(a%b==c)
	{
		System.out.println("Modulo");
	}
	else
	{
		System.out.println("Not Possible");
	}
	}
}
