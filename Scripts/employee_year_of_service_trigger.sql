SET NEW.year_of_service = TIMESTAMPDIFF(YEAR, NEW.date_of_joining, CURDATE());