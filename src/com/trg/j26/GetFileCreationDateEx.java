package com.trg.j26;

import java.io.*;
import java.util.StringTokenizer;

public class GetFileCreationDateEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			 
    		Process proc = 
    		   Runtime.getRuntime().exec("ls -ltr //home//prime//b/new.txt");
 
    		BufferedReader br = 
    		   new BufferedReader(
    		      new InputStreamReader(proc.getInputStream()));
 
    		String data =br.readLine();
 
    		//it's quite stupid but work
    	//	for(int i=0; i<6; i++){
    			//data = br.readLine();
    		//	System.out.println("Extracted value : " + br.readLine());
    	//	}
 
    		System.out.println("Extracted value : " + data);
 
    		//split by space
    		StringTokenizer st = new StringTokenizer(data);
    		String permissions = st.nextToken();//Get permissions
    		String fileno = st.nextToken();//Get fileno
    		String folder = st.nextToken();//get folder
    		String folderinit = st.nextToken();//get folder
    		String size=st.nextToken();//get size
    		String month=st.nextToken();//get month
    		String date = st.nextToken();//get date
    		String time=st.nextToken();//get time
    		
    		System.out.println("allowed permissions  : " + permissions);
    		System.out.println("file no. in the folder  : " + fileno);
    		System.out.println("Creation folder  : " + folder);
    		System.out.println("Creation folderinit  : " + folderinit);
    		System.out.println("Creation size in kb : " + size);
    		System.out.println("Creation month  : " + month);
    	    System.out.println("Creation Date  : " + date);
    		System.out.println("Creation Time  : " + time);
 
    	}catch(IOException e){
 
    		e.printStackTrace();
 
    	}
 
	}

}
