package com.practice.crud_operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	public void updateAge(int id, int newAge) {
		String sql = "UPDATE student SET age = ? WHERE id = ?";
		
		try(Connection con = DBConnection.getInstance().getConnection();
			PreparedStatement ps = con.prepareStatement(sql)) {
				
			ps.setInt(1, newAge);
			ps.setInt(2, id);
			
			int row = ps.executeUpdate();
			
			System.out.println("\nUpdating studnet details :-");
			
			if(row > 0) System.out.println("Student age updated!!!");
			else System.out.println("Student age does not updated!!!");
			
		} catch(SQLException e) {
			System.out.println("SQLException occurs! " + e.getMessage());
		}
	}
}