package com.trg.j26;

import java.io.*;

public class LineNumberReaderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			 
    		File file =new File("/home/prime/b/newfile.txt");
 
    		if(file.exists()){
 
    		    FileReader fr = new FileReader(file);
    		    LineNumberReader lnr = new LineNumberReader(fr);
 
    		    int linenumber = 0;
 
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
	}

}
