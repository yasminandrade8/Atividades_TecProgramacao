public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double calcular() {
        return this.preco * this.qtdEstoque;
    }
    public void adicionar(int qtd) {
        if (qtd > 0) {
            this.qtdEstoque += qtd;
            System.out.println(qtd + " unidade(s) adicionada(s).");
        }
    }
    public void retirar(int qtd) {
        if (qtd > 0 && qtd <= this.qtdEstoque) {
            this.qtdEstoque -= qtd;
            System.out.println(qtd + " unidade(s) retirada(s)");
        } else {
            System.out.println("ERRO: Estoque insuficiente ou valor inválido!");
        }
    }
}
