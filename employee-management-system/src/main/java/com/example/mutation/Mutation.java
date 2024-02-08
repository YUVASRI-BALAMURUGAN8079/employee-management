package com.example.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.Input.*;
import com.example.Service.*;
import com.example.entity.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class Mutation implements GraphQLMutationResolver {

    private AadharService aadharService;
    private AnnouncementService announcementService;
    private DegreeAndCertificateService degreeAndCertificateService;
    private DepartmentService departmentService;
    private DesignationService designationService;
    private DetailsService detailsService;
    private DrivingLicenseService drivingLicenseService;
    private EmployeeService employeeService;
    private EventService eventService;
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
    public Mutation(AadharService aadharService, LeaveService leaveService,AnnouncementService announcementService,DegreeAndCertificateService degreeAndCertificateService, DepartmentService departmentService, DesignationService designationService, DetailsService detailsService, DrivingLicenseService drivingLicenseService, EmployeeService employeeService, EventService eventService,ExperienceService experienceService, HolidayService holidayService, ModeService modeService, PanService panService, PaymentInformationService paymentInformationService, ReportingTableService reportingTableService, ResignationService resignationService,SalaryService salaryService, VoterCardService voterCardService) {
        this.aadharService = aadharService;
        this.announcementService=announcementService;
        this.degreeAndCertificateService = degreeAndCertificateService;
        this.departmentService = departmentService;
        this.designationService = designationService;
        this.detailsService = detailsService;
        this.drivingLicenseService = drivingLicenseService;
        this.employeeService = employeeService;
        this.leaveService=leaveService;
        this.eventService=eventService;
        this.experienceService = experienceService;
        this.holidayService=holidayService;
        this.modeService = modeService;
        this.panService = panService;
        this.paymentInformationService = paymentInformationService;
        this.reportingTableService = reportingTableService;
        this.resignationService=resignationService;
        this.salaryService = salaryService;
        this.voterCardService = voterCardService;
    }
    //deletion
    public String deleteDepartmentById(Long id){
        departmentService.deleteDepartment(id);
        return "Department "+id+" deleted";
    }

    public String deleteDesignationById(Long id){
        designationService.deleteDesignation(id);
        return "Designation "+id+" deleted";
    }

    public String deleteModeById(Long id){
        modeService.deleteModeById(id);
        return "Mode "+id+" deleted";
    }

    public String deleteEventById(Long id){
        eventService.deleteEventById(id);
        return "Event "+id+" deleted";
    }
    //creation

    public Employee addEmployee(EmployeeInput employeeInput){
        return employeeService.addEmployee(employeeInput);
    }

    public Aadhar addAadharDetailsByEmployeeId(AadharInput aadharInput)
    {
        return aadharService.addAadharDetailsByEmployeeId(aadharInput);
    }

    public DegreeAndCertificate addDegreeAndCertificate(DegreeAndCertificateInput degreeAndCertificateInput)
    {
        return degreeAndCertificateService.addDegreeAndCertificate(degreeAndCertificateInput);
    }

    public Department addDepartment(DepartmentInput departmentInput)
    {
        return departmentService.addDepartment(departmentInput);
    }

    public Designation addDesignation(DesignationInput designationInput)
    {
        return designationService.addDesignation(designationInput);
    }

    public Details addDetails(DetailsInput detailsInput)
    {
        return detailsService.addDetails(detailsInput);
    }

    public DrivingLicense addDrivingLicense(DrivingLicenseInput drivingLicenseInput)
    {
        return drivingLicenseService.addDrivingLicense(drivingLicenseInput);
    }

    public Event addEvent(EventInput eventInput){
        return eventService.addEvent(eventInput);
    }

    public Experience addExperience(ExperienceInput experienceInput)
    {
        return experienceService.addExperience(experienceInput);
    }

    public Mode addMode(ModeInput modeInput)
    {
        return modeService.addMode(modeInput);
    }

    public Pan addPan(PanInput panInput)
    {
        return panService.addPan(panInput);
    }

    public PaymentInformation addPaymentInformation(PaymentInformationInput paymentInformationInput)
    {
        return paymentInformationService.addPaymentInformation(paymentInformationInput);
    }

    public ReportingTable addReportingData(ReportingTableInput reportingTableInput)
    {
        return reportingTableService.addReportingData(reportingTableInput);
    }

    public Salary addSalaryToEmployeeById(SalaryInput salaryInput)
    {
        return salaryService.addSalary(salaryInput);
    }
    public VoterCard addVoterCardDetailsById(VoterCardInput voterCardInput)
    {
        return voterCardService.addVoterCard(voterCardInput);
    }
    public Department updateDepartmentByDepartmentId(DepartmentInput departmentInput){
        return departmentService.updateDepartment(departmentInput);
    }

    public Designation updateDesignationByDesignationId(DesignationInput designationInput){
        return designationService.updateDesignation(designationInput);
    }

    public Aadhar updateAadharByEmployeeId(AadharInput aadharInput){
        return aadharService.updateAadhar(aadharInput);
    }
    public DegreeAndCertificate updateDegreeAndCertificateById(DegreeAndCertificateInput degreeAndCertificateInput){
        return degreeAndCertificateService.updateDegreeAndCertificateByEmployeeId(degreeAndCertificateInput);
    }
    public Details updateDetailsByEmployeeId(DetailsInput detailsInput){
        return detailsService.updateDetailsByEmployeeId(detailsInput);
    }

    public DrivingLicense updateDrivingLicenseByEmployeeId(DrivingLicenseInput drivingLicenseInput){
        return drivingLicenseService.updateDrivingLicenseByEmployeeId(drivingLicenseInput);
    }

    public Employee updateEmployeeByEmployeeId(EmployeeInput employeeInput){
        return employeeService.updateEmployeeById(employeeInput);
    }

    public Event updateEvent(EventInput eventInput){
        return eventService.updateEvent(eventInput);
    }
    public Mode updateModeById(ModeInput modeInput){
        return modeService.updateModeByModeId(modeInput);
    }

    public Pan updatePanByEmployeeId(PanInput panInput){
        return panService.updatePanByEmployeeId(panInput);
    }

    public PaymentInformation updatePaymentInformationByEmployeeId(PaymentInformationInput paymentInformationInput){
        return paymentInformationService.updatePIByEmmployeeId(paymentInformationInput);
    }

    public Salary updateSalaryByEmployeeId(SalaryInput salaryInput){
        return salaryService.updateSalaryByEmployeeId(salaryInput);
    }
    public VoterCard updateVoterCardByEmployeeId(VoterCardInput voterCardInput){
        return voterCardService.updateVoterCard(voterCardInput);
    }

    public Experience updateExperienceById(ExperienceInput experienceInput){
        return experienceService.updateExperience(experienceInput);
    }



    public Announcement addAnnouncement(AnnouncementInput announcementInput){
        return announcementService.addAnnouncement(announcementInput);
    }

    public String deleteAnnouncementById(Long id){
        announcementService.deleteAnnouncementById(id);
        return "Deleted";
    }

    public Announcement updateAnnouncementById(AnnouncementInput announcementInput){
        return announcementService.updateAnnouncementById(announcementInput);
    }

    public Holiday addHoliday(HolidayInput holidayInput){
        return holidayService.addHoliday(holidayInput);
    }

    public Holiday updateHolidayById(HolidayInput holidayInput){
        return holidayService.updateHoliday(holidayInput);
    }

    public String deleteHolidayById(Long id){
        holidayService.deleteHolidayById(id);
        return "Deleted";
    }

    @Transactional
    public String deleteLeaveBalanceForEmployeeByEmployeeId(Long id){
        leaveService.deleteLeaveBalanceForEmployeeByEmployeeId(id);
        return "Deleted";
    }

    public String addLeaveRequest(LeaveRequestInput leaveRequestInput){
        int flag=leaveService.submitLeaveRequest(leaveRequestInput);
        if(flag==1)  return "submitted successfully";
        if(flag==2) return "submitted under paid leave";
        return "submitted under unpaid leave";
    }

    @Transactional
    public String addResignation(ResignationInput resignationInput){
        String ans=resignationService.addResignation(resignationInput);
        return ans;

    }

    public Resignation updateResignationByEmployeeId(ResignationInput resignationInput){
        return resignationService.updateResignationByEmployeeId(resignationInput);
    }

    @Transactional
    public String deleteResignationByEmployeeId(Long id){
        resignationService.deleteResignationByEmployeeId(id);
        return "deleted";
    }

    @Transactional
    public String updateReportingTableByEmployeeId(ReportingTableInput reportingTableInput){
        reportingTableService.updateReportingTable(reportingTableInput);
        return "success";
    }

    @Transactional
    public String addResignationWithAlternateManager(ResignationInput resignationInput,Long id){
        resignationService.processResignation(resignationInput,id);
        return "success";
    }

    @Transactional
    public String deleteReportingTable(Long id){
        reportingTableService.deleteEmployee(id);
        return "deleted";
    }

    public String addLeaveBalanceBalanceByEmployee(Long id){
        leaveService.initializeLeaveBalance(id);
        return "Success";
    }
}
