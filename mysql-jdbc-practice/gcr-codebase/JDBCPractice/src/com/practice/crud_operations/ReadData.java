package com.practice.crud_operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadData {
	public void readAllStudents() {
		String sql = "SELECT * FROM student";
		
		try(Connection con = DBConnection.getInstance().getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			
			ResultSet rs = ps.executeQuery();
			
			System.out.println("\nReading alll studnet details :-");
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				System.out.println("ID: " + id + " || name: " + name + " || age: " + age); 
			}
			
		} catch(SQLException e) {
			System.out.println("Read all students data operation failed");
		}
	}
}