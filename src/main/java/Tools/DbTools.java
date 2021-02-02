package Tools;

import Models.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbTools {
    public static int checkExist(Connection conn, String id, String pwd) throws SQLException {
        String query = "SELECT * FROM persons";
        try (PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                if (rs.getString("Login").equals(id) && rs.getString("MotDePasse").equals(pwd))
                    if (rs.getString("Type").equals("Client"))
                        return 1;
                    else if (rs.getString("Type").equals("Manager"))
                        return 2;
                    else
                        return 3; //autre

            }
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return 0;
    }

    public static boolean createAccount(Connection conn, Person user) throws SQLException {
        if (checkExist(conn, user.getLogin(), user.getMotDePasse()) == 0) {
            throw new SQLException("Utilisateur existe deja.");
        }
        String query = " INSERT INTO persons (Prenom, Nom, Email, NumTel, Type, Login, MotDePasse, DateNaissance,Sexe)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(query);) {
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


}
