package RENDUJDBC.Models;


import java.util.Date;

public class Evenement {
    private int id_event;
    private String nom_event;
    private Date date_event;
    private String description;
    private int id_user;

    public Evenement() {
    }

    public Evenement(int id_event, String nom_event, Date date_event, String description, int id_user) {
        this.id_event = id_event;
        this.nom_event = nom_event;
        this.date_event = date_event;
        this.description = description;
        this.id_user = id_user;
    }

    public int getId_event() {
        return id_event;
    }

    public void setId_event(int id_event) {
        this.id_event = id_event;
    }

    public String getNom_event() {
        return nom_event;
    }

    public void setNom_event(String nom_event) {
        this.nom_event = nom_event;
    }

    public Date getDate_event() {
        return date_event;
    }

    public void setDate_event(Date date_event) {
        this.date_event = date_event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "id_event=" + id_event +
                ", nom_event='" + nom_event + '\'' +
                ", date_event=" + date_event +
                ", description='" + description + '\'' +
                ", id_user=" + id_user +
                '}';
    }
}

