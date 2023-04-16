CREATE TABLE company (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE user (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  password varchar(255) DEFAULT NULL,
  company_id int DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FOREIGN KEY (company_id) REFERENCES company (id)
);

CREATE TABLE vehicle (
  id int NOT NULL AUTO_INCREMENT,
  registration_Number varchar(255) DEFAULT NULL,
  company_id int DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FOREIGN KEY (company_id) REFERENCES company (id)
);


CREATE TABLE technical_info (
  id int NOT NULL AUTO_INCREMENT,
  brand varchar(255) DEFAULT NULL,
  model varchar(255) DEFAULT NULL,
  mileage int DEFAULT NULL,
  status varchar(255) DEFAULT NULL,
  cubic_capacity int DEFAULT NULL,
  power int DEFAULT NULL,
  fuel varchar(255) DEFAULT NULL,
  fuel_consumption double,
  body varchar(255) DEFAULT NULL,
  length int DEFAULT NULL,
  width int DEFAULT NULL,
  height int DEFAULT NULL,
  own_weight int DEFAULT NULL,
  maximum_weight int DEFAULT NULL,
  vehicle_id int DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FOREIGN KEY (vehicle_id) REFERENCES vehicle (id)
);


