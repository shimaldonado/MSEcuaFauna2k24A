package MSEcuaFauna.MSControlers;

import MSEcuaFauna.*;
import MSEcuaFauna.MSDataBase.SMDatabaseConnection;
import MSEcuaFauna.MSModels.SMHormiga;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SMHormigaDAO {
    
    public void smCreateHormiga(SMHormiga hormiga) throws SQLException {
        String sql = "INSERT INTO SMHormiga (TipoHormiga, Ubicacion, Sexo, GenoAlimento, IngestaNativa, Estado) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = SMDatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, hormiga.getSmTipoHormiga());
            pstmt.setString(2, hormiga.getSmUbicacion());
            pstmt.setString(3, hormiga.getSmSexo());
            pstmt.setString(4, hormiga.getSmGenoAlimento());
            pstmt.setString(5, hormiga.getSmIngestaNativa());
            pstmt.setString(6, hormiga.getSmEstado());
            pstmt.executeUpdate();
        }
    }

    public List<SMHormiga> smReadAllHormigas() throws SQLException {
        List<SMHormiga> hormigas = new ArrayList<>();
        String sql = "SELECT * FROM SMHormiga";
        try (Connection conn = SMDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                SMHormiga hormiga = new SMHormiga(
                    rs.getInt("ID"),
                    rs.getString("TipoHormiga"),
                    rs.getString("Ubicacion"),
                    rs.getString("Sexo"),
                    rs.getString("GenoAlimento"),
                    rs.getString("IngestaNativa"),
                    rs.getString("Estado")
                );
                hormigas.add(hormiga);
            }
        }
        return hormigas;
    }

    public void smUpdateHormiga(SMHormiga hormiga) throws SQLException {
        String sql = "UPDATE SMHormiga SET TipoHormiga = ?, Ubicacion = ?, Sexo = ?, GenoAlimento = ?, IngestaNativa = ?, Estado = ? WHERE ID = ?";
        try (Connection conn = SMDatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, hormiga.getSmTipoHormiga());
            pstmt.setString(2, hormiga.getSmUbicacion());
            pstmt.setString(3, hormiga.getSmSexo());
            pstmt.setString(4, hormiga.getSmGenoAlimento());
            pstmt.setString(5, hormiga.getSmIngestaNativa());
            pstmt.setString(6, hormiga.getSmEstado());
            pstmt.setInt(7, hormiga.getSmId());
            pstmt.executeUpdate();
        }
    }

    public void smDeleteHormiga(int smId) throws SQLException {
        String sql = "DELETE FROM SMHormiga WHERE ID = ?";
        try (Connection conn = SMDatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, smId);
            pstmt.executeUpdate();
        }
    }
}
