-- private Long id;
--     
--     @ManyToOne
--     @JoinColumn(name = "employee_id")
--     private Employee employee;
--     
--     private LocalDate startDate;
--     private LocalDate endDate;
--     private String leaveType;
--     private String status; // Approved, Pending, Rejected
--     

use main_project;

drop table if exists `leave_request`;

create table `leave_request` (
	id bigint auto_increment primary key,
    emp_id bigint,
    start_date DATE,
    end_date DATE,
    no_of_days int default 0,
    leave_type varchar(50),
    Foreign key(emp_id) references employee(emp_id)
);

select * from `leave_request`;