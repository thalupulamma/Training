package com.trg.j26;

import java.io.File;

public class MoveFileEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			 
	    	   File afile =new File("/home/prime/a/newfile.txt");
	 
	    	   if(afile.renameTo(new File("/home/prime/b/" + afile.getName()))){
	    		System.out.println("File is moved successful!");
	    	   }else{
	    		System.out.println("File is failed to move!");
	    	   }
	 
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
	}

}
