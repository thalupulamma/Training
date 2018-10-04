package com.trg.j21;

public class MarkAssertDemo {
	static float maximummarks=100;
	static float changes(float mark)
	{
		maximummarks=maximummarks-mark;
		System.out.println("The maximummark is:"+maximummarks);
		return maximummarks;
		
	}
	
	public static void main(String args[])
	{
		float g;
		for(int i=0;i<5;i++)
		{
			g=changes(15);
			assert maximummarks>=40.00:"marks is below 40.";
		}
	}

}
