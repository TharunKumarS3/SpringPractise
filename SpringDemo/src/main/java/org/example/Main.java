package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

          ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//            Doctor doc=context.getBean(Doctor.class);
//            doc.assist();
//
//
//            ApplicationContext con2=new ClassPathXmlApplicationContext("spring.xml");
//            Nurse nurse=con2.getBean(Nurse.class);
//            nurse.assist();

        //INTERFACE
//        Staff staff=context.getBean(Doctor.class);
//        staff.assist();
//        Staff staff2=context.getBean(Nurse.class);
//        staff2.assist();

//        //setting values in xml by injecting
//        Doctor doctor=context.getBean(Doctor.class);
//        System.out.println("doctor name " +doctor.getDoctor_name());
//        //getting by constructor-org
//        System.out.println("doctor id "+ doctor.getDoctor_id());


        //ANNOATATION CONFIGURATION
//        Doctor doctor=context.getBean(Doctor.class);
//        doctor.assist();

        //SINGLETON SCOPE

//


        Patient patient=context.getBean(Patient.class);
        patient.setPatient_name("kumar");
        System.out.println(patient.getPatient_name());
          Patient patient1 =context.getBean(Patient.class);
          System.out.println(patient1.getPatient_name());
//
        //PROTOTYPE SCOPE
//
//         Patient patient=context.getBean(Patient.class);
//         patient.setPatient_name("kumar");
//         System.out.println(patient.getPatient_name());
//
//         Patient patient1 =context.getBean(Patient.class);
//        System.out.println(patient1.getPatient_name());
        }

}