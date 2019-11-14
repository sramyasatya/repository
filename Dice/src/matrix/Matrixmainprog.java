package matrix;
import java.util.Scanner;
public class Matrixmainprog {
public static void main()
{
	Scanner sc=new Scanner(System.in);
	int matrix[][]=new int[4][4];
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			matrix[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			if(matrix[i][j]==matrix[i][j])
			{
				
			}
		}
	}
}
}
