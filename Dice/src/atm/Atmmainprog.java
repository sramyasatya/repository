package atm;
import java.util.*;
//import java.String
public class Atmmainprog {
public static void main(String args[])
{
	int balance=40000;
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR SECRET PIN NUMBER:");
	int pin=sc.nextInt();
	do {
	System.out.println("********Welcome to ATM Service**************\r\n" + 
			"    1. Check Balance\r\n" + 
			"    2. Withdraw Cash\r\n" + 
			"    3. Deposit Cash\r\n" + 
			"    4. Quit\r\n" + 
			"    ******************?**************************?*\r\n" + 
			"");
	System.out.println("Enter your choice");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("YOUR BALANCE IN Rs : "+balance);
		break;
	case 2:
		System.out.println("ENTER THE AMOUNT TO WITHDRAW: ");
		int withdrawamount=sc.nextInt();
		balance=balance-withdrawamount;
		System.out.println("please collect cash");
		System.out.println("your balance is"+balance);
		break;
	case 3:
		System.out.println("ENTER THE AMOUNT TO WITHDRAW: ");
		int depositamount=sc.nextInt();
		balance=balance-depositamount;
		System.out.println("your balance is"+balance);
		break;
	case 4:
		System.out.println("Thank you using atm");
		break;
	}
	System.out.println("DO U WISH TO HAVE ANOTHER TRANSCATION?(y/n):");
	str=sc.next();
	}while(str.equals("y"));
	
}
}
