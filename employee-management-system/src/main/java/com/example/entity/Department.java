package com.example.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="department")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="introduced_date")
    private Date date;

    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private List<Employee> employee;

    public Department(String departmentName) {
        this.name=departmentName;
    }
}
