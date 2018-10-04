package com.trg.j25;

import java.io.*;

public class TestFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//open the file that is the first
			// command line parameter
			
			FileInputStream fstream= new FileInputStream("/home/prime/zero.txt");
			//get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			// Read File line  by line
			while((strLine= br.readLine())!=null){
				//print the content on the console
				System.out.println(strLine);
			}
			// close the input stream
			in.close();
			
			
		}catch(Exception e){
			// catch exception if any
			
			System.err.println("Error: "+e.getMessage());
		}

	}

}
