package com.example.Input;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class DetailsInput {
    private Long detailsId;
    private Long employeeId;
    private String name;
    private String gender;
    private Date dob;
    private String maritalStatus;
    private String bloodGroup;
    private boolean physicallyChallenged;
    private String workEmail;
    private String personalEmail;
    private Long mobilePhone;
    private String currentAddress;
    private String permanentAddress;
    private String password;
}
