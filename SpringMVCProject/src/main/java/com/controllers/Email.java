package com.controllers;


import com.DTO.EmailDTO;
import com.DTO.UserInfo;
import com.Service.EmailService;
import com.Service.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
public class Email {

    Logger logger= Logger.getLogger(Email.class.getName());

    @Autowired
    private EmailServiceImpl emailServiceImpl;
    @RequestMapping("/sendEmail")
    public String sendEmail( Model model)
    {

        model.addAttribute("emailDTO",new EmailDTO());
        return "sendEmail";
    }

    @RequestMapping("/processEmail")
    public String processEmail(@SessionAttribute("userinfo") UserInfo userInfo, @ModelAttribute("emailDTO") EmailDTO emailDTO)
    {
        try
        {
            emailServiceImpl.sendEmail(userInfo.getUrname(),userInfo.getCrname(),emailDTO.getUserEmail(),userInfo.getResult());
        }
        catch (Exception ex)
        {
            logger.info(">>>>>>>> ERROR >>>>>>>>>>" +
                    " " + ex.getMessage());

        }
        return "processedEmailPage";
    }
}
