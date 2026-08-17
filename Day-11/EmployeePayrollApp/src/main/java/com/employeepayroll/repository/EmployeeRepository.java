package com.employeepayroll.repository;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employeepayroll.model.Employee;
 
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	// Finding employees whose salary is greater than a given amount.
	  
	@Query("SELECT e FROM Employee e WHERE e.salary > :minSalary")
	List<Employee> findEmployeesWithSalaryGreaterThan(@Param("minSalary") BigDecimal minSalary);
	
} 	 