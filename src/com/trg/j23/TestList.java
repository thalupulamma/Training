package com.trg.j23;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.trg.j19.Car;


public class TestList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Car> myList = new ArrayList<Car>();
		
		Car myHondaCar = new Car();
		myHondaCar.setNumberOfDoors(4);
		
		myList.add(myHondaCar);
		
		Car myHyundaiCar = new Car();
		myHyundaiCar.setNumberOfDoors(4);
		
		myList.add(myHyundaiCar);
		
		Car myJaguarCar = new Car();
		myJaguarCar.setNumberOfDoors(2);
		
		myList.add(myJaguarCar);
		
		
		for(int i=0; i<myList.size();i++){
			
			Car mycar=myList.get(i);
		     System.out.println("Car details: "+mycar.getNumberOfDoors());   
		
		
	}
	
	 Iterator iterator= myList.iterator();
	 
	 while(iterator.hasNext()){
		 
		 Car mycar= (Car)iterator.next();// type casting of car object (Car)
		 System.out.println("Car Details thru Iterator: "+mycar.getNumberOfDoors());
	 }
	 
	 
	
	
}	

}
