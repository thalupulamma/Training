package com.trg.j21p2;

public class MyOtherClass {
	
	public MyOtherClass(){
		
	}
     void testException(String userName, String userPassword) throws CHException, Exception{
    	 
    	 try{
    		 
    		 if(!("chandu".equalsIgnoreCase(userName)))
    			 throw new CHException("User Name is wrong");
    		 
    		 if(!("3edge".equals(userPassword)))
    			 throw new CHException("User Password is wrong");
    	 }
    	 catch(CHException che){
    		 System.out.println("Inside MyOtherClass:testException(): "+che.getMessage());
    	     
    		 throw new Exception(che.getMessage());
    	 }
    	 
     }
}
