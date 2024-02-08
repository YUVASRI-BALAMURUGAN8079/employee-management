package com.example.Service;

import com.example.Input.DegreeAndCertificateInput;
import com.example.entity.DegreeAndCertificate;
import com.example.entity.Designation;
import com.example.entity.Employee;
import com.example.repository.DegreeAndCertificateRepository;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DegreeAndCertificateService {
    public DegreeAndCertificateRepository degreeAndCertificateRepository;
    public EmployeeRepository employeeRepository;

    @Autowired
    public DegreeAndCertificateService(DegreeAndCertificateRepository degreeAndCertificateRepository,EmployeeRepository employeeRepository) {
        this.degreeAndCertificateRepository = degreeAndCertificateRepository;
        this.employeeRepository=employeeRepository;
    }
    public List<DegreeAndCertificate> findAllDegreeAndCertificate(){return degreeAndCertificateRepository.findAll();}
    public List<DegreeAndCertificate> findDegreeAndCertificateByEmployeeId(Long id) { return degreeAndCertificateRepository.findByEmployeeId(id);}

    public DegreeAndCertificate addDegreeAndCertificate(DegreeAndCertificateInput degreeAndCertificateInput)
    {
        Long employeeId=degreeAndCertificateInput.getEmployeeId();
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid employeeId"));

        String degree=degreeAndCertificateInput.getDegree();
        String specialization=degreeAndCertificateInput.getSpecialization();
        int yearOfJoining=degreeAndCertificateInput.getYearOfJoining();
        int yearOfCompletion=degreeAndCertificateInput.getYearOfJoining();
        int cgpa=degreeAndCertificateInput.getCgpa();
        String college=degreeAndCertificateInput.getCollege();

        DegreeAndCertificate newDegreeAndCertificate=new DegreeAndCertificate(employee,
                degree,specialization,yearOfJoining,yearOfCompletion,cgpa,college);
        return degreeAndCertificateRepository.save(newDegreeAndCertificate);
    }

    public DegreeAndCertificate updateDegreeAndCertificateByEmployeeId(DegreeAndCertificateInput degreeAndCertificateInput){
        DegreeAndCertificate degreeAndCertificate=degreeAndCertificateRepository.findById(degreeAndCertificateInput.getId()).orElse(null);
        if(degreeAndCertificate!=null){
            if(degreeAndCertificateInput.getDegree()!=null)degreeAndCertificate.setDegree(degreeAndCertificateInput.getDegree());
            if(degreeAndCertificateInput.getSpecialization()!=null)degreeAndCertificate.setSpecialization(degreeAndCertificateInput.getSpecialization());
            if(degreeAndCertificateInput.getYearOfJoining()!=null)degreeAndCertificate.setYearOfJoining(degreeAndCertificateInput.getYearOfJoining());
            if(degreeAndCertificateInput.getYearOfCompletion()!=null)degreeAndCertificate.setYearOfCompletion(degreeAndCertificateInput.getYearOfCompletion());
            if(degreeAndCertificateInput.getCgpa()!=0)degreeAndCertificate.setCgpa(degreeAndCertificateInput.getCgpa());
            if(degreeAndCertificateInput.getCollege()!=null)degreeAndCertificate.setCollege(degreeAndCertificateInput.getCollege());
        }
        return degreeAndCertificateRepository.save(degreeAndCertificate);
    }

}
