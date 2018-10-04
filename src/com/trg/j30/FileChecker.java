package com.trg.j30;

import java.io.File;

public class FileChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("/home/prime/newfile.txt");
		 
		  if(f.exists()){
			  System.out.println("File existed");
		  }else{
			  System.out.println("File not found!");
		  }

	}

}
