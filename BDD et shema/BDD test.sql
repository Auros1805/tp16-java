DROP DATABASE IF EXISTS Restorant_Tapas;

CREATE DATABASE Restorant_Tapas
CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE Restorant_Tapas;

CREATE TABLE Tapas
(
    idTapas INT(11) NOT NULL AUTO_INCREMENT,
    nomTapas INT(11),
    prix FLOAT,
    PRIMARY KEY(idTapas)
);

CREATE TABLE Categorie
(
    idCategorie INT(11) NOT NULL AUTO_INCREMENT,
    nomCategorie VARCHAR(64),
    PRIMARY KEY(idCategorie)
);

CREATE TABLE Commande
(
    idCommande INT(11) NOT NULL AUTO_INCREMENT,
    numCommande INT(11) AUTO_INCREMENT,
    PRIMARY KEY(idCommande)
);

CREATE table nbTapas 
(
    
);

ALTER TABLE Commentaire
ADD CONSTRAINT Commentaire_idAuteur
FOREIGN KEY(idAuteur)
REFERENCES Chasseur(idChasseur);

ALTER TABLE Commentaire
ADD CONSTRAINT Commentaire_idAvis
FOREIGN KEY(idAvis)
REFERENCES Avis(idAvis);


ALTER TABLE AvisRecherche
ADD CONSTRAINT AvisRecherche_idAuteur
FOREIGN KEY (idAuteur)
REFERENCES Chasseur (idChasseur);
