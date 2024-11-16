package com.hibernate.HibernateWithMySQL.Repository;

import com.hibernate.HibernateWithMySQL.entities.DepartmentEntity;
import com.hibernate.HibernateWithMySQL.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {     //Body Starts here

}
