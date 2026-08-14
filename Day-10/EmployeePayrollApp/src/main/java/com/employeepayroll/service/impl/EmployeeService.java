package com.employeepayroll.service.impl;

import org.springframework.stereotype.Service;

import com.employeepayroll.dto.EmployeeRequestDto;
import com.employeepayroll.dto.EmployeeResponseDto;
import com.employeepayroll.exception.DepartmentNotFoundException;
import com.employeepayroll.exception.EmployeeNotFoundException;
import com.employeepayroll.mapper.EmployeeMapper;
import com.employeepayroll.model.Employee;
import com.employeepayroll.repository.DepartmentRepository;
import com.employeepayroll.repository.EmployeeRepository;
import com.employeepayroll.service.IEmployeeService;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeMapper employeeMapper;

    // Constructor Injection
    public EmployeeService(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
        this.employeeMapper = employeeMapper;
    }

    
    // Create an Employee
    public EmployeeResponseDto createEmployee(EmployeeRequestDto requestDto) {

    		// Validating the department by department id
        validateDepartment(requestDto.getDeptId());

        Employee employee = employeeMapper.toEntity(requestDto);

        Employee savedEmployee = employeeRepository.save(employee);

        return employeeMapper.toResponseDto(savedEmployee);
    } 
     

    // Get all Employees
    public List<EmployeeResponseDto> getAllEmployees() {

        return employeeRepository.findAll()
				                 .stream()
				                 .map(employeeMapper::toResponseDto)
				                 .toList(); 
    }
    

    // Get Employee by Id
    public EmployeeResponseDto getEmployeeById(Long id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() ->
                        new EmployeeNotFoundException (
                                "Employee not found with this id: " + id
                )
        );

        return employeeMapper.toResponseDto(employee);
    }

    // Update Employee
    public EmployeeResponseDto updateEmployee(Long id, EmployeeRequestDto requestDto) {

        employeeRepository.findById(id)
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "Employee not found with this id: " + id
                )
        );

        validateDepartment(requestDto.getDeptId());

        Employee employee = employeeMapper.toEntity(requestDto);

        employeeRepository.update(id, employee);

        employee.setId(id);

        return employeeMapper.toResponseDto(employee);
    }
    
    
    // Patch Employee
    public EmployeeResponseDto patchEmployee(Long id, EmployeeRequestDto requestDto) {

        // Check employee exists or not
        employeeRepository.findById(id)
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "Employee not found with this id: " + id
                )
        );

        employeeRepository.update(id, requestDto);

        Employee updatedEmployee = employeeRepository.findById(id)
							                        .orElseThrow(() ->
							                                new EmployeeNotFoundException(
							                                        "Employee not found with id: " + id
							                                )
							                        );

        return employeeMapper.toResponseDto(updatedEmployee);
    }

    
    // DELETE
    public void deleteEmployee(Long id) {

        employeeRepository.findById(id)
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "Employee with id " + id + " not found"
                        )
                );

        employeeRepository.deleteById(id);
    }

    
    // Helper method (Validate department)
    private void validateDepartment(Long deptId) {

        departmentRepository.findById(deptId)
                .orElseThrow(() ->
                        new DepartmentNotFoundException (
                                "Department with id " + deptId + " not found"
                )
        );
    }
}