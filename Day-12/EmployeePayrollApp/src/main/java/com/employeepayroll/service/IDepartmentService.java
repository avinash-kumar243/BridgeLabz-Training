package com.employeepayroll.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.employeepayroll.dto.DepartmentRequestDto;
import com.employeepayroll.dto.DepartmentResponseDto;

public interface IDepartmentService {

	DepartmentResponseDto createDepartment(DepartmentRequestDto departmentDto);
	DepartmentResponseDto updateDepartment(Long id, DepartmentRequestDto departmentDto);
	DepartmentResponseDto patchDepartment(Long id, DepartmentRequestDto departmentDto);
	DepartmentResponseDto getDepartmentById(Long id);
	List<DepartmentResponseDto> getAllDepartments();
	void deleteDepartment(Long id);
	
	Page<DepartmentResponseDto> getDepartmentsWithPagination(int page, int size);
	
	List<DepartmentResponseDto> getDepartmentsSorted(String sortBy, String direction);
	
	List<DepartmentResponseDto> getDepartmentsByName(String name); 
}  