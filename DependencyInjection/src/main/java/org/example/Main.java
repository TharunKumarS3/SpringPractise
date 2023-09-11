package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //we are not doing normal way like Student s=new Student()
        //spring will help us to create automativally
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Student st1=context.getBean(Student.class);
        st1.startCheat();
        Student2 st2=context.getBean(Student2.class);
        st1.startCheat();



    }
}