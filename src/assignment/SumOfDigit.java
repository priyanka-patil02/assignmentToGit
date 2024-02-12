package assignment;

import java.util.Iterator;
import java.util.Scanner;

public class SumOfDigit
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :- ");
		
		int num = sc.nextInt();
		int sum=0;
		int rem;
		
		for(;num!=0;num=num/10)
		{
			rem = num%10;
			
			sum=sum+rem;
			
		}
		
		System.out.println("Sum of digits are : "+sum);

	}

}
