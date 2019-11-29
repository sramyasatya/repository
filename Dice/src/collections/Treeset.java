package collections;
import java.util.TreeSet;
public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				TreeSet<String>ts1 = new TreeSet<String>();
				ts1.add("ram");
				ts1.add("sum");
				ts1.add("hmm");
				TreeSet<String> ts2 = new TreeSet<String>(ts1);// moves ts1 values to ts2
				//sorts data  only in ascending order
				System.out.println(ts1);
				System.out.println(ts2);
//				TreeSet<Integer>ts3 = new TreeSet<Integer>(new MyComparatortreeset());
//				ts3.add(8);
//				ts3.add(2);
//				ts3.add(3);
//				System.out.println(ts3);	
				TreeSet<String>ts3 = new TreeSet<String>(new MyComparatortreeset());
				ts3.add("s");
				ts3.add("y");
				ts3.add("i");
				
				System.out.println(ts3);	
				
			}
		
	}


