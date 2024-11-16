package com.hibernate.HibernateWithMySQL.Repository;

import com.hibernate.HibernateWithMySQL.entities.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long>{  //Body starts here

}
