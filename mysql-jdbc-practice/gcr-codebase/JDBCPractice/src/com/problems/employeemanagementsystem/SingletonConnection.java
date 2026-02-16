package com.problems.employeemanagementsystem;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class SingletonConnection {
	private static SingletonConnection instance;
	private Connection connection;
	
	private static String URL = "jdbc:mysql://localhost:3306/employeedb";
	private static String user = "root";
	private static String password = "Avinash269";
	
	
	// Private Constructor
	private SingletonConnection() {
		try {
			connection = DriverManager.getConnection(URL, user, password);
			System.out.println("Connection formed!");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	// getInstance() 
	public static SingletonConnection getInstance() {
		if(instance == null) {
			instance = new SingletonConnection();
		}
		return instance; 
	}
	
	// getConnection
	public Connection getConnection() {
		return connection; 
	}
}