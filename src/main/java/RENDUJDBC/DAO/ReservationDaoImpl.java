package RENDUJDBC.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import RENDUJDBC.Models.*;


public  class ReservationDaoImpl implements ReservationDAO {
    private Connection connection = DBConnection.getConnection();

    @Override
    public List<Reservation> findAll() {
        List<Reservation> reservations = new ArrayList<>();
        String sql = "SELECT * FROM reservation";
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Reservation reservation = new Reservation(
                    rs.getInt("id_reservation"),
                    rs.getInt("id_user"),
                    rs.getInt("id_event"),
                    rs.getInt("id_salle"),
                    rs.getInt("id_terrain"),
                    rs.getDate("date_reservation")
                );
                reservations.add(reservation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservations;
    }

    public void save(Reservation reservation) {
        String sql = "INSERT INTO reservation (id_user, id_event, id_salle, id_terrain, date_reservation) VALUES (?, ?, ?, ?, ?)";
        
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, reservation.getId_user());
            pstmt.setInt(2, reservation.getId_event());
            pstmt.setInt(3, reservation.getId_salle());
            pstmt.setInt(4, reservation.getId_terrain());
            pstmt.setDate(5, (Date) reservation.getDate_reservation());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(int id) {
        String sql = "DELETE FROM reservation WHERE id_reservation = ?";
        
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Reservation findById(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void update(Reservation reservation) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean checkAvailability(int id_salle, int id_terrain, Date date) {
        throw new UnsupportedOperationException("Unimplemented method 'checkAvailability'");
    }
}
