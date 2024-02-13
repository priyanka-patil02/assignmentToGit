package assignment;

class A
{
	 /*public int add(int i , int j)
	 {
	    return i+j;
	  } */
	public static int test1()
	{
		System.out.println("Hello this is test1 method");
		return 10;
		  
		}
}
	
class B
{
	  public static void main(String[]  args)
	  {
	   /* A a1 = new A();
	  //  a1.add(a1.add(10,20),a1.add(30,40));
	    int sum=  a1.add(a1.add(10,20),a1.add(30,40));
	    System.out.println("Sum = "+sum);*/
		  A.test1();
		  int k = A.test1();
		  System.out.println(k);
		  
		  
		 /* String str="FOX";  //str length is 3 i.e f=1,o=2,x=3
			int i=0;
			System.out.println(str.length());
			while(i<str.length())
			{
			  System.out.print(str.charAt(i));
			  i++;
			} */
	  }

}