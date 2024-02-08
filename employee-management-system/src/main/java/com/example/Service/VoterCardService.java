package com.example.Service;

import com.example.Input.VoterCardInput;
import com.example.entity.Employee;
import com.example.entity.VoterCard;
import com.example.repository.EmployeeRepository;
import com.example.repository.VoterCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class VoterCardService {
    private VoterCardRepository voterCardRepository;
    private EmployeeRepository employeeRepository;

    @Autowired
    public VoterCardService(VoterCardRepository voterCardRepository,EmployeeRepository employeeRepository) {
        this.voterCardRepository = voterCardRepository;
        this.employeeRepository=employeeRepository;
    }
    public List<VoterCard> findAllVoterCard(){return voterCardRepository.findAll();}
    public VoterCard findVoterCardByEmployeeId(Long id)
    {
        return voterCardRepository.findByEmployeeId(id);
    }

    public VoterCard addVoterCard(VoterCardInput voterCardInput){
        Long employeeId=voterCardInput.getEmployeeId();
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()-> new IllegalArgumentException("Invalid Employee Id"));
        String voterId=voterCardInput.getVoterId();
        String name=voterCardInput.getName();
        String fatherName=voterCardInput.getFatherName();
        String gender=voterCardInput.getGender();
        Date dob=voterCardInput.getDob();
        String address=voterCardInput.getAddress();
        VoterCard newVoterCard=new VoterCard(employee,voterId,name,fatherName,gender,dob,address);
        return voterCardRepository.save(newVoterCard);
    }

    public VoterCard updateVoterCard(VoterCardInput voterCardInput){
        VoterCard voterCard=voterCardRepository.findByEmployeeId(voterCardInput.getEmployeeId());
        if(voterCard!=null){
            if(voterCardInput.getVoterId()!=null)voterCard.setVoterId(voterCardInput.getVoterId());
            if(voterCardInput.getName()!=null)voterCard.setName(voterCardInput.getName());
            if(voterCardInput.getFatherName()!=null)voterCard.setFatherName(voterCardInput.getFatherName());
            if(voterCardInput.getDob()!=null)voterCard.setDob(voterCardInput.getDob());
            if(voterCardInput.getGender()!=null)voterCard.setGender(voterCardInput.getGender());
            if(voterCardInput.getAddress()!=null)voterCard.setAddress(voterCardInput.getAddress());
        }
        return voterCardRepository.save(voterCard);
    }

}
