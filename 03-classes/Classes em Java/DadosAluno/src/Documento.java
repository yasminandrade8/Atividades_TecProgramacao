//Objetivo: Ler os dados de um Aluno, utilizando classe e 2 métodos

import java.util.Scanner;

public class Documento {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        
        System.out.println("Digite seu RA: ");
        a.RA = sc.nextLine();
        System.out.println("Digite seu nome: ");
        a.nome = sc.nextLine();
        System.out.println("Digite seu endereço: ");
        a.endereco = sc.nextLine();
        System.out.println("Digite seu curso: ");
        a.curso = sc.nextLine();


        a.exibirDados();
        a.exibirDiciplinas();
        sc.close();
    }
}
