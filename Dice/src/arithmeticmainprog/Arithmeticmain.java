package arithmeticmainprog;
import java.util.Scanner;
public class Arithmeticmain {
	public static void main(String args[])
	{
		int count=0;
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	if(a+b==c)
	{
		System.out.println("Add");
		count++;
	}
	if(a-b==c)
	{
		System.out.println("Subtract");
		count++;
	}	
	if(a*b==c)
	{
		System.out.println("multiply");
		count++;
	}
	if(a/b==c)
	{
		System.out.println("Divide");
		count++;
	}
	if(a%b==c)
	{
		System.out.println("Modulo");
		count++;
	}
	else if(count==0)
	{
		System.out.println("Not Possible");
	}
	}
}
