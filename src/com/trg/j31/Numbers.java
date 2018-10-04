package com.trg.j31;

public class Numbers {

	int j=0;
	synchronized int thisnumber(int n){
		j=n;
		try{
			Thread.sleep(600);
			
		}catch(Exception e){
        	System.out.println(e);
			
		}
		return j*25;
	}
}
