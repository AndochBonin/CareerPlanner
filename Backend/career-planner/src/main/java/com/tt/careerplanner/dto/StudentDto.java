package com.tt.careerplanner.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="students")
public class StudentDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    @Column(length = 255)
    private String firstName;

    @Column(length = 255)
    private String lastName;

    @Column(length = 40)
    private String emailAddress;

    @Column(length = 40)
    private String accountPassword;
}
