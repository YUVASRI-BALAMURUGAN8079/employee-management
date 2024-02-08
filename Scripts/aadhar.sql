-- 3)Aadhar->{id,aadhar number, dob,name,address,gender}
use main_project;
drop table if exists `aadhar`;

create table `aadhar`	(id bigint auto_increment primary key, emp_id bigint unique,aadhar_number varchar(20) unique,
date_of_birth date,name varchar(50),address varchar(125),gender varchar(15),
FOREIGN KEY (emp_id) REFERENCES employee(emp_id));

INSERT INTO `main_project`.`aadhar` (`emp_id`, `aadhar_number`, `date_of_birth`, `name`, `gender`) VALUES ('1001', '2635 2825 2725 2722', '1980-01-02', 'GANESH', 'MALE');
INSERT INTO `main_project`.`aadhar` (`emp_id`, `aadhar_number`, `date_of_birth`, `name`, `gender`) VALUES ('1002', '2226 9529 1752 9652', '1983-04-05', 'SURESH', 'MALE');
INSERT INTO `main_project`.`aadhar` (`emp_id`, `aadhar_number`, `date_of_birth`, `name`, `address`, `gender`) VALUES ('1003', '9087 1736 1292 1271', '1984-06-23', 'HARISH', 'A-01,RM.COLONY,PERUNGUDI,CHENNAI', 'MALE');
INSERT INTO `main_project`.`aadhar` (`emp_id`, `aadhar_number`, `date_of_birth`, `name`, `address`, `gender`) VALUES ('1004', '7283 1836 2368 2872', '1980-01-28', 'RAM', 'B-01,RM.COLONY,PERUNGUDI,CHENNAI', 'MALE');
INSERT INTO `main_project`.`aadhar` (`emp_id`, `aadhar_number`, `date_of_birth`, `name`, `address`, `gender`) VALUES ('1005', '1228 2632 2724 2722', '1983-07-12', 'JANANI', 'B-02,RM.COLONY,PERUNGUDI,CHENNAI', 'FEMALE');
INSERT INTO `main_project`.`aadhar` (`emp_id`, `aadhar_number`, `date_of_birth`, `name`, `address`, `gender`) VALUES ('1006', '0236 2352 2736 2863', '1991-09-09', 'JANU', 'B-03,RM.COLONY,PERUNGUDI,CHENNAI', 'FEMALE');
INSERT INTO `main_project`.`aadhar` (`emp_id`, `aadhar_number`, `date_of_birth`, `name`, `address`, `gender`) VALUES ('1007', '9626 2736 2698 2726', '1994-03-19', 'ESWARI', 'B-04,RM.COLONY,PERUNGUDI,CHENNAI', 'FEMALE');
INSERT INTO `main_project`.`aadhar` (`emp_id`, `aadhar_number`, `date_of_birth`, `name`, `address`, `gender`) VALUES ('1008', '2245 2852 2672 2262', '1992-04-23', 'JAISRI', 'C-01,RM.COLONY,PERUNGUDI,CHENNAI', 'FEMALE');
INSERT INTO `main_project`.`aadhar` (`emp_id`, `aadhar_number`, `date_of_birth`, `name`, `address`, `gender`) VALUES ('1009', '2725 2725 2275 2696', '1995-11-16', 'VENI', 'C-02,RM.COLONY,PERUNGUDI,CHENNAI', 'FEMALE');
INSERT INTO `main_project`.`aadhar` (`emp_id`, `aadhar_number`, `date_of_birth`, `name`, `address`, `gender`) VALUES ('1010', '1972 1581 8581 1792', '1990-12-17', 'WATSON', 'C-03,RM.COLONY,PERUNGUDI,CHENNAI', 'MALE');

UPDATE `main_project`.`aadhar` SET `address` = 'B-02,RM.COLONY,PERUNGUDI,CHENNAI' WHERE (`id` = '3');
UPDATE `main_project`.`aadhar` SET `address` = 'A-01,RM.COLONY,PERUNGUDI,CHENNAI' WHERE (`id` = '1');
UPDATE `main_project`.`aadhar` SET `address` = 'B-03,RM.COLONY,PERUNGUDI,CHENNAI' WHERE (`id` = '4');
UPDATE `main_project`.`aadhar` SET `address` = 'B-01,RM.COLONY,PERUNGUDI,CHENNAI' WHERE (`id` = '2');
UPDATE `main_project`.`aadhar` SET `address` = 'B-04,RM.COLONY,PERUNGUDI,CHENNAI' WHERE (`id` = '5');
UPDATE `main_project`.`aadhar` SET `address` = 'C-01,RM.COLONY,PERUNGUDI,CHENNAI' WHERE (`id` = '6');
UPDATE `main_project`.`aadhar` SET `address` = 'C-02,RM.COLONY,PERUNGUDI,CHENNAI' WHERE (`id` = '7');
UPDATE `main_project`.`aadhar` SET `address` = 'C-03,RM.COLONY,PERUNGUDI,CHENNAI' WHERE (`id` = '8');
UPDATE `main_project`.`aadhar` SET `address` = 'C-04,RM.COLONY,PERUNGUDI,CHENNAI' WHERE (`id` = '9');
UPDATE `main_project`.`aadhar` SET `address` = 'C-05,RM.COLONY,PERUNGUDI,CHENNAI' WHERE (`id` = '10');



select * from `aadhar`;

INSERT INTO `main_project`.`aadhar` (`emp_id`,`aadhar_number`, `date_of_birth`, `name`, `address`, `gender`) VALUES ('1','1234 6874 8648 2483', '2000-12-04', 'GANESH K', 'G-27,RM Colony,Puliyur,Karur', 'MALE');
INSERT INTO `main_project`.`aadhar` (`emp_id`,`aadhar_number`, `date_of_birth`, `name`, `address`, `gender`) VALUES ('2','2839 2538 9637 2586', '1999-04-04', 'SURESH G', 'F-12,Anna Nagar,Chennai', 'MALE');
INSERT INTO `main_project`.`aadhar` (`emp_id`,`aadhar_number`, `date_of_birth`, `name`, `address`, `gender`) VALUES ('3','8348 3840 2396 4743', '1998-06-07', 'RAMESH S', '66,CBI Colony,Perungudi, Chennai', 'MALE');

select * from `aadhar`;