package com.bjsxt.springbootexcepionandjunit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

    @RequestMapping("/showInfo")
    public String showInfo(){
        String str = null;
        str.length();
        return "ok";
    }

    @RequestMapping("/showInfo2")
    public String showInfo2(){
        int a = 10/0;
        return "ok";
    }


}
