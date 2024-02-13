package assignment;

public class Main
{

	public static void main(String[] args) 
	{
		/*
		//ststic method calling and comment is visible while calling in eclipse
		Comment_Class.commentMethod( 0,0);
		*/
		
		byte b1= (byte)130;
		byte b2 =(byte)(short)130;
		byte b3 = (byte)(int)(short)130;
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		System.out.println("b3 = "+b3);
		
		
		int i = 130;
		short s = (short)i;
		short s1 = (short)(byte) i;
		byte b = (byte) i;
		
		System.out.println("s = "+s);
		System.out.println("s1 = "+s1);
		System.out.println("b= "+b);
	}

}
