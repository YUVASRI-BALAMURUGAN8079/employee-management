-- role-> id,role_name


use main_project;

drop table if exists `general_role`;

create table `general_role` (id int primary key auto_increment,
	name varchar(50));

select * from general_role;

INSERT INTO `main_project`.`general_role` (`id`, `name`) VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `main_project`.`general_role` (`id`, `name`) VALUES ('2', 'ROLE_EMPLOYEE');
