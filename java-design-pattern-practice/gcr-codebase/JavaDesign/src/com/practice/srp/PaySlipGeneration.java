package com.practice.srp;

//A single responsibility to generate employee bill
public class PaySlipGeneration {
	private SalaryCalculation sc;
	
	public PaySlipGeneration(SalaryCalculation sc) {
		this.sc = sc;
	}
	
	// generate employee bill
	public void paymentSlipGenerator(Employee employee) {
		double salary = sc.calculateSalary(employee);	
		System.out.println(employee.getEmployeeType() + " employee total bill: " + salary);
	}
}