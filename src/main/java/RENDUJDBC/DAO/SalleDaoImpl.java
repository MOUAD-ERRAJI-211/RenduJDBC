package RENDUJDBC.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import RENDUJDBC.Models.*;


public class SalleDaoImpl implements SalleDAO {
    @Override
    public Salle findById(int id) {
        String sql = "SELECT * FROM salle WHERE id_salle = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Salle(
                        rs.getInt("id_salle"),
                        rs.getString("nom_salle"),
                        rs.getInt("capacite")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Connection connection = DBConnection.getConnection();

    @Override
    public List<Salle> findAll() {
        List<Salle> salles = new ArrayList<>();
        String sql = "SELECT * FROM salle";
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Salle salle = new Salle(
                    rs.getInt("id_salle"),
                    rs.getString("nom_salle"),
                    rs.getInt("capacite")
                );
                salles.add(salle);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return salles;
    }

    public void save(Salle salle) {
        String sql = "INSERT INTO salle (nom_salle, capacite) VALUES (?, ?)";
        
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, salle.getNom_salle());
            pstmt.setInt(2, salle.getCapacite());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(int id) {
        String sql = "DELETE FROM salle WHERE id_salle = ?";
        
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

