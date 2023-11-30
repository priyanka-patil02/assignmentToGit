package assignment;

import java.util.Scanner;

public class MaximumNumber 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
       // System.out.println("Show 3 numbers :- " +a+""+b+""+c);
        
        if(a >b && a >c)
        {
        	System.out.println(" maximum number is  : "+a);
        	
        }
        else if(b>a && b>c)
        {
        	System.out.println("maximum number is : "+b);
        }
        else
        {
        	System.out.println("maximum number is : "+c);
        }
        
        
        
        
	}

}
