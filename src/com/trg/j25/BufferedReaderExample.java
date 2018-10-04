package com.trg.j25;

import java.io.*;

public class BufferedReaderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("/home/prime/newfilechandu.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			      try {
				     if (br != null)
					     br.close();
			           }
			
			          catch (IOException ex)
			          {
				        ex.printStackTrace();
			            }
		           }
 
	}

}
