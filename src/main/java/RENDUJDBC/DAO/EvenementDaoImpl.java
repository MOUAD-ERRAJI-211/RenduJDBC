package RENDUJDBC.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import RENDUJDBC.Models.*;


public class EvenementDaoImpl implements EvenementDAO {
    @Override
    public Evenement findById(int id) {
        return null;
    }

    @Override
    public void update(Evenement evenement) {
    }
    private Connection connection = DBConnection.getConnection();

    @Override
    public List<Evenement> findAll() {
        List<Evenement> evenements = new ArrayList<>();
        String sql = "SELECT * FROM Evenement";
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Evenement evenement = new Evenement(
                    rs.getInt("id_event"),
                    rs.getString("nom_event"),
                    rs.getDate("date_event"),
                    rs.getString("description"),
                    rs.getInt("id_user")
                );
                evenements.add(evenement);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return evenements;
    }

    public void save(Evenement evenement) {
        String sql = "INSERT INTO Evenement (nom_event, date_event, description) VALUES (?, ?, ?)";
        
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, evenement.getNom_event());
            pstmt.setDate(2, (Date) evenement.getDate_event());
            pstmt.setString(3, evenement.getDescription());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(int id) {
        String sql = "DELETE FROM Evenement WHERE id_event = ?";
        
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

