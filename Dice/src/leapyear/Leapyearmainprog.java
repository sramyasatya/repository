package leapyear;
import java.util.Scanner;
public class Leapyearmainprog {
	static String leapyear(int year){
	    String leapdate = "";
	    if(year < 1918) 
	    {               
	    	if(year%4==0)
	    	
	    		leapdate="12.09"+year;
	   
	    	else
	    		leapdate="13.09"+year;
	        
	    }
	    else if(year == 1918)
	    {                                          
	        leapdate += "26.09." + year;
	    } 
	    else
	    {   if((year%400==0)||(year%4==0&&year%100!=0))
	    	
    		leapdate="12.09"+year;
   
    	else
    		leapdate="13.09."+year;
                                                                 
	        
	    }
	    return leapdate;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year");
	int year=sc.nextInt();
	String dateoftheyear=leapyear(year);
	System.out.println(dateoftheyear);
}

}

