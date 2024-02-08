CREATE DEFINER=`root`@`localhost` TRIGGER `leave_request_BEFORE_UPDATE` BEFORE UPDATE ON `leave_request` FOR EACH ROW BEGIN
SET NEW.no_of_days = DATEDIFF(NEW.end_date, NEW.start_date)+1;
END