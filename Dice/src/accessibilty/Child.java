package accessibilty;
//import java.util.*;
public class Child extends Parent{

	void m3() {
		System.out.println( ""m3 method");
	}
	void m2() {
		System.out.println( "m3 method");
	}
	void m4() {
		System.out.println( "m3 method");
	}
	void m1() {
		System.out.println( "m3 method);
	}
		{
			sop child method m1 // make final/private and check staticparent and staticparent can be used
		}
	}
	public static void main(String args[])
	{
		Child c=new Child();
		c.m1();// default the modifier is default
		c.m2();
		c.m3();
}
}
