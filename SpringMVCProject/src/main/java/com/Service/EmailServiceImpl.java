package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{
    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public void sendEmail(String userName,String crname,String userEmail, String result) {
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setTo(userEmail);
        simpleMailMessage.setSubject("Flames result");
        simpleMailMessage.setText("Hi "+userName +"\n" +
                "WE DID FLAMES FOR "+ userName + " and " +crname+" \n" +
                " The result is "+ result);



        javaMailSender.send(simpleMailMessage);

    }
}
