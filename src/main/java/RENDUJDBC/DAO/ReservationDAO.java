package RENDUJDBC.DAO;

import java.sql.Date;
import java.util.List;

public interface ReservationDAO {
    List<RENDUJDBC.Models.Reservation> findAll();
    RENDUJDBC.Models.Reservation findById(int id);
    void save(RENDUJDBC.Models.Reservation reservation);
    void update(RENDUJDBC.Models.Reservation reservation);
    void deleteById(int id);
    boolean checkAvailability(int id_salle, int id_terrain, Date date);
}

