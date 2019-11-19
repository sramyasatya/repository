package javaprograms;
import java.util.Scanner;
public class Swapprog {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.print(num1+" "+num2);
}
}
