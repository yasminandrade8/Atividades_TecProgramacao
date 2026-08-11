public abstract class Transporte {
    protected String tipo;

    public Transporte(String tipo) {
        this.tipo = tipo;
    }
    public abstract void mover();
    public abstract void acelerar();
    public abstract void exibir();

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
}
