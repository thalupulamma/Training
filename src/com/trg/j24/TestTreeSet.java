package com.trg.j24;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args){
		
		TreeSet<String> treeSet=new TreeSet<String>();
		
		
		treeSet.add("nagaraj");
		treeSet.add("chandu");
		treeSet.add("sindhura");
		treeSet.add("anurag");
		treeSet.add("karthik");
		treeSet.add("chandu");
		treeSet.add("nagaraj");
		
		
		Iterator <String> iterator = treeSet.iterator();
		
		while (iterator.hasNext()){
			
			String myString = (String)iterator.next();
			System.out.println("TreeSet Name: " +myString);
		}
		
	}

}
