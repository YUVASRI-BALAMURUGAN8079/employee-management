# Driving license->{id,license number,name,dob,blood goup,father's name,expire on,address}

use main_project;

drop table if exists `driving_license`;

create table `driving_license`	(id bigint auto_increment primary key,
emp_id bigint,
license_number varchar(16) UNIQUE,
name varchar(100), dob date,
blood_group varchar(20),
father_name varchar(40),date_of_issue date,valid_till date,
address varchar(200),
FOREIGN KEY (emp_id) REFERENCES employee(emp_id));

INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1001', 'TN99 20192842374', 'GANESH', '1980-01-02', 'B+', 'KARTHICK', '2000-01-09', '2023-12-12', 'A-01,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1002', 'TN99 20192842849', 'SURESH', '1983-04-05', 'B-', 'MANIVANNAN', '2001-01-09', '2023-12-12', 'B-01,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1003', 'TN99 20192862893', 'HARISH', '1984-06-23', 'O+', 'THANGAVEL', '2002-01-09', '2023-12-12', 'B-02,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1004', 'TN99 20192827392', 'RAM', '1980-01-28', 'O+', 'SATHYARAJ', '2003-01-09', '2023-12-12', 'B-03,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1005', 'TN99 20192283928', 'JANANI', '1983-07-12', 'AB-', 'CHANDRU', '2004-01-09', '2023-12-12', 'B-04,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1006', 'TN98 20192827392', 'JANU', '1991-09-09', 'AB+', 'RAVI', '2005-01-09', '2023-12-12', 'C-01,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1007', 'TN99 22837209829', 'ESWARI', '1994-03-19', 'A+', 'ARAVINDH', '2006-01-09', '2023-12-12', 'C-02,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1008', 'TN99 28374929827', 'JAISRI', '1992-04-23', 'O-', 'RAMAN', '2007-01-09', '2023-12-12', 'C-03,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1009', 'TN99 29382939812', 'VENI', '1995-11-16', 'A-', 'VISHAL', '2008-01-09', '2023-12-12', 'C-04,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1010', 'TN99 93749398439', 'WATSON', '1990-12-17', 'B-', 'CRIST', '2009-01-09', '2023-12-12', 'C-05,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1011', 'TN99 27393047329', 'VISHWA', '1996-09-09', 'AB+', 'MANIKANNDAN', '2000-01-09', '2023-12-12', 'D-01,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1012', 'TN99 28409326303', 'MANI', '1994-10-26', 'O+', 'CHINNARASA', '2001-01-09', '2023-12-12', 'D-02,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1013', 'TN99 27393649343', 'MAKESHA', '1996-12-13', 'O+', 'PRAKASH', '2002-01-09', '2023-12-12', 'D-03,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1014', 'TN99 17392749327', 'PRIYA', '1998-09-01', 'O-', 'BALAMURUGAN', '2003-01-09', '2023-12-12', 'D-04,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1015', 'TN99 17392946342', 'BALU', '1995-09-02', 'B+', 'SATHAPAN', '2004-01-09', '2023-12-12', 'D-05,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`driving_license` (`emp_id`, `license_number`, `name`, `dob`, `blood_group`, `father_name`, `date_of_issue`, `valid_till`, `address`) VALUES ('1016', 'TN99 34837493745', 'BALA', '2000-10-03', 'B+', 'MURUGAN', '2020-01-09', '2030-12-12', 'E-01,RM.COLONY,PERUNGUDI,CHENNAI');


select * from driving_license;

SELECT * FROM driving_license;




