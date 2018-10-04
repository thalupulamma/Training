package com.trg.j19p2;

public class ObjectToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String obj="123";
          int i = Integer.parseInt(obj);
          System.out.println("Numeric string to primitive int="+i);
          
          Integer j=123;
          int intValue=j.intValue();
          int k=intValue;
          System.out.println("integer(object) value to primitive int:"+k);
          
	}

}
