package com.example.entity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="date_of_joining")
    private Date dateOfJoining;

    @Column(name="year_of_service")
    private int yearOfService;

    @Column(name="working_status")
    private boolean workingStatus;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name="job_id")
    private Designation designation;

    @ManyToOne
    @JoinColumn(name="employement_mode_id")
    private Mode mode;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    private List<DegreeAndCertificate> degreeAndCertificates;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    private Aadhar aadhar;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    private Details details;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    private List<Experience> experiences;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    private DrivingLicense drivingLicense;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    private Pan pan;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    private PaymentInformation paymentInformation;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    private  ReportingTable singlereportingTable;

    @OneToMany(mappedBy = "reportingEmployee",cascade = CascadeType.ALL)
    private List<ReportingTable> reportingTable;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    private Salary salary;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    private VoterCard voterCard;

    @OneToMany(mappedBy="announcedEmployee")
    private List<Announcement> announcementByAnnouncedEmployee;

    @OneToMany(mappedBy="approvedEmployee")
    private List<Announcement> announcementByApprovedEmployee;

    @OneToMany(mappedBy="employee")
    private List<Event> events;

    @OneToOne(mappedBy = "employee")
    private LeaveBalance leaveBalance;

    @OneToMany(mappedBy="employee")
    private List<LeaveRequest> leaveRequest;

    @OneToOne(mappedBy = "employee")
    private Resignation resignation;

    public Employee(String firstName, String lastName, Date dateOfJoining,  Designation designation, Department department, Mode mode) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfJoining=dateOfJoining;
        this.department=department;
        this.designation=designation;
        this.mode=mode;
    }
}
