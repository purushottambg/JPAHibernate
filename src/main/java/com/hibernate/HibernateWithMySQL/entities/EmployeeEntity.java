package com.hibernate.HibernateWithMySQL.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Table(name = "EmployeeTable")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empID;

    @Column
    private String name;

    @Column
    private List<DepartmentEntity> department;

    @Column
    private String departmentDesc;

}
