package com.trg.a2;

public class TestOder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ListOfOrders listOfOrders = new ListOfOrders();
        listOfOrders.readingList("/home/prime/b/order.txt", "/home/prime/b/product.txt","/home/prime/b/customer.txt");
        listOfOrders.printList();
	}

}
