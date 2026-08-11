public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }
    
    @Override
    public void exibir() {
        System.out.println("=== Dados do Carro ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Número de portas: " + getNumPortas());
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro");
    }

    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}
