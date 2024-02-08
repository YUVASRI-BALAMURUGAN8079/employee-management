DROP DATABASE IF EXISTS main_project;

create database main_project;

use main_project;

drop table if exists department;
 
create table department(id bigint auto_increment primary key,
name varchar(30));

select * from department;


INSERT INTO `main_project`.`department` (`name`) VALUES ('Management');
INSERT INTO `main_project`.`department` (`name`) VALUES ('Engineering');
INSERT INTO `main_project`.`department` (`name`) VALUES ('Marketing');
INSERT INTO `main_project`.`department` (`name`) VALUES ('Visual Design');
INSERT INTO `main_project`.`department` (`name`) VALUES ('Growth Maketing');
INSERT INTO `main_project`.`department` (`name`) VALUES ('Human Resources');
INSERT INTO `main_project`.`department` (`name`) VALUES ('Product and Content Marketing');
INSERT INTO `main_project`.`department` (`name`) VALUES ('Finance');
INSERT INTO `main_project`.`department` (`name`) VALUES ('Sales');
INSERT INTO `main_project`.`department` (`name`) VALUES ('Product Design');
INSERT INTO `main_project`.`department` (`name`) VALUES ('Product Management');
INSERT INTO `main_project`.`department` (`name`) VALUES ('Admin');
INSERT INTO `main_project`.`department` (`name`) VALUES ('Customer Management');

ALTER TABLE department ADD COLUMN introduced_date date;

UPDATE `main_project`.`department` SET `introduced_date` = '2019-05-05' WHERE (`id` = '1');
UPDATE `main_project`.`department` SET `introduced_date` = '2019-05-05' WHERE (`id` = '2');
UPDATE `main_project`.`department` SET `introduced_date` = '2019-05-05' WHERE (`id` = '3');
UPDATE `main_project`.`department` SET `introduced_date` = '2019-05-05' WHERE (`id` = '4');
UPDATE `main_project`.`department` SET `introduced_date` = '2019-05-05' WHERE (`id` = '5');
UPDATE `main_project`.`department` SET `introduced_date` = '2019-05-05' WHERE (`id` = '6');
UPDATE `main_project`.`department` SET `introduced_date` = '2019-05-10' WHERE (`id` = '7');
UPDATE `main_project`.`department` SET `introduced_date` = '2019-05-10' WHERE (`id` = '8');
UPDATE `main_project`.`department` SET `introduced_date` = '2019-05-10' WHERE (`id` = '9');
UPDATE `main_project`.`department` SET `introduced_date` = '2019-05-10' WHERE (`id` = '10');
UPDATE `main_project`.`department` SET `introduced_date` = '2019-05-10' WHERE (`id` = '11');
UPDATE `main_project`.`department` SET `introduced_date` = '2019-05-10' WHERE (`id` = '12');
UPDATE `main_project`.`department` SET `introduced_date` = '2019-05-10' WHERE (`id` = '13');


select * from department;