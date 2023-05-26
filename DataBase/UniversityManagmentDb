-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 14, 2023 at 08:23 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `universitymanagmentdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

CREATE TABLE `adminlogin` (
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`Username`, `Password`) VALUES
('Admin', 'Admin@123');

-- --------------------------------------------------------

--
-- Table structure for table `managelecturer`
--

CREATE TABLE `managelecturer` (
  `IndexNo` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `qualification` varchar(50) NOT NULL,
  `department` varchar(50) NOT NULL,
  `experience` int(11) NOT NULL,
  `phone` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `managelecturer`
--

INSERT INTO `managelecturer` (`IndexNo`, `name`, `address`, `age`, `gender`, `qualification`, `department`, `experience`, `phone`) VALUES
('IT-001', 'Inoka', 'Kandy', 34, 'Female', 'Master', 'School of Computing', 10, 774512455),
('IT-002', 'Prasanna', 'Kandy', 44, 'Male', 'PHD', 'School of Computing', 3, 785643122),
('IT-003', 'Shehan', 'Colombo', 36, 'Male', 'PHD', 'School of Computing', 3, 761234123),
('IT-004', 'Nishani', 'Jaffna', 33, 'Female', 'PHD', 'School of Computing', 4, 786543211),
('SB-001', 'Sunil', 'Kandy', 47, 'Male', 'Master', 'School of Business', 8, 765467890),
('SB-002', 'Ashan', 'Dambulla', 35, 'Male', 'Master', 'School of Business', 4, 775544345),
('SB-003', 'Aruna', 'Dambulla', 40, 'Male', 'PHD', 'School of Business', 6, 775544332),
('SB-004', 'Thrindu', 'Matale', 32, 'Male', 'Master', 'School of Business', 2, 765464490);

-- --------------------------------------------------------

--
-- Table structure for table `managestudentsresult`
--

CREATE TABLE `managestudentsresult` (
  `IndexNo` varchar(50) NOT NULL,
  `Department` varchar(50) NOT NULL,
  `Programme` varchar(50) NOT NULL,
  `GradePoints` double DEFAULT NULL,
  `GPA` double DEFAULT NULL,
  `FinalGrade` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `managestudentsresult`
--

INSERT INTO `managestudentsresult` (`IndexNo`, `Department`, `Programme`, `GradePoints`, `GPA`, `FinalGrade`) VALUES
('DCSD-002', 'School of Computing', 'Computer System Design', 119, 3.4, 'Pass'),
('DCSD-003', 'School of Computing', 'Computer System Design', NULL, NULL, NULL),
('DM-001', 'School of Business', 'Digital Marketing', NULL, NULL, NULL),
('DSE-001', 'School of Computing', 'Software Engineering', NULL, NULL, NULL),
('EM-001', 'School of Business', 'Event Managment', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `moduleresult`
--
-- Error reading structure for table universitymanagmentdb.moduleresult: #1932 - Table 'universitymanagmentdb.moduleresult' doesn't exist in engine
-- Error reading data for table universitymanagmentdb.moduleresult: #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'FROM `universitymanagmentdb`.`moduleresult`' at line 1

-- --------------------------------------------------------

--
-- Table structure for table `studentdetails`
--

CREATE TABLE `studentdetails` (
  `IndexNo` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Age` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Department` varchar(50) NOT NULL,
  `Programme` varchar(50) NOT NULL,
  `Phone` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentdetails`
--

INSERT INTO `studentdetails` (`IndexNo`, `Name`, `Age`, `Address`, `Email`, `Department`, `Programme`, `Phone`) VALUES
('DCSD-002', 'Pasindu', '24', 'Kandy', 'pasindu@gmail.com', 'School of Computing', 'Computer System Design', 789096545),
('DCSD-003', 'Nimasha', '21', 'Colombo', 'nimasha@gmail.com', 'School of Computing', 'Computer System Design', 786543456),
('DM-001', 'Nimal', '22', 'Colombo', 'nimal@gmail.com', 'School of Business', 'Digital Marketing', 785612674),
('DSE-001', 'Mahel', '21', 'Polonnaruwa', 'mahel@gmail.com', 'School of Computing', 'Software Engineering', 789092063),
('EM-001', 'Akila', '21', 'Kandy', 'Akila@gmail.com', 'School of Business', 'Event Managment', 776756432);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminlogin`
--
ALTER TABLE `adminlogin`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `managelecturer`
--
ALTER TABLE `managelecturer`
  ADD PRIMARY KEY (`IndexNo`);

--
-- Indexes for table `managestudentsresult`
--
ALTER TABLE `managestudentsresult`
  ADD PRIMARY KEY (`IndexNo`);

--
-- Indexes for table `studentdetails`
--
ALTER TABLE `studentdetails`
  ADD PRIMARY KEY (`IndexNo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
