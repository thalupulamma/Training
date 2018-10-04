package com.trg.j21;

public class GC1 {
	String str;
	int id;
	GC1(int i){
		this.str=new String("abcdefghijklmnopqrstuvwxyz");
		this.id=i;
	}
	protected void finalize(){
		System.out.println("GC1 object "+id+" has been finalized. ");
	}

}
