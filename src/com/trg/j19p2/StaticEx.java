package com.trg.j19p2;

public class StaticEx {
	
	private static int staticint=0;
	private int normalint=23;
	
	public static void printInt()
	{
		System.out.println("staticint:"+staticint);
	}
	public static void changeStaticInt(int pint){

		  staticint=pint;
		  System.out.println("changed-staticint:" +staticint);
		} 
}
