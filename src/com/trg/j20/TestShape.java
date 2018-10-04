package com.trg.j20;

public class TestShape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Shape shape=new Shape("yellow",true);
       
       System.out.println("the shape of the object is:"+shape.color);
       System.out.println("the boolean value of the filled with the colour is: "+shape.filled);
       
       String i= shape.toString("red",false);
       System.out.println(i);
       
	}

}
