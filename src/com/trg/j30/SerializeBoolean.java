package com.trg.j30;
import java.io.*;

public class SerializeBoolean {

	/**
	 * @param args
	 */
    SerializeBoolean(){
    	
    	Boolean booleanData = new Boolean("true");
    			
   try{
	   FileOutputStream fos = new FileOutputStream("boolean.ser");
	   ObjectOutputStream oos = new ObjectOutputStream(fos);
	   oos.writeObject(booleanData);
	   oos.close();
   }catch(IOException ie){
	   ie.printStackTrace();
   }
    }

   public static void main(String[] args) {
	   
	   SerializeBoolean sb = new SerializeBoolean();
    	
    }
	

}
