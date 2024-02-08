package com.example.Service;

import com.example.Input.LeaveRequestInput;
import com.example.entity.Employee;
import com.example.entity.LeaveBalance;
import com.example.entity.LeaveRequest;
import com.example.repository.EmployeeRepository;
import com.example.repository.LeaveBalanceRepository;
import com.example.repository.LeaveRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class LeaveService {
    private LeaveBalanceRepository leaveBalanceRepository;
    private LeaveRequestRepository leaveRequestRepository;
    private EmployeeRepository employeeRepository;

    @Autowired
    public LeaveService(LeaveRequestRepository leaveRequestRepository,LeaveBalanceRepository leaveBalanceRepository,EmployeeRepository employeeRepository) {
        this.leaveRequestRepository=leaveRequestRepository;
        this.leaveBalanceRepository = leaveBalanceRepository;
        this.employeeRepository=employeeRepository;
    }

    public List<LeaveBalance> getAllLeaveBalance(){
        return leaveBalanceRepository.findAll();
    }

    public LeaveBalance getLeaveBalanceByEmployeeId(Long id){
        return leaveBalanceRepository.findByEmployeeId(id);
    }

    public LeaveBalance findLeaveBalanceById(Long id){
        return leaveBalanceRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Invalid Leave ID"));
    }

    public void initializeLeaveBalance(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Employee ID"));
        if (employee != null) {
            LeaveBalance leaveBalance = new LeaveBalance();
            leaveBalance.setEmployee(employee);
            leaveBalance.setTotalWorkFromHome(2);
            leaveBalance.setAvailableWorkFromHome(2);

            leaveBalance.setTotalCasualLeave(2);
            leaveBalance.setTotalMarriageLeave(2);
            leaveBalance.setTotalSickLeave(2);
            leaveBalance.setTotalPaidLeave(5);
            leaveBalance.setTotalFloaterLeave(2);


            leaveBalance.setAvailableCasualLeave(2);
            leaveBalance.setAvailableMarriageLeave(2);
            leaveBalance.setAvailableSickLeave(2);
            leaveBalance.setAvailablePaidLeave(5);
            leaveBalance.setAvailableFloaterLeave(2);

            leaveBalance.setTotalLeave(leaveBalance.getTotalCasualLeave()+leaveBalance.getTotalPaidLeave()+
                    leaveBalance.getTotalSickLeave()+leaveBalance.getTotalMarriageLeave()+
                    leaveBalance.getTotalFloaterLeave());
            leaveBalance.setTotalLeaveAvailable(
                    leaveBalance.getAvailableCasualLeave()+leaveBalance.getAvailableFloaterLeave()+
                            leaveBalance.getAvailableMarriageLeave()+leaveBalance.getAvailableSickLeave()+
                            leaveBalance.getAvailablePaidLeave()
            );
            leaveBalance.setTotalLeaveTaken(0);
            leaveBalanceRepository.save(leaveBalance);
        }
    }

    public void deleteLeaveBalanceForEmployeeByEmployeeId(Long id){
        leaveBalanceRepository.deleteByEmployeeId(id);
    }
    public List<LeaveRequest> getAllLeaveRequest(){
        return leaveRequestRepository.findAll();
    }
    public List<LeaveRequest> getLeaveRequestByEmployeeId(Long id){
        return leaveRequestRepository.findByEmployeeId(id);
    }

    public LeaveRequest getLeaveRequestById(Long id){
        return leaveRequestRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Invalid Leave Request ID"));
    }

    public int submitLeaveRequest(LeaveRequestInput leaveRequestInput){
        Long empId=leaveRequestInput.getEmpId();
        Employee employee=employeeRepository.findById(empId).orElse(null);
        Date startDate =leaveRequestInput.getStartDate();
        Date endDate=leaveRequestInput.getEndDate();
        String leaveType=leaveRequestInput.getLeaveType().toLowerCase();
        //int noOfDays=(int)calculateDateDifferenceInDays(startDate, endDate);

        long timeDiff = Math.abs(leaveRequestInput.getStartDate().getTime() - leaveRequestInput.getEndDate().getTime());
        long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
        int requestedDays=(int)daysDiff+1;
        System.out.println("Request days: "+requestedDays);
        System.out.println();
        LeaveRequest newLeaveRequest=new LeaveRequest(startDate,endDate,leaveType,requestedDays,employee);
        int flag=0;
        LeaveBalance leaveBalance=leaveBalanceRepository.findByEmployeeId(empId);
        switch (leaveType) {
            case "work from home":
                if(requestedDays<=leaveBalance.getAvailableWorkFromHome()) {
                    leaveBalance.setTotalWorkFromHomeTaken(leaveBalance.getTotalWorkFromHomeTaken() + requestedDays);
                    leaveBalance.setAvailableWorkFromHome(leaveBalance.getAvailableWorkFromHome() - requestedDays);
                }
                else{
                    flag=1;
                }
                break;
            case "casual":
                if(requestedDays<=leaveBalance.getAvailableCasualLeave()){
                leaveBalance.setTotalCasualLeaveTaken(leaveBalance.getTotalCasualLeaveTaken() + requestedDays);
                leaveBalance.setAvailableCasualLeave(leaveBalance.getAvailableCasualLeave() - requestedDays);
                }
                else{
                    flag=1;
                }
                break;
            case "marriage":
                if(requestedDays<=leaveBalance.getAvailableMarriageLeave()) {
                    leaveBalance.setAvailableMarriageLeave(leaveBalance.getAvailableMarriageLeave() - requestedDays);
                    leaveBalance.setTotalMarriageLeaveTaken(leaveBalance.getTotalMarriageLeaveTaken() + requestedDays);
                }
                else{
                    flag=1;
                }
                break;
            case "sick":
                if(requestedDays<=leaveBalance.getAvailableSickLeave()){
                leaveBalance.setAvailableSickLeave(leaveBalance.getAvailableSickLeave() - requestedDays);
                leaveBalance.setTotalSickLeaveTaken(leaveBalance.getTotalSickLeaveTaken() + requestedDays);
                }
                else{flag=1;}
                break;
            case "paid":
                if(requestedDays<=leaveBalance.getAvailablePaidLeave()){
                //leaveBalance.setAvailableUnpaidLeave(leaveBalance.getAvailableUnpaidLeave()- requestedDays);
                leaveBalance.setAvailablePaidLeave(leaveBalance.getAvailablePaidLeave() - requestedDays);
                leaveBalance.setTotalPaidLeaveTaken(leaveBalance.getTotalPaidLeaveTaken() + requestedDays);}
                else{flag=1;}
                break;
            case "floater":
                if(requestedDays<=leaveBalance.getAvailableFloaterLeave()){
                leaveBalance.setAvailableFloaterLeave(leaveBalance.getAvailableFloaterLeave() - requestedDays);
                leaveBalance.setTotalFloaterLeaveTaken(leaveBalance.getTotalFloaterLeaveTaken() + requestedDays);}
                else{flag=1;}
                break;
            case "unpaid":
                leaveBalance.setUnpaidLeave(leaveBalance.getUnpaidLeave() + requestedDays);
            default:
                throw new IllegalArgumentException("Invalid leave type.");
        }
        if(flag==1){
            if(requestedDays<=leaveBalance.getAvailablePaidLeave()){
                leaveBalance.setAvailablePaidLeave(leaveBalance.getAvailablePaidLeave() - requestedDays);
                leaveBalance.setTotalPaidLeaveTaken(leaveBalance.getTotalPaidLeaveTaken() + requestedDays);
                flag=2;
            }
            else leaveBalance.setUnpaidLeave(leaveBalance.getUnpaidLeave() + requestedDays);
        }
//        leaveBalance.setTotalLeave(
//                leaveBalance.getTotalCasualLeaveTaken()+leaveBalance.getTotalMarriageLeaveTaken()+
//                        leaveBalance.getTotalSickLeaveTaken()+leaveBalance.getTotalPaidLeaveTaken()+
//                        leaveBalance.getTotalFloaterLeaveTaken()
//        );
        leaveBalance.setTotalLeaveAvailable(
                leaveBalance.getAvailableCasualLeave()+leaveBalance.getAvailableMarriageLeave()+
                        leaveBalance.getAvailableSickLeave()+leaveBalance.getAvailablePaidLeave()+
                        leaveBalance.getAvailableFloaterLeave()
        );
        leaveBalance.setTotalLeaveTaken(
                leaveBalance.getTotalCasualLeaveTaken()+leaveBalance.getTotalMarriageLeaveTaken()+
                        leaveBalance.getTotalSickLeaveTaken()+leaveBalance.getTotalFloaterLeaveTaken()+
                        leaveBalance.getTotalPaidLeaveTaken()+leaveBalance.getUnpaidLeave()
        );

        leaveBalanceRepository.save(leaveBalance);
        leaveRequestRepository.save(newLeaveRequest);
        if(flag==1) return 0;
        if(flag==2) return 2;
        return 1;
    }

}
