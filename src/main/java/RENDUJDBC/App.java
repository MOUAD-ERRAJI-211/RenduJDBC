package RENDUJDBC;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

import RENDUJDBC.Models.*;
import RENDUJDBC.DAO.*;

public class App {
    private static void gererEvenements() {
        EvenementDaoImpl eventDao = new EvenementDaoImpl();
        Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("\n=== GESTION EVENEMENTS ===");
        System.out.println("1. Afficher tous les événements");
        System.out.println("2. Ajouter un événement");
        System.out.println("3. Supprimer un événement");
        System.out.println("0. Retour au menu principal");
        System.out.print("Votre choix: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
            case 1:
                List<Evenement> events = eventDao.findAll();
                events.forEach(System.out::println);
                break;
            case 2:
                System.out.print("Nom de l'événement: ");
                String nomEvent = scanner.nextLine();
                System.out.print("Date (YYYY-MM-DD): ");
                String dateStr = scanner.nextLine();
                Date dateEvent = Date.valueOf(dateStr);
                System.out.print("Description: ");
                String description = scanner.nextLine();
                
                Evenement newEvent = new Evenement(0, nomEvent, dateEvent, description, 0);
                eventDao.save(newEvent);
                System.out.println("Événement ajouté avec succès!");
                break;
            case 3:
                System.out.print("ID de l'événement à supprimer: ");
                int id = scanner.nextInt();
                eventDao.deleteById(id);
                System.out.println("Événement supprimé avec succès!");
                break;
            case 0:
                return;
            default:
                System.out.println("Choix invalide!");
        }
    }
}

private static void gererSalles() {
    SalleDaoImpl salleDao = new SalleDaoImpl();
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("\n=== GESTION SALLES ===");
        System.out.println("1. Afficher toutes les salles");
        System.out.println("2. Ajouter une salle");
        System.out.println("3. Supprimer une salle");
        System.out.println("0. Retour au menu principal");
        System.out.print("Votre choix: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
            case 1:
                List<Salle> salles = salleDao.findAll();
                salles.forEach(System.out::println);
                break;
            case 2:
                System.out.print("Nom de la salle: ");
                String nomSalle = scanner.nextLine();
                System.out.print("Capacité: ");
                int capacite = scanner.nextInt();
                
                Salle newSalle = new Salle(0, nomSalle, capacite);
                salleDao.save(newSalle);
                System.out.println("Salle ajoutée avec succès!");
                break;
            case 3:
                System.out.print("ID de la salle à supprimer: ");
                int id = scanner.nextInt();
                salleDao.deleteById(id);
                System.out.println("Salle supprimée avec succès!");
                break;
            case 0:
                return;
            default:
                System.out.println("Choix invalide!");
        }
    }
}

private static void gererTerrains() {
    TerrainDaoImpl terrainDao = new TerrainDaoImpl();
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("\n=== GESTION TERRAINS ===");
        System.out.println("1. Afficher tous les terrains");
        System.out.println("2. Ajouter un terrain");
        System.out.println("3. Supprimer un terrain");
        System.out.println("0. Retour au menu principal");
        System.out.print("Votre choix: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
            case 1:
                List<Terrain> terrains = terrainDao.findAll();
                terrains.forEach(System.out::println);
                break;
            case 2:
                System.out.print("Nom du terrain: ");
                String nomTerrain = scanner.nextLine();
                System.out.print("Type: ");
                String type = scanner.nextLine();
                
                Terrain newTerrain = new Terrain(0, nomTerrain, type);
                terrainDao.save(newTerrain);
                System.out.println("Terrain ajouté avec succès!");
                break;
            case 3:
                System.out.print("ID du terrain à supprimer: ");
                int id = scanner.nextInt();
                terrainDao.deleteById(id);
                System.out.println("Terrain supprimé avec succès!");
                break;
            case 0:
                return;
            default:
                System.out.println("Choix invalide!");
        }
    }
}

private static void gererReservations() {
    ReservationDaoImpl reservationDao = new ReservationDaoImpl();
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("\n=== GESTION RESERVATIONS ===");
        System.out.println("1. Afficher toutes les réservations");
        System.out.println("2. Ajouter une réservation");
        System.out.println("3. Supprimer une réservation");
        System.out.println("0. Retour au menu principal");
        System.out.print("Votre choix: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
            case 1:
                List<Reservation> reservations = reservationDao.findAll();
                reservations.forEach(System.out::println);
                break;
            case 2:
                System.out.print("ID Utilisateur: ");
                int idUser = scanner.nextInt();
                System.out.print("ID Événement: ");
                int idEvent = scanner.nextInt();
                System.out.print("ID Salle: ");
                int idSalle = scanner.nextInt();
                System.out.print("ID Terrain: ");
                int idTerrain = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Date (YYYY-MM-DD): ");
                String dateStr = scanner.nextLine();
                Date dateReservation = Date.valueOf(dateStr);
                
                Reservation newReservation = new Reservation(0, idUser, idEvent, idSalle, idTerrain, dateReservation);
                reservationDao.save(newReservation);
                System.out.println("Réservation ajoutée avec succès!");
                break;
            case 3:
                System.out.print("ID de la réservation à supprimer: ");
                int id = scanner.nextInt();
                reservationDao.deleteById(id);
                System.out.println("Réservation supprimée avec succès!");
                break;
            case 0:
                return;
            default:
                System.out.println("Choix invalide!");
        }
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("1. Gérer les événements");
        System.out.println("2. Gérer les salles");
        System.out.println("3. Gérer les terrains");
        System.out.println("4. Gérer les réservations");
        System.out.println("0. Quitter");
        System.out.print("Votre choix: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
            case 1:
                gererEvenements();
                break;
            case 2:
                gererSalles();
                break;
            case 3:
                gererTerrains();
                break;
            case 4:
                gererReservations();
                break;
            case 0:
                System.out.println("Au revoir!");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Choix invalide!");
        }
    }
}
}