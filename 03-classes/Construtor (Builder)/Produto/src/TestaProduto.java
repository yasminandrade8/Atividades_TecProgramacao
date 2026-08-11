//Objetivo: Criar uma classe Produto com seus atributos, contrutor, getters/setters e uma classe main

public class TestaProduto {
    public static void main(String[] args) throws Exception {
        Produto p = new Produto("Mochila", 135.00, 15);

        System.out.println("Produto: " + p.getNome());
        System.out.printf("Preço unitário: %.2f%n", p.getPreco());
        System.out.println("Quantidade no estoque: " + p.getQtdEstoque());
        System.out.printf("Valor total do estoque: %.2f%n", p.calcular());
        p.adicionar(10);
        System.out.printf("Valor total do estoque: %.2f%n", p.calcular());
        p.retirar(5);
        System.out.printf("Valor total do estoque: %.2f%n", p.calcular());


    }
}
