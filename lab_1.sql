create database lab;
use lab;

CREATE TABLE Student (
id INT PRIMARY KEY,
name VARCHAR(50),
marks INT
);

INSERT INTO Student (id, name, marks)
VALUES
    (1, 'Rahul', 85),
    (2, 'Priya', 92),
    (3, 'Amit', 76),
    (4, 'Neha', 88),
    (5, 'Rohan', 65);

SELECT *
FROM Student
ORDER BY marks ASC;

SELECT *
FROM Student
ORDER BY marks DESC;