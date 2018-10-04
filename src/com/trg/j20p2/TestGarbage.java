package com.trg.j20p2;
import java.util.Vector;
public class TestGarbage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int size=200;
           StringBuffer s;
           for(int i=0;i<size;i++)
           {
        	   Vector v = new Vector();
           }
           System.out.println("Garbage collection started explicitly.");
           long time= System.currentTimeMillis();
           System.gc();
           System.out.println("it took "+(System.currentTimeMillis()-time)+ " MS");
	}

}
