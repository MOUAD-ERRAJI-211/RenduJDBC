package RENDUJDBC.Models;


import java.util.Date;

public class EvenementBuilder {
    private int id_event;
    private String nom_event;
    private Date date_event;
    private String description;
    private int id_user;

    public EvenementBuilder id_event(int id_event) {
        this.id_event = id_event;
        return this;
    }

    public EvenementBuilder nom_event(String nom_event) {
        this.nom_event = nom_event;
        return this;
    }

    public EvenementBuilder date_event(Date date_event) {
        this.date_event = date_event;
        return this;
    }

    public EvenementBuilder description(String description) {
        this.description = description;
        return this;
    }

    public EvenementBuilder id_user(int id_user) {
        this.id_user = id_user;
        return this;
    }

    public Evenement build() {
        return new Evenement(id_event, nom_event, date_event, description, id_user);
    }
}

