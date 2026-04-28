CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE student(
    roll INT PRIMARY KEY,
    name VARCHAR(50),
    m1 INT,
    m2 INT,
    m3 INT,
    m4 INT,
    m5 INT
);

INSERT INTO student VALUES
(1,'Arun',78,80,75,88,90),
(2,'Meera',90,85,87,92,88),
(3,'Rahul',60,70,65,72,68);
