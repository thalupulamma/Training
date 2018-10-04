package com.trg.j26;

import java.io.*;

public class RenameFileEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File oldfile =new File("/home/prime/a/oldname.txt");
		File newfile =new File("/home/prime/a/newfile.txt");
 
		if(oldfile.renameTo(newfile)){
			System.out.println("Rename succesful");
		}else{
			System.out.println("Rename failed");
		}
 

	}

}
