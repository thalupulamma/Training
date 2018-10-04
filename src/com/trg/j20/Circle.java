package com.trg.j20;

public class Circle extends Shape {
	double radius;

	public Circle() {
		this.radius=1.0;
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double radius){
		this.radius=radius;
	}
	

	public Circle(String color, boolean filled,double radius) {
		super(color, filled);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
    
	public double getArea()
	{
		
		double area= 3.14*radius*radius;
		return area;
	       
		}
	
	public double getPerimeter()
	{
		double perimeter= 2*3.14*radius;
		return perimeter;
	}
	
	public String toString()
	{
		String yyy=super.toString("red",true);
		return("A circle with radius= "+radius+" which is a subclass of "+yyy);
	}
}
