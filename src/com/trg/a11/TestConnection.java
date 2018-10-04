package com.trg.a11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;


public class TestConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Connection con = null;
         
          LocDAO locDAO = new LocDAO();
          DeptDAO deptDAO = new DeptDAO();
          
          Loc loc= new Loc();
          Dept dept = new Dept();
          Dept locationDept = new Dept();
          List<Loc> locList = new ArrayList<Loc>();
          List<Dept> deptList = new ArrayList<Dept>();
          
          LocView locView= new LocView();
          List<LocView> locViewList = new ArrayList<LocView>();
          List<Dept> deptList2 = new ArrayList<Dept>();
          
          try{
        	  
        	  con = DBConnection.getConnection();
        	  //get all the locations
        	  loc = locDAO.retrieveList(loc,con);
        	  
        	  // for each location , get all the departments
        	  
        	  //pull the location list from loc object
        	  locList = loc.getLocList();
        	  
        	  Iterator iterator = locList.iterator();
        	  
        	  while(iterator.hasNext()){
        		  
        		  Loc localLocation = (Loc)iterator.next();
        		  dept = new Dept();
        		  
        	      // set the location to dept
        		  dept.setLoc(localLocation);
        		  
        		  //retrieve the department list for this location
        	       dept = deptDAO.retriveListByLocId(dept,con);
        	       
        	       deptList.add(dept);
        	   }
        	  
        	  locationDept.setDeptList(deptList);
        	  
        	       // add the location to list
        	  
        	  Iterator iterator2 = locationDept.getDeptList().iterator();
        	  while(iterator2.hasNext()){
        		  
        		  Dept localDepartment = (Dept)iterator2.next();
        		  
        		  deptList2=localDepartment.getDeptList();
        		  
        		  if(deptList2.size()==0)
        			  System.out.println("Location Name: "+localDepartment.getLoc().getLocName()+" No Department with this location");
        		  
        		  else{
        			  Iterator iterator3 = deptList2.iterator();
        			  
        			  while(iterator3.hasNext()){
        				  
        				  Dept localDepartment2 = (Dept)iterator3.next();
        				  
        				  System.out.println("Location Name: "+localDepartment.getLoc().getLocName()+" Department Name: "+localDepartment2.getDeptName());
        			  }
        		  }
        	  }
        	  
          
          }catch(Exception e){
        	  e.printStackTrace();
        	  
          }
          finally{
        	  
        	   
        	  try{
        		  
        		  if(con !=null){
        			  con.close();
        			  
        		  }
        		  }catch(Exception e){}
        	  
          }
	}

	      static void printLoc(List<Loc> locList){
	    	  
	    	  Iterator<Loc> iterator = locList.iterator();
	    	  
	    	  while (iterator.hasNext()){
	    		  Loc loc =(Loc)iterator.next();
	    		  System.out.println("LOC_ID: "+loc.getLocId());
	    		  System.out.println("LOC_NAME: "+loc.getLocName());
	    	  }
	      }
	      
	      static void printDept(List<Dept> deptList){
	    	  Iterator<Dept> iterator = deptList.iterator();
	    	  
	    	  while(iterator.hasNext()){
	    		  Dept dept=(Dept)iterator.next();
	    		  System.out.println("DEPT_ID: "+dept.getDeptId());
	    		  System.out.println("DEPT_NAME: "+dept.getDeptName());
	    		  System.out.println("LOC_ID: "+dept.getLoc().getLocId());
	    		  System.out.println("LOC_NAME: "+dept.getLoc().getLocName());
	    	  }
	    	  
	      }
}
