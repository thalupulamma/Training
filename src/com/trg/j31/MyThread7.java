package com.trg.j31;

public class MyThread7 extends Thread {


	Numbers numbers;
	
	MyThread7(Numbers numbers){
		this.numbers=numbers;
	}
	public void run(){
		int n =numbers.thisnumber(7);
		System.out.println("inside 7th Thread (Expected value = 175):" +n);
	
	}
}
