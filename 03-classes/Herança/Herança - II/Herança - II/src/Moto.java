public class Moto extends Veiculo {
    private int cilindaradas;

    public Moto(String marca, String modelo, int ano, int cilindaradas) {
        super(marca, modelo, ano);
        this.cilindaradas = cilindaradas;
    }

    @Override
    public void exibir() {
        System.out.println("=== Dados da Moto ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Cilindradas: " + getCilindradas());
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando a moto");
    }

    public int getCilindradas() {
        return cilindaradas;
    }
    public void setCilindradas(int cilindaradas) {
        this.cilindaradas = cilindaradas;
    }
}
