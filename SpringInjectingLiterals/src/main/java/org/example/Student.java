package org.example;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    //we can use @Value here itself insted of xml
    @Value("${student.name}")

    private String name;

    @Value("${student.age}") //if we use here then no need setter injection
    private String age;

  //  @Value("${student.name}") //if we use here ,then stter method is called and used for injecting
    public void setName(String name) {
        this.name = name;
    }

    //@Value("${student.age}")
    //@Required // if we use required then we need to pass the values else it wont create the bean
    public void setAge(String age) {
        this.age = age;
    }
    public void display()
    {
        System.out.println("name "+ name);
        System.out.println("age "+ age);
    }
}
