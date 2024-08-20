--LAB-11
CREATE TABLE STU_INFO(
	Rno INT,
	Name varchar(50),
	Branch varchar(50)
);
CREATE TABLE RESULT(
	Rno INT,
	SPI DECIMAL(3,1)
);
CREATE TABLE EMPLOYEE_MASTER(
	EmployeeNo varchar(50),
	Name varchar(50),
	ManagerNo varchar(50)
);
INSERT INTO STU_INFO(Rno,Name,Branch) VALUES
(101,'Raju','CE'),
(102,'Amit','CE'),
(103,'Sanjay','ME'),
(104,'Neha','EC'),
(105,'Meera','EE'),
(106,'Mahesh','ME');
INSERT INTO RESULT(Rno,SPI) VALUES
(101,8.8),
(102,9.2),
(103,7.6),
(104,8.2),
(105,7.0),
(107,8.9);
INSERT INTO EMPLOYEE_MASTER(EmployeeNo,Name,ManagerNo) VALUES
('E01','Tarun',NULL),
('E02','Rohan','E02'),
('E03','Priya','E01'),
('E04','Milan','E03'),
('E05','Jay','E01'),
('E06','Anjana','E04');

--PART-A
--1 Combine information from student and result table using cross join or Cartesian product
SELECT * FROM STU_INFO CROSS JOIN RESULT;

--2 Perform inner join on Student and Result tables.
SELECT * FROM STU_INFO INNER JOIN RESULT ON STU_INFO.Rno=RESULT.Rno;

--3  Perform the left outer join on Student and Result tables
SELECT * FROM STU_INFO LEFT OUTER JOIN RESULT ON STU_INFO.Rno=RESULT.Rno;

--4 Perform the right outer join on Student and Result tables.
SELECT * FROM STU_INFO RIGHT OUTER JOIN RESULT ON STU_INFO.Rno=RESULT.Rno;

--5 Perform the full outer join on Student and Result tables. 
SELECT * FROM STU_INFO FULL OUTER JOIN RESULT ON STU_INFO.Rno=RESULT.Rno;

--6 Display Rno, Name, Branch and SPI of all students
SELECT S.Rno,Name,Branch,R.SPI FROM STU_INFO AS S LEFT JOIN RESULT AS R ON S.Rno=R.Rno;

--7 Display Rno, Name, Branch and SPI of CE branch’s student only
SELECT S.Rno,Name,Branch,R.SPI FROM STU_INFO AS S INNER JOIN RESULT AS R ON S.Rno=R.Rno WHERE BRANCH='CE';

--8 Display Rno, Name, Branch and SPI of other than EC branch’s student only.
SELECT S.Rno,Name,Branch,R.SPI FROM STU_INFO AS S INNER JOIN RESULT AS R ON S.Rno=R.Rno WHERE BRANCH != 'EC';

--9 Display average result of each branch
SELECT BRANCH,AVG(SPI) FROM STU_INFO AS S INNER JOIN RESULT AS R ON S.Rno=R.Rno GROUP BY BRANCH;

--10 Display average result of CE and ME branch
SELECT BRANCH,AVG(SPI) FROM STU_INFO AS S INNER JOIN RESULT AS R ON S.Rno=R.Rno WHERE BRANCH IN ('CE','ME') GROUP BY BRANCH;

--PART-B
--1 Display average result of each branch and sort them in ascending order by SPI.
SELECT BRANCH,AVG(SPI) FROM STU_INFO AS S INNER JOIN RESULT AS R ON S.Rno=R.Rno GROUP BY BRANCH ORDER BY AVG(SPI);

--2 Display highest SPI from each branch and sort them in descending order.
SELECT BRANCH,MAX(SPI) FROM STU_INFO AS S INNER JOIN RESULT AS R ON S.Rno=R.Rno GROUP BY BRANCH ORDER BY MAX(SPI) DESC;

--PART-C
--1 Retrieve the names of employee along with their manager’s name from the Employee table.
SELECT E1.NAME,E2.NAME FROM EMPLOYEE_MASTER E1 INNER JOIN EMPLOYEE_MASTER E2 ON E1.MANAGERNO=E2.EMPLOYEENO;
