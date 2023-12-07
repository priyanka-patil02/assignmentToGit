package assignment;

import java.util.Scanner;

public class PrintMonth
{

	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of month or month name in lower case :- ");
		
		String num = sc.nextLine();
		//System.out.println(" number of month :- " +num);
		
		if( num.equals("1" ) || num.equals("january" ))
		{
			System.out.println("31 Days");
		}
		else if(num.equals("2" ) ||num.equals("february" ))
		{
			System.out.println("28 Days");
		}
		else if( num.equals("3" ) || num.equals("march" ))
		{
			System.out.println("31 Days");
		}
		else if( num.equals("4" ) || num.equals("april" ))
		{
			System.out.println("30 Days");
		}
		else if( num.equals("5" ) || num.equals("may" ))
		{
			System.out.println("31 Days");
		}
		else if( num.equals("6" ) || num.equals("june" ))
		{
			System.out.println("30 Days");
		}
		else if( num.equals("7" ) || num.equals("july" ))
		{
			System.out.println("31 Days");
		}
		else if( num.equals("8" ) || num.equals("august" ))
		{
			System.out.println("31 Days");
		}
		else if( num.equals("9" ) || num.equals("september" ))
		{
			System.out.println("30 Days");
		}
		else if( num.equals("10" ) || num.equals("october" ))
		{
			System.out.println("31 Days");
		}
		else if( num.equals("11" ) || num.equals("november" ))
		{
			System.out.println("30 Days");
		}
		else if( num.equals("12" ) || num.equals("december" ))
		{
			System.out.println("31 Days");
		}
	}

}
