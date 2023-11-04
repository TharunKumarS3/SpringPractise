package com.Validators;


import com.DTO.UserRegistration;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//we are using spring's own validator
public class UserNameValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        //checks if the UserNameValidator.class supports a given object

        return UserRegistration.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //logic here
        // object -> belongs to UserRegisteration.class
        //in support method above confirmed that it belngs to that class

        //we are checking username values should have "_ "
        String userName=((UserRegistration)target).getUserName();
        if(!userName.contains("_"))
        {
            errors.rejectValue("userName","userName.invalid","* must contains '_'");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userName","userName.empty","* cannot be empty");
    }
}
