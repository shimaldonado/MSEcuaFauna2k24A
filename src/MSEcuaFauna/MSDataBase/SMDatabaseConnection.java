package MSEcuaFauna.MSDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SMDatabaseConnection {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                String url = "jdbc:sqlite:DataBase/SMEcuaFauna.db";
                connection = DriverManager.getConnection(url);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
