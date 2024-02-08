package com.example.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="aadhar")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Aadhar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="aadhar_number")
    private String aadharNumber;

    @Column(name="date_of_birth")
    private Date dob;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="gender")
    private String gender;

    @OneToOne
    @JoinColumn(name="emp_id")
    private Employee employee;

    public Aadhar(Employee employee, String aadharNumber, Date dob, String name, String address, String gender) {
        this.aadharNumber = aadharNumber;
        this.dob = dob;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.employee = employee;
    }
}
