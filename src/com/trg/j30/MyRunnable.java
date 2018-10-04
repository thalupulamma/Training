package com.trg.j30;

public class MyRunnable implements Runnable{
	
	private String name,msg;
	
	public MyRunnable(String name, String msg){
		this.name=name;
		this.msg=msg;
	}
	
	public void run(){
		
		System.out.println(name+ " Starts its execution");
		for(int i=1;i<=5;i++){
			System.out.println(name+" says "+msg+" for "+i+ " time/s");
			try{
				Thread.sleep(2000);
				}catch(InterruptedException ie)
				{
					
				}
		}
		System.out.println(name+ " finished execution" );
		
	}

}
