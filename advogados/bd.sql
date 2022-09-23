CREATE DATABASE `advogados` 
-- advogados.advogados definition

CREATE TABLE `advogados` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `telefone` varchar(255) NOT NULL,
  `bairro` varchar(255) NOT NULL,
  `cep` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- advogados.processos definition

CREATE TABLE `processos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `aberturaProcesso` date NOT NULL,
  `conclusaoProcesso` date NOT NULL,
  `descricaoProcesso` varchar(255) NOT NULL,
  `situacao` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- advogados.pessoas definition

CREATE TABLE `pessoas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `bairro` varchar(255) NOT NULL,
  `cidade` varchar(255) NOT NULL,
  `cep` varchar(255) NOT NULL,
  `uf` varchar(100) NOT NULL,
  `telefone` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- advogados.advogado_processo definition

CREATE TABLE `advogado_processo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `advogado_id` int(11) NOT NULL,
  `processo_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `advogado_processo_FK` FOREIGN KEY (`id`) REFERENCES `advogados` (`id`),
  CONSTRAINT `advogado_processo_FK_1` FOREIGN KEY (`id`) REFERENCES `processos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- advogados.pessoa_processo definition

CREATE TABLE `pessoa_processo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pessoa_id` int(11) NOT NULL,
  `processo_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `pessoa_processo_FK` FOREIGN KEY (`id`) REFERENCES `processos` (`id`),
  CONSTRAINT `pessoa_processo_FK_1` FOREIGN KEY (`id`) REFERENCES `pessoas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;