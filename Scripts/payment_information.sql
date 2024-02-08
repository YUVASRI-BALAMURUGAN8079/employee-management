# PaymentInformation(1)-> payment id,salary payment mode,bank,account number, 
# ifsc code, name of the account, PF status,PF number,universal account number,pf join date, name of the account

drop table if exists `payment_information`;

create table `payment_information`	(
payment_id bigint auto_increment primary key,
emp_id bigint unique,
salary_payment_mode varchar(125),
bank_name varchar(125), 
account_number varchar(30) UNIQUE,  
ifsc_code varchar(125) UNIQUE,
name_of_the_account varchar(125),
PF_status boolean,
PF_number varchar(100)UNIQUE,
PF_join_date date,
name_on_the_PF_account varchar(124),
FOREIGN KEY (emp_id) REFERENCES employee(emp_id));

select * from payment_information;

INSERT INTO `main_project`.`payment_information` (`emp_id`, `salary_payment_mode`, `bank_name`, `account_number`, `ifsc_code`, `name_of_the_account`, `PF_status`, `PF_number`, `PF_join_date`, `name_on_the_PF_account`) VALUES ('1003', 'BANK PAYMENT', 'HDFC BANK', '7293762979865', 'AWSD000T123', 'HARISH', '1', 'TNBAN1627895086765432', '2000-09-09', 'HARISH');
INSERT INTO `main_project`.`payment_information` (`emp_id`, `salary_payment_mode`, `bank_name`, `account_number`, `ifsc_code`, `name_of_the_account`, `PF_status`, `PF_number`, `PF_join_date`, `name_on_the_PF_account`) VALUES ('1004', 'BANK PAYMENT', 'HDFC BANK', '7293762979866', 'AWSD000T128', 'RAM', '1', 'TNBAN1627895086765435', '2001-09-09', 'RAM');
INSERT INTO `main_project`.`payment_information` (`emp_id`, `salary_payment_mode`, `bank_name`, `account_number`, `ifsc_code`, `name_of_the_account`, `PF_status`, `PF_number`, `PF_join_date`, `name_on_the_PF_account`) VALUES ('1005', 'BANK PAYMENT', 'HDFC BANK', '7293762979867', 'AWSD000T127', 'JANAI', '1', 'TNBAN1627895086765437', '2008-09-17', 'JANAI');
INSERT INTO `main_project`.`payment_information` (`emp_id`, `salary_payment_mode`, `bank_name`, `account_number`, `ifsc_code`, `name_of_the_account`, `PF_status`, `PF_number`, `PF_join_date`, `name_on_the_PF_account`) VALUES ('1006', 'BANK PAYMENT', 'HDFC BANK', '7293762979869', 'AWSD000T126', 'JANU', '1', 'TVBAN1627895086765439', '2006-10-17', 'JANU');


select * from payment_information;
