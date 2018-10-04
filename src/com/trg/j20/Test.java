package com.trg.j20;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Outer outer=new Outer();
 
 Outer.Inner inner = outer.new Inner();
  inner.showMessage();
	}

}
