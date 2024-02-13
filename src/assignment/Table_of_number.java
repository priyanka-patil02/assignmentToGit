package assignment;

public class Table_of_number
{

	public static void main(String[] args) 
	{
		int num;
		int count;
		int multiply;
		for(num=1;num<=20;num++)
		{
			if(num == 6 || num==12 || num== 17)
			{
				continue;
			}
			for(count=1;count<=10;)
			{
				multiply = num * count;
				System.out.print("  "+multiply);
				count++;
			}
			System.out.println("");
			System.out.println("");
			
		}

	}

}
