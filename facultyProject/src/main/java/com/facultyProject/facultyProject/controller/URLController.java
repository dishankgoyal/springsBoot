package com.facultyProject.facultyProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class URLController {

     @GetMapping({"/", "/index"})
    public String index1(ModelMap model){
        //model.addAttribute("employee","hello");
        return "index";
    }
}
