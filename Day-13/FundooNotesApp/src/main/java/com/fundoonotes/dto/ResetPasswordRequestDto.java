package com.fundoonotes.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResetPasswordRequestDto {
	
    @NotBlank(message = "Token is required")
    private String resetToken; 
    
    @NotBlank(message = "New Password is required")
    @Size(min = 8, message = "Password must contain at least 8 characters") 
    private String newPassword;
}