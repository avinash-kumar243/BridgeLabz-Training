package com.employeepayroll.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;

import com.employeepayroll.dto.EmployeeRequestDto;
import com.employeepayroll.dto.EmployeeResponseDto;
import com.employeepayroll.dto.EmployeeSearchDto;

public interface IEmployeeService {
	
	EmployeeResponseDto createEmployee(EmployeeRequestDto requestDto);
	EmployeeResponseDto getEmployeeById(Long id);
	List<EmployeeResponseDto> getAllEmployees();
	EmployeeResponseDto updateEmployee(Long id, EmployeeRequestDto requestDto);
	EmployeeResponseDto patchEmployee(Long id, EmployeeRequestDto requestDto);
	void deleteEmployee(Long id);
	
	Page<EmployeeResponseDto> getEmployeesWithPagination(int page, int size);
	
	List<EmployeeResponseDto> getEmployeesSorted(String sortBy, String direction); 
	
	List<EmployeeResponseDto> searchEmployees(EmployeeSearchDto searchDto); 
	
	List<EmployeeResponseDto> getEmployeesWithSalaryGreaterThan(BigDecimal minSalary); 
} 