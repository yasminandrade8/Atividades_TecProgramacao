public class Aviao extends Transporte {
    private double preco;

    public Aviao(String tipo, double preco) {
        super(tipo);
        this.preco = preco;
    }
    @Override
    public void exibir() {
        System.out.println("Tipo: %s Preço: %s"
        .formatted(getTipo(), getPreco()));
    }
    @Override
    public void mover() {
        System.out.println("O avião está se movendo!");
    }
    @Override
    public void acelerar() {
        System.out.println("O avião está acelerando!");
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
}
