//Objetivo: O programa deverá ler 3 valores inteiros e apresentar os 3 números em ordem crescente.

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Terceiro número: ");
        int n3 = sc.nextInt();

        int menor, meio, maior;

        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
            if (n2 <= n3) {
                meio = n2;
                maior = n3;
            } else {
                meio = n3;
                maior = n2;
            }
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
            if (n1 <= n3) {
                meio = n1;
                maior = n3;
            } else {
                meio = n3;
                maior = n1;
            }
        } else {
            menor = n3;
            if (n1 <= n2) {
                meio = n1;
                maior = n2;
            } else {
                meio = n2;
                maior = n1;
            }
        }

        System.out.println("Números em ordem crescente: ");
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        
        sc.close();
    }
}