package com.example.query;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.Input.LeaveRequestInput;
import com.example.Service.*;
import com.example.annotation.All;
import com.example.annotation.RestrictEmployee;
import com.example.entity.*;
import com.example.repository.HolidayRepository;
import org.springframework.stereotype.Component;

import java.rmi.registry.Registry;
import java.util.List;

@Component
public class Query implements  GraphQLQueryResolver {

    private AadharService aadharService;
    private AnnouncementService announcementService;
    private DegreeAndCertificateService degreeAndCertificateService;
    private DepartmentService departmentService;
    private DesignationService designationService;
    private DetailsService detailsService;
    private DrivingLicenseService drivingLicenseService;
    private EmployeeService employeeService;
    private ExperienceService experienceService;
    private HolidayService holidayService;
    private LeaveService leaveService;
    private ModeService modeService;
    private PanService panService;
    private PaymentInformationService paymentInformationService;
    private ReportingTableService reportingTableService;
    private ResignationService resignationService;
    private SalaryService salaryService;
    private VoterCardService voterCardService;
    private EventService eventService;

    public Query(AadharService aadharService,AnnouncementService announcementService, DegreeAndCertificateService degreeAndCertificateService, DepartmentService departmentService, LeaveService leaveService,DesignationService designationService, DetailsService detailsService, DrivingLicenseService drivingLicenseService, EmployeeService employeeService,EventService eventService, ExperienceService experienceService,HolidayService holidayService, ModeService modeService, PanService panService, PaymentInformationService paymentInformationService, ReportingTableService reportingTableService, ResignationService resignationService,SalaryService salaryService, VoterCardService voterCardService) {
        this.aadharService = aadharService;
        this.announcementService=announcementService;
        this.degreeAndCertificateService = degreeAndCertificateService;
        this.departmentService = departmentService;
        this.designationService = designationService;
        this.detailsService = detailsService;
        this.drivingLicenseService = drivingLicenseService;
        this.employeeService = employeeService;
        this.eventService=eventService;
        this.experienceService = experienceService;
        this.holidayService=holidayService;
        this.leaveService=leaveService;
        this.modeService = modeService;
        this.panService = panService;
        this.paymentInformationService = paymentInformationService;
        this.reportingTableService = reportingTableService;
        this.resignationService=resignationService;
        this.salaryService = salaryService;
        this.voterCardService = voterCardService;
    }

    public List<Aadhar> getAllAadhar(){return aadharService.findAllAadhar();}

    @All
    public List<Announcement> getAllAnnouncements(){return announcementService.getAllAnnouncements();}

    public List<DegreeAndCertificate> getAllDegreeAndCertificate(){return degreeAndCertificateService.findAllDegreeAndCertificate();}

    @All
    public List<Department> getAllDepartments() { return departmentService.findAllDepartment();}

    @All
    public List<Designation> getAllDesignations(){ return designationService.findAllDesignations(); }

    @All
    public List<Details> getAllDetails(){return detailsService.findAllDetails();}
    public List<DrivingLicense> getAllDrivingLicense(){return drivingLicenseService.findAllDrivingLicense();}

    @All
    public List<Employee> getAllEmployee(){return employeeService.findAllEmployee();}

    public List<Experience> getAllExperience(){return experienceService.findAllExperience();}
    @All
    public List<Mode> getAllModes() { return modeService.findAllModes();}

    public List<Pan> getAllPan(){return panService.findAllPan();}
    public List<PaymentInformation> getAllPaymentInformation(){return paymentInformationService.findAllPaymentInformation();}
    @All
    public List<ReportingTable> getAllReportingRecords()
    {
        return reportingTableService.findAllReportingRecords();
    }

    public List<Salary> getAllSalary(){return salaryService.findAllSalary();}
    public List<VoterCard> getAllVoterCard(){return voterCardService.findAllVoterCard();}

    @RestrictEmployee
    public Aadhar getAadharByEmployeeId(Long id){
        return aadharService.findAadharByEmployeeId(id);
    }

    //public List<Announcement> findAnnouncementsByEmployeeId()

