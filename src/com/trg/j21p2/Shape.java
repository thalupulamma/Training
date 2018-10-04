package com.trg.j21p2;

public class Shape {
 String color;
 boolean filled;
 Shape()
 {
	 this.color="green";
	 this.filled=true;
 }
 Shape(String color,boolean filled){
	 this.color=color;
	 this.filled=filled;
 }
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public boolean isFilled() {
	return filled;
}
public void setFilled(boolean filled) {
	this.filled = filled;
}

public String toString(String color,boolean filled)
{
	return("A shape with color of "+color+" and it is filled with color is "+filled);
}
}


