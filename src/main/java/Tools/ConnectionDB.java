package Tools;

import Models.Person;

import java.sql.*;

/**
 * @author z.zafar
 */
public class ConnectionDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/cinemusemaster?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String DB_USERNAME = "cinemuseadmin";
    private static final String DB_PASSWORD = "CineMuse1!$";

    public boolean checkExist(String id, String pwd) throws SQLException {
        String query = "SELECT * FROM persons";
        loadDriverClass();
        try (Connection conn = DriverManager.getConnection(CONNECTION_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                if (rs.getString("Login").equals(id) && rs.getString("MotDePasse").equals(pwd)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return false;
    }

    public boolean createAccount(Person user) throws SQLException {
        if (checkExist(user.getLogin(), user.getMotDePasse())) {
            throw new SQLException("Utilisateur existe deja.");
        }
        String query = " INSERT INTO persons (Prenom, Nom, Email, NumTel, Type, Login, MotDePasse, DateNaissance,Sexe)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        loadDriverClass();
        try (Connection conn = DriverManager.getConnection(CONNECTION_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setString(1, user.getPrenom());
            ps.setString(2, user.getNom());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getNumTel());
            ps.setString(5, "client");
            ps.setString(6, user.getLogin());
            ps.setString(7, user.getMotDePasse());
            ps.setString(8, user.getDateNaissance().toString());
            ps.setString(9, user.getSexe() + "");
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }

    private void loadDriverClass() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Unable to load driver class : " + ex.getMessage());
        }
    }

}
