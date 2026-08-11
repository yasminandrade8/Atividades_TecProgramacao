public class Bicicleta extends Transporte {
    private double preco;

    public Bicicleta(String tipo, double preco) {
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
        System.out.println("A bicicleta está se movendo!");
    }
    @Override
    public void acelerar() {
        System.out.println("A bicicleta está acelerando!");
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }  
}

