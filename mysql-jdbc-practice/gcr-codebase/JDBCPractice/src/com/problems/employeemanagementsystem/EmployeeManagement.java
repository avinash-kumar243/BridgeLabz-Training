package com.problems.employeemanagementsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeManagement {
	SingletonConnection connection = SingletonConnection.getInstance();
	
	
	// Add/Insert Employee
	public void addEmployee(Employee employee) {
		String sql = "INSERT INTO employee (id, name, age, salary) VALUES (?, ?, ?, ?);";
		
		try {
			PreparedStatement statement = connection.getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			
			statement.setInt(1, employee.getId());
			statement.setString(2, employee.getName());
			statement.setInt(3, employee.getAge());
			statement.setDouble(4, employee.getSalary());
			
			int row = statement.executeUpdate();
			System.out.println("row " + row + " inserted successfully!");
		} catch(SQLException e) {
			System.out.println("Insertion of employee failed!!! " + e.getMessage());
		}
	}
	
	
	// View all Employee
	public void viewAllEmployees() {
		String query = "SELECT * FROM employee;";
		
		try {
			PreparedStatement ps = connection.getConnection().prepareStatement(query);
			ResultSet result = ps.executeQuery();
			
			System.out.println("\nViewing all employees are :-");
			while(result.next()) {
				Employee eData = new Employee(result.getInt("id"), result.getString("name"), result.getInt("age"), result.getDouble("salary"));
				System.out.println(eData);
			}
			
		} catch(SQLException e) {
			System.out.println("SQLException occurs!!! " + e.getMessage());
		}
	}
	
	
	// Update Employee
	public void updateEmployeeSalary(int id, double salary) throws SQLException {
		String query = "UPDATE employee SET salary = ? WHERE id = ?";
		
		PreparedStatement ps = connection.getConnection().prepareStatement(query);
		ps.setDouble(1, salary);
		ps.setInt(2,  id);
		
		int row = ps.executeUpdate();
		
		System.out.println("\nUpdating employee details are:- ");
		
		if(row > 0) System.out.println("Employee salary updated");
		else System.out.println("Employee not found!!!");
	}
	
	
	// Delete Employee
	public void deleteEmployee(int id) throws SQLException {
		String query = "DELETE FROM employee WHERE id = ?";
		
		PreparedStatement ps = connection.getConnection().prepareStatement(query);
		ps.setInt(1, id);
		
		int row = ps.executeUpdate();
		
		System.out.println("\nDeleting employee :-");
		
		if(row > 0) System.out.println("Employee with id: " + id + " deleted successfully"); 
		else System.out.println("Id not found!!!");
	}
	
	
	// Search Employee
	public void searchEmployee(int id) throws SQLException {
		String query = "SELECT * FROM employee WHERE id = ?;";
		
		PreparedStatement ps = connection.getConnection().prepareStatement(query);
		
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		System.out.println("\nSearching an Employee :-");
		while(rs.next()) {
			Employee emp = new Employee(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getDouble("salary"));
			System.out.println(emp);
		}
	}
	
}