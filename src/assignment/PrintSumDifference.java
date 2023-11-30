package assignment;

import java.util.Scanner;

public class PrintSumDifference {

	public static void main(String[] args)
	{
		double sum;
		double difference;
		double product;
		double average;
		double distance;
		double max;
		double min;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers : ");
		double num = scan.nextDouble();
		double num1 = scan.nextDouble();
		
		sum= num+num1;
		System.out.println("Sum : "+sum);
		
		difference= num-num1;
		System.out.println("difference : "+difference);
		
		product=num*num1;
		System.out.println("Product : "+product);
		
		average=(num+num1)/2;
		System.out.println("Average : "+average);
		
		distance=num-num1;
		System.out.println("Distance : "+distance);
		
		
		if(num > num1)
		{
			
			System.out.println("Max : "+num);
			System.out.println("Min : "+num1);
		}
		else
		{
			System.out.println("Max : "+num1);
			System.out.println("Min : "+num);
		}
		
		
		
	}

}
