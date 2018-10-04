package com.trg.a1;

import java.io.*;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

import java.util.Scanner;

public class ListOfStudents {


	HashSet<Student>hashSet=new LinkedHashSet<Student>();
	
	
public void readingList(){
	
	
    		BufferedReader br=null ;
    		BufferedReader br1 =null;
    		
    		try{
        		String sCurrentLine,s1CurrentLine,s2CurrentLine;
        		br=new BufferedReader(new FileReader("/home/prime/b/StudentDetails.txt"));
        		br1=new BufferedReader(new FileReader("/home/prime/b/AddressList.txt"));
        		
        	    
        		//
        	while((sCurrentLine=br.readLine())!=null&&(s1CurrentLine=br1.readLine())!=null&&(s2CurrentLine=br2.readLine())!=null);
        		{
        	
        	       Student student1=new Student();
        	       Address  address =new Address();
                  StringTokenizer s = new StringTokenizer(sCurrentLine,",");
                 
        			while(s.hasMoreTokens()){
       		
        			student1.setStudentID(Integer.parseInt(s.nextToken()));
        			student1.setStudentName(s.nextToken());
        			}
        			StringTokenizer s1 = new StringTokenizer(s1CurrentLine,",");
        			
        			while(s1.hasMoreTokens()){
            			address.setDoorNumber(s1.nextToken());
            			address.setStreet(s1.nextToken());
            			address.setCity(s1.nextToken());
            			address.setPincode(s1.nextToken());
            			
            			}
        			student1.setAddress(address);
        		         
        			
        			hashSet.add(student1);
        			}

        		
        		
    		
        		
        		}catch (IOException e) {
    			e.printStackTrace();
    		} 
}	
    	public void printList()
    	{
    		
    	
    	 Iterator<Student> iterator = hashSet.iterator();
    	 while(iterator.hasNext()){
    		 
    		 Student student=(Student)iterator.next();
    		 System.out.println(student.getStudentID()+"	"+student.getStudentName()+"       "+student.getAddress().getDoorNumber()
    				 +"			"+student.getAddress().getStreet()+"          "+student.getAddress().getCity()+"		"+student.getAddress().getPincode());
    		
    	 }
    	
    	

  }
}
