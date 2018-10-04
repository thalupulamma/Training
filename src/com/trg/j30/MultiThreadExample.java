package com.trg.j30;

public class MultiThreadExample extends Thread{

	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub

		public void run(){
			for(int i=0;i<5;i++){
				System.out.println(i);
				try{
					sleep((int)Math.random()*5000);
					
				}catch(InterruptedException ie){
					
				}
			}
		}
	public static void main(String[] args) {
		
		new MultiThreadExample().start();
		new MultiThreadExample().start();
		System.out.println("Done");
	}

}
