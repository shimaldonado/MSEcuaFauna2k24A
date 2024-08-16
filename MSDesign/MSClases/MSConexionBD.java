import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MSConexionBD {
    private static final String URL = "jdbc:sqlite:DataBase/ecuaFauna2K24A.db";
    private Connection connection;

    public MSConexionBD() {
        try {
            connection = DriverManager.getConnection(URL);
            System.out.println("Conexión a la base de datos establecida.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión a la base de datos cerrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
