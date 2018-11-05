package com.springs.springs.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeRepository empResp;

    public void save(@Valid Employee emp){
        empResp.save(emp);
    }

}
