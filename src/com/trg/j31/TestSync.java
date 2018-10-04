package com.trg.j31;

public class TestSync {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numbers numbers = new Numbers();
		
		MyThread myThread = new MyThread(numbers);
		MyThread2 myThread2 = new MyThread2(numbers);
		MyThread3 myThread3 = new MyThread3(numbers);
		MyThread4 myThread4 = new MyThread4(numbers);
		MyThread5 myThread5 = new MyThread5(numbers);
		MyThread6 myThread6 = new MyThread6(numbers);
		MyThread7 myThread7 = new MyThread7(numbers);
		
		myThread.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		myThread5.start();
		myThread6.start();
		myThread7.start();
		
		
		

		
	}

}
