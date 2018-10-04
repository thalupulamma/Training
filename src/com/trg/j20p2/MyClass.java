package com.trg.j20p2;

public class MyClass {
	
	
	public int doSomething()
	{
		int x = 30;
		int y =40;
	    return doSomething(x,y);
	    
		
	}
	
	public int doSomething(int a , int b)
	{
		int asq= doMoreStatics(a);
		int bsq= doMoreStatics(b);
		int tot = asq+bsq;
		return tot;
	}
	public static int doStatic(int a, int b)
	{
		int tot = doMoreStatics( b);
		tot=tot+a;
		return tot;
		
	}
    public static int doMoreStatics(int c)
    {
    	int square = c*c;
    	return square;
    }
    
}
