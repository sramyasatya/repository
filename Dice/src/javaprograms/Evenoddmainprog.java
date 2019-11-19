package javaprograms;
import java.util.Scanner;
public class Evenoddmainprog {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num%2==0)
		System.out.print(num+" is Even");
	else
		System.out.print(num+" is odd");
}
}
