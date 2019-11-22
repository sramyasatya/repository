package exception;

public class Test {
public static void main()
{m1();
	try
	{
		Calc.div(30,0);
		int[] i=new int[] {1,2,3};
		System.out.println(i[1]);
		String str="Hello WOrld";
		System.out.println(str.charAt(4));
		//FileInputStream fis=new FileInputStream("C.../.")
		}
	catch(ArithmeticException e) {
		System.out.println("'y' value should be greater than 0");
		e.printStackTrace();
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("'y' value should be greater than 0");
		e.printStackTrace();
	}
	catch(Exception e) {
		System.out.println("'y' value should be greater than 0");
		e.printStackTrace();
	}
	finally
	{
		System.out.println("finally block executed in all conditions");
	}

	System.out.println("After try-catch block");
	}
public static void m1() {
	
	m2();
}
public static void m2(){
	//if(y==0)
		//{
		//	throws new ArithmeticException("y value should be greater than 0");
		//}
	return (10/0);// this wont execute when 0 is given becos before itself the exception handles
	
}
}

/*package exception;

public class Test {
public static void main()
{
	try
	{
		Calc.div(30,0);
		int[] i=new int[] {1,2,3};
		System.out.println(i[1]);
		String str="Hello WOrld";
		System.out.println(str.charAt(4));
		FileInputStream fis=new FileInputStream("C.../.")
		}
	catch(ArithmeticException|ArrayIndexOutOfBoundsException|NullpointerException e) {---- another way
		System.out.println("'y' value should be greater than 0");
		e.printStackTrace();
	}
	
finally
	{
		System.out.println("finally block executed in all conditions");
	}

	System.out.println("After try-catch block");
	}
}/
/*package exception;

public class Test {
public static void main()
{
	try
	{
		Calc.div(30,0);
	}catch(ArithmeticException e) {
		System.out.println("'y' value should be greater than 0");
		e.printStackTrace();
	}
	System.out.println("After try-catch block");
	}
}
*/
/*package exception;

public class Test {
public static void main()
{
	try
	{
		Calc.div(30,0);
		int[] i=new int[](1,2,3);
		System.out.print(
	}catch(ArithmeticException e) {
		System.out.println("'y' value should be greater than 0");
		e.printStackTrace();
	}
	System.out.println("After try-catch block");
	}
}*/