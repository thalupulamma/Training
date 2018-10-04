package com.trg.j19;

public class VehicleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
    Car myCar=new Car("Blue",240);
    
    System.out.println("colour of my car is:"+myCar.colour);
    System.out.println("speed of my car is:" +myCar.speed);
    
    Car myHundai= new Car("BLACK");
    System.out.println("colour of my car is :"+myHundai.colour);
    
    Car myHonda=new Car(250);
    System.out.println("speed of my car is:" +myHonda.speed);
    
    Car car=new Car();
    car.licensePlate="AP05 AX 9999";
    car.numberOfDoors=4;
    car.colour="White";
    
    car.getNumberOfDoors(4);
    car.getLicensePlate("AP05 AX 9999");
    
    
}
}