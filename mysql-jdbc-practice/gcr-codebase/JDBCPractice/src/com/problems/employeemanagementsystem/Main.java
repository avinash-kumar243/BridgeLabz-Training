package com.problems.employeemanagementsystem;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		EmployeeManagement management = new EmployeeManagement();
		
		try {
			management.addEmployee(new Employee(101, "Avinash", 23, 10000));
			management.addEmployee(new Employee(104, "Deepak", 24, 20000));
			management.addEmployee(new Employee(106, "Vikash", 21, 30000));
			management.addEmployee(new Employee(105, "Komal", 22, 50000));
			
			management.viewAllEmployees();
			
			management.updateEmployeeSalary(104, 80000);
			management.deleteEmployee(106);
			management.searchEmployee(101);
			
			management.viewAllEmployees();
			
		} catch(SQLException e) {
			System.out.println("SQLException occurs!!!");
		}
	}
}