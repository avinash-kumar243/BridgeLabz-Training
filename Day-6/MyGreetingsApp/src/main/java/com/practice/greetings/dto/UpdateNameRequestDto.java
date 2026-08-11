package com.practice.greetings.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateNameRequestDto {

    @NotBlank(message = "Name is required")
    private String name;
}