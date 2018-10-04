package com.trg.j21p2;

public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			
			MyClass myClass=new MyClass("chandu","3Edge");
			myClass.testException();
			
		}
		catch(CHException e){
			System.out.println("inside main function"+e.getMessage());
			
		}catch(Exception e){
			System.out.println("inside main function"+e.getMessage());
			e.printStackTrace();
		}
	}

}
