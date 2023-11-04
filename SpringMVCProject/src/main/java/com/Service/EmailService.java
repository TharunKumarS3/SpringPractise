package com.Service;

import com.DTO.EmailDTO;

public interface EmailService {
    public void sendEmail(String userName,String crname,String userEmail,String result);
}
