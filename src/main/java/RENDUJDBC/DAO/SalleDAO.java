package RENDUJDBC.DAO;

import java.util.List;

import RENDUJDBC.Models.Salle;

public interface SalleDAO {
    List<Salle> findAll();
    Salle findById(int id);
    void save(Salle salle);
    void deleteById(int id);
}

