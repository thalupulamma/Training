package com.trg.j24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList = new ArrayList<String>();
		
		myList.add("NagaRaj");
		myList.add("Chandu");
		myList.add("Sindhu");
		myList.add("Anurag");
		myList.add("maniKumar");
		myList.add("Chandu");
		
		
		for(int i=0;i<myList.size();i++){
			
			String myString = myList.get(i);
			System.out.println("Name: "+myString);
		}
		
		System.out.println("");
		
		
		
		Iterator<String> iterator = myList.iterator();
		
		while(iterator.hasNext()){
			
			String myString=(String)iterator.next();
			System.out.println("Name thru iterator: "+myString);
		}
		
		System.out.println("");
		
		
		Collections.sort(myList);
		
		Iterator iterator2= myList.iterator();
		
		while(iterator2.hasNext()){
			
			String myString=(String)iterator2.next();
			System.out.println("Name thru Iterator: "+myString);
		}
		
	
		

	}

}
