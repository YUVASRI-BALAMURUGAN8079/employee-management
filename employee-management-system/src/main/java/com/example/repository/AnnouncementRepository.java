package com.example.repository;

import com.example.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement,Long> {

    //@Query("SELECT rt.employee FROM ReportingTable rt WHERE rt.reportingEmployee.id = :employeeId")

//    @Query("SELECT a from Announcement a where a.announcedEmployee= :empId")
//    List<Announcement> findByAnnouncedEmployee(Long empId);
    //List<Announcement> findByApprovedEmployee(Long empId);

    List<Announcement> findByAnnouncedEmployeeId(Long empId);

    List<Announcement> findByApprovedEmployeeId(Long empId);

}
