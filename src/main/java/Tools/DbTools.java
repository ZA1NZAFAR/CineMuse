package Tools;

import Models.Person;

import java.sql.*;

public class DbTools {

    public int checkExist(String id, String pwd) throws SQLException {
        String query = "SELECT * FROM person";
        try (PreparedStatement ps = getConnection().prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                if (rs.getString("Login").equals(id) && rs.getString("MDP").equals(pwd))
                    if (rs.getString("Type").equals("Client"))
                        return 1;
                    else if (rs.getString("Type").equals("Manager"))
                        return 2;
                    else if (rs.getString("Login").equals(id))
                        return 3;
                    else
                        return 4; //autre

            }
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return 0;
    }

    public boolean createAccount(Person user) throws SQLException {
        if (checkExist(user.getLogin(), user.getMotDePasse()) == 3) {
            throw new SQLException("Utilisateur existe deja.");
        }
        String query = " INSERT INTO persons (Prenom, Nom, Email, NumTel, Type, Login, MotDePasse, DateNaissance,Sexe)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = getConnection().prepareStatement(query)) {
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
