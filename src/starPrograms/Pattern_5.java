package starPrograms;

import java.util.Scanner;

public class Pattern_5 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row number : ");
		int row = sc.nextInt();
		//int m=0;
		 int i,j;
		for( i=0;i<row;i++)
		{
			
			
			for (j=row-i; j>1; j--)   
			{
				
				System.out.print(" ");
				
			}
			//System.out.println();
			for (j=0; j<=i; j++)  
			{
				
				System.out.print("* ");    //give space after *
				
				
			}
			
			System.out.println();
		}
		
	}

}
