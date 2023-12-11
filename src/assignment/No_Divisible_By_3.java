package assignment;

public class No_Divisible_By_3
{

	public static void main(String[] args)
	{
		int num;
		int i;
		int j;
		int k;
		
		System.out.println("Divisible by 3 :- ");
		for(num=1;num<=100;num=num+1)
		{
			
			if(num%3==0)
			{
				
				System.out.print(num+" , ");
			}
		}
		
		System.out.println(" ");
		
		System.out.println("Divisible by 5 :- ");
			for(num=1;num<=100;num=num+1)
			{
				
				if(num%5==0)
				{
					
					System.out.print(num+" , ");
				}
			
		    }
			
		System.out.println(" ");	
		System.out.println("Divisible by 3 and 5 :- ");
			for(num=1;num<=100;num=num+1)
			{
				
				if(num%3==0 && num%5==0)
				{
					
					System.out.print(num+" , ");
				}
			
		    }
			
	}

}
