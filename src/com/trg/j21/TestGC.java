package com.trg.j21;

public class TestGC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Available Free Memory: "+rt.freeMemory());
		
		for(int i=0;i<10000;i++){
			GC1 x= new GC1(i);
		}
		System.out.println("Free Memory before call to gc():"+rt.freeMemory());
		System.runFinalization();
		System.gc();
		System.out.println("Free Memory after call to gc();"+rt.freeMemory());
		
	}

}
