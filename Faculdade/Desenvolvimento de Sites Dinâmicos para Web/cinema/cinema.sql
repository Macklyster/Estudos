-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 
-- Versão do Servidor: 5.5.24-log
-- Versão do PHP: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `cinema`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `banner`
--

CREATE TABLE IF NOT EXISTS `banner` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(200) NOT NULL,
  `imagem` varchar(20) NOT NULL,
  `filme_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `filme_id` (`filme_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Extraindo dados da tabela `banner`
--

INSERT INTO `banner` (`id`, `titulo`, `imagem`, `filme_id`) VALUES
(1, 'Gênios do Crime', 'b1.jpg', 2),
(2, 'Miss Peregrine''s Home for Peculiar Children', 'b2.jpg', 1),
(3, 'Peter''s Dragon', 'b3.jpg', 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `filme`
--

CREATE TABLE IF NOT EXISTS `filme` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(200) NOT NULL,
  `original` varchar(200) NOT NULL,
  `ano` int(11) NOT NULL,
  `elenco` varchar(200) NOT NULL,
  `sinopse` text NOT NULL,
  `imagem` varchar(30) NOT NULL,
  `tipo_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `tipo_id` (`tipo_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Extraindo dados da tabela `filme`
--

INSERT INTO `filme` (`id`, `titulo`, `original`, `ano`, `elenco`, `sinopse`, `imagem`, `tipo_id`) VALUES
(1, 'O Lar das crianças peculiares', 'Miss Peregrine''s Home for Peculiar Children', 2016, 'Eva Green, Samuel L. Jackson, Asa Butterfield, Allison Janney, Ella Purnell, Judi Dench, Chris O´Dowd, Rupert Everett, Terence Stamp', 'Do visionário diretor Tim Burton, e baseado em um best-seller, esta é uma inesquecível experiência cinematográfica. Quando seu querido avô deixa pistas para Jake sobre um mistério que percorre diferentes mundos e tempos, ele encontra um lugar mágico conhecido como o Orfanato da Srta. Peregrine para Crianças Peculiares. Mas o mistério e perigo se aprofundam quando ele começa a conhecer os moradores e descobre seus poderes especiais… e seus inimigos poderosos. Por fim, Jake descobre também que somente a sua `peculiaridade´ especial pode salvar seus novos amigos.', '1.jpg', 2),
(2, 'Gênios do crime', 'Masterminds', 2015, 'Kristen Wiig, Owen Wilson, Jason Sudeikis, Kate McKinnon, Zach Galifianakis, Ken Marino, Mary Elizabeth Ellis, Leslie Jones', 'Gênios do Crime é inspirado em fatos reais de um dos roubos mais inacreditáveis da história. David (Zach Galifianakis) trabalha em uma empresa de segurança transportando milhões de dólares em carros-fortes. Quando ele conhece a mulher dos seus sonhos, Kelly (Kristen Wiig), ela o apresenta para Steve (Owen Wilson), um ambicioso criminoso. Com um plano cheio de falhas eles conseguem o improvável: roubar a empresa de David e ficar estupidamente ricos. Agora eles precisam descobrir o mais importante : o que fazer com tanto dinheiro!', '3.jpg', 6),
(3, 'Bruxa de blair', 'Blair Witch', 2016, 'James Allen McCune, Corbin Reid, Wes Robinson, Valorie Curry, Callie Hernandez, Brandon Scott', 'Um grupo de estudantes universitários se aventuram na floresta de Black Hills para desvendar os mistérios que cercam o desaparecimento da irmã de James, que muitos acreditam estar ligado à lenda da Bruxa de Blair. No início, o grupo está esperançoso, especialmente quando uma dupla de moradores se oferecem como guias na floresta. Mas com o cair da noite, o grupo é surpreendido por uma presença ameaçadora e lentamente, eles começam a perceber que a lenda é real e muito mais sinistra do que imaginaram.', '2.jpg', 3),
(4, 'Meu amigo, o dragão', 'Petes Dragon', 2015, 'Bryce Dallas Howard, Robert Redford, Karl Urban, Wes Bentley, Craig Hall, Oona Laurence, Oakes Fegley, Isiah Whitlock Jr., Marcus Henderson, Esmée Myers', 'Quando o órfão Pete e seu melhor amigo Elliott, um dragão verde invisível, vão parar numa pequena cidade litorânea, os moradores acham que ele é o responsável por uma série de contratempos hilários. Mas depois de um ousado resgate, eles mudam de ideia e passam a acreditar no amigo de Pete que lança fogo pela boca. Repleto de amizade e diversão, este clássico para a família apresenta a canção indicada ao Oscar®, Candle On The Water (Melhor Canção Original, 1977).', '4.jpg', 4),
(5, 'A garota no trem', 'The Girl On The Train', 2015, 'Emily Blunt, Rebecca Ferguson, Laura Prepon, Justin Theroux, Luke Evans, Edgar Ramirez, Haley Bennett', 'Situado no universo do editorial de livros, em New York, Alice Harvey, filha de um poderoso agente literário, encontra-se presa em um trabalho como editora assistente de livros, enquanto tenta superar seu bloqueio criativo. Quando Alice é inesperadamente colocada na equipe para relançar um romance best-seller com base em fatos de sua própria vida, o autor do livro reaparece e abre uma perigosa porta para memórias dolorosas do seu passado.', '5.jpg', 3),
(6, 'Kubo e as Cordas Mágicas', 'Kubo And The Two Strings', 2016, 'Art Parkinson, George Takei, Cary-Hiroyuki Tagawa e mais.', 'Kubo vive uma normal e tranquila vida em uma pequena vila no Japão com sua mãe. Até que um espírito vingativo do passado muda completamente sua vida, ao fazer com que todos os tipos de deuses e monstros o persigam. Agora, para sobreviver, Kubo terá de encontrar uma armadura mágica que foi usada pelo seu falecido pai, um lendário guerreiro samurai.', '1.png', 4),
(7, 'Inferno', 'Inferno', 2016, ' Tom Hanks, Felicity Jones, Irrfan Khan, Omar Sy, Sidse Babett Knudsen, Ben Foster', 'O renomado professor de simbologia de Harvard, Robert Langdon (Tom Hanks) visita a Itália e se envolve em mais uma aventura envolvendo símbolos ocultos e corporações secretas. Ele se vê em uma jornada em que procura desvendar os mistérios do clássico da literatura "A Divina Comédia", de Dante Alighieri.', '6.jpg', 1),
(8, '12 Horas Para Sobreviver - O Ano da Eleição', 'The Purge: Election Year', 2015, 'Frank Grillo, Elizabeth Mitchell, Mykelti Williamson', 'pós a conclusão de Uma Noite de Crime 2, o policial Barnes (Frank Grillo) se tornou o principal responsável pela segurança da senadora Charlene Roan (Elizabeth Mitchell). Em plena época de eleições, ela é uma das melhores posicionadas nas pesquisas, porque deseja eliminar de uma vez por todas a noite de crime. Mas seus planos não saem como esperado.', '2.png', 3),
(9, 'Rogue One: A Star Wars Story', 'Rogue One: A Star Wars Story', 2016, 'Felicity Jones, Riz Ahmed, Ben Mendelsohn e mais.', 'No primeiro filme derivado da franquia Star Wars, guerreiros rebeldes partem em missão para roubar os planos da Estrela da Morte e trazer nova esperança para a galáxia.', '7.jpg', 5),
(10, 'Jack Reacher 2', 'Jack Reacher 2', 2016, 'Tom Cruise, Cobie Smulders, Danika Yarosh e mais.', 'Jack Reacher (Tom Cruise) retorna à base militar onde serviu na Virgínia, onde pretende levar uma comandante local para jantar. Só que, logo ao chegar, descobre que ela foi sequestrada. Não demora muito para que ele assuma a responsabilidade de salvá-la.', '8.jpg', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipo`
--

CREATE TABLE IF NOT EXISTS `tipo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `tipo` (`tipo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Extraindo dados da tabela `tipo`
--

INSERT INTO `tipo` (`id`, `tipo`) VALUES
(1, 'Ação'),
(4, 'Animação'),
(2, 'Aventura'),
(6, 'Comédia'),
(5, 'Ficção'),
(3, 'Suspense');

-- --------------------------------------------------------

--
-- Estrutura da tabela `trailer`
--

CREATE TABLE IF NOT EXISTS `trailer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `youtube` varchar(200) NOT NULL,
  `filme_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `filme_id` (`filme_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Extraindo dados da tabela `trailer`
--

INSERT INTO `trailer` (`id`, `youtube`, `filme_id`) VALUES
(1, 'https://www.youtube.com/watch?v=yzl3kkxYV8Q', 1),
(2, 'https://www.youtube.com/watch?v=DNn2F2nIky8', 1),
(3, 'https://www.youtube.com/watch?v=Piz4KWeD1mE', 3),
(4, 'https://www.youtube.com/watch?v=8zr8jQJgx18', 3),
(5, 'https://www.youtube.com/watch?v=7hqbqmWjDIA', 3),
(6, 'https://www.youtube.com/watch?v=zgPiiaLQD5Y', 3),
(7, 'https://www.youtube.com/watch?v=n9NdykTYd7k', 4),
(8, 'https://www.youtube.com/watch?v=mdb5sQiQojQ', 5),
(9, 'https://www.youtube.com/watch?v=kmQ1WcX425E', 5),
(10, 'https://www.youtube.com/watch?v=cFC-4PZVYLI', 7),
(11, 'https://www.youtube.com/watch?v=X2jmakUuABk', 6),
(12, 'https://www.youtube.com/watch?v=CYcTgzXPwYI', 9),
(13, 'https://www.youtube.com/watch?v=R74QIAaRuEg', 9);

--
-- Restrições para as tabelas dumpadas
--

--
-- Restrições para a tabela `banner`
--
ALTER TABLE `banner`
  ADD CONSTRAINT `banner_ibfk_1` FOREIGN KEY (`filme_id`) REFERENCES `filme` (`id`);

--
-- Restrições para a tabela `filme`
--
ALTER TABLE `filme`
  ADD CONSTRAINT `filme_ibfk_1` FOREIGN KEY (`tipo_id`) REFERENCES `tipo` (`id`);

--
-- Restrições para a tabela `trailer`
--
ALTER TABLE `trailer`
  ADD CONSTRAINT `trailer_ibfk_1` FOREIGN KEY (`filme_id`) REFERENCES `filme` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
