-- user_role-> id,emp_id,role_id

USE main_project;

drop table if exists `user_role`;

create table `user_role`(id int primary key auto_increment,
emp_id bigint,role_id int,
foreign key (emp_id) references details(emp_id),
foreign key(role_id) references general_role(id));

INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1001', '2');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1002', '2');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1003', '2');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1004', '2');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1005', '1');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1006', '2');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1007', '2');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1008', '2');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1009', '2');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1010', '2');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1011', '2');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1012', '2');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1013', '2');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1014', '2');
INSERT INTO `main_project`.`user_role` (`emp_id`, `role_id`) VALUES ('1015', '2');

select * from user_role;

select d.work_email,gr.name from details d inner join user_role ur on d.emp_id=ur.emp_id 
inner join general_role gr on ur.role_id=gr.id;
select workEmail,password,1 as enabled from details;