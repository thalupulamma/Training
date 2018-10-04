package com.trg.j31;

public class MyThread3 extends Thread {
	

	Numbers numbers;
	
	MyThread3(Numbers numbers){
		this.numbers=numbers;
	}
	public void run(){
		int n =numbers.thisnumber(3);
		System.out.println("inside Third Thread (Expected value = 75):" +n);
	
	}
}
