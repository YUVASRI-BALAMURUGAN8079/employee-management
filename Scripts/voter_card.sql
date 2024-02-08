# Voter Id Card->{ id,voter id,name,father's name,gender,dob,address}

use main_project;

drop table if exists `voter_card`;

create table `voter_card`	(
id bigint auto_increment primary key,
emp_id bigint,
voter_id varchar(20) UNIQUE,
name varchar(100), 
father_name varchar(40),
gender varchar(15), 
dob date, 
address varchar(200),
FOREIGN KEY (emp_id) REFERENCES employee(emp_id));

select * from voter_card;

INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1001', 'GANESH ', 'KARTHICK', 'MALE', '1980-01-02', 'A-01,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1002', 'SURESH', 'MANIVANNAN', 'MALE', '1983-04-05', 'B-01,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1003', 'HARISH', 'THANGAVEL', 'MALE', '1984-06-23', 'B-02,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1004', 'RAM', 'SATHYARAJ', 'MALE', '1980-01-28', 'B-03,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1005', 'JANANI', 'CHANDRU', 'FEMALE', '1983-07-12', 'B-04,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1006', 'JANU', 'RAVI', 'FEMALE', '1991-09-09', 'C-01,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1007', 'ESWARI ', 'ARAVINDH', 'FEMALE', '1994-03-19', 'C-02,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1008', 'JAISRI', 'RAMAN', 'FEMALE', '1992-04-23', 'C-03,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1009', 'VENI', 'VISHAL', 'FEMALE', '1995-11-16', 'C-04,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1010', 'WATSON', 'CRIST', 'MALE', '1990-12-17', 'C-05,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1011', 'VISHWA', 'MANIKANNDAN', 'MALE', '1996-09-09', 'D-01,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1012', 'MANI', 'CHINNARASA', 'MALE', '1994-10-26', 'D-02,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1013', 'MAKESHA', 'PRAKASH', 'FEMALE', '1996-12-13', 'D-03,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1014', 'PRIYA', 'BALAMURUGAN', 'FEMALE', '1998-09-01', 'D-04,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1015', 'BALU', 'SATHAPAN', 'MALE', '1995-09-02', 'D-05,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`voter_card` (`emp_id`, `name`, `father_name`, `gender`, `dob`, `address`) VALUES ('1016', 'BALA', 'MURUGAN', 'MALE', '2000-10-03', 'E-01,RM.COLONY,PERUNGUDI,CHENNAI');

UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0184956' WHERE (`id` = '1');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0454927' WHERE (`id` = '2');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0156925' WHERE (`id` = '3');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0164983' WHERE (`id` = '4');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0164987' WHERE (`id` = '5');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0249394' WHERE (`id` = '6');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0278493' WHERE (`id` = '7');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0193349' WHERE (`id` = '8');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0162840' WHERE (`id` = '9');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0123309' WHERE (`id` = '10');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0162839' WHERE (`id` = '11');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0169725' WHERE (`id` = '12');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0162695' WHERE (`id` = '13');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0162896' WHERE (`id` = '14');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0167394' WHERE (`id` = '15');
UPDATE `main_project`.`voter_card` SET `voter_id` = 'YCV0167295' WHERE (`id` = '16');



select * from voter_card;