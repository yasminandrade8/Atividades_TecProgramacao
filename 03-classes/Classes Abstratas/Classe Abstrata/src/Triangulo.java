public class Triangulo extends Figura {
    private double base, altura;

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area() {
        return (base * altura) / 2;
    }
    @Override
    public String toString() {
        return "Triangulo ---> Cor: %s, Área: %.2f"
        .formatted(getCor(), area());
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
}
