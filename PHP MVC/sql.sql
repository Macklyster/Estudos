/*Criando o banco de dados*/

CREATE DATABASE IF NOT EXISTS `agenda` CHARACTER SET 'utf8';
USE `agenda`;

/*Criando a tabela agenda*/

DROP TABLE IF EXISTS `agenda`;
CREATE TABLE IF NOT EXISTS `agenda` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` char(45) NOT NULL,
  `telefone` char(15) NOT NULL,
  `celular` char(15) NOT NULL,
  `email` char(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT IGNORE INTO `agenda` (`id`, `nome`, `telefone`, `celular`, `email`) VALUES
(1, 'Pedro', '(11) 9999-8888', '(11) 9999-8888', 'pedro@site.com.br'),
(2, 'Roberto', '(11) 9999-8888', '(11) 9999-8888', 'roberto@site.com.br'),
(3, 'José', '(11) 9999-8888', '(11) 9999-8888', 'jose@site.com.br'),
(4, 'Leandro', '(11) 9999-8888', '(11) 9999-8888', 'leandro@site.com.br'),
(5, 'Leandro', '(11) 9999-8888', '(11) 9999-8888', 'leandro@site.com.br'),
(6, 'Leandro', '(11) 9999-8888', '(11) 9999-8888', 'leandro@site.com.br');

/*Criando a tabela agenda*/

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nome` char(60) DEFAULT '',
  `email` char(100) DEFAULT '',
  `senha` char(32) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT IGNORE INTO `usuarios` (`id`, `nome`, `email`, `senha`) VALUES
(1, 'AlexMCoder', 'alex@mCoder.com.br', '202cb962ac59075b964b07152d234b70');