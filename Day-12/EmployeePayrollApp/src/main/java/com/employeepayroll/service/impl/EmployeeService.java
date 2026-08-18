package com.employeepayroll.service.impl;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.employeepayroll.dto.EmployeeRequestDto;
import com.employeepayroll.dto.EmployeeResponseDto;
import com.employeepayroll.dto.EmployeeSearchDto;
import com.employeepayroll.exception.DepartmentNotFoundException;
import com.employeepayroll.exception.EmployeeNotFoundException;
import com.employeepayroll.mapper.EmployeeMapper;
import com.employeepayroll.model.Department;
import com.employeepayroll.model.Employee;
import com.employeepayroll.repository.DepartmentRepository;
import com.employeepayroll.repository.EmployeeRepository;
import com.employeepayroll.service.IEmployeeService;

import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Logger;

@Service
public class EmployeeService implements IEmployeeService {
	
    private static final Logger logger = Logger.getLogger(EmployeeService.class.getName());

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
    @Override 
    public EmployeeResponseDto createEmployee(EmployeeRequestDto requestDto) {
    	
    		logger.info("Creating employee with name: " + requestDto.getName());

        Department department = departmentRepository.findById(requestDto.getDeptId())
							        .orElseThrow(() -> {
							        	
							        			logger.warning("Department not found with id: " + requestDto.getDeptId());
							        			
							                return new DepartmentNotFoundException(
							                        "Department not found with id: "
							                                + requestDto.getDeptId()
							                           
							                	);
							        });

        Employee employee = employeeMapper.toEntity(requestDto, department);

        Employee savedEmployee = employeeRepository.save(employee);
        
        logger.info("Employee created successfully with ID: " + savedEmployee.getId());

        return employeeMapper.toResponseDto(savedEmployee);
    } 
     

    // Get all Employees
    public List<EmployeeResponseDto> getAllEmployees() {
    		
    		logger.info("Get all employees details");
    		
    		List<EmployeeResponseDto> employees = employeeRepository.findAll()
								                 .stream()
								                 .map(employeeMapper::toResponseDto)
								                 .toList(); 
    		
    	    logger.info("Successfully fetched " + employees.size() + " employees");
    	    
    	    return employees; 
    }
    

    // Get Employee by Id
    public EmployeeResponseDto getEmployeeById(Long id) {
    	
        logger.info("Fetching employee with ID: " + id);
 
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> {
                	
                    		logger.warning("Employee not found with ID: " + id);
                    
                        return new EmployeeNotFoundException (
                                "Employee not found with this id: " + id
                        	);
                        
                });

