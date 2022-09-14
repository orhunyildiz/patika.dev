package JDBC.Exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionManagementExercise {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/university", "root", "mysql")) {
            String updatePositionSql = "UPDATE employees SET position = ? WHERE emp_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updatePositionSql);
            preparedStatement.setString(1, "senior developer");
            preparedStatement.setInt(2, 1);

            String updateSalarySql = "UPDATE employees SET salary = ? WHERE emp_id = ?";
            PreparedStatement preparedStatement1 = connection.prepareStatement(updateSalarySql);
            preparedStatement1.setDouble(1, 3000);
            preparedStatement1.setInt(2, 1);

            boolean autoCommit = connection.getAutoCommit();

            try {
                connection.setAutoCommit(false);
                preparedStatement.executeUpdate();
                preparedStatement1.executeUpdate();
                connection.commit();
            } catch (SQLException exception) {
                connection.rollback();
            } finally {
                connection.setAutoCommit(autoCommit);
            }
        } catch (SQLException exception) {
            System.out.println("SQLException: " + exception.getMessage());
            System.out.println("SQLState: " + exception.getSQLState());
            System.out.println("VendorError: " + exception.getErrorCode());
        }
    }
}
