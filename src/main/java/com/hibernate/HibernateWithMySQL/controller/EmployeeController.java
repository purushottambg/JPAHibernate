package com.hibernate.HibernateWithMySQL.controller;

import com.hibernate.HibernateWithMySQL.entities.EmployeeEntity;
import com.hibernate.HibernateWithMySQL.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
    @GetMapping(path = "/welcome")
    public String greetingsPage(){
        return "Hello Visitor, You're welcome to the Puru's Java World!!";
    }

    @GetMapping(path = "/{empId}")
    public EmployeeEntity getEmployeeById(@PathVariable Long empId){
        return employeeService.findEmployeeById(empId);
    }

    @PostMapping
    public EmployeeEntity createNewEmployee(@RequestParam EmployeeEntity employeeEntity){
        return employeeService.createNewEmployee(employeeEntity);
    }



}
