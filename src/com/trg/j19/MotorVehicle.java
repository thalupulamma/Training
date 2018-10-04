package com.trg.j19;

public class MotorVehicle extends Vehicle {

	public MotorVehicle() {
		// TODO Auto-generated constructor stub
	}

	public MotorVehicle(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}

	public MotorVehicle(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	public MotorVehicle(String colour, int speed) {
		super(colour, speed);
		// TODO Auto-generated constructor stub
	}
         int sizeOfEngine;
         String licensePlate;
         
       void getSizeOfEngine()
       {
    	   System.out.println("the size of the engine is the size of the engine");
       }
       
       void getLicensePlate(String licensePlate)
       {
    	   System.out.println("the license plate number is the lisence plate"+licensePlate);
    	   
       }
}
