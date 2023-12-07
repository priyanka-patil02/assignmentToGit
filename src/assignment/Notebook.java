package assignment;

 class Notebook 
{
	String name;
	double length;
	int pages;
	String size;
	static String colour;  //use of static
		
	void toWrite(String content)
	{
		System.out.println(name+" - "+content);
	}

}

 class Sofa
	{
	    String name;
		double length;
		static int capacity;
		String colour;
		String material;
		
		void toSeat(String content)
		{
			System.out.println(name+" - "+content);
		}
	}
 
 
 class Toys
	{
	 	String name;
		String material;
		double weight;
		String colour;
		 
		
		static int sum(int i,int j)  // declared as static method
		{
			int k=i+j;
			return k;
		}
		
		static void toPlay(String content)    // declared as static method
		{
			//System.out.println(name+" - "+content);
			System.out.println(content);       // void is static thats why no return value 
		}
		
	}
 

	class Table
	{
		double length;
		double height;
		String colour;
		String shape;
		double weight;
		
		void toWrite(String content)
		{
			System.out.println(content+" "+shape);
		}
	
	}
	
	
	class Mouse
	{
		double length;
		double height;
		String colour;
		String shape;
		int button;
		
		
		void toCick(String content)
		{
			System.out.println(colour+" - "+content);
		}
	}
	
	class Books
	{
		String name;
		double weight;
		int pages;
		
		
		void toRead(String content)
		{
			System.out.println(name+" - "+content);
		}
	
	}
	
	class Clock
	{
		String name;
		int numbers;
		String shape;
		String material;
		 
		void toShowTime(String content)
		{
			System.out.println(name+" - "+content);
		}
	}
	
	class Fan
	{
		String name;
		int noOfBlades;
		String material;
		double weight;
		
		void circulateAir(String content)
		{
			System.out.println(name+" - "+content);
		}
	}
	
	class Pen
	{
		String name;
		double height;
		double width;
		String shape;
		
		
		void toWrite(String content)
		{
			System.out.println(name+" - "+content);
		}
	}
	
	class Mobile
	{
		String name;
		double height;
		double width;
		double weight;
		String colour;
		
		
		void toCall(String content)
		{
			System.out.println(name+" - "+content);
		}
		
	}
	
	class Human
	{
		double height;
		double weight;
		String colour;
		String name;
		int age;
		
		void toWalk(String content)
		{
			System.out.println(name+" - "+content);
		}
	}
	

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
