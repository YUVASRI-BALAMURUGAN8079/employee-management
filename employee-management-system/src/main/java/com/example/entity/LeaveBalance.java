package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.checkerframework.checker.units.qual.C;

import javax.persistence.*;

@Entity
@Table(name="leave_balance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LeaveBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="leave_id")
    private Long id;

    @Column(name="total_work_from_home")
    private int totalWorkFromHome;

    @Column(name="total_casual_leave")
    private int totalCasualLeave;

    @Column(name="total_marriage_leave")
    private int totalMarriageLeave;

    @Column(name="total_sick_leave")
    private int totalSickLeave;

    @Column(name="total_paid_leave")
    private int totalPaidLeave;

    @Column(name="total_floater_leave")
    private int totalFloaterLeave;

    @Column(name="total_work_from_home_taken")
    private int totalWorkFromHomeTaken;

    @Column(name="total_casual_leave_taken")
    private int totalCasualLeaveTaken;

    @Column(name="total_marriage_leave_taken")
    private int totalMarriageLeaveTaken;


    @Column(name="total_sick_leave_taken")
    private int totalSickLeaveTaken;

    @Column(name="total_paid_leave_taken")
    private int totalPaidLeaveTaken;

    @Column(name="total_floater_leave_taken")
    private int totalFloaterLeaveTaken;

    @Column(name="available_work_from_home")
    private int  availableWorkFromHome;

    @Column(name="available_casual_leave")
    private int  availableCasualLeave;

    @Column(name="available_marriage_leave")
    private int availableMarriageLeave;

    @Column(name="available_sick_leave")
    private int availableSickLeave;

    @Column(name="available_paid_leave")
    private int availablePaidLeave;

    @Column(name="available_floater_leave")
    private int availableFloaterLeave;

    @Column(name="unpaid_leave")
    private int unpaidLeave;

    @Column(name="total_leave")
    private int totalLeave ;

    @Column(name="total_leave_taken")
    private int totalLeaveTaken ;

    @Column(name="total_leave_available")
    private int totalLeaveAvailable ;

    @OneToOne
    @JoinColumn(name="emp_id")
    private Employee employee;
}
