public class Carro extends Veiculo {
    private String placaC;
    private double precoC;

    public Carro(String marca, String modelo, int ano, String placaC, double precoC) {
        super(marca, modelo, ano);
        this.placaC = placaC;
        this.precoC = precoC;
    }
    @Override
    public double calcularImposto() {
        return precoC * 0.4;
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Marca: %s \nModelo: %s \nAno: %s \nPreço: %.2f \nPlaca: %s \nImposto: %.2f"
            .formatted(getMarca(), getModelo(), getAno(), getPrecoC(), getPlacaC(), calcularImposto())
        );
    }

    public void setPlacaC(String placaC) {
        this.placaC = placaC;
    }
    public void setPrecoC(double precoC) {
        this.precoC = precoC;
    }

    public String getPlacaC() {
        return placaC;
    }
    public double getPrecoC() {
        return precoC;
    }
}
