//Objetivo: Ler a nota do aluno, fazer a média delas e depois imprimir se o aluno foi ou não aprovado.

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4;

        System.out.println("Nota 1° Bimestre: ");
        n1 = sc.nextDouble();
        System.out.println("Nota 2° Bimestre: ");
        n2 = sc.nextDouble();
        System.out.println("Nota 3° Bimestre: ");
        n3 = sc.nextDouble();
        System.out.println("Nota 4° Bimestre: ");
        n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.printf("%.2f Aprovado!", media);
        } else {
            System.out.printf("%.2f Reprovado.", media);
        }

        sc.close();
    }
}
