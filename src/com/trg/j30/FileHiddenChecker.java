package com.trg.j30;

import java.io.File;

public class FileHiddenChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		    	File file = new File("/home/prime/hidden-newfile.txt");
		 
		    	if(file.isHidden()){
		    		System.out.println("This file is hidden");
		    	}else{
		    		System.out.println("This file is not hidden");
		    	}
	}

}
