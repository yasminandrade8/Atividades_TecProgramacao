public class Main {
    public static void main(String[] args) throws Exception {
        Transporte c = new Carro("Carro", 90000);
        Transporte m = new Moto("Moto", 20000);
        Transporte ca = new Caminhao("Caminhão", 400000);

        c.exibir();
        c.mover();
        c.acelerar();
        

        m.exibir();
        m.mover();
        m.acelerar();
        System.out.println("=".repeat(30));

        ca.exibir();
        ca.mover();
        ca.acelerar();
        System.out.println("=".repeat(30));
    }
}
