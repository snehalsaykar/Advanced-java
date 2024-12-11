package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
    
		// load the driver
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 // register the driver
		 Driver driver = new com.mysql.cj.jdbc.Driver();
		 DriverManager.registerDriver(driver);
		 
		 // get the connection
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		 
		 // create the statement
		 Statement statement = connection.createStatement();
		 
		 // execute the statement
		 statement.execute("CREATE DATABASE demo8");
		 
		 // process the result
		 System.out.println("Database created");
		 
		 // close the connection
		 statement.close();
		 connection.close();
		 
		 // de-register the driver
		 DriverManager.deregisterDriver(driver);
}
}
