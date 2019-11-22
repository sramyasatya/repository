/*package fileobjectsindifferentmachine;
import java.util.StringTokenizer;
public class Stringtokenizer {
public static void main(String args[])
{
	StringTokenizer st=new StringTokenizer("Hello|World");
	System.out.println(st.nextToken("|"));//overloading
	//System.out.println(st.nextToken());
	//System.out.println(st.nextToken());
	System.out.println(st.countTokens());
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
	
}
}*/



package fileobjectsindifferentmachine;
import java.util.StringTokenizer;
public class Stringtokenizer {
public static void main(String args[])
{
	StringTokenizer st=new StringTokenizer("Hello| World","|");
	//System.out.println(st.nextToken());
	//System.out.println(st.nextToken());
	
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
	System.out.println(st.countTokens());
}
}


/*package fileobjectsindifferentmachine;
import java.util.StringTokenizer;
public class Stringtokenizer {
public static void main(String args[])
{
	StringTokenizer st=new StringTokenizer("Hello World");
	//System.out.println(st.nextToken());
	//System.out.println(st.nextToken());
	
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
	System.out.println(st.countTokens());
}
}*/

/*package fileobjectsindifferentmachine;
import java.util.StringTokenizer;
public class Stringtokenizer {
public static void main(String args[])
{
	StringTokenizer st=new StringTokenizer("Hello World");
	//System.out.println(st.nextToken());
	//System.out.println(st.nextToken());
	System.out.println(st.countTokens());
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
}
}*/











/*package fileobjectsindifferentmachine;
import java.util.StringTokenizer;
public class Stringtokenizer {
public static void main(String args[])
{
	StringTokenizer st=new StringTokenizer("Hello World");
	System.out.println(st.nextToken());
	System.out.println(st.nextToken());
}
}*/
