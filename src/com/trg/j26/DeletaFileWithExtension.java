package com.trg.j26;

import java.io.*;

public class DeletaFileWithExtension {

	/**
	 * @param args
	 */
	 private static final String FILE_DIR = "/home/prime/a/";
	 private static final String FILE_TEXT_EXT = ".txt";
	
	 public static void main(String[] args) {
		 
		 new DeletaFileWithExtension().deleteFile(FILE_DIR,FILE_TEXT_EXT);
	 }
		// TODO Auto-generated method stub
		 public void deleteFile(String folder, String ext){
			 
		     GenericExtFilter filter = new GenericExtFilter(ext);
		     File dir = new File(folder);
		 
		     //list out all the file name with .txt extension
		     String[] list = dir.list(filter);
		 
		     if (list.length == 0) return;
		 
		     File fileDelete;
		 
		     for (String file : list){
		   	String temp = new StringBuffer(FILE_DIR)
		                      .append(File.separator)
		                      .append(file).toString();
		    	fileDelete = new File(temp);
		    	boolean isdeleted = fileDelete.delete();
		    	System.out.println("file : " + temp + " is deleted : " + isdeleted);
		     }
		   }
		 
		
		  
}

