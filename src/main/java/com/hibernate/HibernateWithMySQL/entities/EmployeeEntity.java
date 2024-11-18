package com.hibernate.HibernateWithMySQL.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

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

    @Column(nullable = false)
    private Integer contact;

    @Column(nullable = false)
    private int salary;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false) // Foreign key column
    @JsonIgnore
    private DepartmentEntity department;
}