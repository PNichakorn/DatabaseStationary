-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 27, 2020 at 01:29 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `datastationary`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Customer_code` varchar(10) COLLATE utf8_thai_520_w2 NOT NULL,
  `Customer_Name` varchar(30) COLLATE utf8_thai_520_w2 NOT NULL,
  `Customer_Address` varchar(100) COLLATE utf8_thai_520_w2 NOT NULL,
  `Customer_Tel` varchar(10) COLLATE utf8_thai_520_w2 NOT NULL,
  `Customer_Email` varchar(30) COLLATE utf8_thai_520_w2 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_thai_520_w2;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Customer_code`, `Customer_Name`, `Customer_Address`, `Customer_Tel`, `Customer_Email`) VALUES
('610055', 'ณัฐกนกสรวง เพิ่มมงคล', ' สุขสวัสดิ์ 33/2 แขวงราษฎร์บูรณะ กรุงเทพ', '0905519624', 'natkanoksoung99@gmail.com'),
('610812', 'กันติชา มณีกุล', '89 หมู่ 5 ตำบลเกาะเต่า  อำเภอป่าพะยอม จังหวัดพัทลุง', '0950282111', 'cream@hotmail.com'),
('610830', 'ณัฐพล นันไชยวงศ์', '41/1 หมู่ 7 ต.นาน้อย อ.นาน้อย น่าน 55150', '096258350', 'com@hotmail.com'),
('610832', 'ณิชากร แพงาม', '411/77 หมู่10 ถ.ประชาอุทิศ ต.ในคลองบางปลากด อ.พระสมุทรเจดีย์ สมุทรปราการ 10290', '0891304660', 'momantra00@gmail.com'),
('610837', 'ธนธร แก้วศรี', '16/1 ม.7 ถ.เทพคุณากร ต.โสธร อ.เมือง ฉะเชิงเทรา 24000', '0851429335', 'na2709@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `Pay_ID` varchar(10) COLLATE utf8_thai_520_w2 NOT NULL,
  `Pay_Date` date NOT NULL,
  `Total_Price` int(100) NOT NULL,
  `Customer_code` varchar(10) COLLATE utf8_thai_520_w2 NOT NULL,
  `Typ_Pay` varchar(100) COLLATE utf8_thai_520_w2 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_thai_520_w2;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`Pay_ID`, `Pay_Date`, `Total_Price`, `Customer_code`, `Typ_Pay`) VALUES
('XX0001', '2020-02-27', 120, '610055', 'โอนเงินผ่าน Internet banking'),
('XX0002', '2020-03-11', 130, '610832', 'โอนเงินผ่าน Internet banking'),
('XX0003', '2020-04-22', 140, '610837', 'โอนเงินผ่าน Internet banking'),
('XX0004', '2020-05-01', 400, '610812', 'ชำระเงินปลายทาง');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `Product_Code` varchar(10) COLLATE utf8_thai_520_w2 NOT NULL,
  `Product_Name` varchar(30) COLLATE utf8_thai_520_w2 NOT NULL,
  `Product_Price` int(10) NOT NULL,
  `Product_Detail` varchar(100) COLLATE utf8_thai_520_w2 NOT NULL,
  `Product_Stock` int(100) NOT NULL,
  `Product_Brand` varchar(100) COLLATE utf8_thai_520_w2 NOT NULL,
  `Type_Code` varchar(10) COLLATE utf8_thai_520_w2 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_thai_520_w2;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`Product_Code`, `Product_Name`, `Product_Price`, `Product_Detail`, `Product_Stock`, `Product_Brand`, `Type_Code`) VALUES
('A001', 'MILDLNER BRUSH', 60, 'ปากกาเน้นข้อความจากญี่ปุ่นหมึกไม่ซึม', 16, 'MildIiner', 'FT01TH'),
('A002', 'ปากกา SARASA', 32, 'ปากกาเจลหลากหลายสีขนาดมาตรฐาน 0.5 มม.', 109, 'Zebra sara', 'FT01TH'),
('A003', 'Sarasa Mark', 40, 'ปากกาเจล ที่มีความพิเศษไท้เหมือนใคร เพราะ สามารถเน้นข้อความทับได้ เนื้อเจลแห้งไว', 60, 'Zebra Sara', 'FT01TH'),
('A004', 'Sarasa CLI', 28, 'ปากกาเจลหลากสี ขนาดหัว 0.5 มม มีให้เลือกกว่า 20 สี ใช้งานง่าย หมึกไม่ซึม งานคุณภาพ', 520, 'Zebra sara', 'FT01TH'),
('A005', 'กระดาษโน๊ตMolinta', 70, 'กระดาษโน๊ต B5 เส้นกริด น่ารัก มีทั้งหมด8ลายให้เลือก จำนวน 50 แผ่น ขนาด 8.8 * 12 cm.', 42, '', 'FT02TH'),
('A006', 'Crayola Super tips set', 130, 'ปากกเนื้อหมึกที่ได้รับความนิยมมากในอเมริกา มาพร้อมกับหัวสามเหลี่ยม ประกอบด้วย set100สี พร้อมเเพ็กเกจ', 1, 'Crayola', 'FT01TH'),
('A007', 'Refill ไส้ปากกา Sarasa', 25, 'Refill Sarasa 0.5mm มาพร้อมกับสี น้ำเงิน แดง ดำ น้ำเงินเข้ม', 67, 'Zebra sara', 'FT01TH'),
('A008', 'Molinta Paper Note แบบกริด', 150, 'กระดาษโน๊ตลายกริด ขนาดB5 ความหนา 100 แกรม เขียนงาน จดบันทึกได้ยาวๆๆ ดีไซต์น่ารัก\'', 3, '', 'FT02TH');

