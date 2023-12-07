package assignment;

public class PrimeNumber 
{

	public static void main(String[] args)
	{
		int i =0;
	    int j =0;
	    int n;  
	    String  primeNum = "";
	    int counter_1 =0;

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 
	          
	          for(j =i; j>=1; j--)
	          {
	             if(i%j==0)
	             {
	            	 counter = counter + 1;
	             }
	          }
	          if (counter ==2)
	          {
	        	  //primeNumbers =  i + " ";
	        	  counter_1++;
	        	  primeNum = primeNum + i + " ";
	        	  if( counter_1 == 20)
			      {
			    	  
			       break;
			      }
	        	  
	          }	
	          
	       }	
	       	System.out.println("First 20 Prime numbers are :");
	       	System.out.println(primeNum);

	}

}
