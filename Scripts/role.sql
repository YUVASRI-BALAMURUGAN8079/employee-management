use main_project;

drop table if exists `role`;
 
create table `role`(id bigint auto_increment primary key,
name varchar(100));

select * from `role`;

INSERT INTO `main_project`.`role` (`name`) VALUES ('CEO');
INSERT INTO `main_project`.`role` (`name`) VALUES ('CPO and CTO');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Lead Visual Designer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Growth Marketing Manager');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Senior Manager-HR');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Head of Content');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Head of Finance');
INSERT INTO `main_project`.`role` (`name`) VALUES ('VP of Sales');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Principle Design Manager');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Product Designer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Junior Product Designer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Lead of Product Designer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Senior Engineer Manager');
INSERT INTO `main_project`.`role` (`name`) VALUES ('FrontEnd Architect');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Engineering Manager');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Senior Engineering Manager');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Senior Backend Engineer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Backend Engineer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Junior Software Engineer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Lead Backend Engineer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('InternShip-Software Engineer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('ML Engineer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Lead FrontEnd Engineer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Senior FrontEnd Engineer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Mobile App Developer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Senior QA ');
INSERT INTO `main_project`.`role` (`name`) VALUES ('devOps Manager');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Lead devops Engineer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Technical Architect');
INSERT INTO `main_project`.`role` (`name`) VALUES ('VP of Product');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Product Manager');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Associate Product Manager');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Lead of Visual Designer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Senior Motion Designer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Senior Video Designer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Senior Visual Designer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Account Executive');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Senior SDR');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Sales and Representative');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Junior SDR');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Marketing Analyst');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Marketing Operations Specialist');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Admin,Intern-HR');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Content Marketing Specialist');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Junior Product Marketing Associate');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Product Experience Speacilist');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Accounts Executive');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Solution Engineer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Lead Customer Support Specialist');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Senior Customer Success Specialist');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Sales Manager');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Senior Lead Solutions Engineer');
INSERT INTO `main_project`.`role` (`name`) VALUES ('Senior Lead-Sales and Support En');
INSERT INTO `main_project`.`role` (`name`) VALUES ('RevOps Manager');
INSERT INTO `main_project`.`role` (`name`) VALUES ('VP of Engineering');

select * from `role`;