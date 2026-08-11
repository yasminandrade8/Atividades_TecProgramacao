// Nome: Yasmin Rodrigues de Andrade
//Ra: 2171392521035
//Objetivo: Criar uma classe Abstrata Figura e 
//          as classes Retângulo, Triângulo, Quadrado,
//          que herdarão da clssse Figura. Criar a classe Quadrado que
//          que herdará da classe Retângulo.

public class Main {
    public static void main(String[] args) throws Exception {
        Figura r = new Retangulo("Azul", 3.90, 7.0);
        System.out.println(r);

        Figura t = new Triangulo("Vermelho", 6.34, 10.4);
        System.out.println(t);

        Figura c = new Circulo("Amarelo", 4);
        System.out.println(c);
        
        Figura q = new Quadrado("Verde", 4);
        System.out.println(q);
    }
}
