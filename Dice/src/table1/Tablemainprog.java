package table1;
import java.util.Scanner;
public class Tablemainprog {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int iterate=sc.nextInt();
	for(int i=1;i<=iterate;i++)
	{
		System.out.println(n+"*"+i+"="+n*i);
	}
}
}
