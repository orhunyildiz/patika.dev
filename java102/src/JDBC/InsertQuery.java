package JDBC;

import java.sql.*;

public class InsertQuery {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO student (student_name, student_class) VALUES ('Damla', 4)");

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student (student_name, student_class) VALUES (?, ?)");
            preparedStatement.setString(1, "Ahmet");
            preparedStatement.setInt(2, 5);
            preparedStatement.executeUpdate();

            preparedStatement.close();
            statement.close();
        } catch (SQLException exception) {
            System.out.println("SQLException: " + exception.getMessage());
            System.out.println("SQLState: " + exception.getSQLState());
            System.out.println("VendorError: " + exception.getErrorCode());
        }
    }
}
