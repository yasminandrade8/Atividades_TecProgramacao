public class Carro extends Transporte {
    private double preco;

    public Carro(String tipo, double preco) {
        super(tipo);
        this.preco = preco;
    }
    @Override
    public void exibir() {
        System.out.println("Tipo: %s \nPreço: %.2f"
        .formatted(getTipo(), getPreco()));
    }
    @Override
    public void mover() {
        System.out.println("O carro está se movendo!");
    }
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
}
