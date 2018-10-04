package com.trg.j18;

public class VehicleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car car=new Car();

car.licensePlate="AP05 AX 9999";
car.numberOfDoors=4;
car.colour="White";
car.getNumberOfDoors();
car.getLicensePlate();
System.out.println("colour of the car is "+car.colour);
car.speed=120;
System.out.println("speed of the car is "+car.speed);
car.turnLeft();
car.turnRight();

Bicycle bicycle=new Bicycle();
bicycle.colour="blue";
System.out.println("speed of the bicycle is "+bicycle.speed);

bicycle.ringBell();
bicycle.turnLeft();
bicycle.turnRight();

MotorBike motorBike= new MotorBike();
motorBike.colour="BLACK";
System.out.println("speed of the motorbike is "+motorBike.speed);

motorBike.kickStart();
motorBike.turnLeft();
motorBike.turnRight();
System.out.println("colour of the bicycle is "+bicycle.colour);



	}

}
