package assignment;

public class Method_using_void
{

	public static void main(String[] args) 
	{
		//Calling static method
		Hello.hello();
		
		//Calling non-static method
		Hello hii = new Hello();
		
		hii.hi();
		
	}

}

class Hello
{
	//static void method
	static void hello()
	{
		System.out.println("Hello..in static method");
		
	}
	
	//non-static void method
	
	 void hi()
	{
		 System.out.println("Hii..in non-static method");
		 return;
	}


}
