package assignment;

public class Parameterized_method 
{

	public static void main(String[] args)
	{
		
		//Calling static Parameterized method
		int a=Demo.Add(10, 30);
		
		System.out.println("Static add = "+a);
	
		
		//Calling non-static Parameterized method
		Demo d = new Demo();
		String str = d.toSpeak("Parameterized string..");
		System.out.println(str);
		
		//System.out.println(d.toSpeak("Parameterized string.."));
	}

}

class Demo
{
	
	static int Add(int i,int j)
	{
		
	 int k = i+j;
	 return k;
		
	}
	
	String toSpeak(String content)
	{
		return "Hii.."+content;
		
	}
	

}
