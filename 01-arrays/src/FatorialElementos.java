//Objetivo: Criar um programa que solicite ao usuário 5 elementos que serão inseridos no vetor A, 
//          depois criar um vetor B. Ler o vetor A e para cada elemento, 
//          calcular o fatorial e gravar no B. Mostrar as duas coleções no final.

import java.util.Scanner;

public class FatorialElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[5];
        int [] b = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int num = a[i];
            long f = 1;

            for (int j = 1; j <= num; j++) {
                f *= j;
            }

            b[i] = (int) f;
        }

        System.out.println("COLEÇÃO A \t\t COLEÇÃO B");
        for(int i = 0; i < 5; i++) {
            System.out.println("Posição: " + i + ": " + a[i] + "\t\t" + "Posição " + i + ": " + b[i]);
        }
        sc.close();
    }
}
