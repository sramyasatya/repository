package collections;
import java.util.*;
public class Test {
	

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(1,"Ramya");
		hs.put(6,"Sumi");
		hs.put(3,"Abirami");
		hs.put(8,"Shobana");
		
		Set <Map.Entry<Integer,String>> sm = hs.entrySet();
		for(Map.Entry<Integer,String> s : sm)
		{
			if(s.getKey()>5)
			{
				System.out.println(s.getKey()+" "+s.getValue());
			}
		}
		
		// TODO Auto-generated method stub

	}

}
