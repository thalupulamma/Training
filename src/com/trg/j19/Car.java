package com.trg.j19;

public class Car extends MotorVehicle {
	int numberOfDoors;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}

	public Car(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	public Car(String colour, int speed) {
		super(colour, speed);
		// TODO Auto-generated constructor stub
	}
 
 
 public  void swtchOnAirCon()
  {
	  System.out.println("switch on the air condition");
  }
 
 public void setNumberOfDoors(int numberOfDoors)
 {
	  this.numberOfDoors=numberOfDoors;
 }
  
 public int getNumberOfDoors()
  {
	  return numberOfDoors;
  }
}
