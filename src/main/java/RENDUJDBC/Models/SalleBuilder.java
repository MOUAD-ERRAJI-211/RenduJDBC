package RENDUJDBC.Models;


public class SalleBuilder {
    private int id_salle;
    private String nom_salle;
    private int capacite;

    public SalleBuilder id_salle(int id_salle) {
        this.id_salle = id_salle;
        return this;
    }

    public SalleBuilder nom_salle(String nom_salle) {
        this.nom_salle = nom_salle;
        return this;
    }

    public SalleBuilder capacite(int capacite) {
        this.capacite = capacite;
        return this;
    }

    public Salle build() {
        return new Salle(id_salle, nom_salle, capacite);
    }
}

