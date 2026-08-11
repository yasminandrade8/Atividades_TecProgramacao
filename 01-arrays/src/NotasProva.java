//Objetivo: Fazer um programa que receba as notas da primeira e da segunda prova 
//          de cinco alunos, armazenar as notas (p1 e p2) em vetores distintos 
//          e depois calcular a média de cada aluno.

import java.util.Scanner;

public class NotasProva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] p1 = new double[5];
        double [] p2 = new double[5];
        double [] media = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota Aluno P1: ");
            p1[i] = sc.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota Aluno P2: ");
            p2[i] = sc.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            media[i] = (p1[i] + p2[i]) / 2.0;
        }

        System.out.println("P1 \t P2 \t MÉDIA");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%.1f \t %.1f \t %.1f %n", p1[i], p2[i], media[i]);
        }

        sc.close();

    }
}
