package com.trg.j20;

public class TestShapes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Circle circle=new Circle(20);
		 double area= circle.getArea();
		 System.out.println("the area of a circle is:"+area);
		 double perimeter= circle.getPerimeter();
		 System.out.println("the perimeter of a circle is:"+perimeter);
		  String s=circle.toString();
		  System.out.println(s);
		 
		 
		 Rectangle rectangle= new Rectangle(20,30);
		 
		 double areaofrec=rectangle.getArea();
		 System.out.println("the area of a rectangle is:"+areaofrec);
		 
		 double perimeterofrec= rectangle.getPerimeter();
		 System.out.println("the perimeter of a rectangle is:"+perimeterofrec);
		 
		 String st= rectangle.toString();
		 System.out.println(st);
		 
		 Square square=new Square();
		 double areaofsq = square.getArea();
         System.out.println("the area of a square is:"+areaofsq);
		 
		 double perimeterofsq = square.getPerimeter();
		 System.out.println("the perimeter of a square is:"+perimeterofsq);
		 
		 String st1= square.toString();
		 System.out.println(st1);
		 
		 
		 //System.out.println("the side of a square is:"+square.getLength());
	}
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	

