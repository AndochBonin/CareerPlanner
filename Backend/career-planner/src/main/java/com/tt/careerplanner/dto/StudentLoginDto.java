
package com.tt.careerplanner.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class StudentLoginDto {
    @Column(length = 40)
    private String emailAddress;
    @Column(length = 40)
    private String accountPassword;
}