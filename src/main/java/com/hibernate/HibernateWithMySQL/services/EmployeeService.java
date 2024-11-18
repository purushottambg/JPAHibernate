package com.hibernate.HibernateWithMySQL.services;

import com.hibernate.HibernateWithMySQL.Repository.EmployeeRepository;
import com.hibernate.HibernateWithMySQL.entities.EmployeeEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    public EmployeeEntity findEmployeeById(Long empId){         //find existing employee by id
        return employeeRepository.findById(empId).orElse(null);
    }

    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity){         //Create New Employee
        return employeeRepository.save(employeeEntity);
    }



}
