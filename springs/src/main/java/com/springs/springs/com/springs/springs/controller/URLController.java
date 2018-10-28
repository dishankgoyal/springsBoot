package com.springs.springs.com.springs.springs.controller;

import com.springs.springs.hibernate.Employee;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class URLController {
    @GetMapping({"/", "/index"})
    public String index1(Model model){
        model.addAttribute("employee",new Employee());
        return "index";
    }

    @PostMapping("/result")
    public String result(@ModelAttribute Employee employee){
        System.out.print(employee.getName()); //use a logger instead
        return "result"; //may want to return a different page name for clarity
    }
}
