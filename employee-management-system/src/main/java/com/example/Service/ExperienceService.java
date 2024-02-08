package com.example.Service;

import com.example.Input.ExperienceInput;
import com.example.entity.DegreeAndCertificate;
import com.example.entity.Employee;
import com.example.entity.Experience;
import com.example.repository.EmployeeRepository;
import com.example.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class ExperienceService {
    public ExperienceRepository experienceRepository;
    public EmployeeRepository employeeRepository;

    @Autowired
    public ExperienceService(ExperienceRepository experienceRepository,EmployeeRepository employeeRepository) {
        this.experienceRepository = experienceRepository;
        this.employeeRepository=employeeRepository;
    }
    public List<Experience> findAllExperience(){return experienceRepository.findAll();}
    public List<Experience> findExperienceByEmployeeId(Long id) { return experienceRepository.findByEmployeeId(id); }

    public Experience addExperience(ExperienceInput experienceInput)
    {
        Long employeeId=experienceInput.getEmployeeId();
        Employee employee= employeeRepository.findById(employeeId)
                .orElseThrow(()->new IllegalArgumentException("Invalid Employee Id"));
        String companyName=experienceInput.getCompanyName();
        String jobTitle=experienceInput.getJobTitle();
        Date dateOfJoining=experienceInput.getDateOfJoining();
        Date dateOfRelieving=experienceInput.getDateOfRelieving();
        //int experience=experienceInput.getExperience();
        String location=experienceInput.getLocation();
        String description=experienceInput.getDescription();

        Experience newExperience=new Experience(employee,companyName,
                jobTitle,dateOfJoining,dateOfRelieving,location,description);
        return experienceRepository.save(newExperience);
    }

    public Experience updateExperience(ExperienceInput experienceInput){
        Experience experience=experienceRepository.findById(experienceInput.getExperienceId())
                .orElseThrow(()-> new IllegalArgumentException("Invalid Id"));
        if(experience!=null){
            if(experienceInput.getCompanyName()!=null)experience.setCompanyName(experienceInput.getCompanyName());
            if(experienceInput.getJobTitle()!=null)experience.setJobTitle(experienceInput.getJobTitle());
            if(experienceInput.getDateOfJoining()!=null)experience.setDateOfJoining(experienceInput.getDateOfJoining());
            if(experienceInput.getDateOfRelieving()!=null)experience.setDateOfRelieving(experienceInput.getDateOfRelieving());
            if(experienceInput.getLocation()!=null)experience.setLocation(experienceInput.getLocation());
            if(experienceInput.getDescription()!=null)experience.setDescription(experienceInput.getDescription());
        }
        return experienceRepository.save(experience);
    }

}
