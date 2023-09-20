package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//we have to declare is as @Controller to get scanned
//when ever /add is called front controller will cal this controller
@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("1")int i, @RequestParam("2")int j)
    {

        int k=i+j;
        System.out.println("answer is ="+ k );
        //this will create the object and used to send the calculation to the view
        ModelAndView mv=new ModelAndView();
        mv.setViewName("display.jsp");
        mv.addObject("obj",k);

        return mv;
    }
}
