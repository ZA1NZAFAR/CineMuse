package Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author z.zafar
 */
public class ConnectionDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/cinemusemaster?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String DB_USERNAME = "cinemuseadmin";
    private static final String DB_PASSWORD = "CineMuse1!$";

    public static Connection getConnection() throws SQLException {
        loadDriverClass();
        try (Connection conn = DriverManager.getConnection(CONNECTION_URL, DB_USERNAME, DB_PASSWORD)) {
            return conn;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }

    private static void loadDriverClass() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Unable to load driver class : " + ex.getMessage());
        }
    }

}
