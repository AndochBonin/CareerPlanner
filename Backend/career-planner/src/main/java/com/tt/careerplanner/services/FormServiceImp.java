package com.tt.careerplanner.services;

import com.tt.careerplanner.dto.FormDto;
import com.tt.careerplanner.model.Form;
import com.tt.careerplanner.repositories.FormRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FormServiceImp implements FormService{
    @Autowired
    private FormRepository formRepository;

    public FormServiceImp(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    @Override
    public ResponseEntity saveForm(Form form) {
        FormDto formDto = new FormDto();

        BeanUtils.copyProperties(form,formDto);

        formRepository.save(formDto);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
