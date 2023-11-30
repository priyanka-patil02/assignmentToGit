package assignment;

import java.util.Scanner;

public class TemperatureConversion
{

	public static void main(String[] args)
	{
		
		  double fahrenheit; double kelvin; final double deg = 1.8; final double
		  celDeg=32; final double kel=273; Scanner scan = new Scanner(System.in);
		  
		  System.out.println("Enter temperature in Celcius : "); double celcius =
		  scan.nextDouble();
		  
		  fahrenheit = (deg * celcius) + celDeg;
		  
		  kelvin = celcius +kel;
		  
		  System.out.println(celcius+" Celcius = "+fahrenheit+" Fahrenheit ");
		  System.out.println(celcius+" Celcius = "+kelvin+" Kelvin ");
		  
		 

	}

}
