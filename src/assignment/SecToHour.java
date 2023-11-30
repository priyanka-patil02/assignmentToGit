package assignment;

import java.util.Scanner;

public class SecToHour {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter seconds  : ");
		
		int seconds = scan.nextInt();
		
		int hour = (seconds/3600) % 3600;
		
		System.out.println(" hour is  : "+hour);
		
		int minute = (seconds/60)%60;
		System.out.println(" minute is  : "+minute);
		
		int sec= seconds%60;
		System.out.println(" seconds is  : "+sec);
		
		System.out.println(hour+" Hours"+" "+minute+" Minutes"+" "+sec+" Seconds");
		
	}

}
