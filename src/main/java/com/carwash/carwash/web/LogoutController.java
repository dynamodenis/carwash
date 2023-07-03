package com.carwash.carwash.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {
    @RequestMapping(value={"/", "index.html"})
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        //modelAndView.addObject("name", "Ford Mustang");
        modelAndView.setViewName("logout");

        return modelAndView;
    }
}