-- --------------------------------------------------------

--
-- Table structure for table `producttype`
--

CREATE TABLE `producttype` (
  `Type_Code` varchar(10) COLLATE utf8_thai_520_w2 NOT NULL,
  `Type_Name` varchar(30) COLLATE utf8_thai_520_w2 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_thai_520_w2;

--
-- Dumping data for table `producttype`
--

INSERT INTO `producttype` (`Type_Code`, `Type_Name`) VALUES
('FT01TH', 'ปากกา'),
('FT02TH', 'สมุด'),
('FT03TH', 'ยางลบ'),
('FT04TH', 'ดินสอ');

-- --------------------------------------------------------

--
-- Table structure for table `purchaseorder`
--

CREATE TABLE `purchaseorder` (
  `Purchase_Code` varchar(10) COLLATE utf8_thai_520_w2 NOT NULL,
  `Date_BuyProduct` date NOT NULL,
  `Quantity_Product` int(100) NOT NULL,
  `Customer_Code` varchar(10) COLLATE utf8_thai_520_w2 NOT NULL,
  `Product_Code` varchar(10) COLLATE utf8_thai_520_w2 NOT NULL,
  `Trans_Code` varchar(10) COLLATE utf8_thai_520_w2 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_thai_520_w2;

--
-- Dumping data for table `purchaseorder`
--

INSERT INTO `purchaseorder` (`Purchase_Code`, `Date_BuyProduct`, `Quantity_Product`, `Customer_Code`, `Product_Code`, `Trans_Code`) VALUES
('PCH0001', '2020-02-27', 2, '610055', 'A001', 'K0001TH'),
('PCH0002', '2020-03-11', 1, '610832', 'A006', 'P0002TH'),
('PCH0003', '2020-04-22', 5, '610837', 'A004', 'K0001TH'),
('PCH0004', '2020-05-01', 10, '610812', 'A003', 'K0001TH');

-- --------------------------------------------------------

--
-- Table structure for table `transportation`
--

CREATE TABLE `transportation` (
  `Trans_Code` varchar(10) COLLATE utf8_thai_520_w2 NOT NULL,
  `Trans_Method` varchar(100) COLLATE utf8_thai_520_w2 NOT NULL,
  `Trans_Name` varchar(100) COLLATE utf8_thai_520_w2 NOT NULL,
  `Trans_Price` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_thai_520_w2;

--
-- Dumping data for table `transportation`
--

INSERT INTO `transportation` (`Trans_Code`, `Trans_Method`, `Trans_Name`, `Trans_Price`) VALUES
('K0001TH', 'ทางบก', 'Kerry', 60),
('P0002TH', 'ทางบก', 'ไปรษณีย์ด่วนพิเศษ (EMS)', 50),
('P0003TH', 'ทางบก', 'ไปรษณีย์ลงทะเบียน', 35);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Customer_code`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`Pay_ID`),
  ADD KEY `Customer_code` (`Customer_code`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`Product_Code`),
  ADD KEY `Type_Code` (`Type_Code`);

--
-- Indexes for table `producttype`
--
ALTER TABLE `producttype`
  ADD PRIMARY KEY (`Type_Code`);

--
-- Indexes for table `purchaseorder`
--
ALTER TABLE `purchaseorder`
  ADD PRIMARY KEY (`Purchase_Code`),
  ADD KEY `Customer_Code` (`Customer_Code`),
  ADD KEY `Product_Code` (`Product_Code`),
  ADD KEY `Trans_Code` (`Trans_Code`);

--
-- Indexes for table `transportation`
--
ALTER TABLE `transportation`
  ADD PRIMARY KEY (`Trans_Code`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`Customer_code`) REFERENCES `customer` (`Customer_code`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product_ibfk_1` FOREIGN KEY (`Type_Code`) REFERENCES `producttype` (`Type_Code`);

--
-- Constraints for table `purchaseorder`
--
ALTER TABLE `purchaseorder`
  ADD CONSTRAINT `purchaseorder_ibfk_1` FOREIGN KEY (`Customer_Code`) REFERENCES `customer` (`Customer_code`),
  ADD CONSTRAINT `purchaseorder_ibfk_2` FOREIGN KEY (`Product_Code`) REFERENCES `product` (`Product_Code`),
  ADD CONSTRAINT `purchaseorder_ibfk_3` FOREIGN KEY (`Trans_Code`) REFERENCES `transportation` (`Trans_Code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
