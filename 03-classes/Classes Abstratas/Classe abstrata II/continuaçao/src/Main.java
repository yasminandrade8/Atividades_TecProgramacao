public class Main {
    public static void main(String[] args) throws Exception {
        Veiculo m = new Moto("Honda", "CG 160 Titan", 2026, "EGL-2511", 20590);
        Veiculo c = new Carro("Toyota", "Corolla", 2025, "FCE-5648", 206990);
        Veiculo ca = new Caminhao("Volvo", "FH 540", 2018, "DPT-9185", 490000);

        m.exibirDetalhes();
        System.out.println("-".repeat(30));
        c.exibirDetalhes();
        System.out.println("-".repeat(30));
        ca.exibirDetalhes();
    }
}
