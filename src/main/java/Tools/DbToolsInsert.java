package Tools;

import Models.Places;

import java.sql.*;

public class DbToolsInsert {

    public boolean insertPlaces(Places p) throws SQLException {
        String query = p.getSql();
        try (PreparedStatement ps = getConnection().prepareStatement(query)) {
            ps.executeUpdate();
        }
        return true;
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
