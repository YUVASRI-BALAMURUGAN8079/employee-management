package com.example.Input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalaryInput {
    private Long salaryId;
    private Long employeeId;
    private Long monthlyBasic;
    private Long monthlyHRA;
    private Long monthlySpecialAllowance;
    private Long annuallyBasic;
    private Long annuallyHRA;
    private Long annuallySpecialAllowance;
    private Long monthlyCTC;
    private Long annualCTC;
}
