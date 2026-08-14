package com.employeepayroll.controller;

import com.employeepayroll.dto.EmployeeRequestDto;
import com.employeepayroll.dto.EmployeeResponseDto;
import com.employeepayroll.service.IEmployeeService;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/employees")
    public ResponseEntity<EmployeeResponseDto> createEmployee(@Valid @RequestBody EmployeeRequestDto requestDto) {

        EmployeeResponseDto response = employeeService.createEmployee(requestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    

    // Get all Employees
    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeResponseDto>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    
    // Get Employee by Id
    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeResponseDto> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    
    // Update Employee
    @PutMapping("/employees/{id}")
    public ResponseEntity<EmployeeResponseDto> updateEmployee(@PathVariable Long id, @Valid @RequestBody EmployeeRequestDto requestDto) {
        return ResponseEntity.ok(employeeService.updateEmployee(id, requestDto));
    }
    
    
    // Patch Employee
    @PatchMapping("/employees/{id}")
    public ResponseEntity<EmployeeResponseDto> patchEmployee(@PathVariable Long id, @Valid @RequestBody EmployeeRequestDto requestDto) {
        return ResponseEntity.ok(employeeService.patchEmployee(id, requestDto));
    }
    

    // Delete Employee
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {

        employeeService.deleteEmployee(id);

        return ResponseEntity.noContent().build();
    }
}