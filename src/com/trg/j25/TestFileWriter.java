package com.trg.j25;

import java.io.*;

public class TestFileWriter {
	
	public static void main (String[] args)
	{
		String fileWithPath="/home/prime/zero1.txt";
		String text = "This is my text testing to create a new file.";
		File file = new File(fileWithPath);
		Writer output = null;
		try{
			
			output = new BufferedWriter(new FileWriter(file));
			output.write(text);
			System.out.println("File is written");
			
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			try{
				if (output != null)output.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
		
	}
}
