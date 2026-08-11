public class Circulo extends Figura {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }
    @Override
    public double area() {
        return Math.PI * (Math.pow(raio, 2));
    }
    public double getDiametro() {
        return 2 * raio;
    }
    @Override
    public String toString() {
        return "Círculo ---> Cor: %s, Área: %.2f, Diâmetro: %.2f"
            .formatted(getCor(), area(), getDiametro());
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    } 
}
