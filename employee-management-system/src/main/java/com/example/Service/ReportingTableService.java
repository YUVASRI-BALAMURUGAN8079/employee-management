package com.example.Service;

import com.example.Input.ReportingTableInput;
import com.example.entity.Employee;
import com.example.entity.ReportingTable;
import com.example.repository.EmployeeRepository;
import com.example.repository.ReportingTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReportingTableService {
    private ReportingTableRepository reportingTableRepository;
    private EmployeeRepository employeeRepository;

    @Autowired
    public ReportingTableService(ReportingTableRepository reportingTableRepository,EmployeeRepository employeeRepository) {
        this.reportingTableRepository = reportingTableRepository;
        this.employeeRepository=employeeRepository;
    }
    public List<ReportingTable> findAllReportingRecords(){ return reportingTableRepository.findAll(); }
    public Employee findReportingManagerByEmployeeId(Long id) {
        return reportingTableRepository.findReportingManagerByEmployeeId(id);
    }
    public List<Employee> findEmployeesByReportingManagerId(Long reportingEmployeeId) {
        return reportingTableRepository.findEmployeesByReportingManagerId(reportingEmployeeId);
    }
    public ReportingTable addReportingData(ReportingTableInput reportingTableInput)
    {
        Long reportingEmployeeId=reportingTableInput.getReportingEmployeeId();
        Employee reportingEmployee=employeeRepository.findById(reportingEmployeeId)
                .orElseThrow(()->new IllegalArgumentException("Invalid Reporting Employee Id"));
        Long reportingManagerId=reportingTableInput.getReportingManagerId();
        Employee reportingManager=employeeRepository.findById(reportingManagerId)
                .orElseThrow(()->new IllegalArgumentException("Invalid Reporting Manager Id"));

        ReportingTable newReportingTableData=new ReportingTable(reportingEmployee,reportingManager);
        return reportingTableRepository.save(newReportingTableData);
    }

    public ReportingTable updateReportingTable(ReportingTableInput reportingTableInput) {
        ReportingTable reportingTable = reportingTableRepository.findByEmployeeId(reportingTableInput.getReportingEmployeeId());
        if (reportingTable != null) {
            if (reportingTableInput.getReportingEmployeeId() != null) {
                Employee reportingEmployee = employeeRepository.findById(reportingTableInput.getReportingEmployeeId()).orElse(null);
                reportingTable.setEmployee(reportingEmployee);
            }
            if (reportingTableInput.getReportingManagerId() != null) {
                Employee reportingManager = employeeRepository.findById(reportingTableInput.getReportingManagerId()).orElse(null);
                reportingTable.setReportingEmployee(reportingManager);

            }
            return reportingTableRepository.save(reportingTable);
        }
        return null;
    }

//    Reference


//    public ReportingTable update(ReportingTable  reportingTable){
//
//       // ReportingTable reportingTable=reportingTableRepository.findByEmployeeId(reportingTableInput.getReportingEmployeeId());
//        if(reportingTable!=null){
//            if(reportingTable.getReportingEmployee()!=null){
//                Employee reportingManager=employeeRepository.findById(reportingTable.getReportingEmployee().getId()).orElse(null);
//                reportingTable.setEmployee(reportingManager);
//            }
//            if(reportingTable.getEmployee()!=null) {
//                Employee reportingEmployee = employeeRepository.findById(reportingTable.getEmployee().getId()).orElse(null);
//                reportingTable.setReportingEmployee(reportingEmployee);
//            }
//
//            return reportingTableRepository.save(reportingTable);
//        }
//        return null;
//    }

    public void deleteEmployee(Long id){
        reportingTableRepository.deleteByEmployeeId(id);
    }

}

