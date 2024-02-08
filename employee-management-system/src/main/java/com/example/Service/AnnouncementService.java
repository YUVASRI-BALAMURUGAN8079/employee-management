package com.example.Service;

import com.example.Input.AnnouncementInput;
import com.example.entity.Announcement;
import com.example.entity.Employee;
import com.example.repository.AnnouncementRepository;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class AnnouncementService {
    private AnnouncementRepository announcementRepository;
    private EmployeeRepository employeeRepository;

    @Autowired
    public AnnouncementService(AnnouncementRepository announcementRepository,EmployeeRepository employeeRepository) {
        this.announcementRepository = announcementRepository;
        this.employeeRepository=employeeRepository;
    }

    public List<Announcement> getAllAnnouncements() {
        return announcementRepository.findAll();
    }

    public List<Announcement> getAnnouncementByAnnouncedEmployeeId(Long empId){
        return announcementRepository.findByAnnouncedEmployeeId(empId);
    }

    public List<Announcement> getAnnouncementByApprovedEmployee(Long empId){
        return announcementRepository.findByApprovedEmployeeId(empId);
    }

    public Announcement addAnnouncement(AnnouncementInput announcementInput){
        String title=announcementInput.getTitle();
        String content=announcementInput.getContent();
        Date announcementDate=announcementInput.getAnnouncementDate();
        Long announcedEmployeeId=announcementInput.getAnnouncedEmployeeId();
        Employee announcedEmployee=employeeRepository.findById(announcedEmployeeId)
                .orElseThrow(()-> new IllegalArgumentException("Invalid Announced Employee Id"));
        Long approvedEmployeeId=announcementInput.getApprovedEmployeeId();

        Employee approvedEmployee=employeeRepository.findById(approvedEmployeeId)
                .orElseThrow(()-> new IllegalArgumentException("Invalid Approved Employee Id"));

        Announcement newAnnouncement=new Announcement(title,content,announcementDate,announcedEmployee,approvedEmployee);
        return announcementRepository.save(newAnnouncement);
    }

    public Announcement updateAnnouncementById(AnnouncementInput announcementInput){
        Announcement announcement=announcementRepository.findById(announcementInput.getId()).orElse(null);
        if(announcement!=null) {
            if(announcementInput.getTitle()!=null)announcement.setTitle(announcementInput.getTitle());
            if(announcementInput.getContent()!=null)announcement.setContent(announcementInput.getContent());
            if(announcementInput.getAnnouncementDate()!=null)announcement.setAnnouncementDate(announcementInput.getAnnouncementDate());
            Long announcedEmployeeId = announcementInput.getAnnouncedEmployeeId();
            if(announcementInput.getAnnouncedEmployeeId()!=null){
                Employee announcedEmployee = employeeRepository.findById(announcedEmployeeId)
                        .orElseThrow(() -> new IllegalArgumentException("Invalid Announced Employee Id"));
                announcement.setAnnouncedEmployee(announcedEmployee);
            }

            Long approvedEmployeeId = announcementInput.getApprovedEmployeeId();
            if(announcementInput.getApprovedEmployeeId()!=null){

                Employee approvedEmployee = employeeRepository.findById(approvedEmployeeId)
                        .orElseThrow(() -> new IllegalArgumentException("Invalid Approved Employee Id"));
                announcement.setApprovedEmployee(approvedEmployee);
            }
        }
        return announcementRepository.save(announcement);
    }

    public void deleteAnnouncementById(Long id){
        announcementRepository.deleteById(id);
    }

}
