package assignment;

import java.util.Scanner;

public class Amstrong_Number 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :- ");
		
		int num = sc.nextInt();
		int num1=num;
		int add=0;
		int add1=0;
		int cube=0;
		int sum=0;
		int rem;
		
		for(;num!=0;num=num/10)
		{
			rem = num%10;
			
			add=add1+rem;  
			cube = add*add*add;
			//System.out.println("Sum  : "+cube);
			sum=sum+cube;
			
		}
		
		if(num1 == sum)
		{
			System.out.println("num= "+num1);

		  System.out.println("Addition of cube of number : "+sum);
		  System.out.println("Number is Amstrong number.");
		}
		else
		{
			System.out.println("num= "+num1);
			System.out.println("Addition of cube of number : "+sum);
			System.out.println("Number is not Amstrong number. ");
		}
	}

}
