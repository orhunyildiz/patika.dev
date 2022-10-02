package PatikaDevClone.com.patikadev.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    private Connection connection;

    public Connection connectDB() {
        try {
            connection = DriverManager.getConnection(Config.DB_URL, Config.DB_USERNAME, Config.DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
        return connection;
    }

    public static Connection getInstance() {
        DBConnector dbConnector = new DBConnector();
        return dbConnector.connectDB();
    }
}
