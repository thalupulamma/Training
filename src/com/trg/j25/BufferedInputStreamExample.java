package com.trg.j25;

import java.io.*;
import java.io.IOException;

public class BufferedInputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/home/prime/newfilechandu.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
 
		try {
			fis = new FileInputStream(file);
 
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
 
			while (dis.available() != 0) {
				System.out.println(dis.readLine());
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				bis.close();
				dis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
