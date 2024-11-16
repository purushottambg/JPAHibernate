package com.hibernate.HibernateWithMySQL.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String departmentDesc;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false) // Foreign key column
    private DepartmentEntity department;
}