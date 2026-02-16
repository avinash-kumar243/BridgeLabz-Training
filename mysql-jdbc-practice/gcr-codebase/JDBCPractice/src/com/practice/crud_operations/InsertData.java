package com.practice.crud_operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	
	public void insertData(int id, String name, int age) {
		String query = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
		
		try(Connection con = DBConnection.getInstance().getConnection();
			PreparedStatement ps = con.prepareStatement(query)) {
			
			ps.setInt(1, id);
			ps.setString(2,  name);
			ps.setInt(3, age);
			
			System.out.println("\n");
			
			int row = ps.executeUpdate();
			System.out.println(row + " row(s) inserted successfully!");
			
		} catch(SQLException e) {
			System.err.println("Insert operation failed! " + e.getMessage());
		}
	}
}