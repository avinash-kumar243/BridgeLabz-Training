package com.practice.srp;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Avi", 101, 10000, "PartTime");
		Employee employee2 = new Employee("Allu", 102, 20000, "FullTime");
		Employee employee3 = new Employee("Aman", 103, 30000, "Contract");
		
		SalaryCalculation sc = new SalaryCalculation();
		PaySlipGeneration psg = new PaySlipGeneration(sc);

		System.out.println("-------------------- Salary calculation ---------------------");
		System.out.println(employee1.getEmployeeType() + " employee1 salary is: " + sc.calculateSalary(employee1));
		System.out.println(employee2.getEmployeeType() + " employee2 salary is: " + sc.calculateSalary(employee2));
		System.out.println(employee3.getEmployeeType() + " employee3 salary is: " + sc.calculateSalary(employee3) + "\n");
		System.out.println("-------------------------------------------------------------");

		System.out.println("\n-------------------- Bill generation ---------------------");
		psg.paymentSlipGenerator(employee1);
		psg.paymentSlipGenerator(employee2);
		psg.paymentSlipGenerator(employee3);
		System.out.println("----------------------------------------------------------");
	}
}