package com.tt.careerplanner.services;
import com.tt.careerplanner.model.Student;
import org.springframework.http.ResponseEntity;

public interface StudentService {

    ResponseEntity signupStudent(Student student);
}
