use CSE_3A_106
CREATE TABLE Dept(
	DepartmentID INT PRIMARY KEY,
	DepartmentName VARCHAR(100) NOT NULL UNIQUE,
	DepartmentCode VARCHAR(50) NOT NULL UNIQUE,
	Location VARCHAR(50) NOT NULL
);
CREATE TABLE Person(
	PersonID INT PRIMARY KEY,
	PersonName VARCHAR(100) NOT NULL,
	DepartmentID INT NULL,
	Salary DECIMAL(8,2) NOT NULL,
	JoiningDate DATETIME NOT NULL,
	City VARCHAR(100) NOT NULL,
	FOREIGN KEY (DepartmentID) REFERENCES Dept(DepartmentID)
);
INSERT INTO Dept(DepartmentID,DepartmentName,DepartmentCode,Location) VALUES
(1,'Admin','Adm','A-Block'),
(2,'Computer','CE','C-Block'),
(3,'Civil','CI','G-Block'),
(4,'Electrical','EE','E-Block'),
(5,'Mechanical','ME','B-Block');
INSERT INTO Person(PersonID,PersonName,DepartmentID,Salary,JoiningDate,City) VALUES
(101,'Rahul Tripathi',2,56000,'2000-01-01','Rajkot'),
(102,'Hardik Pandya',3,18000,'2001-09-25','Ahmedabad'),
(103,'Bhavin Kanani',4,25000,'2000-05-14','Baroda'),
(104,'Bhoomi Vaishnav',1,39000,'2005-02-08','Rajkot'),
(105,'Rohit Topiya',2,17000,'2001-07-23','Jamnagar'),
(106,'Priya Menpara',NULL,9000,'2000-10-18','Ahmedabad'),
(107,'Neha Sharma',2,34000,'2002-12-25','Rajkot'),
(108,'Nayan Goswami',3,25000,'2001-07-01','Rajkot'),
(109,'Mehul Bhundiya',4,13500,'2005-01-09','Baroda'),
(110,'Mohit Maru',5,14000,'2000-05-25','Jamnagar');

--PART-A
--1 Find all persons with their department name & code
SELECT p.PersonName,d.DepartmentName,d.DepartmentCode FROM PERSON AS p LEFT JOIN DEPT AS d ON p.DepartmentID=d.DepartmentID

--2 Find the person's name whose department is in C-Block.