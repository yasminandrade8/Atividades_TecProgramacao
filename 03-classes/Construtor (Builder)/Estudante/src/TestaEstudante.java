//Objetivo: Criar uma classe Estudante com seus atributos, construtor, getters/setters, métodos e uma classe main

public class TestaEstudante {
    public static void main(String[] args) throws Exception {
        Estudante e = new Estudante("Yasmin", 19, 8.5);

        e.exibir();
        e.calcularMedia();
    }
}
