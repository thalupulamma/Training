package com.trg.j24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestObjectSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Fruit[] fruits=new Fruit[4];
		
		Fruit pineapple = new Fruit("Pineapple","Pineapple description",70);
		Fruit apple = new Fruit("Apple","Apple description",100);
		Fruit orange = new Fruit("orange","orange description",80);
		Fruit banana = new Fruit("Banana","Banana description",90);
		
		List<Fruit> fruitList = new ArrayList<Fruit>();
		
		fruitList.add(pineapple);
		fruitList.add(apple);
		fruitList.add(orange);
		fruitList.add(banana);
		
		Collections.sort(fruitList);
		

		Iterator <Fruit>iterator= fruitList.iterator();
		
		while(iterator.hasNext()){
			
			Fruit fruit=(Fruit)iterator.next();
			System.out.println("Fruit Name thru Iterator: "+fruit.getFruitName());
	        System.out.println("Fruit Name thru Iterator: "+fruit.getQuantity());
			
			
			
		}
		
		
		
	}

}
