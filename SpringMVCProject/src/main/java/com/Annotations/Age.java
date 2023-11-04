package com.Annotations;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME) //this annoatation class will convert into byte code
//and it will remain in the run time so jvm can use it
@Constraint(validatedBy = AgeValidator.class) //we are representing  the class where we wrote logics
public @interface Age
{
    String message() default "{invalidAgeMessage}"; //loading message from properties file
    int lower() default 18;
    int upper() default 60;

    //then we need 2 imp thing
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    //after this we need to create class where we can write logics



}
