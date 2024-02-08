package com.example.Input;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class PanInput {
    private Long panId;
    private Long employeeId;
    private String panNumber;
    private String name;
    private Date dob;
    private String parentOrSpouseName;
}
