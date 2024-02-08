CREATE DEFINER=`root`@`localhost` TRIGGER `salary_BEFORE_INSERT` BEFORE INSERT ON `salary` FOR EACH ROW BEGIN
SET NEW.Monthly_CTC = NEW.Monthly_Basic + NEW.Monthy_HRA + NEW.Monthy_Special_Allowance;
SET NEW.Annually_Basic = NEW.Monthly_Basic*12;
SET NEW.Annually_HRA= NEW.Monthy_HRA*12;
SET NEW.Annually_Special_Allowance= NEW.Monthy_Special_Allowance*12;
SET NEW.Annual_CTC = NEW.Monthly_CTC*12;
END