package com.example.SpringSecurity_JwtToken.service;

import com.example.SpringSecurity_JwtToken.modules.Student;
import com.example.SpringSecurity_JwtToken.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }
}
