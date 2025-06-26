package com.example.SpringSecurity_JwtToken.controller;

import com.example.SpringSecurity_JwtToken.modules.Users;
import com.example.SpringSecurity_JwtToken.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService service;


    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return service.register(user);

    }

    @GetMapping("/alluser")
    public List<Users> getAllUsers(){
        return service.getAllUser();
    }
}
