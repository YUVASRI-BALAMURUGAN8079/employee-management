use main_project;

drop table if exists `events`;

CREATE TABLE `events` (
    event_id bigint AUTO_INCREMENT PRIMARY KEY,
    event_name VARCHAR(255) NOT NULL,
    event_date DATE NOT NULL,
    event_day varchar(25),
    event_location VARCHAR(255) NOT NULL,
    event_description TEXT,
    organizer_id bigint,
    allocated_funds bigint,
    FOREIGN KEY (organizer_id) REFERENCES employee (emp_id)
);

INSERT INTO `main_project`.`events` (`event_name`, `event_date`, `event_location`, `organizer_id`, `allocated_funds`) VALUES ('Pongal Celebration', '2023-01-12', 'Superops.ai,Chennai', '1005', '3000');
INSERT INTO `main_project`.`events` (`event_name`, `event_date`, `event_location`, `organizer_id`, `allocated_funds`) VALUES ('Republic Day Celebration', '2023-01-25', 'Superops.ai,Chennai', '1005', '1500');


select * from `events`;
