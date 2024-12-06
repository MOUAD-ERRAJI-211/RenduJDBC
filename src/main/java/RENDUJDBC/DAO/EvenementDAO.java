package RENDUJDBC.DAO;
import java.util.List;

import RENDUJDBC.Models.Evenement;
public interface EvenementDAO {
    List<Evenement> findAll();
    Evenement findById(int id);
    void save(Evenement evenement);
    void update(Evenement evenement);
    void deleteById(int id);
}

