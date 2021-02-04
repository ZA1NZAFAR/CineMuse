package Tools;

import DTO.FilmSeanceDTO;
import Models.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbTools {

    public int checkExist(String id, String pwd) throws SQLException {
        String query = "SELECT * FROM person";
        try (PreparedStatement ps = getConnection().prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                if (rs.getString("Login").equals(id) && rs.getString("MDP").equals(pwd)) {
                    if (rs.getString("Type").equals("Client"))
                        return 1;
                    else if (rs.getString("Type").equals("Manager"))
                        return 2;
                    else
                        return 3; //autre
                }
                if (rs.getString("Login").equals(id))
                    return 9;
            }

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return 0;
    }

    public void createAccount(Person user) throws SQLException {
        if (checkExist(user.getLogin(), user.getMotDePasse()) == 9) {
            throw new SQLException("Utilisateur existe deja.");
        }
        String query = " INSERT INTO person (Prenom, Nom, Email, NumTel, Type, Login, MDP, DateNaissance,Sexe)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = getConnection().prepareStatement(query)) {
            ps.setString(1, user.getPrenom());
            ps.setString(2, user.getNom());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getNumTel());
            ps.setString(5, "client");
            ps.setString(6, user.getLogin());
            ps.setString(7, user.getMotDePasse());
            ps.setString(8, user.getDateNaissance());
            ps.setString(9, user.getSexe() + "");
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }

    public List<FilmSeanceDTO> getFilms(String date, Filters filters) throws SQLException {
        ArrayList<FilmSeanceDTO> res = new ArrayList<>();
        String queryGetSeances;
        if (null == date)
            queryGetSeances = "SELECT * FROM seance WHERE Date = CURDATE()";
        else {
            queryGetSeances = "SELECT * FROM seance WHERE Date = " + "'" + date + "'";
        }
        try (PreparedStatement ps = getConnection().prepareStatement(queryGetSeances);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String idFilmPourLaSeance = rs.getString("IdFilm");
                Seance seance = new Seance(rs.getInt("IdSeance"), rs.getDouble("Heure"),
                        rs.getString("Date"),
                        rs.getInt("NbPlacesDispo"),
                        rs.getInt("NbPlaceOccupe"),
                        rs.getInt("IdSalle"),
                        rs.getInt("IdFilm"),
                        rs.getInt("IdPlaces"));


                String requeteGetFilmPourLaSeance = "SELECT * FROM film WHERE IdFilm = " + idFilmPourLaSeance;
                try (PreparedStatement ps2 = getConnection().prepareStatement(requeteGetFilmPourLaSeance);
                     ResultSet rs2 = ps2.executeQuery()) {
                    while (rs2.next()) {
                        res.add(new FilmSeanceDTO(seance, new Film(rs2.getInt("IdFilm"), rs2.getString("Nom"), rs2.getString("Genre"), rs2.getString("Langue"),
                                rs2.getString("PhotoAdresse"), rs2.getInt("Prix"), rs2.getInt("Annee"),
                                rs2.getInt("Duree"))));
                    }
                } catch (SQLException e) {
                    throw new SQLException(e.getMessage());
                }
            }
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }

        return res;
    }

    public Places getPlacesForSeance(int idSeance) throws SQLException {
        Places places = null;
        String query = "SELECT * FROM Places WHERE idPlaces = (SELECT IdPlaces FROM Seance WHERE IdSeance = " + idSeance+")";
        try (PreparedStatement ps = getConnection().prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int[] tabTemp = new int[50];
                for (int i = 0; i < 50; i++) {
                    tabTemp[i] = rs.getInt("p" + i);
                }
                places = new Places(rs.getInt("IdPlaces"),tabTemp);
            }
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return places;
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
