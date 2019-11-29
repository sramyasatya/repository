package collections;

import java.util.*;
public class MyComparatortreeset implements Comparator {
	public static void main(String[] args) {
		
			}

	@Override
	public int compare(Object obj1, Object obj2) 
	{
		// TODO Auto-generated method stub
		String s1=(String) obj1;
		String s2=(String) obj2;

		
//		Integer I1 =(Integer)obj1;
//	   Integer I2 =(Integer)obj2;	
//		if(I1<I2)
//			return 1;// sorts data in descending order..
//		else if(I1>I2)
//			return -1;
//		else
//			return 0;
		
		return (s2.compareTo(s1));
		//return (s1.compareTo(s2));//ascending
		
	}}
