package com.objectmodeling.EmployeeManagement;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	private List<Department> departments;
	
	public Company(String name) {
		this.name = name;
		this.departments = new ArrayList<>();
	}

	public Department addDepartment(String departmentName) {
		Department d = new Department(departmentName);
		departments.add(d);
		return d;
	}

	public void closeCompany() {
		System.out.println("\nClosing Company: " + name);
		departments.clear();
		System.out.println("All departments and employee have been removed.");
	}

	public void showStructure() {
		System.out.println("\nCompany: " + name);
		for(Department d : departments) {
			d.showEmployee();
		}
		
	}
	
	
}