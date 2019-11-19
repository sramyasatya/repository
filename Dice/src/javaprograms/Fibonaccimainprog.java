package javaprograms;
import java.util.Scanner;
public class Fibonaccimainprog {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int first=0,second=1,third;
		System.out.print(first+" "+second);
		for(int i=0;i<num;i++)
		{
			third=first+second;
			first=second;
			second=third;
			System.out.print(" "+third);
		}
	}
}
