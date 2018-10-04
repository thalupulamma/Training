package com.trg.j21;
	
	public class EnumTest {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingSystems os;
		
		os=OperatingSystems.ubuntu;
	switch(os){
		case windows:
			System.out.println("You chose windows!");
			break;
			
		case unix:
		   System.out.println("You chose unix!");
		   break;
		   
		case linux:
		   System.out.println("You chose linux!");
		   break;
		   
		case machintosh:
		   System.out.println("You chose macintosh!");
		   break;
		
		   default:
		
		   System.out.println("I don't know your os");
		   break;
		   
		}

	}

}
