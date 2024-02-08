use main_project;

drop table if exists `resignation`;

create table `resignation`(
	id bigint auto_increment primary key,
    emp_id	bigint,
    resignation_applied_date date, 
    reason varchar(255),
    feedback text,
    final_working_day date,
    Foreign key(emp_id) references employee(emp_id) );
    
select * from `resignation`;