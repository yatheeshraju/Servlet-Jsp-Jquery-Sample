package com.testPackage;

import java.sql.*;

public class Validate
{
    public static boolean checkUser(String name,String pass) 
    {
     boolean st =false;
     try{

	

	 //creating connection with the database 
        Connection con= SqlConnectionClass.getConnection();
        PreparedStatement ps =con.prepareStatement
                            ("select * from user_table where name=? and password=?");
        ps.setString(1, name);
        ps.setString(2, pass);
        ResultSet rs =ps.executeQuery();
        st = rs.next();
       
     }catch(Exception e)
     {
         e.printStackTrace();
     }
        return st;                 
 }   
}