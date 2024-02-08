package com.example.Input;

import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

@Getter
@Setter
public class VoterCardInput {
    private Long Id;
    private Long employeeId;
    private String voterId;
    private String name;
    private String fatherName;
    private String gender;
    private Date dob;
    private String address;
}
