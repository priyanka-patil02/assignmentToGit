package assignment;

public class Method_Chaining
{

	public static void main(String[] args) 
	{
		A1 a1 = new A1();
		
		a1.method_1().method_2();

	}

}

class A1
{
	A1 method_1()
	{
		System.out.println("Hello ,in method 1..");
		
		return this ;
		
	}
	
	A1 method_2()
	{
		System.out.println("Hiii ,in method 2..");
		return this ;
		
	}

}
