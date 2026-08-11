//Objetivo: Receber um número e mostrar o fatorial desse número.

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        long f = 1;
        System.out.println("Digite um número: ");
        a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            f *= i;
        }
        System.out.println("O fatorial de " + a + " é: " + f);

        sc.close();
    }
}
