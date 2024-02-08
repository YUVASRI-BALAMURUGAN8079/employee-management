package com.example.Service;

import com.example.Input.PanInput;
import com.example.entity.Employee;
import com.example.entity.Pan;
import com.example.repository.EmployeeRepository;
import com.example.repository.PanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class PanService {
    private PanRepository panRepository;
    private EmployeeRepository employeeRepository;

    @Autowired
    public PanService(PanRepository panRepository,EmployeeRepository employeeRepository) {
        this.panRepository = panRepository;
        this.employeeRepository=employeeRepository;
    }
    public List<Pan> findAllPan(){return panRepository.findAll();}
    public Pan findPanByEmployeeId(Long id){
        return panRepository.findByEmployeeId(id);
    }

    public Pan addPan(PanInput panInput)
    {
        Long employeeId=panInput.getEmployeeId();

        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()->new IllegalArgumentException("Invalid EmployeeId"));
        String panNumber=panInput.getPanNumber();
        String name=panInput.getName();
        Date dob=panInput.getDob();
        String parentOrSpouseName=panInput.getParentOrSpouseName();
        Pan newPan=new Pan(employee,panNumber,name,dob,parentOrSpouseName);
        return panRepository.save(newPan);
    }

    public Pan updatePanByEmployeeId(PanInput panInput){
        Pan pan=panRepository.findByEmployeeId(panInput.getEmployeeId());
        if(pan!=null){
            if(panInput.getPanNumber()!=null)pan.setPanNumber(panInput.getPanNumber());
            if(panInput.getName()!=null)pan.setName(panInput.getName());
            if(panInput.getDob()!=null)pan.setDob(panInput.getDob());
            if(panInput.getParentOrSpouseName()!=null)pan.setParentOrSpouseName(panInput.getParentOrSpouseName());
        }
        return panRepository.save(pan);
    }

}
