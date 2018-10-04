package com.trg.a11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
Dept retrieveList(Dept dept, Connection con){
		
		Statement statement = null;
		ResultSet resultSet = null;
		
		Dept localDept;
		List<Dept> deptList = new ArrayList<Dept>();
		
		try{
			String query = "SELECT D.DEPT_ID,D.DEPT_NAME FROM DEPT D";
			
			statement = con.createStatement();
			
			resultSet=statement.executeQuery(query);
			
			while(resultSet.next()){
				
				 localDept = new Dept();
				localDept.setDeptId(resultSet.getInt("DEPT_ID"));
				localDept.setDeptName(resultSet.getString("DEPT_NAME"));
				
				deptList.add(localDept);
				
				
			}
			dept.setDeptList(deptList);
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
			return dept;
	}

Dept retriveListByLocId(Dept dept, Connection con){
	
	PreparedStatement statement = null;
	ResultSet resultSet = null;
	
	Dept localDept;
	List<Dept> deptList = new ArrayList<Dept>();
	
	try{
		
		String query = "SELECT DEPT_ID,DEPT_NAME FROM DEPT WHERE LOC_ID=?";
		
		statement = con.prepareStatement(query);
		statement.setInt(1, dept.getLoc().getLocId());
		
		resultSet = statement.executeQuery();
		
		while(resultSet.next()){
			
			localDept = new Dept();
			localDept.setDeptId(resultSet.getInt("DEPT_ID"));
			localDept.setDeptName(resultSet.getString("DEPT_NAME"));
			
			deptList.add(localDept);
		}
		
		dept.setDeptList(deptList);
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
	return dept;
	
}
}

