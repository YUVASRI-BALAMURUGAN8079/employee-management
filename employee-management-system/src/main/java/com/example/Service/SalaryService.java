package com.example.Service;

import com.example.Input.SalaryInput;
import com.example.entity.Employee;
import com.example.entity.Salary;
import com.example.repository.EmployeeRepository;
import com.example.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {
    private SalaryRepository salaryRepository;
    private EmployeeRepository employeeRepository;

    @Autowired
    public SalaryService(SalaryRepository salaryRepository,EmployeeRepository employeeRepository) {
        this.salaryRepository = salaryRepository;
        this.employeeRepository=employeeRepository;
    }
    public List<Salary> findAllSalary(){return salaryRepository.findAll();}
    public Salary findSalaryByEmployeeId(Long id){
        return salaryRepository.findByEmployeeId(id);
    }

    public Salary addSalary(SalaryInput salaryInput)
    {
        Long employeeId=salaryInput.getEmployeeId();
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()->new IllegalArgumentException("Invalid Employee Id"));
        Long monthlyBasic=salaryInput.getMonthlyBasic();
        Long monthlyHRA=salaryInput.getMonthlyHRA();
        Long monthlySpecialAllowance=salaryInput.getMonthlySpecialAllowance();
        Long annuallyBasic=salaryInput.getAnnuallyBasic();
        Long annuallyHRA=salaryInput.getAnnuallyHRA();
        Long annuallySpecialAllowance=salaryInput.getAnnuallySpecialAllowance();
        Long monthlyCTC=salaryInput.getMonthlyCTC();
        Long annualCTC=salaryInput.getAnnualCTC();
        Salary newSalary=new Salary(employee, monthlyBasic,monthlyHRA,monthlySpecialAllowance,annuallyBasic,annuallyHRA,annuallySpecialAllowance,monthlyCTC,annualCTC);
        return salaryRepository.save(newSalary);
    }

    public Salary updateSalaryByEmployeeId(SalaryInput salaryInput){
        Salary salary=salaryRepository.findByEmployeeId(salaryInput.getEmployeeId());
        if(salary!=null){
            if(salaryInput.getMonthlyBasic()!=null)salary.setMonthlyBasic(salaryInput.getMonthlyBasic());
            if(salaryInput.getMonthlyHRA()!=null)salary.setMonthlyHRA(salaryInput.getMonthlyHRA());
            if(salaryInput.getMonthlySpecialAllowance()!=null)salary.setMonthlySpecialAllowance(salaryInput.getMonthlySpecialAllowance());
            if(salaryInput.getMonthlyBasic()!=null)salary.setAnnuallyBasic(salaryInput.getMonthlyBasic()*12);
            if(salaryInput.getMonthlyHRA()!=null) salary.setAnnuallyHRA(salaryInput.getMonthlyHRA()*12);
            if(salaryInput.getMonthlySpecialAllowance()!=null)salary.setAnnuallySpecialAllowance(salaryInput.getMonthlySpecialAllowance()*12);
            if(salaryInput.getMonthlyBasic()!=null&&salaryInput.getMonthlyHRA()!=null&&salaryInput.getMonthlySpecialAllowance()!=null){
                salary.setMonthlyCTC(salaryInput.getMonthlyBasic()+salaryInput.getMonthlyHRA()+salaryInput.getMonthlySpecialAllowance());
                salary.setAnnualCTC(salary.getMonthlyCTC()*12);
            }

            // individual

            if(salaryInput.getMonthlyBasic()==null &&salaryInput.getMonthlyHRA()!=null&&salaryInput.getMonthlySpecialAllowance()!=null){
                salary.setMonthlyCTC(salary.getMonthlyBasic()+salaryInput.getMonthlyHRA()+salaryInput.getMonthlySpecialAllowance());
                salary.setAnnualCTC((salary.getMonthlyBasic()+salaryInput.getMonthlyHRA()+salaryInput.getMonthlySpecialAllowance())*12);
            }

            if(salaryInput.getMonthlyBasic()!=null &&salaryInput.getMonthlyHRA()==null&&salaryInput.getMonthlySpecialAllowance()!=null){
                salary.setMonthlyCTC(salaryInput.getMonthlyBasic()+salary.getMonthlyHRA()+salaryInput.getMonthlySpecialAllowance());
                salary.setAnnualCTC((salaryInput.getMonthlyBasic()+salary.getMonthlyHRA()+salaryInput.getMonthlySpecialAllowance())*12);
            }
            if(salaryInput.getMonthlyBasic()!=null &&salaryInput.getMonthlyHRA()!=null&&salaryInput.getMonthlySpecialAllowance()==null){
                salary.setMonthlyCTC(salaryInput.getMonthlyBasic()+salaryInput.getMonthlyHRA()+salary.getMonthlySpecialAllowance());
                salary.setAnnualCTC((salaryInput.getMonthlyBasic()+salaryInput.getMonthlyHRA()+salary.getMonthlySpecialAllowance())*12);
            }

            if(salaryInput.getMonthlyBasic()==null &&salaryInput.getMonthlyHRA()==null&&salaryInput.getMonthlySpecialAllowance()!=null){
                salary.setMonthlyCTC(salary.getMonthlyBasic()+salary.getMonthlyHRA()+salaryInput.getMonthlySpecialAllowance());
                salary.setAnnualCTC(salary.getMonthlyCTC()*12);
                //salary.setAnnualCTC((salaryInput.getMonthlyBasic()+salaryInput.getMonthlyHRA()+salary.getMonthlySpecialAllowance())*12);
            }
            if(salaryInput.getMonthlyBasic()==null &&salaryInput.getMonthlyHRA()!=null&&salaryInput.getMonthlySpecialAllowance()==null){
                salary.setMonthlyCTC(salary.getMonthlyBasic()+salaryInput.getMonthlyHRA()+salary.getMonthlySpecialAllowance());
                salary.setAnnualCTC(salary.getMonthlyCTC()*12);
                //salary.setAnnualCTC((salaryInput.getMonthlyBasic()+salaryInput.getMonthlyHRA()+salary.getMonthlySpecialAllowance())*12);
            }
            if(salaryInput.getMonthlyBasic()!=null &&salaryInput.getMonthlyHRA()==null&&salaryInput.getMonthlySpecialAllowance()==null){
                salary.setMonthlyCTC(salaryInput.getMonthlyBasic()+salary.getMonthlyHRA()+salary.getMonthlySpecialAllowance());
                salary.setAnnualCTC(salary.getMonthlyCTC()*12);
                //salary.setAnnualCTC((salaryInput.getMonthlyBasic()+salaryInput.getMonthlyHRA()+salary.getMonthlySpecialAllowance())*12);
            }

        }
        return salaryRepository.save(salary);
    }

}
