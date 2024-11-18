package com.hibernate.HibernateWithMySQL.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class EmployeeController {
    private final EmployeeController employeeController;

    public EmployeeController(EmployeeController employeeController){
        this.employeeController=employeeController;
    }


}
