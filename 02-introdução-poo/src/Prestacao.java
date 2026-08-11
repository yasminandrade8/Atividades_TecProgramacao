//Objetivo: Calcular e mostrar o valor de uma prestação em atraso.

import java.util.Scanner;

public class Prestacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        double taxa;
        int tempo;
        System.out.println("Valor da prestação: ");
        valor = sc.nextDouble();
        System.out.println("Taxa de juros: ");
        taxa = sc.nextDouble();
        System.out.println("Tempo: ");
        tempo = sc.nextInt();

        double Prestacao = valor + (valor *(taxa / 100) * tempo);

        System.out.println("Sua prestação é de: " + Prestacao + " reais");
        sc.close();
    }
}