package percentage_of_runs;
import java.util.Scanner;
/*import java.math.RoundingMode;
import java.text.DecimalFormat;*/
public class Runsmainprog {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	//private static DecimalFormat df = new DecimalFormat("0.00");
	int total=sc.nextInt();
	int four=sc.nextInt();
	int six=sc.nextInt();
	int nooffoursix=4*four+6*six;
	int remaining=total-nooffoursix;
	float percentage=remaining*100; 
	//df.setRoundingMode(RoundingMode.UP);
	System.out.println("Percentage= "+/*df.format*/(percentage/total));
}
}
