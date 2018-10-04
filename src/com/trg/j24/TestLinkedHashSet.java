package com.trg.j24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	

	public static void main(String[] args){
		
		HashSet<String> hashSet=new LinkedHashSet<String>();
		
		
		hashSet.add("Nagaraju");
		hashSet.add("chandu");
		hashSet.add("Sindhura");
		hashSet.add("Anurag");
		hashSet.add("karthik");
		hashSet.add("chandu");
		hashSet.add("Nagaraju");
		
		
		Iterator <String> iterator = hashSet.iterator();
		
		while (iterator.hasNext()){
			
			String myString = (String)iterator.next();
			System.out.println("HashSet Name: " +myString);
		}
		
	}

}
