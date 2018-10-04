package com.trg.j30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		try{
		
			scanner = new Scanner(new File("/home/prime/b/newfile.txt"));
	   
			 while(scanner.hasNext()){
				 String  string = scanner.next();
				 System.out.println("the String is:"+string);
			 }
		}catch(FileNotFoundException fo){
			fo.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
        finally{
        	scanner.close();
        }
	}

}
