package com.tt.careerplanner.dto;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="forms")
public class FormDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long responseId;

    @Column(length = 3)
    private String responseDescription;
}
