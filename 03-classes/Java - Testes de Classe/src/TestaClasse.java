//Objetivo: Criar um programa que leia o nome e as três notas trimestrais de um aluno (pesos 30, 35 e 35). 
//          Exibir a nota final e o status de aprovação (mínimo 60%). 
//          Se reprovado, informar quantos pontos faltam para atingir o mínimo.

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Digite seu nome: ");
        a.setNome(sc.nextLine());
        System.out.println("Digite a nota do 1° Trimestre: ");
        a.setNota1(sc.nextDouble());
        System.out.println("Digite a nota do 2° Trimestre: ");
        a.setNota2(sc.nextDouble());
        System.out.println("Digite a nota do 3° Trimestre: ");
        a.setNota3(sc.nextDouble());

        a.calcularM1();
        a.calcularM2();
        a.calcularM3();

        if (a.notaFinal() >= 60) {
            System.out.printf("NOTA FINAL: %.2f%n", a.notaFinal());
            System.out.println("APROVADO");
        }else {
            System.out.printf("NOTA FINAL: %.2f%n", a.notaFinal());
            System.out.println("REPROVADO");
            double faltam = 60 - a.notaFinal();
            System.out.printf("FALTARAM %.2f PONTOS%n", faltam);    
        }
        sc.close();
    }
}
