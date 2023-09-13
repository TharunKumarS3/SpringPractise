package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        DBConn conn=context.getBean(DBConn.class);
        conn.disp();
        conn.getConn();




    }
}