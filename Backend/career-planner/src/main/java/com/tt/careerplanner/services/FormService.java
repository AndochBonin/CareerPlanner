package com.tt.careerplanner.services;
import com.tt.careerplanner.dto.FormDto;
import com.tt.careerplanner.model.Form;
import org.springframework.http.ResponseEntity;

public interface FormService {
    public ResponseEntity saveForm(Form form);
}
