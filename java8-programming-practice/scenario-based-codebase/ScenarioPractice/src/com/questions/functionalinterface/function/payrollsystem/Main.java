package com.questions.functionalinterface.function.payrollsystem;

import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		
		// In payroll system, calculate annual salary from monthly salary.
		Function<Integer, Integer> annualSalaryCalculator = salary -> salary * 12;
		
		System.out.println("Monthly salary is: 40000, annual salary is: " + annualSalaryCalculator.apply(45000));
		System.out.println("Monthly salary is: 70000, annual salary is: " + annualSalaryCalculator.apply(70000));
	}
}