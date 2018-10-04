package com.trg.j20p2;

public class TestMyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		MyClass myClass = new MyClass();
		
		int y= myClass.doSomething();
		
		System.out.println("the result of doSomethingis "+y);
		
		int x=MyClass.doStatic(3, 4);
		
		System.out.println("the result of doStatic is "+x);
	}

}
