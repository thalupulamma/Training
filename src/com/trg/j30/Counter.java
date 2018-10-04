package com.trg.j30;

public class Counter implements Runnable {
	
	int count=0;
	Thread t;
	private volatile boolean running = true;
	public Counter(int p_level)
	{
         t = new Thread(this);
		t.setPriority(p_level);
	}
	public void run()
	{
		while (running)
		{
			count++;
		}
	}
    public void stop()
    {
    	running=false;
    }
    public void start()
    {
    	t.start();
    }
}
