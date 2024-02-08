package com.example.Input;

import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

@Setter
@Getter
public class ResignationInput {
    private Long id;
    private Long employeeId;
    private Date resignationAppliedDate;
    private String reason;
    private String feedback;
    private Date finalWorkingDate;
}
