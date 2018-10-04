package com.trg.j26;

import java.io.File;
import java.io.IOException;

public class FilePathExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			 
    	    File temp = File.createTempFile("i-am-a-temp-file", ".jpg" );
 
    	    String absolutePath = temp.getAbsolutePath();
    	    System.out.println("File path : " + absolutePath);
 
    	    String filePath = absolutePath.
    	    	     substring(0,absolutePath.lastIndexOf(File.separator));
 
    	    System.out.println("File path : " + filePath);
 
    	}catch(IOException e){
 
    	    e.printStackTrace();
 
    	}
 
	}

}
