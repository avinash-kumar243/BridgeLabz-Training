package com.employeepayroll.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	    
		Department savedDepartment = departmentRepository.findById(id).orElseThrow(() -> 
											new DepartmentNotFoundException(
													"Department not found with this id: " + id 
											)
										);
		
		savedDepartment.setName(departmentDto.getName());
		savedDepartment.setDescription(departmentDto.getDescription()); 
		
		Department updatedDepartment = departmentRepository.save(savedDepartment);
		
		return departmentMapper.toDepartmentResponseDto(updatedDepartment);   
	}
	
	
	// Patch Department
	public DepartmentResponseDto patchDepartment(Long id, DepartmentRequestDto requestDto) {

	    // Check department exists or not
		Department savedDepartment = departmentRepository.findById(id).orElseThrow(() -> 
											new DepartmentNotFoundException(
													"Department not found with this id: " + id 
											)
										);

	    // Update if fields are provided
        if(requestDto.getName() != null) {
        		savedDepartment.setName(requestDto.getName());
        }  
        if(requestDto.getDescription() != null) {
    			savedDepartment.setDescription(requestDto.getDescription());
        }

        Department updatedDepartment = departmentRepository.save(savedDepartment);
        
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
	
	
	// Get Departments With Pagination
	@Override
	public Page<DepartmentResponseDto> getDepartmentsWithPagination(int page, int size) {
	    Pageable pageable = PageRequest.of(page, size);

	    Page<Department> departmentPage = departmentRepository.findAll(pageable);

	    return departmentPage.map(departmentMapper::toDepartmentResponseDto); 
	}
	
	
	// Get Departments in Sorted order
	@Override
	public List<DepartmentResponseDto> getDepartmentsSorted(String sortBy, String direction) {

	    Sort sort;

	    if(direction.equalsIgnoreCase("desc")) {
	        sort = Sort.by(sortBy).descending();
	    } else {
	        sort = Sort.by(sortBy).ascending();
	    }

	    return departmentRepository.findAll(sort)
	            .stream()
	            .map(departmentMapper::toDepartmentResponseDto)
	            .toList();
	}
	
	
	// Get Department By Name (QBE) 
	@Override
	public List<DepartmentResponseDto> getDepartmentsByName(String name) {

	    return departmentRepository.findByName(name)
	            .stream()
	            .map(departmentMapper::toDepartmentResponseDto)
	            .toList();
	}
}