package friendintrest;
import java.util.Scanner;
public class Friendintrestmain {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int count=0;
	float deposit=sc.nextFloat();
	int rateofintrest=sc.nextInt();
	int thresholdvalue=sc.nextInt();
	//int output;
	
	while(deposit<thresholdvalue)
	{
	float intrest=(deposit*rateofintrest)/100;
	deposit=deposit+intrest;
	count++;
	if(thresholdvalue<=deposit)
		{
		System.out.println(count);
		break;
		}
	}
}
}
