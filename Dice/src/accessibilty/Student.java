package accessibilty;
public class Student {//private variables can be accessed by using public methods
private int rollno; // we can do this without using getter and 
private String name;//setter methods but the values wont be get at the time of object creation.. 
//but in the case of using constructor the values will be passes at the time of object creation itself
//if we use only the constructor then accessibilty outside class is not possible
//using constructor the value will take value only once.. setter and getter methods are used set(modify) and get values
Student(int rollno,String name)
  {
  this.rollno=rollno;
  this.name=name;
  }
 
public int getdetails()
{
	return rollno;
}
public void setdetails(int roll)
{
	this.rollno=roll;
}
public static void main(String args[])
{
	Student s1=new Student(10,"Ram");
	//s1.setdetails(10);
	System.out.println(s1.getdetails());
}
}

	
