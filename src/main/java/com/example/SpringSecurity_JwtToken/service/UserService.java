package com.example.SpringSecurity_JwtToken.service;

import com.example.SpringSecurity_JwtToken.modules.Users;
import com.example.SpringSecurity_JwtToken.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

        private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

        public Users register(Users user) {
            user.setPassword(encoder.encode(user.getPassword()));
            repo.save(user);
            return user;
        }

        public List<Users> getAllUser(){
            return repo.findAll();
        }
    }

