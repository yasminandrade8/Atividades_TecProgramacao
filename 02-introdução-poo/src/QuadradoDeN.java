//Objetivo: O programa deverá ler um número inteiro e apresentar o resultado do quadrado desse número.

import java.util.Scanner;

public class QuadradoDeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número: ");
        n = sc.nextInt();

        int q = n * n;

        System.out.println("O resultado é: " + q);
        sc.close();
    }
}
