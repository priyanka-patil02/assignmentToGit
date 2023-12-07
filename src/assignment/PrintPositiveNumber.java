package assignment;

import java.util.Scanner;

public class PrintPositiveNumber 
{
 // check whether value is positive or negative 
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :- ");
		
		int num = sc.nextInt();
		if (num < 0) 
		{
			System.out.println("number is negative");
		} 
		else if (num > 0)
		{
			System.out.println("number is positive");
		}
		else
		{
			System.out.println("number is 0 i.e neither positive nor negative.");
		}
	}

}
