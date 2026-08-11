package Herança_01;

public class Empresa {
    public static void main(String[] args) {
        Gerente g = new Gerente("Marcos", "444555666777", 4567.00, 99999);

        g.exibir();
        g.autentica(99999);
    }
}