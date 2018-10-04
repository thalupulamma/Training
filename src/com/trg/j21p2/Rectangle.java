package com.trg.j21p2;

public class Rectangle extends Shape {
	int width;
	int length;

	public Rectangle() {
		this.length=1;
		this.width=1;
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int length, int width){
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

	public void setWidth(int width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString(){
   	 String yyy=super.toString("red",true);
   	 String string=("A shape with width ="+width+ "and length=" + length +",which is subclass of "+yyy);
        return string;
        
	}
     public void getArea(){
    	 try{
    	 System.out.println("the area of a rectangle is :"+(length*width)/0);
     }
    	 catch(ArithmeticException ae){
 			System.out.println("Arithmetic Exception. divisor cannot be zero. please change and try again.");
 			}
     
     }
     public void getPerimeter(){
    	 
    	 try{
    		 
    	  System.out.println("the perimeter of a rectangle is: "+(2*(length+width))/0);
            }
    	 
    	 catch(ArithmeticException ae){
  			System.out.println("Arithmetic Exception. divisor cannot be zero. please change and try again.");
  			}
     finally{
    	 System.out.println("the rectangle work is done");
     }
     
     }
     }

     
     
     
     
    
     
     
     

