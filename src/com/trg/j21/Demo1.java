

package com.trg.j21;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		try{	
			try{
			String s="123";
			int i = Integer.parseInt(s);
			System.out.println("I="+i);
			
			}
			catch(NumberFormatException ne){
				System.out.println("Number format exception. Perhaps you passed a character");
			    throw new Exception("My Exception"); 
			}
		
			
			
		try{		
			
		double x=0;
		System.out.println("x="+x);
        double y=50/x;
         System.out.println("y="+y);
	      }
		catch(ArithmeticException ae){
		System.out.println("Arithmetic Exception. divisor cannot be zero. please change and try again.");
		}
	 System.out.println("no problems.code is correct");
	}
	
	catch(Exception e){
		System.out.println("General Exception: Reason not Known");
	}
	
	
	finally{
		System.out.println("i am always function, no matter what the exception is");
	}
}
}


	


