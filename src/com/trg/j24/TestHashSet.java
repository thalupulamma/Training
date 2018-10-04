package com.trg.j24;

import java.util.HashSet;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class TestHashSet {

	
	public static void main(String[] args){
		
		HashSet<String> hashSet=new HashSet<String>();
		
		
		hashSet.add("Nagaraju");
		hashSet.add("Chandu");
		hashSet.add("Anurag");
		hashSet.add("Sindhura");
		hashSet.add("Karthika");
		hashSet.add("Chandu");
		hashSet.add("Nagaraju");
		
		
		Iterator <String> iterator = hashSet.iterator();
		
		while (iterator.hasNext()){
			
			String myString = (String)iterator.next();
			System.out.println("HashSet Name: " +myString);
		}
		
	}
}
