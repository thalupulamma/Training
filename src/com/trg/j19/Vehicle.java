package com.trg.j19;

public class Vehicle {
	int speed;
	String colour;
	public Vehicle(){
	}
	
	public Vehicle(String colour){
		this.colour=colour;
		System.out.println("the present vehicle colour is"+colour);
	}
    public Vehicle(int speed){
    	this.speed=speed;
    	
    }
    public Vehicle(String colour, int speed){
    	this.colour=colour;
    	this.speed=speed;
    }
    void turnLeft()
    {
    	System.out.println("take the left turn");
    }
    void turnRight()
    {
    	System.out.println("take the right turn");
    }

}
