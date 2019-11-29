package collections;

import java.util.*;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        
		        ArrayList<Integer> list=new ArrayList<Integer>();
		     int sum=0;
		        for(int i=1;i<=100;i++)
		        {
		            
		            list.add(i);
		            if(i%2==0)
		            	sum=sum+i;
		        }
		        System.out.println(sum);
//		        Iterator itr=list.iterator();
//		        int sum=0;
//		        int a;
//		        while(itr.hasNext())
//		        {
//		            a=(itr.next()).intValue();
//		            if(a%2==0)
//		            {
//		                sum=sum+a;
//		            }
//		        }
//		        System.out.print(sum);
		     
	}	


}
