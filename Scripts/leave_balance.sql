use main_project;

drop table if exists `leave_balance`;

create table `leave_balance` (
	leave_id bigint AUTO_INCREMENT PRIMARY KEY,
	emp_id bigint not NULL unique,
    total_work_from_home int,
	total_casual_leave int ,
    total_marriage_leave int,
    total_sick_leave int,
    total_paid_leave int,
    total_floater_leave int,

    total_work_from_home_taken int default 0,
	total_casual_leave_taken int default 0,
    total_marriage_leave_taken int default 0,
    total_sick_leave_taken int default 0,
    total_paid_leave_taken int default 0,
    total_floater_leave_taken int default 0,
    
    available_work_from_home int default 0,
    available_casual_leave int default 0,
    available_marriage_leave int default 0,
    available_sick_leave int default 0,
    available_paid_leave  int default 0, 
    available_floater_leave int default 0,
    unpaid_leave int default 0,
    total_leave int default 0,
    total_leave_taken int default 0,
    total_leave_available int default 0,
    FOREIGN KEY(emp_id) REFERENCES employee(emp_id)
);

select * from `leave_balance`;

