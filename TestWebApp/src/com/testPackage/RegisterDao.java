package com.testPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDao {

	  public static boolean RegisterUser(String name,String pass) 
	    {
	     boolean st =false;
	     try{

	    	 //creating connection with the database 
	            Connection con= SqlConnectionClass.getConnection();
	            PreparedStatement ps =con.prepareStatement
	            		("insert into user_table (name,password) values(?,?)");
	                                
	        ps.setString(1, name);
	        ps.setString(2, pass);
	        int t =ps.executeUpdate();
	       
	       if(t>-1){
	    	   st=true;
	       }
	       
	     }catch(Exception e)
	     {
	         e.printStackTrace();
	     }
	        return st;                 
	 }
}
