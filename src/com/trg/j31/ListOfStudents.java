package com.trg.j31;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListOfStudents {
	int linenumber = 0;
	Student[] student= new Student[linenumber];
	
public void readingList(){
	
	int linenumber = 0;
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
    	
    	
    	Student[] student= new Student[linenumber];
    	
    	BufferedReader br = null;
    	try{
    		String sCurrentLine;
    		br=new BufferedReader(new FileReader("/home/prime/b/StudentDetails.txt"));
    		int i = linenumber;
    	    
    		while((sCurrentLine=br.readLine())!=null)
    		{
    			
    			Scanner s = new Scanner(br).useDelimiter("\\s*,\\s*");
    			
    			String id = s.next();
    			int di = Integer.parseInt(id);
    			String name=s.next();
    			String city=s.next();
    			String pincode= s.next();
    			int codepin = Integer.parseInt(pincode);
    			
    			
    			Student student1=new Student(di,name,city,codepin);
    			List<Student>studentList=new ArrayList<Student>();
    			studentList.add(student1);
    			
    			
    		}
    	}catch (IOException e) {
			e.printStackTrace();
		} 
}	
    /*	public void printList()
    	{
    		
    	
    	 Iterator<Student> iterator = studentList.iterator();
    	 while(iterator.hasNext()){
    		 
    		 Student student=(Student)iterator.next();
    		 System.out.println(student.getStudentID()+"	"+student.getStudentName()+"	"+student.getCity()+"	"+student.getPincode());
    		  Iterator<Student> iterator = studentList.iterator;
    	 }
    	
    	
    	finally {
			      try {
				     if (br != null)
					     br.close();
			           }
			
			          catch (IOException ex)
			          {
				        ex.printStackTrace();
			            }
    	
}

  
   
	  
	   
    	
}*/
}
