package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.checkerframework.checker.units.qual.C;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="payment_information")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="payment_id")
    private Long id;

    @Column(name="salary_payment_mode")
    private String salaryPaymentMode;

    @Column(name="bank_name")
    private String bankName;

    @Column(name="account_number")
    private String accountNumber;

    @Column(name="ifsc_code")
    private String ifscCode;

    @Column(name="name_of_the_account")
    private String nameOfTheAccount;

    @Column(name="PF_status")
    private boolean pfStatus;

    @Column(name="PF_number")
    private String pfNumber;

    @Column(name="PF_join_date")
    private Date pfJoinDate;

    @Column(name="name_on_the_PF_account")
    private String nameOnThePFAccount;

    @OneToOne
    @JoinColumn(name="emp_id")
    private Employee employee;

    public PaymentInformation(Employee employee, String salaryPaymentMode, String bankName, String accountNumber, String ifscCode, String nameOfTheAccount, boolean pfStatus, String pfNumber, Date pfJoinDate, String nameOnThePFAccount) {
        this.salaryPaymentMode = salaryPaymentMode;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.nameOfTheAccount = nameOfTheAccount;
        this.pfStatus = pfStatus;
        this.pfNumber = pfNumber;
        this.pfJoinDate = pfJoinDate;
        this.nameOnThePFAccount = nameOnThePFAccount;
        this.employee = employee;
    }
}
