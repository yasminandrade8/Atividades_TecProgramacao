//Objetivo: O programa receberá um número e deverá apresentar o resto da divisão por 6.

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.println("Digite um número: ");
        n = sc.nextDouble();

        double d = n % 6;

        System.out.println("O resultado é: " + d);
        sc.close();
    }
}