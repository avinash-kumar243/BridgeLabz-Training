package com.questions.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeDataList employeeList = new EmployeeDataList();
		
		employeeList.add(new Employee(101, "Avi", 24, "Male", "EC", "Sales", 2012, 30000));
		employeeList.add(new Employee(102, "Mannu", 28, "Male", "CSE", "Product",2018, 40000));
		employeeList.add(new Employee(103, "Deepika", 25, "Female", "IT", "Sales", 2025, 35000));
		employeeList.add(new Employee(104, "Komal", 23, "Female", "CSE", "Sales", 2014, 20000));
		employeeList.add(new Employee(105, "Shekhar", 27, "Male", "EC", "Account Management", 2023, 50000));
		employeeList.add(new Employee(106, "Vikki", 26, "Male", "CE", "Dev", 2015, 60000));
		employeeList.add(new Employee(107, "Shivani", 24, "Female", "CSE", "Product", 2018, 80000));
		employeeList.add(new Employee(108, "Yash", 22, "Male", "IT", "Dev", 2013, 52000));

		
		
		// Actual work :- 
		
		// Problem 1 :-  How many male and female employees are there in the organization?
		System.out.println("1. Count of all male and female employees are: "); 
		System.out.println(employeeList.employees.stream()
				.collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting())));
		
		
		
		// Problem 2 :- Print the name of all departments in the organization?
		System.out.println("\n2. All departments name in the organization are: "); 
		employeeList.employees.stream()
							  .map(Employee -> Employee.getDepartment())
							  .distinct().toList()
							  .forEach(System.out::println);
		
		

		// Problem 3 :- What is the average age of male and female employees ?
		System.out.println("\n3. Average age of male and female are: "); 
		System.out.println(employeeList.employees.stream()
												  .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))));
		
		
		// Problem 4 :- Get the details of highest paid employee in the organization?
		System.out.println("\n4. Highest paid employee details are: "); 
		Optional<Employee> h = employeeList.employees.stream()
													 .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(h);
		
		
		
		// Problem 5 :- Get the names of all employees who have joined after 2015?
		System.out.println("\n5. All employees who have joined after 2015 are: "); 
		employeeList.employees.stream()
							  .filter(Employee -> Employee.getJoiningYear() >= 2015)
							  .forEach(System.out::println);
		
		
		// Problem 6 :- Count the number of employees in each department?
		System.out.println("\n6. Total count of employees in each department: "); 
		System.out.println(employeeList.employees.stream()
												 .collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.counting())));
		
		
		
		// Problem 7 :- What is the average salary of each department ?
		System.out.println("\n7. Average salary of each department: ");
		System.out.println(employeeList.employees.stream()
												 .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Emp -> Emp.getSalary()))));
		
		
		
		// Problem 8 :- Get the details of youngest male employee in the 'IT' Department?
		System.out.println("\n8. Youngest male employee in IT department is: "); 
		Employee youngestEmp = employeeList.employees.stream()
													 .filter(emp -> emp.getGender().equals("Male"))
													 .max(Comparator.comparing(Employee::getJoiningYear))
													 .get();
		System.out.println(youngestEmp);
		
		
		
		// Problem 9 :- Who has the most working experience in the organization?
		System.out.println("\n8. Most experience employee is: "); 
		System.out.println(employeeList.employees.stream()
												 .min(Comparator.comparing(Employee :: getJoiningYear))
												 .get());
		
		
		// Problem 10 :- How many male and female employees are there in the Sales team?
		System.out.println("\n10. Number of male and female employees in the Sales team are: ");
		System.out.println(employeeList.employees.stream()
												 .filter(Employee -> Employee.getTeam().equals("Sales")) 
												 .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
												 );
		
		
		// Problem 11 :- What is the average salary of male and female employees?
		System.out.println("\n11. Average salary of male and female employees is: ");
		System.out.println(employeeList.employees.stream()
												 .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getSalary)))); 	
		
		
		
		// Problem 12 :- List down the names of all employees in each department ?
		System.out.println("\n12. All employees name in each department are: ");
		Map<String, List<String>> result = employeeList.employees.stream()
							  									 .collect(Collectors.groupingBy(Employee::getDepartment, 
							  									  Collectors.mapping(Employee::getName, Collectors.toList()))); 
		result.forEach((dept, name) -> System.out.println(dept + " : " + name));
		
		
		
		// Problem 13 :- What is the average salary and total salary of the whole organization?
		System.out.println("\n13. Average salary and total salary of the whole organization is: "); 
		double averageSalary = employeeList.employees.stream() 
							  						 .collect(Collectors.averagingInt(Employee::getSalary));
		double totalSalary = employeeList.employees.stream()
												   .collect(Collectors.summingInt(Employee::getSalary));
		System.out.printf("Average salary: %.2f, total Salary: %.2f\n", averageSalary, totalSalary);
		
		
		
		// Problem 14 :- Get the employee whose salary are more than 25k
		System.out.println("\n14. All employees whose salary are more than 25000 :- ");
		employeeList.employees.stream()
							  .filter(Employee -> Employee.getSalary() >= 25000)
							  .forEach(System.out::println);
		
		
		
		// Problem 15 :- Who is the highest paid employee in the organization?
		System.out.println("\n15. Highest paid employee is: ");
		System.out.println(employeeList.employees.stream()
							  .max(Comparator.comparing(Employee::getSalary)).get());
		
		
		
		// Problem 16 :- Who is the second highest paid employee in the organization?
		System.out.println("\n16. Second highest paid employee is: ");
		System.out.println(employeeList.employees.stream()
												 .sorted(Comparator.comparing(Employee::getSalary).reversed())
												 .skip(1)
												 .findFirst()
												 .get());
		
		
		// Problem 17 :- Who is the third highest paid employee in the organization?
		System.out.println("\n17. Third highest paid employee is: ");
		System.out.println(employeeList.employees.stream()
												 .sorted(Comparator.comparing(Employee::getSalary).reversed())
												 .skip(2)
												 .findFirst()
												 .get());
		
		
		// Problem 18 :- Who is the lowest paid employee in the organization?
		System.out.println("\n18. Lowest paid employee is: ");
		System.out.println(employeeList.employees.stream()
												 .sorted(Comparator.comparing(Employee::getSalary))
												 .findFirst()
												 .get());
		
		
		// Problem 19 :- Who is the second lowest paid employee in the organization?
		System.out.println("\n19. Second lowest paid employee is: ");
		System.out.println(employeeList.employees.stream()
												 .sorted(Comparator.comparing(Employee::getSalary))
												 .skip(1)
												 .findFirst()
												 .get());
		
		
		// Problem 20 :- Get the first five lowest paid employee in the organization?
		System.out.println("\n20. First five lowest paid employee in the organization are: ");
		employeeList.employees.stream()
							  .sorted(Comparator.comparing(Employee::getSalary))
							  .limit(5)
							  .forEach(System.out::println);
		
		
		// Problem 21 :- Get the first five highest paid employee in the organization?
		System.out.println("\n21. First five highest paid employee in the organization are: ");
		employeeList.employees.stream()
							  .sorted(Comparator.comparing(Employee::getSalary).reversed())
							  .limit(5)
							  .forEach(System.out::println);
	} 
}