package com.employeepayroll.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employeepayroll.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
//	Query by Example code
//	List<Department> findByName(String name); 
	
	@Query("SELECT d FROM Department d WHERE d.name = :name")
	List<Department> findByName(@Param("name") String name); 
} 