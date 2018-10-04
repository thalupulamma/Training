package com.trg.j25;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 
		      File file = new File("/home/prime/newfilechandu.txt");
	 
		      if (file.createNewFile()){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }
	 
	    	} catch (IOException e) {
		      e.printStackTrace();
		}
	}

}
