package com.fundoonotes.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResetPasswordRequestDto {
	
    @NotBlank(message = "Token is required")
    private String resetToken; 
    
    @NotBlank(message = "New Password is required")
    @Size(min = 8, message = "Password must contain at least 8 characters") 
    private String newPassword;
}