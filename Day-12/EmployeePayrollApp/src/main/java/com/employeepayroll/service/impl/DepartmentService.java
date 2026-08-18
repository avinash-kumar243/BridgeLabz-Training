package com.employeepayroll.service.impl;

import java.util.List;
import java.util.logging.Logger;

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
	
	private static final Logger logger = Logger.getLogger(DepartmentService.class.getName()); 

	private final DepartmentRepository departmentRepository;
	private final DepartmentMapper departmentMapper;
	
	// Constructor injection
	public DepartmentService(DepartmentRepository departmentRepository, DepartmentMapper departmentMapper) {
		this.departmentRepository = departmentRepository;
		this.departmentMapper = departmentMapper;
	} 
	
	
	// Create a Department
	public DepartmentResponseDto createDepartment(DepartmentRequestDto departmentDto) { 
		
		logger.info("Creating a new department object");
		
		// Convert to department entity
		Department department = departmentMapper.toEntity(departmentDto);
		
		Department savedDepartment = departmentRepository.save(department);	
		
	    logger.info("Department created successfully with ID: " + savedDepartment.getId());
		
		return departmentMapper.toDepartmentResponseDto(savedDepartment); 
	}
		
	
	// Update Department
	public DepartmentResponseDto updateDepartment(Long id, DepartmentRequestDto departmentDto) {
		
	    logger.info("Updating department with ID: " + id);
	    
		Department savedDepartment = departmentRepository.findById(id).orElseThrow(() -> {

	            logger.warning("Department not found for update with ID: " + id);

	            return new DepartmentNotFoundException("Department not found with this id: " + id);
		}); 

		savedDepartment.setName(departmentDto.getName());
		savedDepartment.setDescription(departmentDto.getDescription()); 
		
		Department updatedDepartment = departmentRepository.save(savedDepartment);
		
	    logger.info("Department updated successfully with ID: " + id);

		return departmentMapper.toDepartmentResponseDto(updatedDepartment);   
	}
	
	
	// Patch Department
	public DepartmentResponseDto patchDepartment(Long id, DepartmentRequestDto requestDto) {
		
	    logger.info("Partially updating department with ID: " + id);

	    // Check department exists or not
		Department savedDepartment = departmentRepository.findById(id).orElseThrow(() -> {

	            logger.warning("Department not found for patch with ID: " + id);
	
	            return new DepartmentNotFoundException("Department not found with this id: " + id);
		}); 

	    // Update if fields are provided
        if(requestDto.getName() != null) {
        		savedDepartment.setName(requestDto.getName());
        }  
        if(requestDto.getDescription() != null) {
    			savedDepartment.setDescription(requestDto.getDescription());
        }

        Department updatedDepartment = departmentRepository.save(savedDepartment);
        
        logger.info("Department partially updated successfully with ID: " + id);
        
	    return departmentMapper.toDepartmentResponseDto(updatedDepartment); 
	}
	
	
	// Delete Department
	public void deleteDepartment(Long id) {
		
	    logger.info("Deleting department with ID: " + id);

        departmentRepository.findById(id).orElseThrow(() -> {

            logger.warning("Department not found for deletion with ID: " + id);

            return new DepartmentNotFoundException(
                    "Department not found with this id " + id 
            );
        });
 
        departmentRepository.deleteById(id);
        
        logger.info("Department deleted successfully with ID: " + id);
    }
	
	
	// Get Department By Id
	public DepartmentResponseDto getDepartmentById(Long id) {

	    logger.info("Fetching department with ID: " + id);

        Department department = departmentRepository.findById(id).orElseThrow(() ->  {

                logger.warning("Department not found with ID: " + id);

                return new DepartmentNotFoundException("Department not found with this id " + id);
        });  

        logger.info("Department found successfully with ID: " + id);

        return departmentMapper.toDepartmentResponseDto(department); 
    } 
	
	
	// Get All Departments
	public List<DepartmentResponseDto> getAllDepartments() {
		
	    logger.info("Fetching all departments");
 
	    List<DepartmentResponseDto> departmentList = departmentRepository.findAll()
					               .stream()
					               .map(departmentMapper::toDepartmentResponseDto) 
					               .toList(); 
        
        logger.info("Successfully fetched " + departmentList.size() + " departments");
         
        return departmentList; 
    }
	
	
	// Get Departments With Pagination
	@Override
	public Page<DepartmentResponseDto> getDepartmentsWithPagination(int page, int size) {
		
		logger.info("Fetching departments with pagination. Page: " + page + ", Size: " + size);

	    Pageable pageable = PageRequest.of(page, size);

	    Page<Department> departmentPage = departmentRepository.findAll(pageable);
	    
	    logger.info("Pagination completed. Page: " + page + ", Departments found: " + departmentPage.getNumberOfElements());

	    return departmentPage.map(departmentMapper::toDepartmentResponseDto); 
	}
	
	
	// Get Departments in Sorted order
	@Override
	public List<DepartmentResponseDto> getDepartmentsSorted(String sortBy, String direction) {

		logger.info("Fetching departments sorted by: " + sortBy + ", direction: " + direction);
		
	    Sort sort;

	    if(direction.equalsIgnoreCase("desc")) {
	        sort = Sort.by(sortBy).descending();
	    } else {
	        sort = Sort.by(sortBy).ascending();
	    }

	    List<DepartmentResponseDto> departmentList = departmentRepository.findAll(sort)
	            .stream()
	            .map(departmentMapper::toDepartmentResponseDto)
	            .toList();
	    
	    logger.info("Department sorting completed. Departments found: " + departmentList.size());
	    
	    return departmentList; 
	}
	
	
	// Get Department By Name (QBE) 
	@Override
	public List<DepartmentResponseDto> getDepartmentsByName(String name) {
		
		logger.info("Searching departments by name: " + name);

	    List<DepartmentResponseDto> departmentList = departmentRepository.findByName(name)
	            .stream()
	            .map(departmentMapper::toDepartmentResponseDto)
	            .toList();
	    
	    logger.info("Department search completed. Departments found: " + departmentList.size());
	    
	    return departmentList; 
	}
}