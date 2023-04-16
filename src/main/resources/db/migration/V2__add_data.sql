insert into Company(id,name) values (1,"Speed Transport SRL");
insert into user(name,password,company_id) values ("Ionescu George","123",1);
insert into user(name,password,company_id) values ("Andreea Gheorghe","abc",1);
insert into vehicle (registration_Number, company_id) values ("B-100-ABC",1);
insert into vehicle (registration_Number, company_id) values ("B-101-ABC",1);
insert into vehicle (registration_Number, company_id) values ("B-102-ABC",1);
insert into vehicle (registration_Number, company_id) values ("B-103-ABC",1);
insert into vehicle (registration_Number, company_id) values ("B-104-ABC",1);
insert into vehicle (registration_Number, company_id) values ("B-105-ABC",1);
insert into vehicle (registration_Number, company_id) values ("B-106-ABC",1);

INSERT INTO `fleet_management`.`technical_info`
(`id`, `brand`, `model`, `mileage`, `status`, `cubic_capacity`,
`power`, `fuel`, `fuel_consumption`, `body`, `length`, `width`, `height`, `own_weight`,
`maximum_weight`, `vehicle_id`) VALUES ('2', 'Mercedes', 'Benz', '50', 'activ', '2000',
'300', 'diesel', '3.5', 'truck', '4000', '1800', '1600', '3000', '3500', '1');
