package com.facultyProject.faculty_project.controller;

import com.facultyProject.faculty_project.dao.Login;
import com.facultyProject.faculty_project.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller

public class URLController {

    @Autowired
    LoginService loginService;

    @GetMapping({"/", "/index"})
    public String index1(ModelMap model){
       model.addAttribute("login",new Login());
        return "index";
    }

    @PostMapping("/adminDashBoard")
    public String adminDashBoard(@ModelAttribute @Valid Login login,BindingResult bindingResult, @ModelAttribute Boolean htmlResult){
        if(bindingResult.hasErrors()){
            return "index";
        }

        else{
            boolean result=loginService.loginChcek(login);
            if(result){
            return "adminDashBoard";}
            else{
                htmlResult=false;
                return "index";
            }
        }
    }
}
