#employee->	id,first name,middle name,last name,date of joining
#			details_id, reporting id,payment_id,salary id,department id,job id,employement mode id

USE main_project;

drop table if exists `employee`;

create table `employee`	(
emp_id bigint auto_increment primary key,
first_name varchar(25),
last_name varchar(25),
date_of_joining date,
year_of_service int,
working_status boolean,
department_id bigint,
job_id bigint ,
employement_mode_id bigint,
FOREIGN KEY (department_id) REFERENCES department(id),
FOREIGN KEY (job_id) REFERENCES `role`(id),
FOREIGN KEY (employement_mode_id) REFERENCES employement_mode(id))auto_increment=1001;

INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('GANESH ', 'K', '2019-05-05', '1', '1', '1');
INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('SURESH', 'M', '2019-05-05', '1', '1', '2');
INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('HARISH', 'T', '2019-05-05', '1', '4', '3');
INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('RAM', 'S', '2019-05-05', '1', '5', '4');
INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('JANANI', 'C', '2019-05-05', '1', '6', '5');
INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('JANU', 'R', '2019-05-10', '1', '7', '6');
INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('ESWARI ', 'A', '2019-05-10', '1', '8', '7');
INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('JAISRI', 'R', '2019-05-10', '1', '9', '8');
INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('VENI ', 'V', '2019-05-10', '1', '10', '9');

INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('WATSON', 'C', '2019-05-10', '1', '2', '55');
INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('VISHWA', 'M', '2019-05-10', '1', '11', '30');
INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('MANI', 'C', '2019-05-10', '1', '4', '34');
INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('MAKESHA', 'P' ,'2019-06-01', '1', '4', '35');

INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('PRIYA', 'B', '2019-06-01', '1', '9', '37');
INSERT INTO `main_project`.`employee` (`first_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('BALU', '2019-06-01', '1', '9', '38');

INSERT INTO `main_project`.`employee` (`first_name`, `last_name`, `date_of_joining`, `working_status`, `department_id`, `job_id`) VALUES ('BALA', 'M', '2020-09-01', '1', '6', '43');
UPDATE `main_project`.`employee` SET `working_status` = '1', `employement_mode_id` = '1' WHERE (`emp_id` = '1002');
UPDATE `main_project`.`employee` SET `working_status` = '1', `employement_mode_id` = '1' WHERE (`emp_id` = '1003');
UPDATE `main_project`.`employee` SET `working_status` = '1', `employement_mode_id` = '1' WHERE (`emp_id` = '1013');
UPDATE `main_project`.`employee` SET `employement_mode_id` = '1' WHERE (`emp_id` = '1001');
UPDATE `main_project`.`employee` SET `employement_mode_id` = '1' WHERE (`emp_id` = '1004');
UPDATE `main_project`.`employee` SET `employement_mode_id` = '1' WHERE (`emp_id` = '1005');
UPDATE `main_project`.`employee` SET `employement_mode_id` = '2' WHERE (`emp_id` = '1006');
UPDATE `main_project`.`employee` SET `employement_mode_id` = '2' WHERE (`emp_id` = '1007');
UPDATE `main_project`.`employee` SET `employement_mode_id` = '1' WHERE (`emp_id` = '1008');
UPDATE `main_project`.`employee` SET `employement_mode_id` = '1' WHERE (`emp_id` = '1009');
UPDATE `main_project`.`employee` SET `employement_mode_id` = '1' WHERE (`emp_id` = '1010');
UPDATE `main_project`.`employee` SET `employement_mode_id` = '1' WHERE (`emp_id` = '1011');
UPDATE `main_project`.`employee` SET `employement_mode_id` = '1' WHERE (`emp_id` = '1012');
UPDATE `main_project`.`employee` SET `employement_mode_id` = '1' WHERE (`emp_id` = '1014');
UPDATE `main_project`.`employee` SET `employement_mode_id` = '1' WHERE (`emp_id` = '1015');
UPDATE `main_project`.`employee` SET `employement_mode_id` = '6' WHERE (`emp_id` = '1016');


select * from `employee`;

select * from `employee`;


