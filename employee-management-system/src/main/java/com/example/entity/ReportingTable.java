package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="reporting_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReportingTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="emp_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name="reporting_to_emp_id")
    private Employee reportingEmployee;

    public ReportingTable(Employee reportingEmployee, Employee reportingManager) {
        this.employee = reportingEmployee;
        this.reportingEmployee = reportingManager;
    }
}
