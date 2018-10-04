package com.trg.j24;

import java.util.Iterator;
import java.util.Vector;

import com.trg.j19.Car;

public class TestVector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Car> vector = new Vector<Car>();
		
		Car myHondaCar = new Car();
		myHondaCar.setNumberOfDoors(4);
		vector.add(myHondaCar);
		
		Car myHyundaiCar = new Car();
		myHyundaiCar.setNumberOfDoors(2);
		vector.add(myHyundaiCar);
		
		Car myJaguarCar = new Car();
		myJaguarCar.setNumberOfDoors(6);
		vector.add(myJaguarCar);
		
		
		for(int i=0;i<vector.size();i++){
			
			Car mycar = vector.get(i);
			System.out.println("Car Details:" +mycar.getNumberOfDoors());
		}
		
		Iterator<Car> iterator =vector.iterator();
		
		while(iterator.hasNext()){
			
			Car mycar = (Car)iterator.next();
			System.out.println("Car Details thru iterator:" +mycar.getNumberOfDoors());
			
		}
		
		
		
	}

}
