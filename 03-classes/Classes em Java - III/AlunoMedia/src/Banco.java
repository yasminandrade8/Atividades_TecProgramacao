import java.sql.Connection;
import java.sql.PreparedStatement;

public class Banco {
    public void salvarNoBanco(Aluno a) {
    String sql = "INSERT INTO Aluno(matricula, nomeAluno, nota1, nota2, mediaFinal, stat) VALUES(?, ?, ?, ?, ?, ?)";

    try (Connection conn = Conexão.getConexao(); 
        PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, Integer.parseInt(a.getMatricula()));
        stmt.setString(2, a.getNome());
        stmt.setDouble(3, a.getNota1());
        stmt.setDouble(4, a.getNota2());
        stmt.setDouble(5, a.calcularMediaFinal());
        stmt.setString(6, a.status());

        stmt.executeUpdate();
        System.out.println("Aluno " + a.getNome() + " salvo com sucesso!");

    } catch (Exception e) {
        System.err.println("Erro ao salvar objeto Aluno: " + e.getMessage());
    }
}
}
