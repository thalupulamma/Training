package com.trg.a2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;


public class ListOfOrders {

	List<Order>myOrder=new ArrayList<Order>();
	
	public void readingList(String order, String product, String customer){
		
		BufferedReader br=null ;
		BufferedReader br1 =null;
	    BufferedReader br2=null;
		try{
    		String sCurrentLine,s1CurrentLine,s2CurrentLine;
    		br=new BufferedReader(new FileReader(order));
    		br1=new BufferedReader(new FileReader(product));
    		br2=new BufferedReader(new FileReader(customer));
    		
    		while((sCurrentLine=br2.readLine())!=null&&(s1CurrentLine=br1.readLine())!=null&&(s2CurrentLine=br.readLine())!=null){
    			
    		
    		 Order order1 = new Order();
    		 Product product1 = new Product();
    		 Customer customer1 = new Customer();
    		 
    		 
    		// while(((sCurrentLine=br.readLine())!=null))
    		 //{
    		 StringTokenizer s = new StringTokenizer(sCurrentLine,",");
    		 //if(s.hasMoreTokens())
    		// {
    		     customer1.setCustomerID(s.nextToken());
    			 customer1.setCustomerName(s.nextToken());
    			 customer1.setCustomerAddress(s.nextToken());
    			
    			 
    		// }
    		// }
    		 
    		// while(((s1CurrentLine=br1.readLine())!=null))
    		// {
    		 StringTokenizer s1 = new StringTokenizer(s1CurrentLine,",");
    		// if(s1.hasMoreTokens())
    		// {
    			 product1.setProductID(s1.nextToken());
    			 product1.setProductDescription(s1.nextToken());
    			 product1.setProductFinish(s1.nextToken());
    			 product1.setUnitPrice(s1.nextToken());
    			 
    		// }
    		// }
    		// while(((s2CurrentLine=br2.readLine())!=null))
    		// {
    		 StringTokenizer s2 = new StringTokenizer(s2CurrentLine,",");
    		
    		 
    			 order1.setOrderID(s2.nextToken());
    			 order1.setOrderDate(s2.nextToken());
    			 order1.setQuantity(s2.nextToken());
    			 
    			 
    		 
    		// }
    		 order1.setProduct(product1);
    		 order1.setCustomer(customer1);
    		
    		myOrder.add(order1);
    		}
		}catch(IOException e) {
			e.printStackTrace();
		} 
	}
	public void printList()
	{
	 Iterator<Order> iterator = myOrder.iterator();
	 while(iterator.hasNext()){
		Order order = (Order)iterator.next();
		System.out.println(order.getOrderDate()+"	"+order.getOrderID()+"	"+order.getQuantity()+"	"+
				           order.getCustomer().getCustomerID()+"	"+"  "+order.getCustomer().getCustomerName()+" " +order.getCustomer().getCustomerAddress()+"	"+
				           order.getProduct().getProductID()+"  "+order.getProduct().getProductDescription()+"	"+
				           order.getProduct().getProductFinish()+"   "+order.getProduct().getUnitPrice());
		
	 }
}
}

	
	
	
