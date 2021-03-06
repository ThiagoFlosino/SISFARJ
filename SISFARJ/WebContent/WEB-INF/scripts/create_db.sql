
DROP TABLE IF EXISTS `associacao`;

DROP TABLE IF EXISTS `categoria`;

DROP TABLE IF EXISTS `classe`;

DROP TABLE IF EXISTS `competicao`;

DROP TABLE IF EXISTS `local_competicao`;

DROP TABLE IF EXISTS `comp_cat_classe`;

DROP TABLE IF EXISTS `pessoa`;

DROP TABLE IF EXISTS `atleta_competicao`;

DROP TABLE IF EXISTS `associacao_atleta`;

DROP TABLE IF EXISTS `records`;

CREATE TABLE `associacao` (
	`ID` INT NOT NULL AUTO_INCREMENT,
	`NUMERO_OFICIO` INT NOT NULL,
	`DATA` DATE NOT NULL,
	`NOME` varchar NOT NULL,
	`SIGLA` varchar NOT NULL,
	`ENDERECO` varchar NOT NULL,
	`TELEFONE` varchar NOT NULL,
	`NUMERO_COMPROVANTE` INT NOT NULL,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `categoria` (
	`ID` INT NOT NULL AUTO_INCREMENT,
	`NOME` varchar NOT NULL,
	`SIGLA` varchar NOT NULL,
	`DISTANCIA` INT NOT NULL,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `classe` (
	`ID` INT NOT NULL AUTO_INCREMENT,
	`NOME` varchar NOT NULL,
	`IDADE_INICIO` INT NOT NULL,
	`IDADE_FIM` INT NOT NULL,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `competicao` (
	`ID` INT NOT NULL AUTO_INCREMENT,
	`LOCAL_COMPETICAO_ID` INT NOT NULL,
	`NOME` varchar NOT NULL,
	`DATA` DATE NOT NULL,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `local_competicao` (
	`ID` INT NOT NULL AUTO_INCREMENT,
	`ENDERECO` varchar NOT NULL,
	`TIPO_PISCINA` INT NOT NULL,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `comp_cat_classe` (
	`COMPETICAO_ID` INT NOT NULL,
	`CLASSE_ID` INT NOT NULL,
	`CATEGORIA_ID` INT NOT NULL
);

CREATE TABLE `pessoa` (
	`ID` INT NOT NULL AUTO_INCREMENT,
	`NOME` varchar NOT NULL,
	`DATA_NASCIMENTO` DATE NOT NULL,
	`MATRICULA` varchar NOT NULL,
	`SENHA` varchar NOT NULL,
	`TIPO` varchar NOT NULL,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `atleta_competicao` (
	`ID` INT NOT NULL AUTO_INCREMENT,
	`PESSOA_ID` INT NOT NULL,
	`COMPETICAO_ID` INT NOT NULL,
	`PONTUACAO` DECIMAL NOT NULL,
	`TEMPO` varchar NOT NULL,
	`RECORDS_ID` INT NOT NULL,
	`POSICAO_LARGADA` INT NOT NULL,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `associacao_atleta` (
	`ASSOCIACAO_ID` INT NOT NULL,
	`PESSOA_ID` INT NOT NULL,
	`DATA_INICIO` DATE NOT NULL,
	`DATA_FIM` DATE NOT NULL
);

CREATE TABLE `records` (
	`ID` INT NOT NULL AUTO_INCREMENT,
	`DESCRICAO` varchar NOT NULL,
	`BONUS` INT NOT NULL,
	PRIMARY KEY (`ID`)
);

ALTER TABLE `competicao` ADD CONSTRAINT `competicao_fk0` FOREIGN KEY (`LOCAL_COMPETICAO_ID`) REFERENCES `local_competicao`(`ID`);

ALTER TABLE `comp_cat_classe` ADD CONSTRAINT `comp_cat_classe_fk0` FOREIGN KEY (`COMPETICAO_ID`) REFERENCES `competicao`(`ID`);

ALTER TABLE `comp_cat_classe` ADD CONSTRAINT `comp_cat_classe_fk1` FOREIGN KEY (`CLASSE_ID`) REFERENCES `classe`(`ID`);

ALTER TABLE `comp_cat_classe` ADD CONSTRAINT `comp_cat_classe_fk2` FOREIGN KEY (`CATEGORIA_ID`) REFERENCES `categoria`(`ID`);

ALTER TABLE `atleta_competicao` ADD CONSTRAINT `atleta_competicao_fk0` FOREIGN KEY (`PESSOA_ID`) REFERENCES `pessoa`(`ID`);

ALTER TABLE `atleta_competicao` ADD CONSTRAINT `atleta_competicao_fk1` FOREIGN KEY (`COMPETICAO_ID`) REFERENCES `competicao`(`ID`);

ALTER TABLE `atleta_competicao` ADD CONSTRAINT `atleta_competicao_fk2` FOREIGN KEY (`RECORDS_ID`) REFERENCES `records`(`ID`);

ALTER TABLE `associacao_atleta` ADD CONSTRAINT `associacao_atleta_fk0` FOREIGN KEY (`ASSOCIACAO_ID`) REFERENCES `associacao`(`ID`);

ALTER TABLE `associacao_atleta` ADD CONSTRAINT `associacao_atleta_fk1` FOREIGN KEY (`PESSOA_ID`) REFERENCES `pessoa`(`ID`);

