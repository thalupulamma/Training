package com.trg.j31;

public class MyThread4 extends Thread {


	Numbers numbers;
	
	MyThread4(Numbers numbers){
		this.numbers=numbers;
	}
	public void run(){
		int n =numbers.thisnumber(4);
		System.out.println("inside 4th Thread (Expected value = 100):" +n);
	
	}
}
