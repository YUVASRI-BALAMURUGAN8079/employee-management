CREATE DEFINER=`root`@`localhost` TRIGGER `leave_balance_BEFORE_INSERT` BEFORE INSERT ON `leave_balance` FOR EACH ROW BEGIN
SET NEW.available_work_from_home=NEW.total_work_from_home-NEW.total_work_from_home_taken;
SET NEW.available_casual_leave =NEW.total_casual_leave-NEW.total_casual_leave_taken;
SET NEW.available_marriage_leave = NEW.total_marriage_leave-NEW.total_marriage_leave_taken;
SET NEW.available_sick_leave=NEW.total_sick_leave-NEW.total_sick_leave_taken;
SET NEW.available_unpaid_leave =NEW.total_paid_leave-NEW.total_paid_leave_taken;
SET NEW.available_floater_leave=NEW.total_floater_leave-NEW.total_floater_leave_taken;


SET NEW.total_leave=NEW.total_casual_leave+NEW.total_marriage_leave+NEW.total_sick_leave+NEW.total_paid_leave+NEW.total_floater_leave;
SET NEW.total_leave_available=NEW. available_casual_leave+NEW.available_marriage_leave+NEW.available_sick_leave+NEW.available_unpaid_leave+NEW.available_floater_leave;
SET NEW.total_leave_taken=NEW.total_casual_leave_taken+NEW.total_marriage_leave_taken+NEW.total_sick_leave_taken+NEW.total_paid_leave_taken+NEW.total_floater_leave_taken;
END