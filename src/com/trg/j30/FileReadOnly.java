package com.trg.j30;

import java.io.File;

public class FileReadOnly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("/home/prime/b/newfile.txt");
		 
    	//mark this file as read only, since jdk 1.2
    	file.setReadOnly();
 
    	if(file.canWrite()){
    	     System.out.println("This file is writable");
    	}else{
    	     System.out.println("This file is read only");
    	}
 
    	//revert the operation, mark this file as writable, since jdk 1.6
    	file.setWritable(true);
 
    	if(file.canWrite()){
    	     System.out.println("This file is writable");
    	}else{
    	     System.out.println("This file is read only");
    	}   	
	}

}
