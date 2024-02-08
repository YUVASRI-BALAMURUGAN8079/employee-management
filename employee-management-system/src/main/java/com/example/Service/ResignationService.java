package com.example.Service;

import com.example.Input.ResignationInput;
import com.example.entity.Employee;
import com.example.entity.ReportingTable;
import com.example.entity.Resignation;
import com.example.repository.EmployeeRepository;
import com.example.repository.ReportingTableRepository;
import com.example.repository.ResignationRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

@Service
public class ResignationService {
    private ResignationRepository resignationRepository;
    private ReportingTableRepository reportingTableRepository;
    private EmployeeRepository employeeRepository;
    private ReportingTableService reportingTableService;

    @Autowired

    public ResignationService(ResignationRepository resignationRepository,ReportingTableService reportingTableService, ReportingTableRepository reportingTableRepository,EmployeeRepository employeeRepository) {
        this.reportingTableService=reportingTableService;
        this.resignationRepository = resignationRepository;
        this.reportingTableRepository=reportingTableRepository;
        this.employeeRepository = employeeRepository;
    }


    public List<Resignation> findAllResignations(){
        return resignationRepository.findAll();
    }

    public Resignation findResignationByEmployeeId(Long id){
        return resignationRepository.findByEmployeeId(id);
    }

    public Resignation findResignationById(Long id ){
        return resignationRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Resignation ID"));
    }

//    public Resignation addResignation(ResignationInput resignationInput){
//        Long employeeId=resignationInput.getEmployeeId();
//        Employee employee=employeeRepository.findById(employeeId)
//                .orElseThrow(()->new IllegalArgumentException("Invalid Employee ID"));
//        employee.setWorkingStatus(false);
//        Date resignationAppliedDate=resignationInput.getResignationAppliedDate();
//        String reason=resignationInput.getReason();
//        String feedback=resignationInput.getFeedback();
//        Date finalWorkingDate=resignationInput.getFinalWorkingDate();
//
//        Resignation resignation=new Resignation(employee,resignationAppliedDate,reason,feedback,finalWorkingDate);
//       // employeeRepository.save(employee);
//        return resignationRepository.save(resignation);
//    }

    public Resignation updateResignationByEmployeeId(ResignationInput resignationInput){
        Resignation resignation=resignationRepository.findByEmployeeId(resignationInput.getEmployeeId());
        if(resignation!=null) {
            Employee employee = employeeRepository.findById(resignationInput.getEmployeeId()).orElse(null);
            employee.setWorkingStatus(false);
            employeeRepository.save(employee);
            if(employee!=null)resignation.setEmployee(employee);
            if(resignationInput.getResignationAppliedDate()!=null)resignation.setResignationAppliedDate(resignationInput.getResignationAppliedDate());
            if(resignationInput.getReason()!=null)resignation.setReason(resignationInput.getReason());
            if(resignationInput.getFeedback()!=null)resignation.setFeedback(resignationInput.getFeedback());
            if(resignationInput.getFinalWorkingDate()!=null)resignation.setFinalWorkingDate(resignationInput.getFinalWorkingDate());
        }
        return resignationRepository.save(resignation);
    }

    public void deleteResignationByEmployeeId(Long id){
        Employee employee=employeeRepository.findById(id).orElse(null);
        employee.setWorkingStatus(true);
        resignationRepository.deleteByEmployeeId(id);
    }

    public String addResignation(ResignationInput resignationInput){

        System.out.println("1");
        Long employeeId=resignationInput.getEmployeeId();
        System.out.println("2");
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()->new IllegalArgumentException("Invalid Employee ID"));
        Date resignationAppliedDate=resignationInput.getResignationAppliedDate();
        System.out.println("3");

        System.out.println("4");
        String reason=resignationInput.getReason();
        System.out.println("5");
        String feedback=resignationInput.getFeedback();
        System.out.println("6");
        Date finalWorkingDate=resignationInput.getFinalWorkingDate();
        System.out.println("7");
        reportingTableService.deleteEmployee(resignationInput.getEmployeeId());
        List<Employee> reportingTable=reportingTableRepository.findEmployeesByReportingManagerId(employeeId);
        if(reportingTable.size()!=0){
            employee.setWorkingStatus(true);
            return "You are a reporting manager ! so assign the reporting employees to another reporting manager";
        }
        employee.setWorkingStatus(false);

            //reportingTableRepository.findByEmployeeId(resignationInput.getEmployeeId()).setReportingEmployee(null);


        Resignation resignation=new Resignation(employee,resignationAppliedDate,reason,feedback,finalWorkingDate);
//        reportingTableRepository.deleteByEmployeeId(resignationInput.getEmployeeId());

        // employeeRepository.save(employee);
        resignationRepository.save(resignation);

        //reportingTableService.deleteEmployee(resignationInput.getEmployeeId());

        return "accepted";

    }

    public void processResignation(ResignationInput resignationInput, Long newReportingManagerId) {

        Long resigningEmployeeId=resignationInput.getEmployeeId();
        //Long employeeId=resignationInput.getEmployeeId();
        Employee employee=employeeRepository.findById(resigningEmployeeId)
                .orElseThrow(()->new IllegalArgumentException("Invalid Employee ID"));
        employee.setWorkingStatus(false);
        Date resignationAppliedDate=resignationInput.getResignationAppliedDate();
        String reason=resignationInput.getReason();
        String feedback=resignationInput.getFeedback();
        Date finalWorkingDate=resignationInput.getFinalWorkingDate();
        Resignation resignation=new Resignation(employee,resignationAppliedDate,reason,feedback,finalWorkingDate);
        resignationRepository.save(resignation);

        List<Employee> directReports = reportingTableRepository.findEmployeesByReportingManagerId(resigningEmployeeId);

        for (Employee directReport : directReports) {
            ReportingTable reportingTable = reportingTableRepository.findByEmployeeId(directReport.getId());


            reportingTable.setReportingEmployee(employeeRepository.findById(newReportingManagerId).orElse(null));
            reportingTableService.deleteEmployee(resignationInput.getEmployeeId());
            //reportingTableService.update(reportingTable);
        }
    }
}
