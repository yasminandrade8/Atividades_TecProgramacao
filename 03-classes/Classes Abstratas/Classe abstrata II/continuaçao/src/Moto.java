public class Moto extends Veiculo{
    private String placaM;
    private double precoM;

    public Moto(String marca, String modelo, int ano, String placa, double preco) {
        super(marca, modelo, ano);
        this.placaM = placa;
        this.precoM = preco;
    }
    @Override
    public double calcularImposto() {
        return precoM * 0.2;
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Marca: %s \nModelo: %s \nAno: %s \nPreço: %.2f \nPlaca: %s \nImposto: %.2f"
            .formatted(getMarca(), getModelo(), getAno(), getPrecoM(), getPlacaM(), calcularImposto())
        );    
    };

    public void setPlacaM(String placaM) {
        this.placaM = placaM;
    }
    public void setPrecoM(double precoM) {
        this.precoM = precoM;
    }

    public String getPlacaM() {
        return placaM;
    }
    public double getPrecoM() {
        return precoM;
    }
}
