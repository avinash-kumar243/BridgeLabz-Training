package com.practice.crud_operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
	public void deleteStudent(int id) {
		String sql = "DELETE FROM student WHERE id = ?";
		
		try(Connection con = DBConnection.getInstance().getConnection();
			PreparedStatement ps = con.prepareStatement(sql)) {
			
			ps.setInt(1, id);
			
			int row = ps.executeUpdate();
			
			if(row > 0) System.out.println("row deleted successfully!");
			else System.out.println("Student not found!!!");
			
		} catch(SQLException e) {
			System.out.println("SQLException occurs!!! " + e.getMessage());
		}
	}
}