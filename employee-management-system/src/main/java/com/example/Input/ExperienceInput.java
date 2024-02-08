package com.example.Input;

import com.example.entity.Employee;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
public class ExperienceInput {
    private Long experienceId;
    private Long employeeId;
    private String companyName;
    private String jobTitle;
    private Date dateOfJoining;
    private Date dateOfRelieving;
    private int experience;
    private String location;
    private String description;
}
