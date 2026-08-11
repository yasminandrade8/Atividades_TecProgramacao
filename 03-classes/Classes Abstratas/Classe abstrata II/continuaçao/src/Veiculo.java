public abstract class Veiculo {
    protected String marca, modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public abstract double calcularImposto();
    public void exibirDetalhes() {
        System.out.println("Marca: %s \nModelo: %s \nAno: %s"
            .formatted(getMarca(), getModelo(), getAno())
        );    
    };

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
}
