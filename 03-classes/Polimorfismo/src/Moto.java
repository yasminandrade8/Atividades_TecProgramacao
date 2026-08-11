public class Moto extends Transporte {
    private double preco;

    public Moto(String tipo, double preco) {
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
        System.out.println("A moto está se movendo!");
    }
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando!");
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
    
}
