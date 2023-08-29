package org.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@Scope(scopeName = "prototype") //for prototype scope
public class Patient implements BeanNameAware {
    private String patient_name;

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    @Override
    public void setBeanName(String s) {
        //LIFECYCLE OF THE BEAN
        //it will be called before bean creation
        System.out.println("bean name is called");
    }
    @PostConstruct
    public void postConstruct()
    {
        //LIFECYCLE OF THE BEAN
        //it will be called before bean creation
        System.out.println("post construct is called");
    }
}
