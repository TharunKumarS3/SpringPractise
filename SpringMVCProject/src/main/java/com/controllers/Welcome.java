package com.controllers;


import com.DTO.UserInfo;
import com.Service.FlamesService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userinfo") //we can store only model objects
// we can store multiple objects
//@SessionAttributes() wont work if this is present @ModelAttribute("name")
public class Welcome {
    @Autowired
    private FlamesService flamesService;

    @RequestMapping("/")
    public String wel(Model model, HttpServletRequest request)
    {
        //instead of creating Model model below code we used @ModelAttrbute it works same as below
//        UserInfo userInfo=new UserInfo();
//        model.addAttribute("userinfo",userInfo);

        //checking whether user already visted our website by getting cookies
        //but this not convenient to do everytime search for cookies
        //we have @CookieValue("cooiename") by spring to get cookie
//        Cookie[] cookies=request.getCookies();
//        for(Cookie cook : cookies)
//        {
//            if(cook.getName().equals("CookurName"))
//            {
//                String urname=cook.getValue();
//                userInfo.setUrname(urname);
//            }
//        }
        model.addAttribute("userinfo",new UserInfo());
        return "welcome";
    }

    @RequestMapping("/cal")
    //we just created the obj of UserInfo class to inject all the values to the respective
    //-- attributes automatically by spring
    //this is called data binding
    public String showResult(Model model ,@Valid  UserInfo userInfo, BindingResult resultt,HttpSession session,HttpServletRequest request)
    {
           // @Valid will trigger validaton to the UserInfo databinding
            //validation result will be stored in BindingResult


        //we are not able to use @ModelAttribute because of @SessionAttributes
        //so we are going with Model model
        model.addAttribute("userinfo",userInfo);
        model.addAttribute(BindingResult.MODEL_KEY_PREFIX+"userinfo",resultt);
        if(resultt.hasErrors())
        {
            for (ObjectError allError : resultt.getAllErrors()) {
                System.out.println(allError);
            }

            return "welcome";
        }

//        //adding cookie to store username
//        Cookie cookie=new Cookie("CookurName",userInfo.getUrname());
//        cookie.setMaxAge(60*60*24);
//        response.addCookie(cookie);


//        //creating session
//        session=request.getSession();
//        session.setAttribute("urName",userInfo.getUrname());
//        session.setMaxInactiveInterval(120);


        String res=flamesService.calculateLove(userInfo.getUrname(),userInfo.getCrname());
        userInfo.setResult(res);

        return "resultpage";

    }
}
