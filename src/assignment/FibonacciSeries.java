package assignment;

import java.util.Scanner;


import org.testng.annotations.Test;

public class FibonacciSeries
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter count number : ");
		int a= sc.nextInt();
		int n=0,n1=1,n2,i;
		System.out.print(" "+n1);
		for(i=2;i<=a;i++)
		{
			n2=n+n1;
			System.out.print(" "+n2);

			n=n1;
			n1=n2;

		}

	}

}
