?GO
/****** Object:  Table [dbo].[CUSTOMER2]    Script Date: 14-08-2024 13:11:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[CUSTOMER2](
	[customer_id] [int] NULL,
	[cust_name] [varchar](30) NULL,
	[city] [varchar](30) NULL,
	[Grade] [int] NULL,
	[salesman_id] [int] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ORDERS]    Script Date: 14-08-2024 13:11:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ORDERS](
	[ord_no] [int] NULL,
	[purch_amt] [decimal](8, 2) NULL,
	[ord_date] [datetime] NULL,
	[customer_id] [int] NULL,
	[salesman_id] [int] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SALESMAN]    Script Date: 14-08-2024 13:11:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SALESMAN](
	[salesman_id] [int] NULL,
	[name] [varchar](30) NULL,
	[city] [varchar](30) NULL,
	[commission] [decimal](4, 2) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[CUSTOMER2] ([customer_id], [cust_name], [city], [Grade], [salesman_id]) VALUES (3002, N'Nick Rimando', N'New York', 100, 5001)
INSERT [dbo].[CUSTOMER2] ([customer_id], [cust_name], [city], [Grade], [salesman_id]) VALUES (3007, N'Brad Davis', N'New York', 200, 5001)
INSERT [dbo].[CUSTOMER2] ([customer_id], [cust_name], [city], [Grade], [salesman_id]) VALUES (3005, N'Graham Zusi', N'California', 200, 5002)
INSERT [dbo].[CUSTOMER2] ([customer_id], [cust_name], [city], [Grade], [salesman_id]) VALUES (3008, N'Julian Green', N'London', 300, 5002)
INSERT [dbo].[CUSTOMER2] ([customer_id], [cust_name], [city], [Grade], [salesman_id]) VALUES (3004, N'Fabian Johnson', N'Paris', 300, 5006)
INSERT [dbo].[CUSTOMER2] ([customer_id], [cust_name], [city], [Grade], [salesman_id]) VALUES (3009, N'Geoff Cameron', N'Berlin', 100, 5003)
INSERT [dbo].[CUSTOMER2] ([customer_id], [cust_name], [city], [Grade], [salesman_id]) VALUES (3003, N'Jozy Altidor', N'Moscow', 200, 5007)
INSERT [dbo].[CUSTOMER2] ([customer_id], [cust_name], [city], [Grade], [salesman_id]) VALUES (3001, N'Brad Guzan', N'London', NULL, 5005)
INSERT [dbo].[CUSTOMER2] ([customer_id], [cust_name], [city], [Grade], [salesman_id]) VALUES (4001, N'abc', N'ABC', 900, NULL)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70001, CAST(150.50 AS Decimal(8, 2)), CAST(N'2012-12-05 00:00:00.000' AS DateTime), 3005, 5002)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70009, CAST(270.65 AS Decimal(8, 2)), CAST(N'2012-11-10 00:00:00.000' AS DateTime), 3001, 5005)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70001, CAST(65.26 AS Decimal(8, 2)), CAST(N'2012-10-05 00:00:00.000' AS DateTime), 3002, 5001)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70004, CAST(110.50 AS Decimal(8, 2)), CAST(N'2012-08-17 00:00:00.000' AS DateTime), 3009, 5003)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70007, CAST(948.50 AS Decimal(8, 2)), CAST(N'2012-11-10 00:00:00.000' AS DateTime), 3005, 5002)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70005, CAST(2400.60 AS Decimal(8, 2)), CAST(N'2012-07-27 00:00:00.000' AS DateTime), 3007, 5001)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70008, CAST(5760.00 AS Decimal(8, 2)), CAST(N'2012-11-10 00:00:00.000' AS DateTime), 3002, 5001)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70010, CAST(1983.43 AS Decimal(8, 2)), CAST(N'2012-10-10 00:00:00.000' AS DateTime), 3004, 5006)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70003, CAST(2480.40 AS Decimal(8, 2)), CAST(N'2012-10-10 00:00:00.000' AS DateTime), 3009, 5003)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70012, CAST(250.45 AS Decimal(8, 2)), CAST(N'2012-06-27 00:00:00.000' AS DateTime), 3008, 5002)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70011, CAST(75.29 AS Decimal(8, 2)), CAST(N'2012-08-17 00:00:00.000' AS DateTime), 3003, 5007)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70013, CAST(3045.60 AS Decimal(8, 2)), CAST(N'2012-04-25 00:00:00.000' AS DateTime), 3002, 5001)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70001, CAST(150.50 AS Decimal(8, 2)), CAST(N'2012-12-05 00:00:00.000' AS DateTime), 3005, 5002)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70009, CAST(270.65 AS Decimal(8, 2)), CAST(N'2012-11-10 00:00:00.000' AS DateTime), 3001, 5005)
INSERT [dbo].[ORDERS] ([ord_no], [purch_amt], [ord_date], [customer_id], [salesman_id]) VALUES (70001, CAST(65.26 AS Decimal(8, 2)), CAST(N'2012-10-05 00:00:00.000' AS DateTime), 3002, 5001)
INSERT [dbo].[SALESMAN] ([salesman_id], [name], [city], [commission]) VALUES (5001, N'James Hoog', N'New York', CAST(0.15 AS Decimal(4, 2)))
INSERT [dbo].[SALESMAN] ([salesman_id], [name], [city], [commission]) VALUES (5002, N'Nail Knite', N'Paris', CAST(0.13 AS Decimal(4, 2)))
INSERT [dbo].[SALESMAN] ([salesman_id], [name], [city], [commission]) VALUES (5005, N'Pit Alex', N'London', CAST(0.11 AS Decimal(4, 2)))
INSERT [dbo].[SALESMAN] ([salesman_id], [name], [city], [commission]) VALUES (5006, N'Mc Lyon', N'Paris', CAST(0.14 AS Decimal(4, 2)))
INSERT [dbo].[SALESMAN] ([salesman_id], [name], [city], [commission]) VALUES (5007, N'Paul Adam', N'Rome', CAST(0.13 AS Decimal(4, 2)))
INSERT [dbo].[SALESMAN] ([salesman_id], [name], [city], [commission]) VALUES (5003, N'Lauson Hen', N'San Jose', CAST(0.12 AS Decimal(4, 2)))