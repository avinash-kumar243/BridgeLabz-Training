package com.employeepayroll.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employeepayroll.dto.DepartmentRequestDto;
import com.employeepayroll.dto.DepartmentResponseDto;
import com.employeepayroll.exception.DepartmentNotFoundException;
import com.employeepayroll.mapper.DepartmentMapper;
import com.employeepayroll.model.Department;
import com.employeepayroll.repository.DepartmentRepository;
import com.employeepayroll.service.IDepartmentService;

@Service
public class DepartmentService implements IDepartmentService {

	private final DepartmentRepository departmentRepository;
	private final DepartmentMapper departmentMapper;
	
	// Constructor injection
	public DepartmentService(DepartmentRepository departmentRepository, DepartmentMapper departmentMapper) {
		this.departmentRepository = departmentRepository;
		this.departmentMapper = departmentMapper;
	} 
	
	
	// Create a Department
	public DepartmentResponseDto createDepartment(DepartmentRequestDto departmentDto) { 
		
		// Convert to department entity
		Department department = departmentMapper.toEntity(departmentDto);
		
		Department savedDepartment = departmentRepository.save(department);		
		
		return departmentMapper.toDepartmentResponseDto(savedDepartment); 
	}
	
	
	
	// Update Department
	public DepartmentResponseDto updateDepartment(Long id, DepartmentRequestDto departmentDto) {
	    
		departmentRepository.findById(id).orElseThrow(() -> 
			new DepartmentNotFoundException(
					"Department not found with this id: " + id 
			)
		);
		
		Department department = departmentMapper.toEntity(departmentDto);
		departmentRepository.update(id, department);
		department.setId(id);
		
		return departmentMapper.toDepartmentResponseDto(department); 
	}
	
	
	// Patch Department
	public DepartmentResponseDto patchDepartment(Long id, DepartmentRequestDto requestDto) {

	    // Check department exists or not
	    departmentRepository.findById(id)
		                    .orElseThrow(() ->
		                            new DepartmentNotFoundException(
		                                    "Department not found with id: " + id
		                            )
		                    );

	    departmentRepository.update(id, requestDto);

	    Department updatedDepartment = departmentRepository.findById(id)
								                    .orElseThrow(() ->
								                            new DepartmentNotFoundException(
								                                    "Department not found with id: " + id
								                            )
								                    );

	    return departmentMapper.toDepartmentResponseDto(updatedDepartment);
	}
	
	
	// Delete Department
	public void deleteDepartment(Long id) {

        departmentRepository.findById(id).orElseThrow(() -> 
            new DepartmentNotFoundException(
                    "Department not found with this id " + id 
            )
        );
 
        departmentRepository.deleteById(id);
    }
	
	
	// Get Department By Id
	public DepartmentResponseDto getDepartmentById(Long id) {

        Department department = departmentRepository.findById(id)
            .orElseThrow(() ->
                    new DepartmentNotFoundException(
                            "Department not foound with this id " + id
            )
        );

        return departmentMapper.toDepartmentResponseDto(department); 
    } 
	
	
	// Get All Departments
	public List<DepartmentResponseDto> getAllDepartments() {
 
        return departmentRepository.findAll()
					               .stream()
					               .map(departmentMapper::toDepartmentResponseDto) 
					               .toList(); 
    }
}