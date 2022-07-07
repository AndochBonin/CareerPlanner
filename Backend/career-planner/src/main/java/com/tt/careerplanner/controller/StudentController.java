package com.tt.careerplanner.controller;

import com.tt.careerplanner.model.Student;
import com.tt.careerplanner.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/signup")
    public ResponseEntity signupStudent(@RequestBody Student student){
        return studentService.signupStudent(student);
    }

}
