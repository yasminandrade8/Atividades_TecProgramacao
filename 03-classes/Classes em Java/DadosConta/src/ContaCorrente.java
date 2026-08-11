//Objetivo: Ler os dados de um conta corrente, utilizando classes e 2 métodos 

import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Conta c = new Conta();
        
        System.out.println("Digite o número da sua conta: ");
        c.num = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu nome:");
        c.nome = sc.nextLine();
        System.out.println("Digite seu CPF:");
        c.cpf = sc.nextLine();
        System.out.println("Digite seu saldo:");
        c.saldo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Deseja depositar?");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Quanto deseja depositar?");
            double vlr = sc.nextDouble();
            c.dpositar(vlr);
        }
        
        c.exibirDados();
        sc.close();
    }
}
