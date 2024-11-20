package com.hibernate.HibernateWithMySQL.controller;

import com.hibernate.HibernateWithMySQL.entities.EmployeeEntity;
import com.hibernate.HibernateWithMySQL.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

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
    @GetMapping(path = "/all")
    public List<EmployeeEntity> findAllEmps(){
        return employeeService.findEmployees();
    }

    @PostMapping
    public ResponseEntity<EmployeeEntity> createNewEmployee(@RequestBody EmployeeEntity employeeEntity){
        if(employeeEntity.getDepartment()==null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Department can't be null");
        }
        return ResponseEntity.ok(employeeService.createNewEmployee(employeeService.createNewEmployee(employeeEntity)));
    }
}