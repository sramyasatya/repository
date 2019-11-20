package varargs;

public class Varargsmainprog {
	static int add;
	static void sum(int... marks)
	{
		for(int i:marks) {
		add=add+i;
		}
		System.out.println(add);
	}
public static void main(String args[])
{
	sum(10,20,50,7,5,9);
	
}

}
