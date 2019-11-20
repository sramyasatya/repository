package accessibilty;

public class Rectangle implements Shape {
	@Override
	public void draw()
	{
		System.out.println("Rectangle");
	}
	@Override
	public void getArea()
	{
		System.out.println("recArea");
	}
}
