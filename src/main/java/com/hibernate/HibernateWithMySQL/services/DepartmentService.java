package com.hibernate.HibernateWithMySQL.services;

import com.hibernate.HibernateWithMySQL.Repository.DepartmentRepository;
import com.hibernate.HibernateWithMySQL.Repository.EmployeeRepository;
import com.hibernate.HibernateWithMySQL.entities.DepartmentEntity;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    public DepartmentService(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository){
        this.departmentRepository = departmentRepository;
        this.employeeRepository   = employeeRepository;
    }



}
