package com.trg.j30;

public class TestThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread mth1=new MyThread("Demo","Hello");
		mth1.start();
		MyThread mth2=new MyThread("Demo","Hello");
		mth2.start();

	}

}
