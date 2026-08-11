package Herança_02;

public class Garagem {
    public static void main(String[] args) {
        Veiculo caminhao = new Caminhao("46769CSD", 1990, 4);
        Veiculo onibus = new Onibus("25670TAF", 2010, 24);

        System.out.println("- Caminhão");
        caminhao.exibirDados();
        System.out.println("- Ônibus");
        onibus.exibirDados();    
    }
}
