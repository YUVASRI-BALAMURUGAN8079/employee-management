package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.checkerframework.checker.units.qual.A;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="details")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="gender")
    private String gender;

    @Column(name="dob")
    private Date dob;

    @Column(name="marital_status")
    private String maritalStatus;

    @Column(name="blood_group")
    private String bloodGroup;

    @Column(name="physically_challenged")
    private boolean physicallyChallenged;

    @Column(name="work_email")
    private String workEmail;

    @Column(name="personal_email")
    private String personalEmail;

    @Column(name="mobile_phone")
    private Long mobilePhone;

    @Column(name="current_address")
    private String currentAddress;

    @Column(name="permanent_address")
    private String permanentAddress;

    @Column(name="password")
    private String password;


    @OneToOne
    @JoinColumn(name="emp_id")
    private Employee employee;


    public Details(Employee employee, String name, String gender, Date dob, String maritalStatus, String bloodGroup, boolean physicallyChallenged, String workEmail, String personalEmail, Long mobilePhone, String currentAddress, String permanentAddress,String password) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.maritalStatus = maritalStatus;
        this.bloodGroup = bloodGroup;
        this.physicallyChallenged = physicallyChallenged;
        this.workEmail = workEmail;
        this.personalEmail = personalEmail;
        this.mobilePhone = mobilePhone;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
        this.employee = employee;
        this.password=password;
    }
}
