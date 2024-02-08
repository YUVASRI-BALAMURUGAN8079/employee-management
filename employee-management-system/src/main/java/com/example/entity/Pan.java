package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="pan")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="pan_number")
    private String panNumber;

    @Column(name="name")
    private String name;

    @Column(name="date_of_birth")
    private Date dob;

    @Column(name="parent_or_spouse_name")
    private String parentOrSpouseName;

    @OneToOne
    @JoinColumn(name="emp_id")
    private Employee employee;

    public Pan(Employee employee, String panNumber, String name, Date dob, String parentOrSpouseName) {
        this.panNumber = panNumber;
        this.name = name;
        this.dob = dob;
        this.parentOrSpouseName = parentOrSpouseName;
        this.employee = employee;
    }
}
