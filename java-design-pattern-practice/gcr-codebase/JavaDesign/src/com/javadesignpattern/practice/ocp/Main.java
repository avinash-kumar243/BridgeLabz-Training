package com.javadesignpattern.practice.ocp;

public class Main {
	public static void main(String[] args) {
		
		Employee e1 = new PartTimeEmployee(10000);
		Employee e2 = new FullTimeEmployee(20000);
		Employee e3 = new ContractedEmployee(10000);
		
		System.out.println("Part Time Employee salary: " + e1.calculateSalary());
		System.out.println("Full Time Employee salary: " + e2.calculateSalary());
		System.out.println("Contracted Employee salary: " + e3.calculateSalary());
	}
}