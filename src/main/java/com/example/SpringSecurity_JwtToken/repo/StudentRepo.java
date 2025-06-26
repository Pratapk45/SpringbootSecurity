package com.example.SpringSecurity_JwtToken.repo;

import com.example.SpringSecurity_JwtToken.modules.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student , Integer> {
}
