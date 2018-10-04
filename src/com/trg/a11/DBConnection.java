package com.trg.a11;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	
	static Connection getConnection(){
		
		Connection con = null;
		
		try{
			
			//create the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// get the connection for the given url/userid/password
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","trms","trms");
		}catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
}
