package com.controllers;


import com.DTO.UserRegistration;
import com.PropertyEditor.NamePropertyEditor;
import com.Validators.EmailValidator;
import com.Validators.UserNameValidator;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Registration {

    @RequestMapping("/register")
    public String showRegPage(@ModelAttribute("userRegistration") UserRegistration userRegistration)
    {
        return "register";
    }


    @RequestMapping("/reg")
    public String submitReg(@Valid @ModelAttribute("userRegistration") UserRegistration userRegistration ,BindingResult result)
    {
        if(result.hasErrors()) {
            for (ObjectError allError : result.getAllErrors()) {
                System.out.println(allError);
            }
            return "register";
        }
        return "registerSuccess";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        System.out.println("inside InitBinder");
       // binder.setDisallowedFields("name"); //this will disallow name field

        //when user entering the spaces without words it will considered as string
        //and databinding will happen to name="      " like this
        //in order to avoid this we use this
        StringTrimmerEditor editor=new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,"name",editor);

        //we created custom propertyEditor
        //to convert name to uppercase
        NamePropertyEditor namePropertyEditor=new NamePropertyEditor();
        binder.registerCustomEditor(String.class,"name",namePropertyEditor);


        //this is spring own validator we created in the name UserNameValidator
        UserNameValidator userNameValidator=new UserNameValidator();
        binder.addValidators(userNameValidator);

        //this is for email validation
        EmailValidator emailValidator=new EmailValidator();
        binder.addValidators(emailValidator);

    }
}
