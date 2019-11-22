package inheritance;

import java.util.Scanner;

class Rectangle {
		int width;
		int height;
		void display()
		{
			System.out.println(width+" "+height);
		}
}
class RectangleArea extends Rectangle
{
	void read_input()
	{
Scanner sc=new Scanner(System.in);
 width=sc.nextInt();
 height=sc.nextInt();
	}
	
	void display()
	{
		System.out.println(width*height);
	}
}
public class SingleInheritance {
public static void main(String args[])
{
	RectangleArea r=new RectangleArea();
	r.read_input();
	r.display();
}
}
	
	
	