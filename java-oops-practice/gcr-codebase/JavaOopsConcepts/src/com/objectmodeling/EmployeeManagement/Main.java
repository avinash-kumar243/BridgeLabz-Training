package com.objectmodeling.EmployeeManagement;

public class Main {
	public static void main(String[] args) {
		Company tcs = new Company("TCS");
		
		Department hr = tcs.addDepartment("HR");
		hr.addEmployee("Aman", "100", 10000);
		hr.addEmployee("Ruchika", "101", 20000);
		
		Department it = tcs.addDepartment("IT");
		it.addEmployee("Deepika", "200", 50000);
		it.addEmployee("Karan", "201", 60000);

		tcs.showStructure();
		
		tcs.closeCompany();
		
		tcs.showStructure();
	}
}