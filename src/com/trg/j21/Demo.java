package com.trg.j21;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		try{
			
			try{
			String s="123x";
			int i = Integer.parseInt(s);
			System.out.println("I="+i);
			dividewithzero();
			}
			catch(NumberFormatException ne){
				System.out.println("Number format exception. Perhaps you passed a character");
			//	dividewithzero();
			}
		}
			
			catch(ArithmeticException ae){
				System.out.println("Arithmetic Exception. divisor cannot be zero. please change and try again.");
			    
			}
			
			
			catch(Exception e){
				System.out.println("General Exception: Reason not Known");
			   // dividewithzero();
			}
	}
			
	 static void dividewithzero(){
		try{		
			
		int x=0;
		System.out.println("x="+x);
         int y=50/x;
         System.out.println("y="+y);
	}
		
		
	
	catch(NumberFormatException ne){
		System.out.println("Number format exception. Perhaps you passed a character");
	}
	
	catch(ArithmeticException ae){
		System.out.println("Arithmetic Exception. divisor cannot be zero. please change and try again.");
		}
	
	catch(Exception e){
		System.out.println("General Exception: Reason not Known");
	}
	}
}
