package com.facultyProject.faculty_project.service;

import com.facultyProject.faculty_project.dao.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private LoginServiceImpl loginServiceImpl;
    public void save(Login login){
         loginServiceImpl.save(login);

    }

    public Boolean loginChcek(Login login){
       /* List<Login> rLogin = loginServiceImpl.fetchByLoginId(login.getLoginId(),login.getPassword());
        System.out.println(rLogin.toString());*/
        return true;
    }
}
