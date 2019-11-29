package lambda;

public class Simplelamba {

	public void greet()
	{
		System.out.println("Hello World");
	}
	()->System.out.print("Hello World");
	()->{System.out.print("Hello World")};
public int square(int n)
{
returm n*n;	
}
(n)->n*n;//valid
(n)->{return n*n;}; //valid
(n)->return n*n; //invalid

(a,b)->a>b?a:b;
}
