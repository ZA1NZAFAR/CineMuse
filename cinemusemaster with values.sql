-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 11, 2021 at 12:27 AM
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

--
-- Dumping data for table `film`
--

INSERT INTO `film` (`IdFilm`, `Nom`, `Prix`, `Genre`, `Annee`, `Duree`, `Langue`, `PhotoAdresse`) VALUES
(44, 'Godzilla', 15, 'Sci-Fi', 2019, 140, 'Anglais', 'https://images.bfmtv.com/kwUUNpaSeT2T0y9VaJhbMC_CJ3U=/4x3:1556x876/375x0/images/-202968.jpg'),
(45, 'Frozen 2', 15, 'Animated', 2018, 120, 'Anglais', 'https://www.denofgeek.com/wp-content/uploads/2019/11/elsa_and_anna_in_frozen_2_ending_0.jpg?fit=1200%2C761'),
(46, 'Gladiator', 10, 'History', 2005, 160, 'Anglais', 'https://imgsrc.cineserie.com/2020/05/gladiator-sur-tmc-le-role-de-maximus-devait-revenir-a-un-autre-acteur.jpg?ver=1');

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
(1, 'Zain', 'ZAFAR', '2021-02-01', 'zzs@gmx.com', '0767341075', 'Manager', 'M', 'zzssrko', 'zzssrko'),
(17, 'asd', 'asd', '2000-01-12', 'asd@asd.asd', '0123456789', 'Client', 'M', 'asd', 'asd');

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

--
-- Dumping data for table `places`
--

INSERT INTO `places` (`IdPlaces`, `p0`, `p1`, `p2`, `p3`, `p4`, `p5`, `p6`, `p7`, `p8`, `p9`, `p10`, `p11`, `p12`, `p13`, `p14`, `p15`, `p16`, `p17`, `p18`, `p19`, `p20`, `p21`, `p22`, `p23`, `p24`, `p25`, `p26`, `p27`, `p28`, `p29`, `p30`, `p31`, `p32`, `p33`, `p34`, `p35`, `p36`, `p37`, `p38`, `p39`, `p40`, `p41`, `p42`, `p43`, `p44`, `p45`, `p46`, `p47`, `p48`, `p49`) VALUES
(39, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(41, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(43, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(46, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(47, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

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

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`IdReservation`, `DATE`, `IdSeance`, `IdFilm`, `IdPerson`, `IdSalle`, `Prix`, `IdTarif`, `PlacesReserves`) VALUES
(41, '2021-02-11', 38, 44, 1, 1, 75, 1, 'Place 4 - Place 14 - Place 24 - Place 34 - Place 35 - '),
(42, '2021-02-12', 42, 45, 17, 2, 90, 1, 'Place 15 - Place 21 - Place 22 - Place 23 - Place 24 - Place 25 - ');

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

--
-- Dumping data for table `seance`
--

INSERT INTO `seance` (`IdSeance`, `Heure`, `Date`, `IdSalle`, `IdFilm`, `IdPlaces`) VALUES
(38, 16, '2021-02-11', 1, 44, 39),
(39, 16, '2021-02-12', 1, 44, 40),
(40, 16, '2021-02-13', 1, 44, 41),
(41, 19, '2021-02-11', 1, 45, 42),
(42, 19, '2021-02-12', 2, 45, 43),
(43, 19, '2021-02-13', 2, 45, 44),
(44, 22, '2021-02-11', 2, 46, 45),
(45, 22, '2021-02-12', 2, 46, 46),
(46, 22, '2021-02-13', 2, 46, 47);

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
  MODIFY `IdFilm` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT for table `person`
--
ALTER TABLE `person`
  MODIFY `IdPerson` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `places`
--
ALTER TABLE `places`
  MODIFY `IdPlaces` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `IdReservation` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `salle`
--
ALTER TABLE `salle`
  MODIFY `IdSalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `seance`
--
ALTER TABLE `seance`
  MODIFY `IdSeance` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT for table `tarif`
--
ALTER TABLE `tarif`
  MODIFY `IdTarif` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
