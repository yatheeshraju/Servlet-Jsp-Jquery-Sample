package com.testPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnectionClass {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//loading drivers for mysql
	    Class.forName("com.mysql.jdbc.Driver");

	 //creating connection with the database 
	    Connection con=DriverManager.getConnection
	                   ("jdbc:mysql://localhost:3306/appdata","root","pass");
	    return con;
	}
	
}
