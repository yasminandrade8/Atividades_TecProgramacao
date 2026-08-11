//Objetivo: Ler 5 números inteiros e identificar o maior e o menor valor.

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "° número");
            int num = sc.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("O maior número é " + maior + " e o menor é " + menor);

        sc.close();
    }
}
