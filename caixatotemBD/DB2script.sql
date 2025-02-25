-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema caixatotem2
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema caixatotem2
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `caixatotem2` DEFAULT CHARACTER SET utf8 ;
USE `caixatotem2` ;

-- -----------------------------------------------------
-- Table `caixatotem2`.`Conta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `caixatotem2`.`Conta` (
  `idConta` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `login` VARCHAR(60) NOT NULL,
  `senha` VARCHAR(20) NOT NULL,
  `pontos` INT NOT NULL,
  PRIMARY KEY (`idConta`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `caixatotem2`.`Lanche`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `caixatotem2`.`Lanche` (
  `idLanche` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `ingredientes` TEXT NOT NULL,
  `valor` DOUBLE(5,2) NOT NULL,
  PRIMARY KEY (`idLanche`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `caixatotem2`.`Bebida`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `caixatotem2`.`Bebida` (
  `idBebida` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `quantidade` INT NOT NULL,
  `valor` DOUBLE(5,2) NOT NULL,
  PRIMARY KEY (`idBebida`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `caixatotem2`.`Acompanhamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `caixatotem2`.`Acompanhamento` (
  `idAcompanhamento` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `valor` DOUBLE(5,2) NOT NULL,
  PRIMARY KEY (`idAcompanhamento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `caixatotem2`.`Sobremesa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `caixatotem2`.`Sobremesa` (
  `idSobremesa` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `sabor` VARCHAR(45) NOT NULL,
  `valor` DOUBLE(5,2) NOT NULL,
  PRIMARY KEY (`idSobremesa`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `caixatotem2`.`Pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `caixatotem2`.`Pedido` (
  `idPedido` INT NOT NULL AUTO_INCREMENT,
  `Conta_id` INT NULL,
  `Lanche_id` INT NULL,
  `Bebida_id` INT NULL,
  `Acompanhamento_id` INT NULL,
  `Sobremesa_id` INT NULL,
  `nomecliente` VARCHAR(45) NOT NULL,
  `valortotal` DOUBLE(5,2) NOT NULL,
  `formapagamento` VARCHAR(45) NOT NULL,
  `pontosusados` INT NULL,
  `desconto` DOUBLE(5,2) NULL,
  `gorjeta` DOUBLE(5,2) NULL,
  PRIMARY KEY (`idPedido`),
  INDEX `fk_Pedido_Conta_idx` (`Conta_id` ASC) VISIBLE,
  INDEX `fk_Pedido_Lanche1_idx` (`Lanche_id` ASC) VISIBLE,
  INDEX `fk_Pedido_Bebida1_idx` (`Bebida_id` ASC) VISIBLE,
  INDEX `fk_Pedido_Acompanhamento1_idx` (`Acompanhamento_id` ASC) VISIBLE,
  INDEX `fk_Pedido_Sobremesa1_idx` (`Sobremesa_id` ASC) VISIBLE,
  CONSTRAINT `fk_Pedido_Conta`
    FOREIGN KEY (`Conta_id`)
    REFERENCES `caixatotem2`.`Conta` (`idConta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_Lanche1`
    FOREIGN KEY (`Lanche_id`)
    REFERENCES `caixatotem2`.`Lanche` (`idLanche`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_Bebida1`
    FOREIGN KEY (`Bebida_id`)
    REFERENCES `caixatotem2`.`Bebida` (`idBebida`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_Acompanhamento1`
    FOREIGN KEY (`Acompanhamento_id`)
    REFERENCES `caixatotem2`.`Acompanhamento` (`idAcompanhamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_Sobremesa1`
    FOREIGN KEY (`Sobremesa_id`)
    REFERENCES `caixatotem2`.`Sobremesa` (`idSobremesa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

alter table conta modify senha text not null;
alter table Recibo rename column Pedido_idPedido to Pedido_id;

select*from pedido;
