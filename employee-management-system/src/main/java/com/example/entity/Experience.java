package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="experience")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="company_name")
    private String companyName;

    @Column(name="job_title")
    private String jobTitle;

    @Column(name="date_of_joining")
    private Date dateOfJoining;

    @Column(name="date_of_relieving")
    private Date dateOfRelieving;

    @Column(name="experience")
    private int experience;

    @Column(name="location")
    private String location;

    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name="emp_id")
    private Employee employee;

    public Experience(Employee employee, String companyName, String jobTitle, Date dateOfJoining, Date dateOfRelieving, String location, String description) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.dateOfJoining = dateOfJoining;
        this.dateOfRelieving = dateOfRelieving;
        this.location = location;
        this.description = description;
        this.employee = employee;
    }
}
