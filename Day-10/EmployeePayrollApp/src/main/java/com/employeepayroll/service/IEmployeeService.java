package com.employeepayroll.service;

import java.util.List;

import com.employeepayroll.dto.EmployeeRequestDto;
import com.employeepayroll.dto.EmployeeResponseDto;

public interface IEmployeeService {
	
	EmployeeResponseDto createEmployee(EmployeeRequestDto requestDto);
	EmployeeResponseDto getEmployeeById(Long id);
	List<EmployeeResponseDto> getAllEmployees();
	EmployeeResponseDto updateEmployee(Long id, EmployeeRequestDto requestDto);
	EmployeeResponseDto patchEmployee(Long id, EmployeeRequestDto requestDto);
	void deleteEmployee(Long id);
}