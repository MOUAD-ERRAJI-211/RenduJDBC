package RENDUJDBC.Models;

public class Utilisateur {
    private int id_user;
    private String nom;
    private String prenom;
    private String email;
    private String type;

    public Utilisateur() {
    }

    public Utilisateur(int id_user, String nom, String prenom, String email, String type) {
        this.id_user = id_user;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.type = type;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id_user=" + id_user +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    
}

