package com.example.Service;

import com.example.Input.DetailsInput;
import com.example.entity.Details;
import com.example.entity.Employee;
import com.example.repository.DetailsRepository;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class DetailsService {
    public DetailsRepository detailsRepository;
    public EmployeeRepository employeeRepository;

    @Autowired
    public DetailsService(DetailsRepository detailsRepository,EmployeeRepository employeeRepository) {
        this.detailsRepository = detailsRepository;
        this.employeeRepository=employeeRepository;
    }
    public List<Details> findAllDetails(){return detailsRepository.findAll();}
    public Details findDetailsByEmployeeId(Long id){
        return detailsRepository.findByEmployeeId(id);
    }

    public Details addDetails(DetailsInput detailsInput)
    {
        Long employeeId=detailsInput.getEmployeeId();
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid employeeId"));

        String name=detailsInput.getName();
        String gender=detailsInput.getGender();
        Date dob=detailsInput.getDob();
        String maritalStatus=detailsInput.getMaritalStatus();
        String bloodGroup=detailsInput.getBloodGroup();
        boolean physicallyChallenged=detailsInput.isPhysicallyChallenged();
        String workEmail=detailsInput.getWorkEmail();
        String personalEmail=detailsInput.getPersonalEmail();
        Long mobilePhone=detailsInput.getMobilePhone();
        String currentAddress=detailsInput.getCurrentAddress();
        String permanentAddress=detailsInput.getPermanentAddress();
        String password=detailsInput.getPassword();
        Details newDetails=new Details(employee, name,gender,dob,maritalStatus,bloodGroup, physicallyChallenged,workEmail,personalEmail,mobilePhone, currentAddress,permanentAddress,password);
        return detailsRepository.save(newDetails);
    }

    public Details updateDetailsByEmployeeId(DetailsInput detailsInput){
        Details details=detailsRepository.findByEmployeeId(detailsInput.getEmployeeId());
        if(details!=null)
        {
            if(detailsInput.getName()!=null)details.setName(detailsInput.getName());
            if(details.getGender()!=null)details.setGender(details.getGender());
            if(detailsInput.getDob()!=null)details.setDob(detailsInput.getDob());
            if(detailsInput.getMaritalStatus()!=null)details.setMaritalStatus(detailsInput.getMaritalStatus());
            if(detailsInput.getBloodGroup()!=null)details.setBloodGroup(detailsInput.getBloodGroup());
            if(detailsInput.isPhysicallyChallenged()!=details.isPhysicallyChallenged())details.setPhysicallyChallenged(detailsInput.isPhysicallyChallenged());
            if(detailsInput.getWorkEmail()!=null)details.setWorkEmail(detailsInput.getWorkEmail());
            if(detailsInput.getPersonalEmail()!=null)details.setPersonalEmail(detailsInput.getPersonalEmail());
            if(detailsInput.getMobilePhone()!=null)details.setMobilePhone(detailsInput.getMobilePhone());
            if(detailsInput.getCurrentAddress()!=null)details.setCurrentAddress(detailsInput.getCurrentAddress());
            if(detailsInput.getPermanentAddress()!=null)details.setPermanentAddress(detailsInput.getPermanentAddress());
            if(detailsInput.getPassword()!=null) details.setPassword(detailsInput.getPassword());
        }
        return detailsRepository.save(details);
    }
    public Details findByEmail(String mail){
        return detailsRepository.findByWorkEmail(mail);

    }


}
