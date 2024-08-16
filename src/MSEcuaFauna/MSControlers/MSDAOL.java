package MSEcuaFauna.MSControlers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import MSEcuaFauna.MSDataBase.SMDatabaseConnection;

public class MSDAOL {
    public void createUser(String username, String password) {
        String hashedPassword = msPass.hashPassword(password);

        String sql = "INSERT INTO Users (username, password) VALUES (?, ?)";

        try (Connection connection = SMDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, username);
            statement.setString(2, hashedPassword);
            statement.executeUpdate();
            System.out.println("User created successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
