package com.trg.j31;

public class MyThread6 extends Thread {


	Numbers numbers;
	
	MyThread6(Numbers numbers){
		this.numbers=numbers;
	}
	public void run(){
		int n =numbers.thisnumber(6);
		System.out.println("inside 6th Thread (Expected value = 150):" +n);
	
	}
}
