package RENDUJDBC.Models;


import java.util.Date;

public class ReservationBuilder {
    private int id_reservation;
    private int id_user;
    private int id_event;
    private int id_salle;
    private int id_terrain;
    private Date date_reservation;

    public ReservationBuilder id_reservation(int id_reservation) {
        this.id_reservation = id_reservation;
        return this;
    }

    public ReservationBuilder id_user(int id_user) {
        this.id_user = id_user;
        return this;
    }

    public ReservationBuilder id_event(int id_event) {
        this.id_event = id_event;
        return this;
    }

    public ReservationBuilder id_salle(int id_salle) {
        this.id_salle = id_salle;
        return this;
    }

    public ReservationBuilder id_terrain(int id_terrain) {
        this.id_terrain = id_terrain;
        return this;
    }

    public ReservationBuilder date_reservation(Date date_reservation) {
        this.date_reservation = date_reservation;
        return this;
    }

    public Reservation build() {
        return new Reservation(id_reservation, id_user, id_event, id_salle, id_terrain, date_reservation);
    }
}

