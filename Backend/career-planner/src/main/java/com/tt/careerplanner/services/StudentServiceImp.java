package com.tt.careerplanner.services;
import com.tt.careerplanner.CareerPlannerApplication;
import com.tt.careerplanner.dto.StudentDto;
import com.tt.careerplanner.dto.StudentLoginDto;
import com.tt.careerplanner.model.Student;
import com.tt.careerplanner.repositories.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public ResponseEntity signupStudent(Student student) {
        StudentDto studentDto = new StudentDto();

        BeanUtils.copyProperties(student,studentDto);

        studentRepository.save(studentDto);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }


    @Override
    public ResponseEntity loginStudent(Student student) {

        //BeanUtils.copyProperties(studentLoginDto,studentDto);

        Optional<StudentDto> retrievedStudentDto = studentRepository.findByEmailAddress(student.getEmailAddress());

        if(retrievedStudentDto.isPresent()){
            if(retrievedStudentDto.get().getAccountPassword().equals(student.getAccountPassword())){
                return new ResponseEntity(HttpStatus.ACCEPTED);
            }
            return new ResponseEntity(HttpStatus.ALREADY_REPORTED);
        }

        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

}
