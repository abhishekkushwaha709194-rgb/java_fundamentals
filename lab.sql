use lab;

CREATE TABLE employee (
                          id INT PRIMARY KEY,
                          salary INT NOT NULL
);

INSERT INTO employee (id, salary)
VALUES
    (1, 20000),
    (2, 30000),
    (3, 15000);

SELECT MAX(salary) AS maxSalary
FROM employee;

SELECT MIN(salary) AS minSalary
FROM employee;

SELECT AVG(salary) AS avgSalary
FROM employee;

SELECT SUM(salary) AS totalSalary
FROM employee;


