insert into Company(id,name) values (1,"CIT One");
insert into user(name,password,company_id) values ("Vasile Bogdan Florin","123",1);
insert into user(name,password,company_id) values ("Bisca Alexandra","abc",1);
insert into vehicle (registration_Number, company_id) values ("B-100-CIT",1);
insert into vehicle (registration_Number, company_id) values ("B-101-CIT",1);
insert into vehicle (registration_Number, company_id) values ("B-102-CIT",1);
insert into vehicle (registration_Number, company_id) values ("B-103-CIT",1);
insert into vehicle (registration_Number, company_id) values ("B-104-CIT",1);
insert into vehicle (registration_Number, company_id) values ("B-105-CIT",1);
insert into vehicle (registration_Number, company_id) values ("B-106-CIT",1);

INSERT INTO `fleet_management`.`technical_info`
(`id`, `brand`, `model`, `mileage`, `status`, `cubic_capacity`,
`power`, `fuel`, `fuel_consumption`, `body`, `length`, `width`, `height`, `own_weight`,
`maximum_weight`, `vehicle_id`) VALUES ('2', 'Mercedes', 'Benz', '50', 'activ', '2000',
'300', 'diesel', '3.5', 'truck', '4000', '1800', '1600', '3000', '3500', '1');
