package com.trg.j30;

public class MyThread extends Thread{
	
	private String name,msg;
	
	public MyThread(String name,String msg)
	{
		this.name=name;
		this.msg=msg;
	}

	public void run(){
		System.out.println(name+ "starts its execution");
		
		for(int i=0;i<=5;i++){
			System.out.println(name + "says:"+msg+"for"+i+" time/s");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ie)
			{
				
			}
		}
		System.out.println(name+" fineshed execution");
	}
}
