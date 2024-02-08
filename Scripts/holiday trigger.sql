CREATE DEFINER=`root`@`localhost` TRIGGER `holiday_BEFORE_INSERT` BEFORE INSERT ON `holiday` FOR EACH ROW BEGIN
 SET NEW.holiday_day = DAYNAME(NEW.holiday_date);
END