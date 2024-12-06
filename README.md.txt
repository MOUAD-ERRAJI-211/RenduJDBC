# Projet de Gestion d'Événements et Réservations (JDBC DAO)

## Description
Application Java console permettant la gestion d'événements, de salles, de terrains et de réservations utilisant le pattern DAO (Data Access Object) avec JDBC pour la persistance des données.

## Structure du Projet


## Configuration Base de Données
1. Créer une base de données MySQL nommée `rendu`
2. Configuration de connexion dans `DBConnection.java`:
   - Host: localhost (127.0.0.1)
   - Port: 3306
   - Username: root
   - Password: (vide)

## Pattern DAO Implémenté
Le projet utilise le pattern DAO pour:
- Séparer la logique métier de la persistance des données
- Fournir une interface abstraite pour les opérations CRUD
- Faciliter la maintenance et les modifications

## Fonctionnalités Principales
1. Gestion des Événements
   - Affichage
   - Ajout
   - Suppression

2. Gestion des Salles
   - Affichage
   - Ajout
   - Suppression

3. Gestion des Terrains
   - Affichage
   - Ajout
   - Suppression

4. Gestion des Réservations
   - Affichage
   - Ajout
   - Suppression

## Utilisation
1. Lancer l'application via la classe `App.java`
2. Utiliser le menu principal pour naviguer entre les différentes fonctionnalités
3. Suivre les instructions à l'écran pour effectuer les opérations souhaitées

## Structure du Code
- **Models**: Classes représentant les entités (Utilisateur,Evenement, Salle, Terrain, Reservation)
- **DAO**: Classes d'accès aux données implémentant les opérations CRUD
- **DBConnection**: Gestion de la connexion à la base de données
- **App**: Point d'entrée de l'application avec interface utilisateur console


