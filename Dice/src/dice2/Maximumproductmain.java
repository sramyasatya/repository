package dice2;
import java.util.Scanner;
public class Maximumproductmain {
public static void main(String args[])
{
	int count=0;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int max=0;
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n-1;i++)
	{
		if(arr[i]<arr[i+1])
		{
			max=arr[i+1];
		}
	}
	int array[][]=new int[n][n];
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
		array[i][j]=arr[i]*arr[j];
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
		if(max==array[i][j])
		{	
			System.out.println(max);
		count++;
		}
		}
	}
	if(count==0)
		System.out.print("-1");
	//System.out.println(max);
}
}
