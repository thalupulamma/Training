package com.trg.j23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.trg.j19.Car;

public class TestLinkedHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Set<Car>mySet = new LinkedHashSet<Car>();
		
		Car myHondaCar = new Car();
		myHondaCar.setNumberOfDoors(4);
		
		mySet.add(myHondaCar);
		
		Car myHyundaiCar = new Car();
		myHyundaiCar.setNumberOfDoors(4);
		
		mySet.add(myHyundaiCar);
		
		Car myJaguarCar = new Car();
		myJaguarCar.setNumberOfDoors(2);
		
		mySet.add(myJaguarCar);
		
		Iterator iterator= mySet.iterator();
		 
		 while(iterator.hasNext()){
			 
			 Car mycar= (Car)iterator.next();
			 System.out.println("Car Details thru Iterator: "+mycar.getNumberOfDoors());
		 }
		 
		

	}

}
