package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyCafeController {



    @RequestMapping("/wel")
    public ModelAndView wel()
    {
        String name="tharun";


        ModelAndView mv=new ModelAndView();
        mv.addObject("name",name);
        mv.setViewName("/WEB-INF/view/home.jsp");

        return mv;
    }

    @RequestMapping("/sub")
    public ModelAndView processOrder(@RequestParam("cafetype") String order)
    {
        System.out.println(order);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/WEB-INF/view/order.jsp");
        mv.addObject("order",order);
        return mv;

    }




}
