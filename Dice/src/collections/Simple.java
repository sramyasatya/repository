package collections;

import java.util.*;
import java.util.HashSet;
import java.util.Vector;

public class Simple {
	public static void main(String args[])
	{
//	int num1 = 10;//AutoBoxing
//          Integer num2=num1;
//	Integer num2=Integer.valueOf(num1);
//System.out.println(num2);//AutoUnboxing
//	int num3 = num2;
//	int num3 =num2.intValue();
//System.out.println(num3);
//	a1.add(true);
/*ArrayList<E> a12=new ArrayList();
Iterator itr=a12.iterator();
System.out.println(a1);
Iterator itr=a1.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}*/
	//Vector
//	Vector<String> v1=new Vector<String>();
//	v1.add("Ram");
//	v1.add("Sam");
//	v1.add("Ravi");
//	v1.add("Ram");
//	System.out.println(v1);
//	//vector maintains insertion order
//	//clone is like deep copy
//	System.out.println("v1.capacity "+v1.capacity());
//	System.out.println("v1.contains "+v1.contains("Ram"));
//	System.out.println("v1.elementAt "+v1.elementAt(2));
//	System.out.println("v1.get(1) "+v1.get(1));
//	
//	Vector<String> v3=(Vector<String>) v1.clone();
//	System.out.println("v1 :"+v1);
//	System.out.println("v3 :"+v3);
//	v1.add("fadef");
//	System.out.println("v1 :"+v1);
//	System.out.println("v3 :"+v3);
//	
//	Vector<String> v2=new Vector<String>();
//	//vector allows duplicates
//	v2.add("ramya");
//	v2.add("hsum");
//	v2.add("hg");
//	v2.add("hy");
//	v1.addAll(v2);
//	System.out.println(v1);
//	v1.removeAll(v2);
//	System.out.println(v1);
//	System.out.println(v2);
//	v1.addAll(v2);
//	v1.retainAll(v2);// v1 will retain the elements of v2 only
//	System.out.println(v1);

/*package collection;


import java.util.ArrayList;
import java.util.Iterator;

public class Test {

public static void main(String[] args) {
	int num1 = 10;
	//AutoBoxing
//	Integer num2=num1;
	Integer num2=Integer.valueOf(num1);
//	System.out.println(num2);
	//AutoUnboxing
//	int num3 = num2;
	int num3 =num2.intValue();
//	System.out.println(num3);
	
	 
	
	
	
	
	
	
	
//	// TODO Auto-generated method stub
//	package package1;
//
//	import java.util.*; 
//	class TestJavaCollection1
//	{ 
////	public static void main(String args[]){ 
	ArrayList list=new ArrayList();//Creating arraylist 
	list.add(10);
	list.add("Anas");
	list.add("Eswar");//Adding object in arraylist 
	list.add("Shobana"); 
//	list.remove(2);
//	list.removeAll(list);
//	list.remove("Ravi");
	
	
//	//Traversing list through Iterator 
	Iterator itr=list.iterator(); 
	while(itr.hasNext()){ 
	System.out.println(itr.next()); 
//	} 
//	} 
//	
//	}
//vector 

//	Vector v = new Vector();
//	Vector v = new Vector(1000,5);
//Vector v = new Vector();
//	v.add("Eswar");
//	v.add("Shobana");
//	v.add("null");
//	v.add(20);
//	v.addElement(12);
//	int i;
//for (int i=0;i<=10;i++)
//{
//v.addElement(i);
//}
//
//System.out.println(v);
//Enumeration e = v.elements();
//while (e.hasMoreElements())
//{
//	Integer I = (Integer)e.nextElement();
//System.out.println(e.nextElement());
//	if (I%2==0);
//	System.out.println(I);
}
//	v.remove(1);
//	v.remove(null);
//	v.clear();
//	v.get(1);
//	System.out.println(v.capacity());
//	v.removeAllElements();
//	Iterator itr = v.iterator();
//	while (itr.hasNext()) {
//	System.out.println(itr.next());
//	
//	Stack s = new Stack();
//	System.out.println(s.push("Anas"));
//	s.push("Eswar");
//	s.push("Eswar");
//	s.push("Shobana");
//	s.push("Sumitha");
//	
//	System.out.println(s);
//	System.out.println(s.search("Eswar"));
//	System.out.println(s.search("A"));
//	s.push(10);
//	s.add(100);
//	s.peek();
////	empty();
}

}
*/

//Stack<Integer> v1=new Stack<Integer>();
////duplicates allowed
//v1.add(10);
//v1.add(6);
//v1.add(34);
//v1.add(1);
//v1.add(6);
//System.out.println(v1);
//System.out.println("capacity "+v1.capacity());
//System.out.println("capacity "+v1.size());
//System.out.println("contains "+v1.contains(100));
//System.out.println("empty "+v1.empty());
//System.out.println("LastIndexof "+v1.LastIndexOf(43));
//System.out.println("removeelement "+v1.removeelement(2));
//System.out.println("search "+v1.search(34));
//System.out.println("peek "+v1.peek());
//System.out.println("pop "+v1.pop());
//v1.push(432);
//v1.setSize(20);
//System.out.println("capacity "+v1.capacity());
//System.out.println("capacity "+v1.size());
//}
//}
/*Vector<String> v3=(Vector<String>) v1.clone();
System.out.println("v1 :"+v1);
System.out.println("v3 :"+v3);
v1.add("fadef");
System.out.println("v1 :"+v1);
System.out.println("v3 :"+v3);
*/


		
		
//HashSet<String> hs=new HashSet<String>();
//hs.add("Ramya");
//hs.add("Abi");
//hs.add("Sumi");
//
//System.out.println(hs);
//
//hs.add("Eswar");
//System.out.println(hs);
//}
//}
		
		
		
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("Ramya");
		hs1.add("Abi");
		hs1.add("Sumi");

		System.out.println(hs1);

		hs1.add("Eswar");
		System.out.println(hs1);

		
		HashSet hs2=hs1;
		System.out.println(hs1.size());
		System.out.println(hs1.equals(hs2));
		Object[] str = hs1.toArray();
		System.out.println(str[0]);
//		for(Object s:str)
//		{
//			System.out.println(s);
//		}
		System.out.println(str[1]);
//		String[] str1 = (String[])hs1.toArray();
		
		System.out.println(hs1.hashCode());
		System.out.println(hs2.hashCode());
		System.out.println(hs1.toString());
//		Iterator itr=hs1.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		ListIterator<String> itr=str.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
}
		
//		LinkedHashSet<String> linkedset = new LinkedHashSet<String>(); 
//		linkedset.add("A");   
//        linkedset.add("B");   
//        linkedset.add("C");   
//        linkedset.add("D");
		//duplicates is not allowed
//        System.out.println("Size of LinkedHashSet = " + linkedset.size());   
//        System.out.println("Original LinkedHashSet:" + linkedset);   
//        System.out.println("Removing D from LinkedHashSet: " + 
//        linkedset.remove("D"));   
//        System.out.println("Trying to Remove Z which is not "+ 
//        "present: " + linkedset.remove("Z"));   
//        System.out.println("Checking if A is present=" +  
//        linkedset.contains("A")); 
//        System.out.println("Updated LinkedHashSet: " + linkedset);
//        
//        TreeSet<String> ts=new TreeSet<String>();
//        ts.add("Ram");
//        ts.add("anu");
//        ts.add("Ramesh");
//        System.out.println(ts);
//        Iterator itr=ts.iterator();
//        while(itr.hasNext())		
//        {
//			System.out.println(itr.next());  		
//	    }
//        
//        
//	}
//
//		}