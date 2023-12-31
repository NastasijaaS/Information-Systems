-- MySQL Script generated by MySQL Workbench
-- Mon May 23 14:03:40 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema projekat
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema projekat
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `projekat` DEFAULT CHARACTER SET utf8 ;
USE `projekat` ;

-- -----------------------------------------------------
-- Table `projekat`.`lokacija`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projekat`.`lokacija` (
  `idlokacija` INT(11) NOT NULL,
  `lokacija_naziv` VARCHAR(45) NULL DEFAULT NULL,
  `adresa` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idlokacija`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `projekat`.`pozicija`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projekat`.`pozicija` (
  `taksi_id` VARCHAR(20) NOT NULL,
  `idlokacija` INT(11) NOT NULL,
  PRIMARY KEY (`idlokacija`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `projekat`.`taksivozilo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projekat`.`taksivozilo` (
  `registracija` VARCHAR(20) NOT NULL,
  `imevlasnika` VARCHAR(25) NULL DEFAULT NULL,
  `adresa_stanovanja_vlasnika` VARCHAR(45) NULL DEFAULT NULL,
  `status` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`registracija`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `projekat`.`zahtev`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projekat`.`zahtev` (
  `id_zahtev` INT(11) NOT NULL,
  `idlokacija` INT(11) NULL DEFAULT NULL,
  `registracija_dodeljenog_taksija` VARCHAR(45) NULL DEFAULT NULL,
  `status` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_zahtev`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