    @All
    public List<Announcement> findAnnouncementByAnnouncedEmployee(Long empId){
        return announcementService.getAnnouncementByAnnouncedEmployeeId(empId);
    }

    @All
    public List<Announcement> findAnnouncementByApprovedEmployee(Long id){
        return announcementService.getAnnouncementByApprovedEmployee(id);
    }

    @RestrictEmployee
    public List<DegreeAndCertificate> getDegreeAndCertificateByEmployeeId(Long id) {
        return degreeAndCertificateService.findDegreeAndCertificateByEmployeeId(id);
    }

    @All
    public Department getDepartmentByEmpId(Long id){
        return departmentService.findDepartmentByEmpId(id);
    }

    @All
    public Designation getDesignationByEmployeeId(Long id) { return designationService.findDesignationByEmployeeId(id); }

    @All
    public Details  getDetailsByEmployeeId(Long id){
        return detailsService.findDetailsByEmployeeId(id);
    }
    @RestrictEmployee
    public DrivingLicense getDrivingLicenseByEmployeeId(Long id){ return drivingLicenseService.findByDrivingLicenseEmployeeId(id); }

    @All
    public Employee getEmployeeById(Long id) { return employeeService.findEmployeeByEmployeeId(id); }
    @RestrictEmployee
    public List<Experience> getExperienceByEmployeeId(Long id) { return experienceService.findExperienceByEmployeeId(id); }

    @All
    public Mode getModeByEmployeeId(Long id)
    {
        return modeService.findModeByEmployeeId(id);
    }

    @RestrictEmployee
    public Pan getPanByEmployeeId(Long id){
        return panService.findPanByEmployeeId(id);
    }

    @RestrictEmployee
    public PaymentInformation getPaymentInformationByEmployeeId(Long id){
        return paymentInformationService.findPaymentInformationByEmployeeId(id);
    }
    @All
    public Employee getReportingManagerByEmployeeId(Long id) { return reportingTableService.findReportingManagerByEmployeeId(id); }

    @All
    public List<Employee> getEmployeesByReportingManagerId(Long id) {
        return reportingTableService.findEmployeesByReportingManagerId(id);
    }
    @RestrictEmployee
    public Salary getSalaryByEmployeeId(Long id) { return salaryService.findSalaryByEmployeeId(id);}

    @RestrictEmployee
    public VoterCard getVoterCardByEmployeeId(Long id){
        return voterCardService.findVoterCardByEmployeeId(id);
    }

    @All
    public List<Holiday> getAllHoliday(){
        return holidayService.findAllHolidays();
    }

    @All
    public Holiday getHolidayById(Long id){
        return holidayService.findHolidayById(id);
    }

    public List<Event> getAllEvents(){
        return eventService.findAllEvents();
    }

    public List<Event> getEventsByOrganiserId(Long id){
        return eventService.findEventsByOrganiserId(id);
    }

    public Event getEventById(Long id){
        return eventService.findEventById(id);
    }

    public List<LeaveBalance> getAllLeaveBalance(){
        return leaveService.getAllLeaveBalance();
    }

    @RestrictEmployee
    public LeaveBalance getLeaveBalanceByEmployeeId(Long id){
        return leaveService.getLeaveBalanceByEmployeeId(id);
    }

    @RestrictEmployee
    public LeaveBalance getLeaveBalanceById(Long id){
        return leaveService.findLeaveBalanceById(id);
    }

    public List<LeaveRequest> getAllLeaveRequest(){
        return leaveService.getAllLeaveRequest();
    }

    @RestrictEmployee
    public List<LeaveRequest> getLeaveRequestByEmployeeId(Long id){
        return leaveService.getLeaveRequestByEmployeeId(id);
    }

    @RestrictEmployee
    public LeaveRequest getLeaveRequestById(Long id){
        return leaveService.getLeaveRequestById(id);
    }

    public List<Resignation> getAllResignation(){
        return resignationService.findAllResignations();
    }
    public Resignation getResignationByEmployeeId(Long id){
        return resignationService.findResignationByEmployeeId(id);
    }
    public Resignation getResignationById(Long id){
        return resignationService.findResignationById(id);
    }
}
