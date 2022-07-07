package com.tt.careerplanner.controller;

import com.tt.careerplanner.model.Form;
import com.tt.careerplanner.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/forms")
public class FormController {
    @Autowired
    FormService formService;

    public FormController(FormService formService) {
        this.formService = formService;
    }

    @PostMapping("/fill")
    public ResponseEntity saveFilledForm(@RequestBody Form form){
        return this.formService.saveForm(form);
    }
}
