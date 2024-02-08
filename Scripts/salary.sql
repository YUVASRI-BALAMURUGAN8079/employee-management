-- Salary(2)->		salary id, monthy_basic,monthy_HRA,monthy_SpecialAllowance, Total_CTC
-- 			anually_basic,anually_HRA,anually_SpecialAllowance,Annual_CTC

drop table if exists `salary`;

create table `salary`	(
salary_id bigint auto_increment primary key, 
emp_id bigint UNIQUE, 
Monthly_Basic bigint, 
Monthy_HRA bigint,
Monthy_Special_Allowance bigint, 
Annually_Basic bigint,
Annually_HRA bigint, 
Annually_Special_Allowance bigint,
Monthly_CTC bigint,
Annual_CTC bigint,
FOREIGN KEY (emp_id) REFERENCES employee(emp_id)
);

select * from salary;

select * from salary;
