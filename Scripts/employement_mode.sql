use main_project;

drop table if exists `employement_mode`;

create table `employement_mode`	(id bigint auto_increment primary key,
name varchar(100));

select * from `employement_mode`;

INSERT INTO `main_project`.`employement_mode` (`name`) VALUES ('Full Time');
INSERT INTO `main_project`.`employement_mode` (`name`) VALUES ('Part Time');
INSERT INTO `main_project`.`employement_mode` (`name`) VALUES ('Temporary');
INSERT INTO `main_project`.`employement_mode` (`name`) VALUES ('Contract');
INSERT INTO `main_project`.`employement_mode` (`name`) VALUES ('Remote');
INSERT INTO `main_project`.`employement_mode` (`name`) VALUES ('Intern');

select * from `employement_mode`;