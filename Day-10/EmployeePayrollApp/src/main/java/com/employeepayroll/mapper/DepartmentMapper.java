package com.employeepayroll.mapper;

import org.springframework.stereotype.Component;

import com.employeepayroll.dto.DepartmentRequestDto;
import com.employeepayroll.dto.DepartmentResponseDto;
import com.employeepayroll.model.Department;

@Component
public class DepartmentMapper {

	// toDepartment()
	public Department toEntity(DepartmentRequestDto dto) {
		
		Department department = new Department();
		
		department.setName(dto.getName());
		department.setDescription(dto.getDescription());
		 
		return department; 
	}
	
	 
	// toResponseDepartment()
	public DepartmentResponseDto toDepartmentResponseDto(Department department) {
		
		return new DepartmentResponseDto(
				department.getId(),
				department.getName(),
				department.getDescription() 			
		);
	}
	
}