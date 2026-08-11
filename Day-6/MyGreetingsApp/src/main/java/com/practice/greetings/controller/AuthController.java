package com.practice.greetings.controller;

import java.util.Optional;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.greetings.dto.LoginRequestDto;
import com.practice.greetings.dto.RegisterRequestDto;
import com.practice.greetings.dto.UpdateNameRequestDto;
import com.practice.greetings.entity.User;
import com.practice.greetings.service.UserService;

@Controller
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }


    // Login page

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("loginRequest", new LoginRequestDto());
        return "login";
    }


    // Login

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("loginRequest")
			            LoginRequestDto request,
			            BindingResult result,
			            HttpSession session,
			            Model model) {

        if(result.hasErrors()) {
            return "login";
        }

        Optional<User> userOptional = userService.login(request);

        if(userOptional.isEmpty()) {
        	
            model.addAttribute("loginError", "Invalid email or password");
            return "login";
        }

        User user = userOptional.get();

        session.setAttribute("loggedInUserId", user.getId());

        return "redirect:/greet";
    }


    // Registration page

    @GetMapping("/register")
    public String registerPage(Model model) {

        model.addAttribute("registrationRequest", new RegisterRequestDto());
        return "register";
    }


    // Registration

    @PostMapping("/register")
    public String register(
            @Valid @ModelAttribute("registrationRequest")
            RegisterRequestDto request,
            BindingResult result,
            Model model) {

        if(result.hasErrors()) {
            return "register";
        }

        boolean registered = userService.register(request);

        if(!registered) {
            model.addAttribute("registrationError", "Email already registered" );
            return "register";
        }

        return "redirect:/login";
    }


    // Update name

    @PostMapping("/update-name")
    public String updateName(
            @Valid @ModelAttribute("updateNameRequest")
            UpdateNameRequestDto request,
            BindingResult result,
            HttpSession session) {

        Long userId = (Long) session.getAttribute("loggedInUserId");

        if(userId == null) {
            return "redirect:/login";
        }

        if(result.hasErrors()) {
            return "redirect:/greet";
        }

        userService.updateName(userId, request.getName());

        return "redirect:/greet";
    }


    // Logout

    @GetMapping("/logout")
    public String logout(HttpSession session) {

        session.invalidate();
        return "redirect:/";
    }
}