package com.example.repository;

import com.example.entity.Employee;
import com.example.entity.ReportingTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ReportingTableRepository extends JpaRepository<ReportingTable,Long> {

    @Query("SELECT e.reportingEmployee FROM ReportingTable e WHERE e.employee.id = :employeeId")
    Employee findReportingManagerByEmployeeId(Long employeeId);

    @Query("SELECT rt.employee FROM ReportingTable rt WHERE rt.reportingEmployee.id = :employeeId")
    List<Employee> findEmployeesByReportingManagerId(Long employeeId);

    ReportingTable findByEmployeeId(Long id);

    @Transactional
    @Modifying
    @Query("delete from ReportingTable where employee.id = :id")
    void deleteByEmployeeId(@Param("id") Long id);

//    @Query("UPDATE ReportingTable rt SET rt.reportingEmployee.id = :newReportingManagerId WHERE rt.employee.id = :employeeId")
//    ReportingTable updateReportingManagerByEmployeeId(@Param("employeeId") Long employeeId, @Param("newReportingManagerId") Long newReportingManagerId);



//
//    @Modifying
//    @Query("UPDATE ReportingTable rt SET rt.reportingEmployee.id = :newReportingManagerId WHERE rt.reportingEmployee.id = :employeeId")
//    void updateReportingManager(Long employeeId, Long newReportingManagerId);
//
}
