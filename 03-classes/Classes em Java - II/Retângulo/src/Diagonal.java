//Objetivo: Ler a largura e altura de um retângulo. Em seguida mostrar a área, perímetro e diagonal.

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Retangulo r = new Retangulo();
        
        System.out.println("Digite a altura do retangulo: ");
        r.altura = sc.nextDouble();
        System.out.println("Digite a largura do retangulo: ");
        r.largura = sc.nextDouble();

        r.exibirDados();
        sc.close();
    }
}
