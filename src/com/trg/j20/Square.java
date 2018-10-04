package com.trg.j20;

public class Square extends Rectangle {
 double length;
 double width;
	public Square()
	{
		super.setLength(14);
	     super.setWidth(14);
		// TODO Auto-generated constructor stub
	}

	public Square(String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	
	}
	public String toString(double length){
   	 String yyy=super.toString("red",true);
   	 return("A square with side =" + length +",which is subclass of "+yyy);
    }
}
