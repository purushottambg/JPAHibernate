package com.hibernate.HibernateWithMySQL.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.List;

@Entity
@Data
@Table(name = "DepartmentTable")
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    @Column
    private String title;

    @OneToOne
    @JoinColumn(name = "manager", referencedColumnName = "empID")
    private EmployeeEntity manger;

    @Column
    private EmployeeEntity workers;
}
