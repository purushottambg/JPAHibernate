package com.hibernate.HibernateWithMySQL.services;

import com.hibernate.HibernateWithMySQL.Repository.DepartmentRepository;
import com.hibernate.HibernateWithMySQL.Repository.EmployeeRepository;
import com.hibernate.HibernateWithMySQL.entities.DepartmentEntity;
import com.hibernate.HibernateWithMySQL.entities.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    public DepartmentService(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository){
        this.departmentRepository = departmentRepository;
        this.employeeRepository   = employeeRepository;
    }


    public DepartmentEntity createNewDepartment(DepartmentEntity departmentEntity) { //This is the service which can process the data
        return departmentRepository.save(departmentEntity);
    }

    public DepartmentEntity findDepartmentById(Long deptId){    //ShowDepartment details by ID
        return departmentRepository.findById(deptId).orElse(null);
    }
    public List<DepartmentEntity> findAllDeps(){
        return departmentRepository.findAll();
    }

    public DepartmentEntity assignEmployeeToDepartment(Long empId, Long deptId){
        Optional<DepartmentEntity> departmentEntity =departmentRepository.findById(deptId);
        Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(empId);

        return departmentEntity.flatMap(
                department -> employeeEntity.map(employee->
                {employee.setDepartment(department);
                department.getEmployees().add(employee);
                return department;
                }
                )
        ).orElse(null);
    }
}
