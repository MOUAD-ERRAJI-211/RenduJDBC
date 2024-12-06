package RENDUJDBC.DAO;
import java.util.List;

import RENDUJDBC.Models.Terrain;
public interface TerrainDAO {
    List<Terrain> findAll();
    Terrain findById(int id);
    void save(Terrain terrain);
    void deleteById(int id);
}

