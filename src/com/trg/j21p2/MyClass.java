package com.trg.j21p2;

public class MyClass {
	
	private String userName;
	private String userPassword;
	public MyClass(){
		
	}
	public MyClass(String userName, String userPassword){
		
		this.userName=userName;
		this.userPassword=userPassword;
	}
	
	void testException() throws CHException , Exception{
		
		try{
			
			MyOtherClass myOtherClass = new MyOtherClass();
			myOtherClass.testException(userName, userPassword);
			System.out.println("User name is "+userName);
		}
		catch(CHException e){
			System.out.println("Inside MyClass:testException() "+e.getMessage());
			System.out.println("Thank you.You learnt User Defined Exception!!");
			
		}catch (Exception e){
			System.out.println("Inside MyClass:testException() "+e.getMessage());
			System.out.println("Thank you.You learnt User Defined Exception!!");
			
			throw new Exception(e.getMessage());
		}
	}

}
