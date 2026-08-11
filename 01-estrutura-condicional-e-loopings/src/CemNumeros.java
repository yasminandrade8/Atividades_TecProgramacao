//Objetivo: Apresentar o total da soma dos primeiros cem números. 

import java.util.Scanner;

public class CemNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma = soma + i;
        }
        System.out.println("O total é: " + soma);
        sc.close();
    }
}
