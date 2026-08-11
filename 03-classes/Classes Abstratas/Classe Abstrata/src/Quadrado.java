public class Quadrado extends Retangulo {
    public Quadrado(String cor, double lado1) {
        super(cor, lado1, lado1);
    }
    @Override
    public double area() {
        return this.lado1 * this.lado1;
    }
    @Override
    public String toString() {
        return "Quadrado ---> Cor: %s, Área: %.2f"
        .formatted(getCor(), area());
    }
}
