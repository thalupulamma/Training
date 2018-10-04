package com.trg.j31p3;

import java.io.*;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

import java.util.Scanner;

public class ListOfStudents {
	int linenumber = 0;

	HashSet<Student>hashSet=new LinkedHashSet<Student>();
	
	
public void readingList(){
	
	
		try{
			 
    		File file =new File("/home/prime/b/StudentDetails.txt");
 
    		if(file.exists()){
 
    		    FileReader fr = new FileReader(file);
    		    LineNumberReader lnr = new LineNumberReader(fr);
 
    		    
 
    	            while (lnr.readLine() != null){
    	        	linenumber++;
    	            }
 
    	            System.out.println("Total number of lines : " + linenumber);
 
    	            lnr.close();
 
 
    		}else{
    			 System.out.println("File does not exists!");
    		}
 
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    	
    	
  
    	
   
    		
    		BufferedReader br = null;
    		try{
        		String sCurrentLine;
        		br=new BufferedReader(new FileReader("/home/prime/b/StudentDetails.txt"));
        		
        	    
        		//
        		while((sCurrentLine=br.readLine())!=null)
        		{
        			//System.out.println(sCurrentLine);
        			
  
        				

        			StringTokenizer s = new StringTokenizer(sCurrentLine,",");
        			while(s.hasMoreTokens()){
       			//System.out.println(id+" 	"+name+" 	"+city+"	 "+pincode);
        			
        			Student student1=new Student();
        			student1.setStudentID(s.nextToken());
        			student1.setStudentName(s.nextToken());
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
    		
    	
    	 Iterator<Student> iterator = hashSet.iterator();
    	 while(iterator.hasNext()){
    		 
    		 Student student=(Student)iterator.next();
    		 System.out.println(student.getStudentID()+"	"+student.getStudentName()+"	"+student.getCity()+"	"+student.getPincode());
    		
    	 }
    	
    	

  
   
	  
	   
    	
}
}
