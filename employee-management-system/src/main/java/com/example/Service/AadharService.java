package com.example.Service;

import com.example.Input.AadharInput;
import com.example.entity.Aadhar;
import com.example.entity.DegreeAndCertificate;
import com.example.entity.Employee;
import com.example.repository.AadharRepository;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class AadharService {
    private AadharRepository aadharRepository;
    private EmployeeRepository employeeRepository;

    @Autowired
    public AadharService(AadharRepository aadharRepository,EmployeeRepository employeeRepository) {
        this.aadharRepository = aadharRepository;
        this.employeeRepository=employeeRepository;
    }
    public List<Aadhar> findAllAadhar(){return aadharRepository.findAll();}
    public Aadhar findAadharByEmployeeId(Long id)
    {
        return aadharRepository.findByEmployeeId(id);
    }

    public Aadhar addAadharDetailsByEmployeeId(AadharInput aadharInput){
        Long employeeId=aadharInput.getEmployeeId();
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()->new IllegalArgumentException("Invalid Employee Id"));
        String aadharNumber=aadharInput.getAadharNumber();
        Date dob=aadharInput.getDob();
        String name=aadharInput.getName();
        String address=aadharInput.getAddress();
        String gender=aadharInput.getGender();

        Aadhar newAadhar=new Aadhar(employee,aadharNumber,dob,name,address,gender);
        return aadharRepository.save(newAadhar);
    }

    public Aadhar updateAadhar(AadharInput aadharInput){
        Aadhar aadhar=aadharRepository.findByEmployeeId(aadharInput.getEmployeeId());
        if(aadhar!=null)
        {
            if(aadharInput.getAadharNumber()!=null)aadhar.setAadharNumber(aadharInput.getAadharNumber());
            if(aadharInput.getDob()!=null)aadhar.setDob(aadharInput.getDob());
            if(aadharInput.getName()!=null)aadhar.setName(aadharInput.getName());
            if(aadharInput.getAddress()!=null)aadhar.setAddress(aadharInput.getAddress());
            if(aadharInput.getGender()!=null)aadhar.setGender(aadharInput.getGender());
        }
        return aadharRepository.save(aadhar);
    }

}
