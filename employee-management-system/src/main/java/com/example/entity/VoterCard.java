package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="voter_card")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VoterCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="voter_id")
    private String voterId;

    @Column(name="name")
    private String name;

    @Column(name="father_name")
    private String fatherName;

    @Column(name="gender")
    private String gender;

    @Column(name="dob")
    private Date dob;

    @Column(name="address")
    private String address;

    @OneToOne
    @JoinColumn(name="emp_id")
    private Employee employee;

    public VoterCard(Employee employee, String voterId, String name, String fatherName, String gender, Date dob, String address) {
        this.voterId = voterId;
        this.name = name;
        this.fatherName = fatherName;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.employee = employee;
    }
}
