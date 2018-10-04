package com.trg.a1p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class ListOfAddress {
	HashSet<Address>hashSet=new LinkedHashSet<Address>();
	
	
	public void readingList(){
		
		BufferedReader br = null;
		try{
    		String sCurrentLine;
    		br=new BufferedReader(new FileReader("/home/prime/b/AddressList.txt"));
    		
    	    
    		//
    		while((sCurrentLine=br.readLine())!=null)
    		{
    			//System.out.println(sCurrentLine);
    			

    				

    			StringTokenizer s = new StringTokenizer(sCurrentLine,",");
    			while(s.hasMoreTokens()){
   		
    			
    			Address student1=new Address();
    			student1.setDoorNumber(s.nextToken());
    			student1.setStreet(s.nextToken());
    			student1.setCity(s.nextToken());
    			student1.setPincode(s.nextToken());
    			
    			hashSet.add(student1);
    			}

    		}
    		
		
    		
    	}catch (IOException e) {
			e.printStackTrace();
		} 
}	
		

	public void printList()
	{
		
	
	 Iterator<Address> iterator = hashSet.iterator();
	 while(iterator.hasNext()){
		 
		 Address student=(Address)iterator.next();
		 System.out.println(student.getDoorNumber()+"	"+student.getStreet()+"	"+student.getCity()+"	"+student.getPincode());
		
	 }
	
}
}