CREATE DEFINER = CURRENT_USER TRIGGER `main_project`.`experience_BEFORE_INSERT` BEFORE INSERT ON `experience` FOR EACH ROW
BEGIN
SET NEW.experience=TIMESTAMPDIFF(YEAR, new.date_of_joining,new.date_of_relieving);
END
