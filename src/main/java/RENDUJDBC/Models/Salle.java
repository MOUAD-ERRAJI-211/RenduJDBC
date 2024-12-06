package RENDUJDBC.Models;


public class Salle {
    private int id_salle;
    private String nom_salle;
    private int capacite;

    public Salle() {
    }

    public Salle(int id_salle, String nom_salle, int capacite) {
        this.id_salle = id_salle;
        this.nom_salle = nom_salle;
        this.capacite = capacite;
    }

    public int getId_salle() {
        return id_salle;
    }

    public void setId_salle(int id_salle) {
        this.id_salle = id_salle;
    }

    public String getNom_salle() {
        return nom_salle;
    }

    public void setNom_salle(String nom_salle) {
        this.nom_salle = nom_salle;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "Salle{" +
                "id_salle=" + id_salle +
                ", nom_salle='" + nom_salle + '\'' +
                ", capacite=" + capacite +
                '}';
    }
}
