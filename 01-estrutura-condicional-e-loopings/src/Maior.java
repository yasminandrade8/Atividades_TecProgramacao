//Objetivo: Ler 3 valores inteiros e imprimir o maior deles.

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Primeiro número: ");
        a = sc.nextInt();
        System.out.println("Segundo número: ");
        b = sc.nextInt();
        System.out.println("Terceiro número: ");
        c = sc.nextInt();

        int maior = 0;
        if (a >= b && a >= c ) {
            maior = a;
        } else if ( b >= a && b >= c) {
            maior = b;
        } else if (c >= a && c >= b) {
            maior = c;
        }

        System.out.println("O maior número é: " + maior);

        sc.close();
    }
}
