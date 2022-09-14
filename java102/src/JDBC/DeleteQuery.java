package JDBC;

import java.sql.*;

public class DeleteQuery {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM student WHERE student_id = 3");

            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM student WHERE student_id = ?");
            preparedStatement.setInt(1, 4);
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
