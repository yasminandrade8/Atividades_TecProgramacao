//Objetivo: Ler um número inteiro e apresentar se é par ou ímpar.

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("Digite um número: ");
        a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }
        
        sc.close();
    }
}