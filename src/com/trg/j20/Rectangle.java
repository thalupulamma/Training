package com.trg.j20;

public class Rectangle extends Shape {
	double width;
	double length;

	public Rectangle() {
		this.length=1.0;
		this.width=1.0;
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}

	public Rectangle(String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	
     public double getArea(){
    	 
    	 return(length*width);
     }
     
     
     public double getPerimeter(){
    	 return(2*(length+width));
     }
     
     public String toString(){
    	 String yyy=super.toString("red",true);
    	 String string=("A shape with width ="+width+ "and length=" + length +",which is subclass of "+yyy);
         return string;
     }
}
     
     
     
     
    
     
     
     

