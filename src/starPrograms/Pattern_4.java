package starPrograms;

import java.util.Scanner;

public class Pattern_4 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row number : ");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for (int j=i; j<=row; j++ )   
			{
				
				System.out.print("*");
				
			}
			System.out.println();
			for (int j=0; j<i; j++)  
			{
				
				System.out.print(" ");
				
			}
			
			
		}

	}

}
