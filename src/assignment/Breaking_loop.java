package assignment;

import java.util.Scanner;

public class Breaking_loop 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :- ");
		int num= sc.nextInt();
		
		while(true)
		{
			if(num < 0)
			{
				System.out.println("Number is less than zero hence break statement...");
				break;
			}
			else
			{
				System.out.println("num = "+num);
			}
			
		}

	}

}
