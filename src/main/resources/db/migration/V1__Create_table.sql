CREATE TABLE Company(
    id INT PRIMARY KEY,
    company_name VARCHAR(255) NOT NULL,
    employees_number INT NOT NULL
) engine=InnoDB DEFAULT CHARSET = gbk;

CREATE TABLE Employee(
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(10),
    company_id INT NOT NULL,
    salary INT NOT NULL
) engine=InnoDB DEFAULT CHARSET = utf8;

create table 