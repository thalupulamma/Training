package com.trg.j24;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.trg.j18.Bicycle;
import com.trg.j18.Car;
import com.trg.j18.MotorBike;


public class TestHashTable {

	public static void main(String[] args){

	Hashtable <Integer, String> hashTable=new Hashtable<Integer, String>();
	

	
	hashTable.put(111,"Fruit");
	hashTable.put(98,"Car");
	hashTable.put(113,"nagraj");
	hashTable.put(114,"Bicycle");

	
	Set mySet= hashTable.entrySet();
	
	
      Iterator mapIterator = mySet.iterator();
	
	    while (mapIterator.hasNext()){
		
		Map.Entry mapEntry = (Map.Entry)mapIterator.next();
		
		
		System.out.println("Key: " +mapEntry.getKey()+"Value: "+mapEntry.getValue());

	    }
	    
    Hashtable<String, Object> hashTable2=new Hashtable<String, Object>();

	Fruit pineapple=new Fruit("Pineapple","Pineapple description",70);
	Car car = new Car();
	MotorBike bike = new MotorBike();
	Bicycle bicycle= new Bicycle();
	
    
    hashTable2.put("Fruit",pineapple);
    hashTable2.put("apache",new MotorBike());
    hashTable2.put("MotorBike",bike);
    hashTable2.put("Bicycle",bicycle);
    
   Hashtable<String, Object> hashTable3=new Hashtable<String, Object>();
    
    hashTable3.put("String Objects",hashTable);
    hashTable3.put("DifferentObjects",hashTable2);
    
    
    Hashtable newHashtable=(Hashtable)hashTable3.get("DifferentObjects");
    MotorBike motorBike = (MotorBike)newHashtable.get("MotorBike");
    motorBike.kickStart();
    
		
		
		
	}
	
}

