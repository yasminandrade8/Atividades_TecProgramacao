public class Main {
    public static void main(String[] args) throws Exception {
        Funcionario clt = new FuncionarioCLT("Yasmin", "55773399", 15000, 20);
        Funcionario pj = new FuncionarioPj("Daniel", "2299331100", 16000, 220);
        clt.exibir();
        System.out.println("-".repeat(30));
        pj.exibir();
    }
}
