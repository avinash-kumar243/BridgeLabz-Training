package com.employeepayroll.controller;

import com.employeepayroll.dto.DepartmentRequestDto;
import com.employeepayroll.dto.DepartmentResponseDto;
import com.employeepayroll.service.IDepartmentService;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

    private final IDepartmentService departmentService;

    // Construction Injection 
    public DepartmentController(IDepartmentService departmentService) {
        this.departmentService = departmentService;
    }
     
 
    // Create a Department
    @Operation(summary = "Create a new department", description = "Creates a new department using the given department details")
    @PostMapping("/departments")
    public ResponseEntity<DepartmentResponseDto> createDepartment(@Valid @RequestBody DepartmentRequestDto requestDto) {

        DepartmentResponseDto response = departmentService.createDepartment(requestDto);
 
        return ResponseEntity.status(HttpStatus.CREATED).body(response); 
    }

    
    // Get all Departments
    @Operation(summary = "Get all departments", description = "Retrieves a list containing all departments available in the database")
    @GetMapping("/departments") 
    public ResponseEntity<List<DepartmentResponseDto>> getAllDepartments() {
        return ResponseEntity.ok(departmentService.getAllDepartments());
    }

    
    // Get Department by Id
    @Operation(summary = "Get department by ID", description = "Retrieves a department using its unique department ID")
    @GetMapping("/departments/{id}")
    public ResponseEntity<DepartmentResponseDto> getDepartmentById(@PathVariable Long id) {
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

    
    // Update a Department
    @Operation(summary = "Update a department", description = "Updates all details of an existing department")
    @PutMapping("/departments/{id}")
    public ResponseEntity<DepartmentResponseDto> updateDepartment(@PathVariable Long id, @Valid @RequestBody DepartmentRequestDto requestDto) {
        return ResponseEntity.ok(departmentService.updateDepartment(id, requestDto));
    }
    
    
    // Patch Department
    @Operation(summary = "Partially update a department", description = "Updates one or more details of an existing department without requiring all department fields")
    @PatchMapping("/departments/{id}")
    public ResponseEntity<DepartmentResponseDto> patchDepartment(@PathVariable Long id, @Valid @RequestBody DepartmentRequestDto requestDto) {
        return ResponseEntity.ok(departmentService.patchDepartment(id, requestDto));
    }

    
    // Delete a Department
    @Operation(summary = "Delete a department", description = "Delete an existing department using department ID")
    @DeleteMapping("/departments/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
        
        return ResponseEntity.noContent().build(); 
    }
    
    
    // Get Departments With Pagination
    @Operation(summary = "Get departments with pagination", description = "Retrieves departments in paginated form. The page number starts from 0 and the default page size is 5")
    @GetMapping("/departments/page")
    public ResponseEntity<Page<DepartmentResponseDto>> getDepartmentsWithPagination(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size) {
        return ResponseEntity.ok(departmentService.getDepartmentsWithPagination(page, size));
    }
    
    
    // Get Departments in Sorted order
    @Operation(summary = "Get departments in sorted order", description = "Retrieves all departments sorted by the specified field in ascending or descending order")
    @GetMapping("/departments/sort")
    public ResponseEntity<List<DepartmentResponseDto>> getDepartmentsSorted(@RequestParam(defaultValue = "id") String sortBy, @RequestParam(defaultValue = "asc") String direction) {
        return ResponseEntity.ok(departmentService.getDepartmentsSorted(sortBy, direction));
    }
    
    
    // Get Department By Name (QBE)
    @Operation(summary = "Search departments by name", description = "Searches for departments based on the provided department name using Query by Example (QBE)")
    @GetMapping("/departments/search")
    public ResponseEntity<List<DepartmentResponseDto>> getDepartmentsByName(@RequestParam String name) {
        return ResponseEntity.ok(departmentService.getDepartmentsByName(name));
    }
}