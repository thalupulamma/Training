package com.trg.j25;

import java.io.*;

public class CopyAFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream inStream = null;
		OutputStream outStream = null;
	 
	    	try{
	 
	    	    File afile =new File("/home/prime/this.jpg");
	    	    File bfile =new File("/home/prime/this1.txt");
	    	    File cfile =new File("/home/prime/this2.svg");
	    	    File dfile =new File("/home/prime/this3.jpg");
	    	    
	 
	    	    inStream = new FileInputStream(afile);
	    	    outStream = new FileOutputStream(bfile);
	    	    outStream = new FileOutputStream(cfile);
	    	    outStream = new FileOutputStream(dfile);
	 
	    	    byte[] buffer = new byte[1024];
	 
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	 
	    	    inStream.close();
	    	    outStream.close();
	 
	    	    System.out.println("File is copied successful!");
	 
	    	}catch(IOException e){
	    		e.printStackTrace();
	    	}
	}

}
