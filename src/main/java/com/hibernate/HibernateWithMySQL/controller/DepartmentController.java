package com.hibernate.HibernateWithMySQL.controller;

import com.hibernate.HibernateWithMySQL.Repository.DepartmentRepository;
import com.hibernate.HibernateWithMySQL.entities.DepartmentEntity;
import com.hibernate.HibernateWithMySQL.services.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/departments")
public class DepartmentController {
    private final DepartmentService departmentService;  //Dependency Injection

    public DepartmentController(DepartmentService departmentService){
        this.departmentService=departmentService;
    }

    @GetMapping(path = "/welcome")
    public String greetingsPage(){
        return "Hello Visitor, You're welcome to the Puru's Java World!!";
    }

    @GetMapping(path = "/{deptId}")
    public DepartmentEntity getDepartmentByID(@PathVariable Long deptId){
        return departmentService.findDepartmentById(deptId);
    }

    @PostMapping
    public DepartmentEntity createNewDepartment(@RequestBody DepartmentEntity departmentEntity){
         return departmentService.createNewDepartment(departmentEntity);
    }

}
