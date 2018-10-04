package com.trg.j30;

import java.io.File;
import java.text.SimpleDateFormat;

public class GetFileLastModifiedExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("/home/prime/b/newfile.txt");
		 
		System.out.println("Before Format : " + file.lastModified());
	 
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	 
		System.out.println("After Format : " + sdf.format(file.lastModified()));
	}

}
