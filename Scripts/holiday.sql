use main_project;

drop table if exists `holiday`;

CREATE TABLE holiday (
    holiday_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    holiday_name VARCHAR(255) NOT NULL,
    holiday_date DATE NOT NULL,
    holiday_day varchar(50),
    is_floater BOOLEAN DEFAULT true
);



select * from holiday;

INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`, `is_floater`) VALUES ('Pongal', '2023-01-15', '0');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`, `is_floater`) VALUES ('Thiruvalluvar Day', '2023-01-16', '0');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`, `is_floater`) VALUES ('Uzhavar Thirunal', '2023-01-17', '1');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`) VALUES ('Republic Day', '2023-01-26');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`, `is_floater`) VALUES ('Telugu New Year', '2023-03-22', '1');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`) VALUES ('Good Friday', '2023-04-07');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`, `is_floater`) VALUES ('Tamil New Year', '2023-04-14', '1');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`) VALUES ('May Day', '2023-05-01');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`) VALUES ('Bakrid', '2023-06-29');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`) VALUES ('Independence Day', '2023-08-15');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`, `is_floater`) VALUES ('Krishna Jayanthi', '2023-09-06', '1');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`) VALUES ('Vinayagar Chaturthi', '2023-09-17');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`, `is_floater`) VALUES ('Milad-un-Nabi', '2023-09-28', '1');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`) VALUES ('Gandhi Jayanthi', '2023-10-02');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`) VALUES ('Ayutha Pooja', '2023-10-23');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`, `is_floater`) VALUES ('Vijayadasami', '2023-10-24', '1');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`) VALUES ('Deepavali', '2023-11-12');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`, `is_floater`) VALUES ('Deepavali Next Day', '2023-11-13', '1');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`) VALUES ('Christmas', '2023-12-25');
INSERT INTO `main_project`.`holiday` (`holiday_name`, `holiday_date`, `is_floater`) VALUES ('Christmas Next Day', '2023-12-26', '1');

UPDATE `main_project`.`holiday` SET `is_floater` = '0' WHERE (`holiday_id` = '19');
UPDATE `main_project`.`holiday` SET `is_floater` = '0' WHERE (`holiday_id` = '17');
UPDATE `main_project`.`holiday` SET `is_floater` = '0' WHERE (`holiday_id` = '15');
UPDATE `main_project`.`holiday` SET `is_floater` = '0' WHERE (`holiday_id` = '14');
UPDATE `main_project`.`holiday` SET `is_floater` = '0' WHERE (`holiday_id` = '12');
UPDATE `main_project`.`holiday` SET `is_floater` = '0' WHERE (`holiday_id` = '10');
UPDATE `main_project`.`holiday` SET `is_floater` = '0' WHERE (`holiday_id` = '9');
UPDATE `main_project`.`holiday` SET `is_floater` = '0' WHERE (`holiday_id` = '8');
UPDATE `main_project`.`holiday` SET `is_floater` = '0' WHERE (`holiday_id` = '6');
UPDATE `main_project`.`holiday` SET `is_floater` = '0' WHERE (`holiday_id` = '4');


select * from holiday;
