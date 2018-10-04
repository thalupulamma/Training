package com.trg.j19p3;

public class ListOfObjects {
	        int items;
	       static int numOfObj=1000;
	       int r;
	        
	 public int setItems(int items)
	 {
		 this.items=items;
		 return items;
	 }
	 public void checking()
	 {
		 if (items>numOfObj)
		 {
			 System.out.println(items +" Items are not available");
		 }
		 else
		 {
			 System.out.println(items + " Items are available");
		 }
	 }
	 public int  remaining()
	 {
		r=numOfObj-items;
		System.out.println("the remaining items are :"+ r);
		return r;
	 }
	   
      
}
