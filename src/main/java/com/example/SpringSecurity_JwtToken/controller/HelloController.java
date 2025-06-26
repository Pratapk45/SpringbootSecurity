package com.example.SpringSecurity_JwtToken.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloo")
    public String firstApi(HttpServletRequest request){
        return "Welcome to Pratap "+request.getSession().getId();
    }
}
