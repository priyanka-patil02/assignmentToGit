package assignment;

import java.util.Scanner;

public class PrintWeekDay 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number between 1 to 7:- ");
		
		int num = sc.nextInt();

		switch (num) 
		{
		case 1:
			System.out.println(num+"- Sunday");
			break;
		case 2 :
			System.out.println(num+"- Monday");
			
			break;
			
		case 3 :
			System.out.println(num+"- Tuesday");
			
			break;
			
		case 4 :
			System.out.println(num+"- Wednesday");
			
			break;
			
		case 5 :
			System.out.println(num+"- Thursday");
			
		    break;
		
		case 6 :
			System.out.println(num+"- Friday");
			
			break;
		
		case 7 :
			System.out.println(num+"- Saturday");
			
			break;
		
		default:
			System.out.println(num+" -Invalid number");
			break;
		}
	}

}
