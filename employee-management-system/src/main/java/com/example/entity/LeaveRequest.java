package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="leave_request")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="start_date")
    private Date startDate ;

    @Column(name="end_date")
    private Date endDate;

    @Column(name="leave_type")
    private String leaveType;

    @Column(name="no_of_days")
    private int requestedDays;

    @ManyToOne
    @JoinColumn(name="emp_id")
    private Employee employee;

    public LeaveRequest(Date startDate, Date endDate, String leaveType,  int requestedDays, Employee employee) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.leaveType = leaveType;
        this.requestedDays = requestedDays;
        this.employee = employee;
    }
}
