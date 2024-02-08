package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="resignation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Resignation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name=" resignation_applied_date")
    private Date  resignationAppliedDate;

    @Column(name="reason")
    private String reason;

    @Column(name="feedback")
    private String feedback;

    @Column(name="final_working_day")
    private Date finalWorkingDate;

    @OneToOne
    @JoinColumn(name="emp_id")
    private Employee employee;

    public Resignation(Employee employee, Date resignationAppliedDate, String reason, String feedback, Date finalWorkingDate) {
        this.resignationAppliedDate = resignationAppliedDate;
        this.reason = reason;
        this.feedback = feedback;
        this.finalWorkingDate = finalWorkingDate;
        this.employee = employee;
    }
}
