package assignment;

import java.util.Scanner;

public class TemperatureConversion
{

	public static void main(String[] args)
	{
		
		  float fahrenheit;
		  float kelvin; 
		  final float deg = (float)1.8; 
		  final float
		  celDeg=32; 
		  final float kel=273;
		  Scanner scan = new Scanner(System.in);
		  
		  System.out.println("Enter temperature in Celcius : "); 
		  float celcius =scan.nextFloat();
		  
		  fahrenheit = (deg * celcius) + celDeg;
		  
		  kelvin = celcius +kel;
		  
		  System.out.println(celcius+" Celcius = "+fahrenheit+" Fahrenheit ");
		  System.out.println(celcius+" Celcius = "+kelvin+" Kelvin ");
		  
		 

	}

}
