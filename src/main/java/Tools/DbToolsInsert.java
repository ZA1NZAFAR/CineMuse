package Tools;

import Models.Film;
import Models.Places;
import Models.Reservation;
import Models.Seance;

import java.sql.*;

public class DbToolsInsert {

    public boolean insertPlaces(Places p) throws SQLException {
        String query = p.getSql();
        try (PreparedStatement ps = getConnection().prepareStatement(query)) {
            ps.executeUpdate();
        }
        return true;
    }

    public void insertReservation(Reservation reservation) throws SQLException {
        String query = reservation.getSql();
        try (PreparedStatement ps = getConnection().prepareStatement(query)) {
            ps.executeUpdate();
        }
    }


    public void insertFilm(Film film) throws SQLException {
        String query = "INSERT INTO film (Nom, Prix, Genre, Annee, Duree, Langue, PhotoAdresse) " +
                "VALUES (?,?,?,?,?,?,?)";
        try (PreparedStatement ps = getConnection().prepareStatement(query)) {
            ps.setString(1, film.getNom());
            ps.setDouble(2, film.getPrix());
            ps.setString(3, film.getGenre());
            ps.setInt(4, film.getAnnee());
            ps.setInt(5, film.getDuree());
            ps.setString(6, film.getLangue());
            ps.setString(7, film.getAddressPhoto());
            ps.execute();
        }
    }

    public int insertPlace() throws Exception {
        String query = "INSERT INTO places () VALUES ()";
        String query2 = "select IdPlaces from places order by IdPlaces desc limit 1";
        try (PreparedStatement ps = getConnection().prepareStatement(query)) {
            ps.execute();
        }
        try (PreparedStatement ps = getConnection().prepareStatement(query2);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                return rs.getInt("IdPlaces");
            }
        }
        return -1;
    }

    public void insertSeance(Seance seance) throws Exception {
        int insertedPlace = insertPlace();
        if (insertedPlace < 0) {
            throw new Exception("Unable to create places");
        }

        String query = "INSERT INTO seance(Heure, Date, IdSalle, IdFilm, IdPlaces)" +
                "VALUES (?,?,?,?,?)";
        try (PreparedStatement ps = getConnection().prepareStatement(query)) {
            ps.setDouble(1, seance.getHeure());
            ps.setString(2, seance.getDate());
            ps.setInt(3, seance.getIdSalle());
            ps.setInt(4, seance.getIdFilm());
            ps.setInt(5, insertedPlace);
            ps.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public Connection getConnection() throws SQLException {
        try {
            Class.forName(Constants.JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(Constants.CONNECTION_URL, Constants.DB_USERNAME, Constants.DB_PASSWORD);
            return conn;
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
    }


}
