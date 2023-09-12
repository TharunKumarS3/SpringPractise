package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        Human human=context.getBean(Human.class);
//        human.cheeckAlive();

        //for @Autowired
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        HumanAutowired human=context.getBean(HumanAutowired.class);
        human.cheeckAlive();


    }
}