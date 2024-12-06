package RENDUJDBC.DAO;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import RENDUJDBC.Models.*;

public  class TerrainDaoImpl implements TerrainDAO {
    private Connection connection = DBConnection.getConnection();

    @Override
    public List<Terrain> findAll() {
        List<Terrain> terrains = new ArrayList<>();
        String sql = "SELECT * FROM Terrain";
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Terrain terrain = new Terrain(
                    rs.getInt("id_terrain"),
                    rs.getString("nom_terrain"),
                    rs.getString("type")
                );
                terrains.add(terrain);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return terrains;
    }

    public void save(Terrain terrain) {
        String sql = "INSERT INTO Terrain (nom_terrain, type) VALUES (?, ?)";
        
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, terrain.getNom_terrain());
            pstmt.setString(2, terrain.getType());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(int id) {
        String sql = "DELETE FROM Terrain WHERE id_terrain = ?";
        
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Terrain findById(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
}
