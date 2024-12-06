package RENDUJDBC.DAO;
import java.util.List;

import RENDUJDBC.Models.Utilisateur;
public interface UtilisateurDAO {
    List<Utilisateur> findAll();
    Utilisateur findById(int id);
    void save(Utilisateur utilisateur);
    void update(Utilisateur utilisateur);
    static void deleteById(int id) {
		
	}
}

