package com.employeepayroll.mapper;

import org.springframework.stereotype.Component;

import com.employeepayroll.dto.EmployeeRequestDto;
import com.employeepayroll.dto.EmployeeResponseDto;
import com.employeepayroll.model.Employee;

@Component
public class EmployeeMapper {

	// Convert Employee Request dto object to Employee Entity
    public Employee toEntity(EmployeeRequestDto dto) {
        Employee employee = new Employee();

        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setPhone(dto.getPhone());
        employee.setSalary(dto.getSalary());
        employee.setDeptId(dto.getDeptId());

        return employee;
    }

    
	// Convert Employee entity to Employee Response dto
    public EmployeeResponseDto toResponseDto(Employee employee) {

        return new EmployeeResponseDto(
                employee.getId(),
                employee.getName(),
                employee.getEmail(),
                employee.getPhone(), 
                employee.getSalary(),
                employee.getDeptId()
        ); 
    }
}