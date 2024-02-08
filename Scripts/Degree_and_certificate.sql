# Degree and certificate-> emp id, degree, branch/specialization,year of joining,year of completion,cgpa/percentage, university/college

use main_project;

drop table if exists `Degree_and_certificate`;

create table `Degree_and_certificate`	(
id bigint auto_increment primary key,
emp_id bigint,
degree varchar(25),
specialization varchar(25),
year_of_joining year ,
year_of_completion year,
cgpa int, 
university_college varchar(125),
FOREIGN KEY (emp_id) REFERENCES employee(emp_id)
);
use main_project;

select * from `Degree_and_certificate`;

select * from `Degree_and_certificate`;
