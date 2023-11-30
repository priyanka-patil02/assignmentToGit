package assignment;

import java.util.Scanner;

public class PrintSquareCube {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		double number = scan.nextDouble();
		
		double square = number*number;
		
		double cube = square*number;
		double power = cube*number;
		
		System.out.println("Square = "+square+"; "+"Cube = "+cube+"; "+"Fourth power = "+power);
	}

}
