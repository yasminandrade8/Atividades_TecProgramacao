public class Caminhao extends Veiculo{
    private String placaCa;
    private double precoCa;

    public Caminhao(String marca, String modelo, int ano, String placaCa, double precoCa) {
        super(marca, modelo, ano);
        this.placaCa = placaCa;
        this.precoCa = precoCa;
    }
    @Override
    public double calcularImposto() {
        return precoCa * 0.015;
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Marca: %s \nModelo: %s \nAno: %s \nPreço: %.2f \nPlaca: %s \nImposto: %.2f"
            .formatted(getMarca(), getModelo(), getAno(), getPrecoCa(), getPlacaCa(), calcularImposto())
        );  
    }

    public void setPlacaCa(String placaCa) {
        this.placaCa = placaCa;
    }
    public void setPrecoCa(double precoCa) {
        this.precoCa = precoCa;
    }

    public String getPlacaCa() {
        return placaCa;
    }
    public double getPrecoCa() {
        return precoCa;
    } 
}
