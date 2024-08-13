use CSE_3A_106
--LAB-9
--SUB QUERIES
CREATE TABLE STUDENT_DATA(
	no INT,
	Name VARCHAR(50),
	City VARCHAR(50),
	DID INT
);
INSERT INTO STUDENT_DATA(NO,NAME,CITY,DID) VALUES
(101,'Raju','Rajkot',10),
(102,'Amit','Ahmedabad',20),
(103,'Sanjay','Baroda',40),
(104,'Neha','Rajkot',20),
(105,'Meera','Ahmedabad',30),
(106,'Mahesh','Baroda',10);
CREATE TABLE ACADEMIC(
	Rno INT,
	SPI DECIMAL(3,1),
	Bklog INT
);
INSERT INTO ACADEMIC(Rno,SPI,Bklog) VALUES
(101,8.8,0),
(102,9.2,2),
(103,7.6,1),
(104,8.2,4),
(105,7.0,2),
(106,8.9,3);
CREATE TABLE DEPARTMENT(
	DID INT,
	DName VARCHAR(50)
);
INSERT INTO DEPARTMENT(DID,DNAME) VALUES 
(10,'Computer'),
(20,'Electrical'),
(30,'Mechanical'),
(40,'Civil');
--PART-A
--1 Display details of students who are from computer department
SELECT * FROM STUDENT_DATA WHERE DID=(SELECT DID FROM DEPARTMENT WHERE DNAME='Computer');
--2 Displays name of students whose SPI is more than 8
SELECT Name FROM STUDENT_DATA WHERE no IN(SELECT RNO FROM ACADEMIC WHERE SPI>8)
--3 Display details of students of computer department who belongs to Rajkot city
SELECT * FROM STUDENT_DATA WHERE DID=(SELECT DID FROM DEPARTMENT WHERE DNAME='Computer') AND CITY='Rajkot';
--4 Find total number of students of electrical department
SELECT COUNT(no) FROM STUDENT_DATA WHERE DID=(SELECT DID FROM DEPARTMENT WHERE DNAME='Electrical')
--5 Display name of student who is having maximum SPI.
SELECT NAME FROM STUDENT_DATA WHERE no IN(SELECT RNO FROM ACADEMIC WHERE SPI=(SELECT MAX(SPI) FROM ACADEMIC))
--6 Display details of students having more than 1 backlog.
SELECT * FROM STUDENT_DATA WHERE no IN(SELECT RNO FROM ACADEMIC WHERE Bklog>1);
--PART-B
--1 Display name of students who are either from computer department or from mechanical department
SELECT Name FROM STUDENT_DATA WHERE DID IN(SELECT DID FROM DEPARTMENT WHERE DNAME IN('Computer','Mechanical'));
--2 Display name of students who are in same department as 102 studying in
SELECT Name FROM STUDENT_DATA WHERE DID IN(SELECT DID FROM STUDENT_DATA WHERE no=102);
--PART-C
--1 Display name of students whose SPI is more than 9 and who is from electrical department.
SELECT NAME FROM STUDENT_DATA WHERE no IN(SELECT RNO FROM ACADEMIC WHERE SPI>9) AND DID=(SELECT DID FROM DEPARTMENT WHERE DNAME='Electrical');
--2 Display name of student who is having second highest SPI.
SELECT NAME FROM STUDENT_DATA WHERE no IN(SELECT Rno FROM ACADEMIC WHERE SPI=(SELECT MAX(SPI) FROM ACADEMIC WHERE SPI<(SELECT MAX(SPI) FROM ACADEMIC)))
--3 Display city names whose students branch wise SPI is 9.2
SELECT CITY FROM STUDENT_DATA WHERE no=(SELECT RNO FROM ACADEMIC WHERE SPI=9.2) AND DID IN(SELECT DID FROM DEPARTMENT GROUP BY DID);
