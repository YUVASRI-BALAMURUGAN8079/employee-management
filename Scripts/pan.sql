-- 4)Pan->{id, permanent number,name,dob,parent's/spouse's name }
use main_project;

drop table if exists `Pan`;

create table `Pan`	(
id bigint auto_increment primary key, 
emp_id bigint,
pan_number varchar(20) UNIQUE,
name varchar(50),
date_of_birth date,
parent_or_spouse_name varchar(40),
FOREIGN KEY (emp_id) REFERENCES employee(emp_id));

INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1001', 'TNASR1234A', 'GANESH ', '1980-01-02', 'KARTHICK');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1002', 'TNASR1234B', 'SURESH', '1983-04-05', 'MANIVANNAN');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1003', 'TNASR1234C', 'HARISH', '1984-06-23', 'THANGAVEL');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1004', 'TNASR1234D', 'RAM', '1980-01-28', 'SATHYARAJ');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1005', 'TNASR1234E', 'JANANI', '1983-07-12', 'CHANDRU');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1006', 'TNASR1234I', 'JANU', '1991-09-09', 'RAVI');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1007', 'TNASR1234V', 'ESWARI', '1994-03-19', 'ARAVINDH');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1008', 'TNASR1234W', 'JAISRI', '1992-04-23', 'RAMAN');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1009', 'TNASR1234P', 'VENI', '1995-11-16', 'VISHAL');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1010', 'TNASR1234L', 'WATSON', '1990-12-17', 'CRIST');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1011', 'TNASR1234U', 'VISHWA', '1996-09-09', 'MANIKANNDAN');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1012', 'TNASR1234H', 'MANI', '1994-10-26', 'CHINNARASA');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1013', 'TNASR1234Q', 'MAKESHA', '1996-12-13', 'PRAKASH');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1014', 'TNASR1234Y', 'PRIYA', '1998-09-01', 'BALAMURUGAN');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1015', 'TNASR1234O', 'BALU', '1995-09-02', 'SATHAPAN');
INSERT INTO `main_project`.`Pan` (`emp_id`, `pan_number`, `name`, `date_of_birth`, `parent_or_spouse_name`) VALUES ('1016', 'TNASR17544E', 'BALA', '2000-10-03', 'MURUGAN');



select * from `Pan`;
