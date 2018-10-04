package com.trg.j31p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestOfStringTokenizer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try{
    		String sCurrentLine;
    		br=new BufferedReader(new FileReader("/home/prime/b/StudentDetails.txt"));
    	
    	    
    		
    		while((sCurrentLine=br.readLine())!=null)
    		{
    		
    			Scanner s = new Scanner(sCurrentLine).useDelimiter("\\s*,\\s*");
    			
    			String id = s.next();
                String name=s.next();
    			String city=s.next();
    			String pincode= s.next();
    			System.out.println(id+" 	"+name+" 	"+city+"	 "+pincode);
    			
    			
    			}
    		
    		
    	}catch (IOException e) {
			e.printStackTrace();
		} 
}	
	}


