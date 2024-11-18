package com.hibernate.HibernateWithMySQL.controller;

import com.hibernate.HibernateWithMySQL.Repository.DepartmentRepository;
import com.hibernate.HibernateWithMySQL.entities.DepartmentEntity;
import com.hibernate.HibernateWithMySQL.services.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
public class DepartmentController {
    private final DepartmentService departmentService;  //Dependency Injection

    public DepartmentController(DepartmentService departmentService){
        this.departmentService=departmentService;
    }

    @PostMapping
    public DepartmentEntity createNewDepartment(@RequestBody DepartmentEntity departmentEntity){
         return departmentService.createNewDepartment(departmentEntity);
    }
}
