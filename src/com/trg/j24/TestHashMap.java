package com.trg.j24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.trg.j18.Bicycle;
import com.trg.j18.MotorBike;
import com.trg.j18.Car;

public class TestHashMap {
	
public static void main(String[] args){
		
		HashMap <String, Object> hashMap=new HashMap<String, Object>();
		
	
		Fruit pineapple=new Fruit("Pineapple","Pineapple description",70);
		Car car = new Car();
		MotorBike bike = new MotorBike();
		Bicycle bicycle= new Bicycle();
		
		hashMap.put("Fruit",pineapple);
		hashMap.put("Car",car);
		hashMap.put("Nagraj",bike);
		hashMap.put("Bicycle",bicycle);
		
		MotorBike mybike=(MotorBike)hashMap.get("Nagraj");
		
		mybike.kickStart();
		
	  	Set mySet= hashMap.entrySet();                                                                                                                                                                    
		
		
          Iterator mapIterator = mySet.iterator();
		
		    while (mapIterator.hasNext()){
			
			Map.Entry mapEntry = (Map.Entry)mapIterator.next();
			
			
			System.out.println("Key: " +mapEntry.getKey());
			System.out.println("Value: " +mapEntry.getValue());
		    }
			
			Iterator mapIterator2 =hashMap.keySet().iterator();
		    
			while (mapIterator2.hasNext()){
				
				String hashMapKey = (String)mapIterator2.next();
				Object obj=(Object)hashMap.get(hashMapKey);
				
				
				System.out.println("Key: " +hashMapKey);
				System.out.println("Value: " +obj);
			}
			
			
		
		
	}

}
