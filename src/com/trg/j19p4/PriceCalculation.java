package com.trg.j19p4;
import  com.trg.j19p3.*;

public class PriceCalculation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	        int costOfObject=10;
		    double totalCost,itemCost;
		    ListOfObjects newList1=new ListOfObjects();
		  int  items= newList1.setItems(2000);
		    newList1.checking();
		    itemCost= items*costOfObject;
		    int r=newList1.remaining();
		    totalCost=r *costOfObject;
		    System.out.println("the total cost of the  required objects="+itemCost);
		    System.out.println("the total cost of the remaining objects="+totalCost);
		    //costOfObject=20;
		    System.out.println("the total cost of the object is="+costOfObject);
		    

	}

}
