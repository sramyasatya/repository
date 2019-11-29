package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList2 {
	


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int temp,out=0;
			ArrayList list = new ArrayList();
			for(int i=1;i<=100;i++)
			{
				list.add(i);
			}
			Iterator obj = list.iterator();  
			
			while(obj.hasNext())
			{
				temp = (int)obj.next();
				if(temp%2==0)
				{
					out+=temp;
				}
			}
			System.out.println(out)
	;
//			System.out.println(list);
		}
	}

