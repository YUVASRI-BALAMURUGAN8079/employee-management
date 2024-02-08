package com.example.entity;

import lombok.*;

import javax.persistence.*;
import java.time.Year;

@Entity
@Table(name="degree_and_certificate")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DegreeAndCertificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="degree")
    private String degree;

    @Column(name="specialization")
    private String specialization;

    @Column(name="year_of_joining")
    private Integer yearOfJoining;

    @Column(name="year_of_completion")
    private Integer yearOfCompletion;

    @Column(name="cgpa")
    private int cgpa;

    @Column(name="university_college")
    private String college;

    @ManyToOne
    @JoinColumn(name="emp_id")
    private Employee employee;

    public DegreeAndCertificate(Employee employee, String degree, String specialization, int yearOfJoining, int yearOfCompletion, int cgpa, String college) {
        this.degree = degree;
        this.specialization = specialization;
        this.yearOfJoining = yearOfJoining;
        this.yearOfCompletion = yearOfCompletion;
        this.cgpa = cgpa;
        this.college = college;
        this.employee = employee;
    }
}
