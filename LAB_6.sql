--LAB-6
use CSE_3A_106
-- Math functions

--PART-A
--1 Display the result of 5 multiply by 30
SELECT 5*30;

--2 Find out the absolute value of -25, 25, -50 and 50
SELECT ABS(-25),ABS(25),ABS(-50),ABS(50);

--3 . Find smallest integer value that is greater than or equal to 25.2, 25.7 and -25.2
SELECT CEILING(25.2),CEILING(25.7),CEILING(-25.2);

--4 Find largest integer value that is smaller than or equal to 25.2, 25.7 and -25.2
SELECT FLOOR(25.2),FLOOR(25.7),FLOOR(-25.2);

--5 Find out remainder of 5 divided 2 and 5 divided by 3
SELECT 5 % 2,5 % 3;

--6 Find out value of 3 raised to 2nd power and 4 raised 3rd power.
SELECT POWER(3,2),POWER(4,3);

--7 Find out the square root of 25, 30 and 50.
SELECT SQUARE(25),SQUARE(30),SQUARE(50);

--8 Find out the square of 5, 15, and 25.
SELECT SQRT(5),SQRT(15),SQRT(25);

--9 Find out the value of PI.
SELECT PI();

--10 Find out round value of 157.732 for 2, 0 and -2 decimal points.
SELECT ROUND(157.732,2),ROUND(157.732,0),ROUND(157.732,-2);

--11 Find out exponential value of 2 and 3.
SELECT EXP(2),EXP(3);

--12 Find out logarithm having base e of 10 and 2.
SELECT LOG(10),LOG(2);

--13 . Find out logarithm having base b having value 10 of 5 and 100
SELECT LOG(5,10),LOG(100,10);

--14 Find sine, cosine and tangent of 3.1415.
SELECT SIN(3.1415),COS(3.1415),TAN(3.1415);

--15 Find sign of -25, 0 and 25.
SELECT SIGN(-25),SIGN(0),SIGN(25);

--16 Generate random number using function.
SELECT RAND();

--PART-B
CREATE TABLE EMP_MASTER(
	EmpNo int,
	EmpName varchar(50),
	JoiningDate datetime,
	Salary decimal(7,2),
	Commission int,
	City varchar(50),
	DeptCode varchar(25)
);
INSERT INTO EMP_MASTER(EmpNo,EmpName,JoiningDate,Salary,Commission,City,DeptCode) VALUES 
(101,'Keyur','2002-01-05',12000.00,4500,'Rajkot','3@g'),
(102,'Hardik','2004-02-15',14000.00,2500,'Ahmedabad','3@'),
(103,'Kajal','2006-03-14',15000.00,3000,'Baroda','3-GD'),
(104,'Bhoomi','2005-06-23',12500.00,1000,'Ahmedabad','1A3D'),
(105,'Harmit','2004-02-15',14000.00,2000,'Rajkot','312A');

--1 Display the result of Salary plus Commission.
SELECT SALARY+COMMISSION AS RESULT FROM EMP_MASTER;

--2 Find smallest integer value that is greater than or equal to 55.2, 35.7 and -55.2.
SELECT CEILING(55.2),CEILING(35.7),CEILING(-55.2);

--3 Find largest integer value that is smaller than or equal to 55.2, 35.7 and -55.2
SELECT FLOOR(55.2),FLOOR(35.7),FLOOR(-55.2);

--4 Find out remainder of 55 divided 2 and 55 divided by 3.
SELECT 55 % 2,55 % 3;

--5 Find out value of 23 raised to 2nd power and 14 raised 3rd power.
SELECT POWER(23,2),POWER(14,3);

--PART-C

--1 Find out the square root of 36, 49 and 81
SELECT SQRT(36),SQRT(49),SQRT(81);

--2 Find out the square of 3, 9, and 12.
SELECT SQUARE(3),SQUARE(9),SQUARE(12);

--3 Find out round value of 280.8952 for 2, 0 and -2 decimal points
SELECT ROUND(280.8952,2),ROUND(280.8952,0),ROUND(280.8952,-2);

--4 Find sine, cosine and tangent of 4.2014.
SELECT SIN(4.2014),COS(4.2014),TAN(4.2014);

--5 Find sign of -55, 0 and 95.
SELECT SIGN(-55),SIGN(0),SIGN(95);

--String functions
--PART-A
--1 Find the length of following. (I) NULL (II) ‘ hello ’ (III) Blank
--(I)
SELECT LEN(NULL);
--(II)
SELECT LEN('hello');
--(III)
SELECT LEN('');

--2 Display your name in lower & upper case.
SELECT LOWER('AumFaldu'),UPPER('AumFaldu');

--3 Display first three characters of your name.
SELECT SUBSTRING('AumFaldu',0,4);

--4 Display 3rd to 10th character of your name.
SELECT SUBSTRING('AumBhaiFaldu',3,8);

--5 Write a query to convert ‘abc123efg’ to ‘abcXYZefg’ & ‘abcabcabc’ to ‘ab5ab5ab5’ using REPLACE.
SELECT REPLACE('abc123efg','123','XYZ'),REPLACE('abcabcabc','c','5');

--6 Write a query to display ASCII code for ‘a’,’A’,’z’,’Z’, 0, 9.
SELECT ASCII('a'),ASCII('A'),ASCII('z'),ASCII('Z'),ASCII('0'),ASCII('9');

--7 Write a query to display character based on number 97, 65,122,90,48,57
SELECT CHAR(97),CHAR(65),CHAR(122),CHAR(90),CHAR(48),CHAR(57);

--8 Write a query to remove spaces from left of a given string ‘hello world ‘
SELECT LTRIM('hello world ');

--9 Write a query to remove spaces from right of a given string ‘ hello world ‘
SELECT RTRIM(' hello world ');

--10 Write a query to display first 4 & Last 5 characters of ‘SQL Server’
SELECT LEFT('SQL Server',4)+RIGHT('SQL Server',5);

--11 Write a query to convert a string ‘1234.56’ to number (Use cast and convert function).
SELECT CAST(1234.56 AS INT);
SELECT CONVERT(INT,1234.56);

--12 Write a query to convert a float 10.58 to integer (Use cast and convert function).
SELECT CAST(10.58 AS INT);
SELECT CONVERT(INT,10.58);

--13 Put 10 space before your name using function
SELECT SPACE(10)+'AumFaldu';

--14 Combine two strings using + sign as well as CONCAT ().
SELECT 'Aum'+'Faldu';
SELECT CONCAT('Aum','Faldu');

--15 Find reverse of “Darshan”.
SELECT REVERSE('Darshan');

--16 Repeat your name 3 times
SELECT REPLICATE('AumFaldu',3);
