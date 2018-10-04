package com.trg.j31;

public class MyThread2 extends Thread{

	Numbers numbers;
	
	MyThread2(Numbers numbers){
		this.numbers=numbers;
	}
	public void run(){
		int n =numbers.thisnumber(2);
		System.out.println("inside Second Thread (Expected value = 50):" +n);
	
	}
}
