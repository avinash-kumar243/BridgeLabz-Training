package com.practice.greetings.controller;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.greetings.dto.GreetingsRequestDto;
import com.practice.greetings.dto.UpdateNameRequestDto;
import com.practice.greetings.service.GreetingsService;
import com.practice.greetings.service.UserService;


@Controller
public class GreetingController {

    private final GreetingsService greetingService;
    private final UserService userService;

    public GreetingController(GreetingsService greetingService, UserService userService) {
        this.greetingService = greetingService;
        this.userService = userService;
    }

    
    // Redirect to Greeting page
    
    @GetMapping("/greet")
    public String showGreetingPage(HttpSession session, Model model) {

        Long userId = (Long)session.getAttribute("loggedInUserId");

        if(userId == null) {
            return "redirect:/login";
        }

        model.addAttribute("user", userService.getUserById(userId));
        model.addAttribute("greetingRequest", new GreetingsRequestDto());
        model.addAttribute("updateNameRequest", new UpdateNameRequestDto());

        return "greeting";
    }


    // Create greeting

    @PostMapping("/greet")
    public String createGreeting(@Valid @ModelAttribute("greetingRequest") GreetingsRequestDto request,
					            BindingResult result,
					            HttpSession session) {

        Long userId = (Long) session.getAttribute("loggedInUserId");

        if(userId == null) {
            return "redirect:/login";
        }

        if(result.hasErrors()) {
            return "greeting";
        }

        greetingService.createGreeting(request, userService.getUserById(userId).getName());

        return "redirect:/history";
    }


    // History

    @GetMapping("/history")
    public String history(HttpSession session, Model model) {

        Long userId = (Long) session.getAttribute("loggedInUserId");

        if(userId == null) {
            return "redirect:/login";
        }

        model.addAttribute("greetings", greetingService.getAllGreetings());

        return "history";
    }


    // Delete all greetings

    @PostMapping("/history/delete")
    public String deleteAllGreetings(HttpSession session) {

        Long userId = (Long) session.getAttribute("loggedInUserId");

        if(userId == null) {
            return "redirect:/login";
        }

        greetingService.deleteAllGreetings();

        return "redirect:/history";
    }
}