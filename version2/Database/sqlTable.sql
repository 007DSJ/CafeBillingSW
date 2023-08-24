-- CREATE DATABASE cafesw;

-- SHOW DATABASES;

USE cafesw;

CREATE TABLE details(
    
    personName varchar(200),
    address text,
    gender varchar(7),
    meal1 varchar(200),
    meal2 varchar(200),
    quantity1 int,
    quantity2 int,
    total_bill double

);

SELECT * FROM details;

INSERT INTO details
VALUES ("Ishan","Noida","Male","Veg Burger","None",2,0,216);