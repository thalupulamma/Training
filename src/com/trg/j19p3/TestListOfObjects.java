package com.trg.j19p3;

public class TestListOfObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ListOfObjects newList= new ListOfObjects();
        newList.setItems(5000);
        newList.checking();
        int r=newList.remaining();
        System.out.println("the remainig items are :"+ r);
	}

}
