package assignment;

public class MethodUsingInt
{

	public static void main(String[] args) 
	{
		//static method calling
		int total_1 = Add.sum(10, 20, 30);
		System.out.println("Total static Addition = "+total_1);
		
		//Non-static method calling
		Add add = new Add();
		
		int total=add.sum(10, 20);
		System.out.println("Total non-static sum = "+total);
		

	}

}

class Add
{
	
	int sum(int i,int j)
	{
		int k= i+j;
		return k;
		
	}
	
	static int sum(int a,int b,int c)
	{
		int d= a+b+c;
		return d;
		
	}



}
