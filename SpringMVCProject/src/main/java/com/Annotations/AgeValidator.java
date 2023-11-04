package com.Annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

//we have to implement ConstraintValidator interface to write logics
public class AgeValidator implements ConstraintValidator<Age,Integer>
{
    //ConstraintValidator<Age,Integer> -> ConstraintValidator<Annoatation name,Type of that annoatation>

    private int lower;
    private int upper;
    @Override
    public void initialize(Age age) {
       //used for initalizing values
        this.lower=age.lower();
        this.upper=age.upper();


    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext constraintValidatorContext) {
        //write logic
        //age-> value entered by user
        if(age == null ||age<lower || age> upper)
        {
            return false;
        }




        return true;
    }

}
