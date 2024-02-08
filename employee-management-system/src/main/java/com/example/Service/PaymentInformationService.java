package com.example.Service;

import com.example.Input.PaymentInformationInput;
import com.example.entity.Employee;
import com.example.entity.PaymentInformation;
import com.example.repository.EmployeeRepository;
import com.example.repository.PaymentInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class PaymentInformationService {

    private PaymentInformationRepository paymentInformationRepository;
    private EmployeeRepository employeeRepository;

    @Autowired
    public PaymentInformationService(PaymentInformationRepository paymentInformationRepository,EmployeeRepository employeeRepository) {
        this.paymentInformationRepository = paymentInformationRepository;
        this.employeeRepository=employeeRepository;
    }
    public List<PaymentInformation> findAllPaymentInformation(){return paymentInformationRepository.findAll();}
    public PaymentInformation findPaymentInformationByEmployeeId(Long id){ return paymentInformationRepository.findByEmployeeId(id); }

    public PaymentInformation addPaymentInformation(PaymentInformationInput paymentInformationInput)
    {
        Long employeeId=paymentInformationInput.getEmployeeId();
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()-> new IllegalArgumentException("Invalid Employee Id"));
        String salaryPaymentMode=paymentInformationInput.getSalaryPaymentMode();
        String bankName=paymentInformationInput.getBankName();
        String account_number=paymentInformationInput.getAccountNumber();
        String ifscCode=paymentInformationInput.getIfscCode();
        String nameOfTheAccount=paymentInformationInput.getNameOfTheAccount();
        boolean PFStatus=paymentInformationInput.isPfStatus();
        String PFNumber=paymentInformationInput.getPfNumber();
        Date PFJoinDate=paymentInformationInput.getPfJoinDate();
        String nameOnThePFAccount=paymentInformationInput.getNameOnThePFAccount();

        PaymentInformation newPaymentInformation=new PaymentInformation(employee,
                salaryPaymentMode,bankName,account_number,ifscCode,nameOfTheAccount,PFStatus,
                PFNumber,PFJoinDate,nameOnThePFAccount);
        return paymentInformationRepository.save(newPaymentInformation);
    }

    public PaymentInformation updatePIByEmmployeeId(PaymentInformationInput paymentInformationInput){
        PaymentInformation paymentInformation=paymentInformationRepository.findByEmployeeId(paymentInformationInput.getEmployeeId());
        if(paymentInformation!=null){
            if(paymentInformationInput.getSalaryPaymentMode()!=null)paymentInformation.setSalaryPaymentMode(paymentInformationInput.getSalaryPaymentMode());
            if(paymentInformationInput.getBankName()!=null)paymentInformation.setBankName(paymentInformationInput.getBankName());
            if(paymentInformationInput.getAccountNumber()!=null)paymentInformation.setAccountNumber(paymentInformationInput.getAccountNumber());
            if(paymentInformationInput.getIfscCode()!=null)paymentInformation.setIfscCode(paymentInformationInput.getIfscCode());
            if(paymentInformationInput.getNameOfTheAccount()!=null)paymentInformation.setNameOfTheAccount(paymentInformationInput.getNameOfTheAccount());
            if(paymentInformationInput.isPfStatus()!=paymentInformation.isPfStatus())paymentInformation.setPfStatus(paymentInformationInput.isPfStatus());
            if(paymentInformationInput.getPfNumber()!=null)paymentInformation.setPfNumber(paymentInformationInput.getPfNumber());
            if(paymentInformationInput.getPfJoinDate()!=null)paymentInformation.setPfJoinDate(paymentInformationInput.getPfJoinDate());
            if(paymentInformationInput.getNameOnThePFAccount()!=null)paymentInformation.setNameOnThePFAccount(paymentInformationInput.getNameOnThePFAccount());
        }
        return paymentInformationRepository.save(paymentInformation);
    }

}
