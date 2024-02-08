package com.example.Input;

import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

@Getter
@Setter
public class LeaveRequestInput {
    private Long id;
    private Long empId;
    private Date startDate ;
    private Date endDate;
    private String leaveType;
    private boolean approved;
    private int requestedDays;
}
