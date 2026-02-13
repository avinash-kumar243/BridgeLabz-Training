package com.practice.singleton_pattern_connection;

import java.sql.Connection;

public class Main {
	public static void main(String[] args) {
		
		try {
			// Get singleton instance
            DatabaseConnectionSingleton dbInstance = DatabaseConnectionSingleton.getInstance();

            // Get connection
            Connection connection = dbInstance.getConnection();

            if(connection != null && !connection.isClosed()) {
                System.out.println("Connection established successfully!");
            }

            // Optional: Close connection
            connection.close();
            System.out.println("Connection closed");
            
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}