package com.employeepayroll.controller;

import com.employeepayroll.dto.EmployeeRequestDto;
import com.employeepayroll.dto.EmployeeResponseDto;
import com.employeepayroll.dto.EmployeeSearchDto;
import com.employeepayroll.service.IEmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private final IEmployeeService employeeService;

    // Constructor Injection
    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    
    // Create Employee
    @Operation(summary = "Create a new employee", description = "Creates a new employee using the given employee details")
    @PostMapping("/employees")
    public ResponseEntity<EmployeeResponseDto> createEmployee(@Valid @RequestBody EmployeeRequestDto requestDto) {

        EmployeeResponseDto response = employeeService.createEmployee(requestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(response); 
    }
    

    // Get all Employees
    @Operation(summary = "Get all employees", description = "Retrieves a list of all employees available in the database")
    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeResponseDto>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    
    // Get Employee by Id
    @Operation(summary = "Get employee by ID", description = "Retrieves an employee using the employee ID")
    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeResponseDto> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    
    // Update Employee
    @Operation(summary = "Update an employee", description = "Updates all details of an existing employee by the employee ID")
    @PutMapping("/employees/{id}")
    public ResponseEntity<EmployeeResponseDto> updateEmployee(@PathVariable Long id, @Valid @RequestBody EmployeeRequestDto requestDto) {
        return ResponseEntity.ok(employeeService.updateEmployee(id, requestDto));
    }
    
    
    // Patch Employee
    @Operation(summary = "Partially update an employee", description = "Updates one or more details of an existing employee without requiring all employee fields")
    @PatchMapping("/employees/{id}")
    public ResponseEntity<EmployeeResponseDto> patchEmployee(@PathVariable Long id, @Valid @RequestBody EmployeeRequestDto requestDto) {
        return ResponseEntity.ok(employeeService.patchEmployee(id, requestDto));
    }
    

    // Delete Employee
    @Operation(summary = "Delete an employee", description = "Deletes an existing employee using the employee's unique ID")
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {

        employeeService.deleteEmployee(id);

        return ResponseEntity.noContent().build();
    }
    
    
    // Get Employee with Pagination
    @Operation(summary = "Get employees with pagination", description = "Retrieves employees in paginated form. The page number starts from 0 and the default page size is 5")
    @GetMapping("/employees/page")
    public ResponseEntity<Page<EmployeeResponseDto>> getEmployeesWithPagination(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size) {
        return ResponseEntity.ok(employeeService.getEmployeesWithPagination(page, size)); 
    }
    
    
    // Get Employee sorted in ascending order
    @Operation(summary = "Get employees in sorted order", description = "Retrieves all employees sorted by the specified field in ascending or descending order")
    @GetMapping("/employees/sort")
    public ResponseEntity<List<EmployeeResponseDto>> getEmployeesSorted(@RequestParam(defaultValue = "id") String sortBy, @RequestParam(defaultValue = "asc") String direction) {
        return ResponseEntity.ok(employeeService.getEmployeesSorted(sortBy, direction));
    }  
     
    
    // Search Employee
    @Operation(summary = "Search employees", description = "Searches for employees based on the provided search criteria")
    @GetMapping("/employees/search")
    public ResponseEntity<List<EmployeeResponseDto>> searchEmployees(@ModelAttribute EmployeeSearchDto searchDto) {
        return ResponseEntity.ok(employeeService.searchEmployees(searchDto));
    }
    
    
    // Find employees whose salary is greater than a given amount
    @Operation(summary = "Find employees with salary greater than a specified amount", description = "Retrieves all employees whose salary is greater than the specified minimum salary")
    @GetMapping("/employees/salary")
    public ResponseEntity<List<EmployeeResponseDto>> getEmployeesWithSalaryGreaterThan(@RequestParam BigDecimal minSalary) {
        return ResponseEntity.ok(employeeService.getEmployeesWithSalaryGreaterThan(minSalary));
    }

}