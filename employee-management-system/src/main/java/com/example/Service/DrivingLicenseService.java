package com.example.Service;

import com.example.Input.DrivingLicenseInput;
import com.example.entity.DrivingLicense;
import com.example.entity.Employee;
import com.example.repository.DrivingLicenseRepository;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class DrivingLicenseService {
    public DrivingLicenseRepository drivingLicenseRepository;
    public EmployeeRepository employeeRepository;

    @Autowired
    public DrivingLicenseService(DrivingLicenseRepository drivingLicenseRepository,EmployeeRepository employeeRepository) {
        this.drivingLicenseRepository = drivingLicenseRepository;
        this.employeeRepository=employeeRepository;
    }
    public List<DrivingLicense> findAllDrivingLicense(){return drivingLicenseRepository.findAll();}
    public DrivingLicense findByDrivingLicenseEmployeeId(Long id){return drivingLicenseRepository.findByEmployeeId(id); }

    public DrivingLicense addDrivingLicense(DrivingLicenseInput drivingLicenseInput)
    {
        Long employeeId=drivingLicenseInput.getEmployeeId();
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()->new IllegalArgumentException("Invalid Employee Id"));
        String licenseNumber=drivingLicenseInput.getLicenseNumber();
        String name=drivingLicenseInput.getName();
        Date dob=drivingLicenseInput.getDob();
        String bloodGroup=drivingLicenseInput.getBloodGroup();
        String fatherName=drivingLicenseInput.getFatherName();
        Date dateOfIssue=drivingLicenseInput.getDateOfIssue();
        Date validTill=drivingLicenseInput.getValidTill();
        String address=drivingLicenseInput.getAddress();
        DrivingLicense newDrivingLicense=new DrivingLicense(employee,licenseNumber,
                name,dob,bloodGroup,fatherName,dateOfIssue,validTill,address);
        return drivingLicenseRepository.save(newDrivingLicense);
    }

    public DrivingLicense updateDrivingLicenseByEmployeeId(DrivingLicenseInput drivingLicenseInput){
        DrivingLicense drivingLicense=drivingLicenseRepository.findByEmployeeId(drivingLicenseInput.getEmployeeId());
        if(drivingLicense!=null){
            if(drivingLicenseInput.getLicenseNumber()!=null)drivingLicense.setLicenseNumber(drivingLicenseInput.getLicenseNumber());
            if(drivingLicenseInput.getName()!=null)drivingLicense.setName(drivingLicenseInput.getName());
            if(drivingLicenseInput.getDob()!=null)drivingLicense.setDob(drivingLicenseInput.getDob());
            if(drivingLicenseInput.getBloodGroup()!=null)drivingLicense.setBloodGroup(drivingLicenseInput.getBloodGroup());
            if(drivingLicenseInput.getFatherName()!=null)drivingLicense.setFatherName(drivingLicenseInput.getFatherName());
            if(drivingLicenseInput.getDateOfIssue()!=null)drivingLicense.setDateOfIssue(drivingLicenseInput.getDateOfIssue());
            if(drivingLicenseInput.getValidTill()!=null)drivingLicense.setValidTill(drivingLicenseInput.getValidTill());
            if(drivingLicenseInput.getAddress()!=null)drivingLicense.setAddress(drivingLicenseInput.getAddress());

        }
        return drivingLicenseRepository.save(drivingLicense);
    }

}
