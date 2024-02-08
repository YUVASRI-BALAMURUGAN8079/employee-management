-- Experience(6)->		id,company name,job title,date of joining,data of relieving,location,description,experience

use main_project;

drop table if exists `experience`;

create table `experience`	(
id bigint auto_increment primary key,
emp_id bigint,
company_name varchar(100), 
job_title varchar(50), 
date_of_joining date, 
date_of_relieving date,
experience int,
location varchar(50),
description varchar(125),
FOREIGN KEY (emp_id) REFERENCES `employee`(emp_id)
);

select * from experience;

INSERT INTO `main_project`.`experience` (`emp_id`, `company_name`, `job_title`, `date_of_joining`, `date_of_relieving`, `location`) VALUES ('1003', 'FRESHWORKS', 'SOFTWARE ENGINEER', '2012-09-01', '2014-09-01', 'BANGALORE');
INSERT INTO `main_project`.`experience` (`emp_id`, `company_name`, `job_title`, `date_of_joining`, `date_of_relieving`, `location`) VALUES ('1003', 'ZOHO', 'SOFTWARE ENGINEER', '2014-10-01', '2018-12-01', 'BANGALORE');
INSERT INTO `main_project`.`experience` (`emp_id`, `company_name`, `job_title`, `date_of_joining`, `date_of_relieving`, `location`) VALUES ('1004', 'FRESHWORKS', 'SOFTWARE ENGINEER', '2012-09-01', '2014-09-01', 'CHENNAI');
INSERT INTO `main_project`.`experience` (`emp_id`, `company_name`, `job_title`, `date_of_joining`, `date_of_relieving`, `location`) VALUES ('1005', 'ZOHO', 'HR', '2012-09-01', '2014-09-01', 'CHENNAI');


select * from experience;
