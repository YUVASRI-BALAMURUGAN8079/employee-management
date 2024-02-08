use main_project;

-- details(4) ->		id, gender,dob,marital status,blood group, physically handicrapped
-- 			work email,personal email, mobile phone	
-- 			current address,permanent address
--             

drop table if exists `details`;

create table `details`	(id bigint auto_increment primary key,
emp_id bigint,
name varchar(100), 
gender varchar(15), 
dob date, 
marital_status varchar(20),
blood_group varchar(40),
physically_challenged boolean, 
work_email varchar(30) unique,
personal_email varchar(30) unique,
mobile_phone bigint, 
current_address varchar(200),
permanent_address varchar(200),
password varchar(255),
FOREIGN KEY (emp_id) REFERENCES employee(emp_id));

select * from details;

INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ( '1001', 'GANESH', 'MALE', '1980-01-02', 'MARRIED', 'B+', '0', 'ganesh@supeorps.ai', 'ganesh@gmail.com', '9877282879', 'A-01,RM.COLONY,PERUNGUDI,CHENNAI', 'A-01,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1002', 'SURESH', 'MALE', '1983-04-05', 'MARRIED', 'B-', '0', 'suresh@supeorps.ai', 'suresh@gmail.com', '9027382639', 'B-01,RM.COLONY,PERUNGUDI,CHENNAI', 'B-01,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1003', 'HARISH', 'MALE', '1984-06-23', 'MARRIED', 'O+', '0', 'harish@supeorps.ai', 'harish@gmail.com', '8262816281', 'B-02,RM.COLONY,PERUNGUDI,CHENNAI', 'B-02,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1004', 'RAM', 'MALE', '1980-01-28', 'MARRIED', 'O-', '0', 'ram@supeorps.ai', 'ram@gmail.com', '8273627229', 'B-03,RM.COLONY,PERUNGUDI,CHENNAI', 'B-03,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1005', 'JANANI', 'FEMALE', '1983-07-12', 'MARRIED', 'AB-', '0', 'janani@supeorps.ai', 'janani@gmail.com', '9728372272', 'B-04,RM.COLONY,PERUNGUDI,CHENNAI', 'B-04,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1006', 'JANU', 'FEMALE', '1991-09-09', 'MARRIED', 'AB+', '0', 'janu@supeorps.ai', 'janu@gmail.com', '8269268363', 'C-01,RM.COLONY,PERUNGUDI,CHENNAI', 'C-01,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1007', 'ESWARI', 'FEMALE', '1994-03-19', 'MARRIED', 'A+', '0', 'eswari@supeorps.ai', 'eswari@gmail.com', '9727352863', 'C-02,RM.COLONY,PERUNGUDI,CHENNAI', 'C-02,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1008', 'JAISRI', 'FEMALE', '1992-04-23', 'MARRIED', 'O-', '0', 'jaisri@supeorps.ai', 'jaisri@gmail.com', '9383739373', 'C-03,RM.COLONY,PERUNGUDI,CHENNAI', 'C-03,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1009', 'VENI', 'FEMALE', '1995-11-16', 'SINGLE', 'A-', '0', 'veni@supeorps.ai', 'veni@gmail.com', '9987837378', 'C-04,RM.COLONY,PERUNGUDI,CHENNAI', 'C-04,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1010', 'WATSON', 'MALE', '1990-12-17', 'MARRIED', 'B-', '0', 'watson@supeorps.ai', 'watson@gmail.com', '8494730483', 'C-05,RM.COLONY,PERUNGUDI,CHENNAI', 'C-05,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1011', 'VISHWA', 'MALE', '1996-09-09', 'SINGLE', 'AB+', '0', 'vishwa@supeorps.ai', 'vishwa@gmail.com', '3283947643', 'D-01,RM.COLONY,PERUNGUDI,CHENNAI', 'D-01,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1012', 'MANI', 'MALE', '1994-10-26', 'SINGLE', 'O+', '0', 'mani@supeorps.ai', 'mani@gmail.com', '9373846343', 'D-02,RM.COLONY,PERUNGUDI,CHENNAI', 'D-02,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1013', 'MAKESHA', 'FEMALE', '1996-12-13', 'SINGLE', 'O+', '0', 'makesha@supeorps.ai', 'makesha@gmail.com', '9836483639', 'D-03,RM.COLONY,PERUNGUDI,CHENNAI', 'D-03,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1014', 'PRIYA', 'FEMALE', '1998-09-01', 'SINGLE', 'O-', '0', 'priya@supeorps.ai', 'priya@gmail.com', '9373638735', 'D-04,RM.COLONY,PERUNGUDI,CHENNAID-04,RM.COLONY,PERUNGUDI,CHENNAI', 'D-04,RM.COLONY,PERUNGUDI,CHENNAID-04,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1015', 'BALU', 'MALE', '1995-09-02', 'MARRIED', 'B+', '0', 'balu@supeorps.ai', 'balu@gmail.com', '6839439437', 'D-05,RM.COLONY,PERUNGUDI,CHENNAI', 'D-05,RM.COLONY,PERUNGUDI,CHENNAI');
INSERT INTO `main_project`.`details` (`emp_id`, `name`, `gender`, `dob`, `marital_status`, `blood_group`, `physically_challenged`, `work_email`, `personal_email`, `mobile_phone`, `current_address`, `permanent_address`) VALUES ('1016', 'BALA', 'MALE', '2000-10-03', 'SINGLE', 'B+', '0', 'bala@supeorps.ai', 'bala@gmail.com', '8363926402', 'E-01,RM.COLONY,PERUNGUDI,CHENNAI', 'E-01,RM.COLONY,PERUNGUDI,CHENNAI');
UPDATE `main_project`.`details` SET `current_address` = 'D-04,RM.COLONY,PERUNGUDI,CHENNAI', `permanent_address` = 'D-04,RM.COLONY,PERUNGUDI,CHENNAI' WHERE (`id` = '14');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '1');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '2');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '3');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '4');
UPDATE `main_project`.`details` SET `password` = '$2a$10$O.HH4kykcAAGq.muFsMIduHUPBaHQ.F6Fk1Zl7xmdvoUQwqR5OUia' WHERE (`id` = '5');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '6');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '7');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '8');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '9');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '10');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '11');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '12');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '13');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '14');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '15');
UPDATE `main_project`.`details` SET `password` = '$2a$10$lbAKW3JHFbcyxcpeh7/Pzudy7GXCbhXIKqDIL7OlW2Yp8T1ho2Btm' WHERE (`id` = '16');



select * from `details`;

