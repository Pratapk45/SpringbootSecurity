package com.example.SpringSecurity_JwtToken.controller;

import com.example.SpringSecurity_JwtToken.dao.StudentDao;
import com.example.SpringSecurity_JwtToken.modules.Student;
import com.example.SpringSecurity_JwtToken.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");

    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody StudentDao studentDao) {

        return studentService.addStudent(studentDao);
    }

    @GetMapping("/get")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    //    private List<Student> students = new ArrayList<>(
//            List.of(
//                    new Student(1, "Navin", 60),
//                    new Student(2, "Kiran", 65)
//            ));

//
//    @GetMapping("/students")
//    public List<Student> getStudents() {
//        return students;
//    }
}
