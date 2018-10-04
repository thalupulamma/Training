package com.trg.j31;

public class MyThread extends Thread {

	Numbers numbers;
	
	MyThread(Numbers numbers){
		this.numbers=numbers;
	}
	public void run(){
		int n =numbers.thisnumber(1);
		System.out.println("inside First Thread (Expected value = 25):" +n);
	
		
	}
}
