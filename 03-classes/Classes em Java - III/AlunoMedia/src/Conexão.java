import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexão {
    private static final String URL = "jdbc:mysql://localhost:3306/notas";
    private static final String USER = "root";
    private static final String PASSWORD = "danyas31";

    public static Connection getConexao() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao MySQL: " + e.getMessage());
        }
    }
}