package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCInsert2 {
	
	private static Driver driver;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args, ResultSet resultSet) {
		try {
			openConnection();
			query = "INSERT INTO users VALUES(?, ?, ?, ?, ?)";
			preparedStatement.setInt(1, 5);
			preparedStatement.setString(2, "Gauri");
			preparedStatement.setString(3, "gauri@gmail.com");
			preparedStatement.setLong(4, 7999955227l);
			preparedStatement.setString(5, "Gauri@1234");
			int rows = preparedStatement.executeUpdate();
			System.out.println(rows + " row(s) affected");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
	}
	
	private static void closeConnection() throws SQLException {
		if (preparedStatement != null)
			preparedStatement.close();
		if (connection != null)
			connection.close();
		if (driver != null)
			DriverManager.deregisterDriver(driver);
	}


}
