package com.hibernate.HibernateWithMySQL.services;

import com.hibernate.HibernateWithMySQL.Repository.DepartmentRepository;
import com.hibernate.HibernateWithMySQL.entities.DepartmentEntity;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    public DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    public void createDepartment(DepartmentEntity departmentEntity){
        departmentRepository.save(departmentEntity);
    }

    public void getDepartmentById(Long departmentId){
        departmentRepository.getById(departmentId);
    }
}
