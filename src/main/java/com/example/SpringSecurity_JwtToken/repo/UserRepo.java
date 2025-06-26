package com.example.SpringSecurity_JwtToken.repo;

import com.example.SpringSecurity_JwtToken.modules.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
