package assignment;

public class Non_Parameterized_Method
{

	public static void main(String[] args) 
	{
		//Calling static,non-parameterized method
		Method.hello();
		
		//Calling non-static,non-parameterized method
		Method method = new Method();
		
		double Temp= method.value_Of_Temp();
		System.out.println(Temp);

	}

}

class Method
{
	
	//non-static,non-parameterized method
	double value_Of_Temp()
	{
		return 37.6;
	}
	
	//static,non-parameterized method
	static void hello()
	{
		System.out.println("Hello..in non-static ,non-pameterized method");
		
	}
}
