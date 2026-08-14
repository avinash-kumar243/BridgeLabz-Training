package com.employeepayroll.controller;

import com.employeepayroll.dto.DepartmentRequestDto;
import com.employeepayroll.dto.DepartmentResponseDto;
import com.employeepayroll.service.IDepartmentService;

import jakarta.validation.Valid;
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
    @PostMapping("/departments")
    public ResponseEntity<DepartmentResponseDto> createDepartment(@Valid @RequestBody DepartmentRequestDto requestDto) {

        DepartmentResponseDto response = departmentService.createDepartment(requestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(response); 
    }

    
    // Get all Departments
    @GetMapping("/departments")
    public ResponseEntity<List<DepartmentResponseDto>> getAllDepartments() {
        return ResponseEntity.ok(departmentService.getAllDepartments());
    }

    
    // Get Department by Id
    @GetMapping("/departments/{id}")
    public ResponseEntity<DepartmentResponseDto> getDepartmentById(@PathVariable Long id) {
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

    
    // Update a Department
    @PutMapping("/departments/{id}")
    public ResponseEntity<DepartmentResponseDto> updateDepartment(@PathVariable Long id, @Valid @RequestBody DepartmentRequestDto requestDto) {
        return ResponseEntity.ok(departmentService.updateDepartment(id, requestDto));
    }
    
    
    // Patch Department
    @PatchMapping("/departments/{id}")
    public ResponseEntity<DepartmentResponseDto> patchDepartment(@PathVariable Long id, @Valid @RequestBody DepartmentRequestDto requestDto) {
        return ResponseEntity.ok(departmentService.patchDepartment(id, requestDto));
    }

    
    // Delete a Department
    @DeleteMapping("/departments/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
        
        return ResponseEntity.noContent().build(); 
    }
    
}