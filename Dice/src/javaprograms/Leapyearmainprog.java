package javaprograms;
import java.util.Scanner;
public class Leapyearmainprog {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		  if((num%400==0)||(num%4==0&&num%100!=0))
		{
			System.out.println("Leap year");
		}
	}
}
