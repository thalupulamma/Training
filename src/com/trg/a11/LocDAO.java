package com.trg.a11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LocDAO {

	Loc retrieveList(Loc loc, Connection con){
		
		Statement statement = null;
		ResultSet resultSet = null;
		
		Loc localLoc;
		List<Loc> locList = new ArrayList<Loc>();
		
		try{
			String query = "SELECT L.LOC_ID,L.LOC_NAME FROM LOC L";
			
			statement = con.createStatement();
			
			resultSet=statement.executeQuery(query);
			
			while(resultSet.next()){
				
				localLoc = new Loc();
				localLoc.setLocId(resultSet.getInt("LOC_ID"));
				localLoc.setLocName(resultSet.getString("LOC_NAME"));
				
				locList.add(localLoc);
				
				
			}
			loc.setLocList(locList);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			finally{
				try{
					if(resultSet != null){
						resultSet.close();
					}
				}catch(Exception e){}
				try{
					if(statement != null){
						statement.close();
					}
				}catch(Exception e){}
				
			}
			return loc;
	}
}
