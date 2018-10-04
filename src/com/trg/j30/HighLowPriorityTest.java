package com.trg.j30;

public class HighLowPriorityTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Counter high = new Counter(Thread.NORM_PRIORITY+2);
		Counter low = new Counter(Thread.NORM_PRIORITY-2);
		low.start();
		high.start();
		
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		low.stop();
		high.stop();
		try{
			low.t.join();
			high.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("interrupted Exception Caught");
		}
		System.out.println("Low Priority Thread's Iterations: "+low.count);
		System.out.println("High Priority Thread's Iterations: "+high.count);
	}

}
