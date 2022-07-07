package com.tt.careerplanner.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long student_id;
    private String first_name;
    private String last_name;
    private String email_address;
    private String account_password;
}
