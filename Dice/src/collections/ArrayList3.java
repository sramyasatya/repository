package collections;
import java.util.*;

public class ArrayList3 {
	     public static void main(String []args){
	        Scanner sc=new Scanner(System.in);
	        ArrayList<Integer> list=new ArrayList<Integer>(100);
	       
	        for(int i=1;i<=100;i++)
	        {
	           list.add(i);
	        }
	        Iterator<Integer> itr=list.iterator();
	        int sum=0;
	        int a;
	        while(itr.hasNext())
	        {
	            a=(int)itr.next();
	            if(a%2==0)
	            {
	                sum=sum+a;
	            }
	        }
	        System.out.print(sum);
	     }
	}
