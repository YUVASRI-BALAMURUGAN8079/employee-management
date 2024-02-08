
use main_project;
drop table if exists `reporting_table`;

CREATE TABLE reporting_table (
	id bigint auto_increment primary key,
    emp_id bigint unique,
    reporting_to_emp_id bigint,
    FOREIGN KEY (emp_id) REFERENCES employee(emp_id),
    FOREIGN KEY (reporting_to_emp_id) REFERENCES employee(emp_id)
);
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1001', '1001');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1002', '1001');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1003', '1001');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1004', '1001');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1005', '1001');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1006', '1001');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1007', '1001');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1008', '1001');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1009', '1002');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1010', '1002');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1011', '1002');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1012', '1003');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1013', '1003');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1014', '1004');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1015', '1004');
INSERT INTO `main_project`.`reporting_table` (`emp_id`, `reporting_to_emp_id`) VALUES ('1016', '1005');

select * from reporting_table;

select * from reporting_table;