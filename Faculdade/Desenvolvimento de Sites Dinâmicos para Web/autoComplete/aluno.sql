-- phpMyAdmin SQL Dump
-- version 3.4.11.1deb2
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 06-Out-2016 às 10:59
-- Versão do servidor: 5.5.31
-- versão do PHP: 5.4.4-14+deb7u3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `1234`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE IF NOT EXISTS `aluno` (
  `ra` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`ra`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9813 ;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`ra`, `nome`) VALUES
(2341, 'Ewellynn Quetlen Kinberly da Silva'),
(3123, 'Clébson Ronaldo da Costa'),
(3131, 'Neyde Gaga'),
(3455, 'Uasleska Jucylleine da Silva'),
(3456, 'Yrislene Kataryna Barroso'),
(3617, 'Keathryn Milladye da Silva'),
(3721, 'Malcoljéquison Lima Diequi'),
(4318, 'Brytiney Marisleinny'),
(5142, 'Istiviuonder Lima'),
(5412, 'Dhyonnilson Jone Santos'),
(5681, 'Byoncih Lara Souza'),
(7612, 'Ervelyn Ketylyn Lima'),
(7812, 'Thayffanny da Silva Pereira'),
(7819, 'Dyeniffer Santos'),
(8612, 'Dyeimes Bonde Santos'),
(8710, 'Diéssyka Moura'),
(8712, 'Thaífy Souza Lima'),
(9812, 'Anna Carolyna Silva Santos');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
