package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.checkerframework.checker.units.qual.A;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="driving_license")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DrivingLicense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="license_number")
    private String licenseNumber;

    @Column(name="name")
    private String name;
    @Column(name="dob")
    private Date dob;

    @Column(name="blood_group")
    private String bloodGroup;

    @Column(name="father_name")
    private String fatherName;

    @Column(name="date_of_issue")
    private Date dateOfIssue;

    @Column(name="valid_till")
    private Date validTill;

    @Column(name="address")
    private String address;

    @OneToOne
    @JoinColumn(name="emp_id")
    private Employee employee;


    public DrivingLicense(Employee employee, String licenseNumber, String name, Date dob, String bloodGroup, String fatherName, Date dateOfIssue, Date validTill, String address) {
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.dob = dob;
        this.bloodGroup = bloodGroup;
        this.fatherName = fatherName;
        this.dateOfIssue = dateOfIssue;
        this.validTill = validTill;
        this.address = address;
        this.employee = employee;
    }
}
