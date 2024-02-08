package com.example.Input;

import javax.persistence.Column;

public class LeaveBalanceInput {
    private Long id;
    private Long employeeId;
    private int totalWorkFromHome;
    private int totalCasualLeave;
    private int totalMarriageLeave;
    private int totalSickLeave;
    private int totalPaidLeave;
    private int totalFloaterLeave;
    private int totalWorkFromHomeTaken;
    private int totalCasualLeaveTaken;
    private int total_marriage_leave_taken;
    private int totalSickLeaveTaken;
    private int totalPaidLeaveTaken;
    private int totalFloaterLeaveTaken;
    private int  availableWorkFromHome;
    private int  availableCasualLeave;
    private int availableMarriageLeave;
    private int availableSickLeave;
    private int availableUnpaidLeave;
    private int availableFloaterLeave;
    private int unpaidLeave;
    private int totalLeave ;
    private int totalLeaveTaken ;
    private int totalLeaveAvailable ;
}
