package com.trg.j21p2;

public class Circle extends Shape {
	int radius;

	public Circle() {
		this.radius=1;
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int radius){
		this.radius=radius;
	}
	

	public Circle(String color, boolean filled,int radius) {
		super(color, filled);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toString()
	{
		String yyy=super.toString("red",true);
		return("A circle with radius= "+radius+" which is a subclass of "+yyy);
	}
		
    
	public void getArea()
	{
		try{
		double area=( 3.14*radius*radius);
	    System.out.println(" the area of the circle is : "+ area);  
		}
		catch(ArithmeticException ae){
			System.out.println("Arithmetic Exception. divisor cannot be zero. please change and try again.");
			}
		}
	
	public void getPerimeter()
	{
		try{
		double perimeter= 2*3.14*radius;
		System.out.println("the perimeter of the circle is:"+perimeter);
		}
		
		catch(ArithmeticException ae){
			System.out.println("Arithmetic Exception. divisor cannot be zero. please change and try again.");
			}
	
	
	finally {
		System.out.println("circle work is done");
	}
	
}
}
