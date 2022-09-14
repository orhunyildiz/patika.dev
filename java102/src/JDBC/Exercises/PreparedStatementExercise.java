package JDBC.Exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExercise {
    public static void main(String[] args) {
        String updatePositionSql = "UPDATE employees SET position = ? WHERE emp_id = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/university", "root", "mysql")) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(updatePositionSql)) {
                preparedStatement.setString(1, "junior developer");
                preparedStatement.setInt(2, 1);
                int rowEffected = preparedStatement.executeUpdate();
            }
        } catch (SQLException exception) {
            System.out.println("SQLException: " + exception.getMessage());
            System.out.println("SQLState: " + exception.getSQLState());
            System.out.println("VendorError: " + exception.getErrorCode());
        }
    }
}
