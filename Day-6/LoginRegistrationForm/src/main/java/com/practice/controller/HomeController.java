package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.entity.User;
import com.practice.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
		
	
	@GetMapping("/")
	public String home() { 
		return "home";
	}
	
	@GetMapping("/register")
	public String registerPage() {
		return "register"; 
	}
	
	// When the use enter name, email, and password and click "register" button. Then request comes here
	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user, Model model) {
	    boolean status = userService.registerUser(user);

	    if(status) {
	        model.addAttribute("success", "Registration Successful! Please Login");
	        return "login";
	    }

	    model.addAttribute("error", "Email already exists");
	    return "register";
	}
		
	
	@GetMapping("/login")
	public String loginPage() { 
	    return "login"; 
	}
	
	// When the user enter email and password and click "login". Then the request comes here
	@PostMapping("/login")
	public String loginUser(@RequestParam String email, @RequestParam String password, Model model){
	    User user = userService.loginUser(email,password);

	    if(user != null){
	        model.addAttribute("username", user.getName());
	        return "dashboard";
	    }

	    model.addAttribute("error", "Invalid Email or Password");
	    return "login"; 
	}
} 