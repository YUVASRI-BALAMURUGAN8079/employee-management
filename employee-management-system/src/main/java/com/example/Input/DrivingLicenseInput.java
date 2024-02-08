package com.example.Input;

import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

@Getter
@Setter
public class DrivingLicenseInput {
    private Long id;
    private Long employeeId;
    private String licenseNumber;
    private String name;
    private Date dob;
    private String bloodGroup;
    private String fatherName;
    private Date dateOfIssue;
    private Date validTill;
    private String address;
}
