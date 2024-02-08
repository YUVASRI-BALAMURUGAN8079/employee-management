package com.example.Input;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EmployeeInput {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private Date dateOfJoining;
    private int yearOfService;
    private Long departmentId;
    private Long designationId;
    private Long modeId;
}
