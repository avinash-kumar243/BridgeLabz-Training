package com.employeepayroll.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentRequestDto {

    @NotBlank(message = "Department name is required")
    @Size(min = 2, max = 20, message = "Department name must be greater than 1 character and less or equal to 20 characters")
    private String name;

    @Size(min = 11, message = "Description must be greater than 10 characters")
    private String description;	    
}