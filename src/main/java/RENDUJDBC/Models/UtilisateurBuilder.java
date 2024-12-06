package RENDUJDBC.Models;


public class UtilisateurBuilder {
    private int id_user;
    private String nom;
    private String prenom;
    private String email;
    private String type;

    public UtilisateurBuilder id_user(int id_user) {
        this.id_user = id_user;
        return this;
    }

    public UtilisateurBuilder nom(String nom) {
        this.nom = nom;
        return this;
    }

    public UtilisateurBuilder prenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public UtilisateurBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UtilisateurBuilder type(String type) {
        this.type = type;
        return this;
    }

    public Utilisateur build() {
        return new Utilisateur(id_user, nom, prenom, email, type);
    }
}

