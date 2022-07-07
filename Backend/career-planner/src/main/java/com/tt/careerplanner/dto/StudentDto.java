package com.tt.careerplanner.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="students")
public class StudentDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long student_id;

    @Column(length = 255)
    private String first_name;

    @Column(length = 255)
    private String last_name;

    @Column(length = 40)
    private String email_address;

    @Column(length = 40)
    private String account_password;
}
