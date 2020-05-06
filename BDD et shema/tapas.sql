DROP DATABASE IF EXISTS Restorant_Tapas;

CREATE DATABASE Restorant_Tapas
CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE Restorant_Tapas;

CREATE TABLE Categorie
(
    idCategorie INT(11) NOT NULL AUTO_INCREMENT,
    nomCategorie VARCHAR(64),
    PRIMARY KEY(idCategorie)
);

CREATE TABLE Tapas
(
    idTapas INT(11) NOT NULL AUTO_INCREMENT,
    nomTapas INT(11),
    prix FLOAT,
    PRIMARY KEY(idTapas)
);
CREATE TABLE CommandeTapas
(
    idTapas INT(11),
    idCommande INT(11),
    PRIMARY KEY(idCommande, idTapas)
);

CREATE TABLE Commande
(
    idCommande INT(11) NOT NULL AUTO_INCREMENT,
    numCommande INT(11) AUTO_INCREMENT,
    nbTapas INT(11),
    PRIMARY KEY(idCommande)
);
CREATE TABLE CommandeTable
(
    idTable INT(11),
    idCommande INT(11),
    PRIMARY KEY(idCommande, idTable)
);

CREATE table Table
(
    idTable INT(11) NOT NULL AUTO_INCREMENT,
    nbPersonne INT(11),
    PRIMARY KEY(idTable)
);

ALTER TABLE Tapas
ADD CONSTRAINT Tapas_idCategorie
FOREIGN KEY(idCategorie)
REFERENCES Categorie(idCategorie);


ALTER TABLE CommandeTapas
ADD CONSTRAINT CommandeTapas_idTapas
FOREIGN KEY(idTapas)
REFERENCES Tapas(idTapas);

ALTER TABLE CommandeTapas
ADD CONSTRAINT CommandeTapas_idCommande
FOREIGN KEY(idCommande)
REFERENCES Commande(idCommande);


ALTER TABLE CommandeTable
ADD CONSTRAINT CommandeTable_idTable
FOREIGN KEY (idTable)
REFERENCES Table (idTable);

ALTER TABLE CommandeTable
ADD CONSTRAINT CommandeTable_idCommande
FOREIGN KEY (idCommande)
REFERENCES Commande (idCommande);
