-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 10, 2021 at 09:03 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cinemusemaster`
--

-- --------------------------------------------------------

--
-- Table structure for table `film`
--

CREATE TABLE `film` (
  `IdFilm` int(11) NOT NULL,
  `Nom` varchar(100) DEFAULT NULL,
  `Prix` double DEFAULT NULL,
  `Genre` varchar(30) DEFAULT NULL,
  `Annee` int(11) DEFAULT NULL,
  `Duree` int(11) DEFAULT NULL,
  `Langue` varchar(30) DEFAULT NULL,
  `PhotoAdresse` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `IdPerson` int(11) NOT NULL,
  `Prenom` varchar(30) NOT NULL,
  `Nom` varchar(30) DEFAULT NULL,
  `DateNaissance` date DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `NumTel` varchar(15) DEFAULT NULL,
  `Type` varchar(20) DEFAULT NULL,
  `Sexe` varchar(30) DEFAULT NULL,
  `Login` varchar(30) DEFAULT NULL,
  `MDP` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`IdPerson`, `Prenom`, `Nom`, `DateNaissance`, `Email`, `NumTel`, `Type`, `Sexe`, `Login`, `MDP`) VALUES
(1, 'Zain', 'ZAFAR', '2021-02-01', 'zzs@gmx.com', '0767341075', 'Manager', 'M', 'zzssrko', 'zzssrko');

-- --------------------------------------------------------

--
-- Table structure for table `places`
--

CREATE TABLE `places` (
  `IdPlaces` int(11) NOT NULL,
  `p0` int(11) DEFAULT 0,
  `p1` int(11) DEFAULT 0,
  `p2` int(11) DEFAULT 0,
  `p3` int(11) DEFAULT 0,
  `p4` int(11) DEFAULT 0,
  `p5` int(11) DEFAULT 0,
  `p6` int(11) DEFAULT 0,
  `p7` int(11) DEFAULT 0,
  `p8` int(11) DEFAULT 0,
  `p9` int(11) DEFAULT 0,
  `p10` int(11) DEFAULT 0,
  `p11` int(11) DEFAULT 0,
  `p12` int(11) DEFAULT 0,
  `p13` int(11) DEFAULT 0,
  `p14` int(11) DEFAULT 0,
  `p15` int(11) DEFAULT 0,
  `p16` int(11) DEFAULT 0,
  `p17` int(11) DEFAULT 0,
  `p18` int(11) DEFAULT 0,
  `p19` int(11) DEFAULT 0,
  `p20` int(11) DEFAULT 0,
  `p21` int(11) DEFAULT 0,
  `p22` int(11) DEFAULT 0,
  `p23` int(11) DEFAULT 0,
  `p24` int(11) DEFAULT 0,
  `p25` int(11) DEFAULT 0,
  `p26` int(11) DEFAULT 0,
  `p27` int(11) DEFAULT 0,
  `p28` int(11) DEFAULT 0,
  `p29` int(11) DEFAULT 0,
  `p30` int(11) DEFAULT 0,
  `p31` int(11) DEFAULT 0,
  `p32` int(11) DEFAULT 0,
  `p33` int(11) DEFAULT 0,
  `p34` int(11) DEFAULT 0,
  `p35` int(11) DEFAULT 0,
  `p36` int(11) DEFAULT 0,
  `p37` int(11) DEFAULT 0,
  `p38` int(11) DEFAULT 0,
  `p39` int(11) DEFAULT 0,
  `p40` int(11) DEFAULT 0,
  `p41` int(11) DEFAULT 0,
  `p42` int(11) DEFAULT 0,
  `p43` int(11) DEFAULT 0,
  `p44` int(11) DEFAULT 0,
  `p45` int(11) DEFAULT 0,
  `p46` int(11) DEFAULT 0,
  `p47` int(11) DEFAULT 0,
  `p48` int(11) DEFAULT 0,
  `p49` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `IdReservation` int(11) NOT NULL,
  `DATE` date DEFAULT NULL,
  `IdSeance` int(11) DEFAULT NULL,
  `IdFilm` int(11) DEFAULT NULL,
  `IdPerson` int(11) DEFAULT NULL,
  `IdSalle` int(11) DEFAULT NULL,
  `Prix` double NOT NULL,
  `IdTarif` int(11) DEFAULT NULL,
  `PlacesReserves` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `salle`
--

CREATE TABLE `salle` (
  `IdSalle` int(11) NOT NULL,
  `NumSalle` int(11) DEFAULT NULL,
  `NbPlace` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `salle`
--

INSERT INTO `salle` (`IdSalle`, `NumSalle`, `NbPlace`) VALUES
(1, 1, 50),
(2, 2, 50);

-- --------------------------------------------------------

--
-- Table structure for table `seance`
--

CREATE TABLE `seance` (
  `IdSeance` int(11) NOT NULL,
  `Heure` int(11) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `IdSalle` int(11) DEFAULT NULL,
  `IdFilm` int(11) DEFAULT NULL,
  `IdPlaces` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tarif`
--

CREATE TABLE `tarif` (
  `IdTarif` int(11) NOT NULL,
  `TypeTarif` varchar(30) DEFAULT NULL,
  `Coef` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tarif`
--

INSERT INTO `tarif` (`IdTarif`, `TypeTarif`, `Coef`) VALUES
(1, 'Normal', 1),
(2, 'Reduit', 0.75),
(3, 'Enfant', 0.5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`IdFilm`);

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`IdPerson`);

--
-- Indexes for table `places`
--
ALTER TABLE `places`
  ADD PRIMARY KEY (`IdPlaces`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`IdReservation`);

--
-- Indexes for table `salle`
--
ALTER TABLE `salle`
  ADD PRIMARY KEY (`IdSalle`);

--
-- Indexes for table `seance`
--
ALTER TABLE `seance`
  ADD PRIMARY KEY (`IdSeance`),
  ADD UNIQUE KEY `IdSeance` (`IdSeance`),
  ADD UNIQUE KEY `uniqueSet` (`IdSalle`,`IdFilm`,`Date`,`Heure`);

--
-- Indexes for table `tarif`
--
ALTER TABLE `tarif`
  ADD PRIMARY KEY (`IdTarif`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `film`
--
ALTER TABLE `film`
  MODIFY `IdFilm` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT for table `person`
--
ALTER TABLE `person`
  MODIFY `IdPerson` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `places`
--
ALTER TABLE `places`
  MODIFY `IdPlaces` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `IdReservation` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `salle`
--
ALTER TABLE `salle`
  MODIFY `IdSalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `seance`
--
ALTER TABLE `seance`
  MODIFY `IdSeance` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `tarif`
--
ALTER TABLE `tarif`
  MODIFY `IdTarif` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
