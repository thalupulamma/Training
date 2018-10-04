package com.trg.j21p2;

public class TestShapes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle=new Circle(20);
		circle.getArea();
		circle.getPerimeter();
		 String s=circle.toString();
		  System.out.println(s);
		 
		 
		 Rectangle rectangle= new Rectangle(20,30);
		 rectangle.getArea();
		 rectangle.getPerimeter();
		  String st= rectangle.toString();
		   System.out.println(st);
		 
		 Square square=new Square();
		 square.getArea();
         
		 
		 square.getPerimeter();
		 
		 String st1= square.toString();
		 System.out.println(st1);
		 
		 
		 //System.out.println("the side of a square is:"+square.getLength());
	}
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	

