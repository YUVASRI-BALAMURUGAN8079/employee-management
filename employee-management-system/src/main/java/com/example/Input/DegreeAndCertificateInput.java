package com.example.Input;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DegreeAndCertificateInput {
    private Long id;
    private Long employeeId;
    private String degree;
    private String specialization;
    private Integer yearOfJoining;
    private Integer yearOfCompletion;
    private int cgpa;
    private String college;
}
