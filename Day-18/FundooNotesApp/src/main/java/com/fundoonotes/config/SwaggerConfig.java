package com.fundoonotes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {  

   @Bean
   OpenAPI EmployeePayrollOpenAPI() {  // Creating OpenAPI bean (OpenAPI - A class provided by Swagger)

   	   // Setting manual fields - Because Swagger needs general information about our API
       return new OpenAPI().info(new Info()
	                        .title("Fundoo Notes App")
	                        .description("REST APIs for managing User and their Notes")
	                        .version("1.0.0")
	                        .contact(new Contact().name("Avinash")));  
   }
}  