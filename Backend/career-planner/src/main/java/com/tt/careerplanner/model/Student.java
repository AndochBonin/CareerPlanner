package com.tt.careerplanner.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long studentId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String accountPassword;
}
