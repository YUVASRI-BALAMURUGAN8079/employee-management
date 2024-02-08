package com.example.Input;

import lombok.Getter;
import lombok.Setter;


import java.sql.Date;

@Getter
@Setter
public class AadharInput {
    private Long aadharId;
    private Long employeeId;
    private String aadharNumber;
    private Date dob;
    private String name;
    private String address;
    private String gender;
}
