package blocks;

public class Blocks {
 int z;
 static String name;
 //static block
	static {
		name="ghad";
		System.out.println("static");
	}
	
	//Instance block
	{
		z=100;
		System.out.println("instance");
	}
	public static void main(String[] args) {
	
System.out.println("main");
Blocks b=new Blocks();
System.out.println(b.z);
	}

}