        return employeeMapper.toResponseDto(employee);
    }

    
    // Update Employee
    @Override
    public EmployeeResponseDto updateEmployee(Long id, EmployeeRequestDto requestDto) {
    	
    		logger.info("Updating employee with ID: " + id); 

        // Check employee exists or not
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> {
                	
                			logger.warning("Employee not found for update. ID: " + id);
                
                        return new EmployeeNotFoundException(
                                "Employee not found with this id: " + id
                        );
                });

        // find department
        Department department = departmentRepository.findById(requestDto.getDeptId())
                .orElseThrow(() -> {
                	
                			logger.warning("Deparment not found with this id: " + requestDto.getDeptId());
                	
                        return new DepartmentNotFoundException(
                                "Department not found with id: "
                                        + requestDto.getDeptId()
                        );
                });

        // Update all employee fields
        employee.setName(requestDto.getName());
        employee.setEmail(requestDto.getEmail());
        employee.setPhone(requestDto.getPhone());
        employee.setSalary(requestDto.getSalary());
        employee.setDepartment(department);

        Employee updatedEmployee = employeeRepository.save(employee);
        
        logger.info("Employee updated successfully in database");

        return employeeMapper.toResponseDto(updatedEmployee);
    }
    
    
    // Patch Employee
    @Override
    public EmployeeResponseDto patchEmployee(Long id, EmployeeRequestDto requestDto) {
    	
    		logger.info("Partial updating employee details");

        // Check employee exists or not
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> {
                	
                			logger.warning("Employee not found with this id: " + id);
                	
                        return new EmployeeNotFoundException(
                                "Employee not found with this id: " + id
                        );
                });

        // Update data
        if(requestDto.getName() != null) employee.setName(requestDto.getName());
        if(requestDto.getEmail() != null) employee.setEmail(requestDto.getEmail());
        if(requestDto.getPhone() != null) employee.setPhone(requestDto.getPhone());
        if(requestDto.getSalary() != null) employee.setSalary(requestDto.getSalary());
        
        // Update department only if deptId is provided
        if(requestDto.getDeptId() != null) {

            Department department = departmentRepository
                    .findById(requestDto.getDeptId())
                    .orElseThrow(() -> {
                    	
                    			logger.warning("Department not found with this id: " + requestDto.getDeptId());
                    		
                            return new DepartmentNotFoundException(
                                    "Department not found with id: " + requestDto.getDeptId()
                            );
                    });
            
            employee.setDepartment(department); 
        }

        Employee updatedEmployee = employeeRepository.save(employee);
        
        logger.info("Employee partially updated successfully with id: " + updatedEmployee.getId());

        return employeeMapper.toResponseDto(updatedEmployee);
    }
    
    
    // Delete Employee
    public void deleteEmployee(Long id) {

        employeeRepository.findById(id)
                .orElseThrow(() -> {
                	
	        				logger.warning("Department not found with this id: " + id);
	        		
	        				return new EmployeeNotFoundException(
	                                "Employee with id " + id + " not found"
	                    );
                });

        employeeRepository.deleteById(id);
        
        logger.info("Employee deleted successfully with ID: " + id);
    }


	@Override
	public Page<EmployeeResponseDto> getEmployeesWithPagination(int page, int size) {
		
		logger.info("Fetching employees with pagination " + "Page: " + page + ", Size: " + size);
		
		Pageable pageable = PageRequest.of(page, size); 

	    Page<Employee> employeePage = employeeRepository.findAll(pageable);
	    
	    logger.info("Successfully fetched page " + page + " containing " + employeePage.getNumberOfElements() + " employees");

	    return employeePage.map(employeeMapper::toResponseDto);
	}
	
	
	@Override
	public List<EmployeeResponseDto> getEmployeesSorted(String sortBy, String direction) {
		
		logger.info("Fetching employees sorted by: " + sortBy + ", direction: " + direction);

	    Sort sort; 

	    if(direction.equalsIgnoreCase("desc")) {
	        sort = Sort.by(sortBy).descending();
	    } else {
	        sort = Sort.by(sortBy).ascending();
	    } 

	    List<EmployeeResponseDto> employeeList = employeeRepository.findAll(sort)
	            .stream()
	            .map(employeeMapper::toResponseDto)
	            .toList();
	    
	    logger.info("Successfully fetched " + employeeList.size() + " sorted employees"); 
	    
	    return employeeList; 
	}
	
	
	@Override
	public List<EmployeeResponseDto> searchEmployees(EmployeeSearchDto searchDto) {
		
	    logger.info("Searching employees using search criteria");

	    Employee employee = new Employee();

	    employee.setName(searchDto.getName());
	    employee.setEmail(searchDto.getEmail());
	    employee.setPhone(searchDto.getPhone());
	    employee.setSalary(searchDto.getSalary());

	    // Department search
	    if(searchDto.getDeptId() != null) {
	    	
	    	 	logger.info("Searching employees for department ID: " + searchDto.getDeptId());
	    	
	        Department department = new Department();

	        department.setId(searchDto.getDeptId());
	        employee.setDepartment(department);
	    }

	    ExampleMatcher matcher = ExampleMatcher.matching()
	            .withIgnoreNullValues()
	            .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)  
	            .withIgnoreCase();

	    Example<Employee> example = Example.of(employee, matcher);

	    List<EmployeeResponseDto> employeeList = employeeRepository.findAll(example)
	            .stream()
	            .map(employeeMapper::toResponseDto) 
	            .toList();
	    
	    logger.info("Employee search completed. Results found: "
	            + employeeList.size());

	    return employeeList; 
	}
	
	
	@Override
	public List<EmployeeResponseDto> getEmployeesWithSalaryGreaterThan(BigDecimal minSalary) {

		logger.info("Searching employees with salary greater than: " + minSalary);
		
	    List<EmployeeResponseDto> employeeList = employeeRepository.findEmployeesWithSalaryGreaterThan(minSalary)
						            .stream()
						            .map(employeeMapper::toResponseDto)
						            .toList(); 
	    
	    logger.info("Salary search completed. Employees found: " + employeeList.size()); 
	    
	    return employeeList; 
	}

} 
