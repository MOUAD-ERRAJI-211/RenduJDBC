CREATE TABLE utilisateur (
    id_user INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) ,
    prenom VARCHAR(255) ,
    email VARCHAR(255) ,
    type VARCHAR(255) CHECK (type IN ('Etudiant', 'Professeur'))
);

CREATE TABLE Evenement (
    id_event INT AUTO_INCREMENT PRIMARY KEY,
    nom_event VARCHAR(255),
    date_event DATE,
    description VARCHAR(255),
    FOREIGN KEY (id_user) REFERENCES utilisateur(id_user)
);

CREATE table salle (
    id_salle INT AUTO_INCREMENT PRIMARY KEY,
    nom_salle VARCHAR(255),
    capacite INT
);

CREATE TABLE Terrain (
    id_terrain INT AUTO_INCREMENT PRIMARY KEY,
    nom_terrain VARCHAR(255),
    type VARCHAR(255)
);

CREATE TABLE reservation (
    id_reservation INT AUTO_INCREMENT PRIMARY KEY,
    FOREIGN KEY (id_user) REFERENCES utilisateur(id_user)
    FOREIGN KEY (id_event) REFERENCES Evenement(id_event)
    id_salle INT,
    FOREIGN KEY (id_terrain) REFERENCES Terrain(id_terrain)
    date_reservation DATE
);

