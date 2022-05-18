-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 16-Maio-2022 às 20:01
-- Versão do servidor: 5.7.26
-- versão do PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cadastrodb`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cursocompleto`
--

DROP TABLE IF EXISTS `cursocompleto`;
CREATE TABLE IF NOT EXISTS `cursocompleto` (
  `RGM` int(10) NOT NULL,
  `nomeAluno` varchar(40) NOT NULL,
  `nascAluno` varchar(10) NOT NULL,
  `CPF` varchar(14) NOT NULL,
  `emailAluno` varchar(40) NOT NULL,
  `endAluno` varchar(60) NOT NULL,
  `munAluno` varchar(40) NOT NULL,
  `ufAluno` varchar(2) NOT NULL,
  `celAluno` int(16) NOT NULL,
  `cursoAluno` varchar(40) NOT NULL,
  `campusAluno` varchar(40) NOT NULL,
  `perAluno` varchar(40) DEFAULT NULL,
  `discAluno` varchar(40) NOT NULL,
  `semAluno` varchar(2) NOT NULL,
  `notaAluno` varchar(4) NOT NULL,
  `falAluno` int(4) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
