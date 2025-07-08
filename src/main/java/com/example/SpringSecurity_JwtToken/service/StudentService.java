package com.example.SpringSecurity_JwtToken.service;

import com.example.SpringSecurity_JwtToken.dao.StudentDao;
import com.example.SpringSecurity_JwtToken.modules.Student;
import com.example.SpringSecurity_JwtToken.modules.Users;
import com.example.SpringSecurity_JwtToken.repo.StudentRepo;
import com.example.SpringSecurity_JwtToken.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private UserRepo userRepo;



    public Student addStudent(StudentDao studentDao) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName(); // this is the logged-in username
        Users user = userRepo.findByUsername(username);

        Student student = new Student();
        student.setName(user.getUsername());
        student.setMarks(studentDao.getMarks());
        return studentRepo.save(student);
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }
}
