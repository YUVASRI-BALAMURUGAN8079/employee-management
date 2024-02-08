package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="salary")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="salary_id")
    private Long id;

    @Column(name="Monthly_Basic")
    private Long monthlyBasic;

    @Column(name="Monthy_HRA")
    private Long monthlyHRA;

    @Column(name="Monthy_Special_Allowance")
    private Long monthlySpecialAllowance;

    @Column(name="Annually_Basic")
    private Long annuallyBasic;

    @Column(name="Annually_HRA")
    private Long annuallyHRA;

    @Column(name="Annually_Special_Allowance")
    private Long annuallySpecialAllowance;

    @Column(name="Monthly_CTC")
    private Long monthlyCTC;

    @Column(name="Annual_CTC")
    private Long annualCTC;

    @OneToOne
    @JoinColumn(name="emp_id")
    private Employee employee;

    public Salary(Employee employee, Long monthlyBasic, Long monthlyHRA, Long monthlySpecialAllowance, Long annuallyBasic, Long annuallyHRA, Long annuallySpecialAllowance, Long monthlyCTC, Long annualCTC) {
        this.monthlyBasic = monthlyBasic;
        this.monthlyHRA = monthlyHRA;
        this.monthlySpecialAllowance = monthlySpecialAllowance;
        this.annuallyBasic = annuallyBasic;
        this.annuallyHRA = annuallyHRA;
        this.annuallySpecialAllowance = annuallySpecialAllowance;
        this.monthlyCTC = monthlyCTC;
        this.annualCTC = annualCTC;
        this.employee = employee;
    }
}
