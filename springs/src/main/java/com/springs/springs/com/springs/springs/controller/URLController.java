package com.springs.springs.com.springs.springs.controller;

import com.springs.springs.hibernate.Employee;
import com.springs.springs.hibernate.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@Validated
public class URLController {
    @Autowired
    EmployeeServiceImpl empService;

    @GetMapping({"/", "/index"})
    public String index1(Model model){
    	System.out.println("hi");
    	System.out.println("get data");
        model.addAttribute("employee",new Employee());
        return "index";
    }

    @PostMapping("/result")
    public String result( @ModelAttribute Employee employee, BindingResult bindingResult){

        List<FieldError> errors = bindingResult.getFieldErrors();
        for (FieldError error : errors ) {
            System.out.println (error.getObjectName() + " - " +error.getDefaultMessage());
        }
        System.out.print(employee.getName()); //use a logger instead
        System.out.println("get data");
        empService.save(employee);
        System.out.print(bindingResult.toString());
        return "result"; //may want to return a different page name for clarity
    }
}
