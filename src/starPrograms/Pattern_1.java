package starPrograms;
import java.util.Scanner;

public class Pattern_1 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter row number : ");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)     // represents row
		{
			
			for(int j=1;j<=i;j++)    //represents column
			{
				System.out.print("*");   //prints *
				
			}
			
			System.out.println();  //goes next line
			
		}
		
		
	}

}
