package com.trg.j21;

import java.io.FileNotFoundException;

public class Demo3 {

	/**
	 * @param args
	 */
	static void throwOne() throws FileNotFoundException{
		System.out.println("Inside throwOne.");
		throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		try{
			throwOne();
		}
		catch(FileNotFoundException e){
			System.out.println("Caught"+e);
		}

}
}
