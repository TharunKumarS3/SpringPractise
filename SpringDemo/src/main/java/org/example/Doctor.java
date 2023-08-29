package org.example;


import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff{

//    private String doctor_name;//setting default values in xml by property tag
//    private String doctor_id; //setting by injecting via constructor-org
//
//
//
//    public Doctor(String doctor_id) {
//        this.doctor_id = doctor_id;
//    }
//    public String getDoctor_id() {
//        return doctor_id;
//    }
//
//    public void setDoctor_id(String doctor_id) {
//        this.doctor_id = doctor_id;
//    }
//
//    public String getDoctor_name() {
//        return doctor_name;
//    }
//
//    public void setDoctor_name(String doctor_name) {
//        this.doctor_name = doctor_name;
//    }

    public void assist()
    {
        System.out.println("Doctor assisting");
    }
}
