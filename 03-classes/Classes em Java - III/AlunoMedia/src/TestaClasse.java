//Objetivo: Criar um sistema que receba os dados de um aluno e calcule a media das notas, 
//          verificar se a nota esata abaixo ou acima da média
//          caso esteja acima o sistema deverá imprimir os dados + a média final, 
//          caso o aluno estaja abaixo da média, o sistema devera mostra
//          que ele ficou de exame e pedirá a nota de exame, 
//          assim os sistema recalcula e imprime a média final.

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        
        System.out.println("Digite seu nome: ");
        a.setNome(sc.nextLine()); 
        System.out.println("Digite sua matrícula: ");
        a.setMatricula(sc.nextLine());
        System.out.println("Digite sua nota da P1: ");
        a.setNota1(sc.nextDouble());
        System.out.println("Digite sua nota da P2: ");
        a.setNota2(sc.nextDouble());

        if (a.calcularMedia() < 6) {
            System.out.println("Você está de exame!!");
            System.out.println("Digite sua nota de Exame: ");
            a.setNotaReavaliacao(sc.nextDouble());
        }

        Banco b = new Banco();
        b.salvarNoBanco(a);
        a.exibir();
        sc.close();
    }
}
