package com.trg.j31;

public class MyThread5 extends Thread {
	

	Numbers numbers;
	
	MyThread5(Numbers numbers){
		this.numbers=numbers;
	}
	public void run(){
		int n =numbers.thisnumber(5);
		System.out.println("inside 5th Thread (Expected value = 125):" +n);
	
	}

}
