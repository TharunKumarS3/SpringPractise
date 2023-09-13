package org.example;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
    @Value("${conn.user}")
    private String user;
    @Value("${conn.pass}")
    private String pass;
    @Value("${conn.url}")
    private String url;
    @Value("${conn.name}")
    private String name;

    public  void disp()
    {
        System.out.println("name "+name);
        System.out.println("url "+url);
        System.out.println("user "+user);
        System.out.println("pass "+pass);
    }
    public void getConn() throws SQLException, ClassNotFoundException {

        Connection connection=DriverManager.getConnection(url,user,pass);
        System.out.println("successfull "+ connection);

    }

}
