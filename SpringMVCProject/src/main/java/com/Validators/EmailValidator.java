package com.Validators;

import com.DTO.UserRegistration;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EmailValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return UserRegistration.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //logic

        //checking email conatins "2022@vitstudent.ac.in"
        //getting email form UserRegistration -> CommunicationDTO ->email
        String email=((UserRegistration)target).getCommunicationDTO().getEmail();
        if(!email.endsWith("2022@vitstudent.ac.in"))
        {
            //default message loaded from properties file
            errors.rejectValue("communicationDTO.email","email.invalidDomain");
        }


        //for this we are loading default message from properties file
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"communicationDTO.email","email.empty");


    }
}
