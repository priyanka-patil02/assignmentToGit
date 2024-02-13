package starPrograms;
import java.util.Scanner;

public class Pattern_1 
{

	public static void main(String[] args) 
	{
		//**************** Pattern 1  *******************//
		
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
		
	
		
		//**************** Pattern 2  *******************//
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row number : ");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			
			for (int j=1*(row-i); j>=1; j--)  
			{
				
				System.out.print(" ");
				
			}
			
			for (int j=1; j<=i; j++ )   
			{
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		*/
		
		//**************** Pattern 3  *******************//
		/*
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row number : ");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=row;j>=i;j--)
			{
				
				System.out.print("*");
			}
			
			System.out.println();
		}

		 */
		
		//**************** Pattern 4  *******************//
		
		/*
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
		 */
		
		
		
		//**************** Pattern 5  *******************//
		
		/*
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
		*/
	}

}
