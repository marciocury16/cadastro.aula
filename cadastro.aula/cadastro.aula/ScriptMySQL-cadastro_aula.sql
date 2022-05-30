
CREATE DATABASE dbLeitor;
USE dbLeitor;
CREATE TABLE `cursocompleto` (
  `RGM` int(10) NOT NULL,
  `nomeAluno` varchar(40),
  `nascAluno` varchar(10) ,
  `CPF` varchar(14),
  `emailAluno` varchar(40) ,
  `endAluno` varchar(60) ,
  `munAluno` varchar(40) ,
  `ufAluno` varchar(2) ,
  `celAluno` int(16) ,
  `cursoAluno` varchar(40) ,
  `campusAluno` varchar(40) ,
  `perAluno` varchar(40),
  `discAluno` varchar(40) ,
  `semAluno` varchar(2),
  `notaAluno` varchar(4) ,
  `falAluno` int(4) 
  );
