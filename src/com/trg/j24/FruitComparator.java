package com.trg.j24;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{

	public int compare(Fruit obj1, Fruit obj2){
		
		Fruit fruit1=(Fruit)obj1;
		Fruit fruit2=(Fruit)obj2;
		
		return fruit1.getFruitName().compareTo(fruit2.getFruitName());
	}
}
