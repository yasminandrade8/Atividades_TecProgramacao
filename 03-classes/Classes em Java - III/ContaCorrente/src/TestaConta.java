//Objetivo: Criar um sistema que recebe dados de contas correntes 
//          e imprima esses dados + os depositos e saques.

import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ContaCorrente[] contas = new ContaCorrente[3];
        
        for (int i = 0; i < contas.length; i++) {
            contas[i] = new ContaCorrente();
            System.out.println("Titular: ");
            contas[i].setNome(sc.nextLine());

            System.out.println("N° da conta: ");
            contas[i].setNumConta(sc.nextInt());
            sc.nextLine();

            System.out.println("A conta é conjunta? (Sim/Nao): ");
            contas[i].setFlag(sc.nextLine());

            System.out.println("Saldo: ");
            contas[i].setSaldo(sc.nextDouble());
            sc.nextLine();

            System.out.println("Sexo: ");
            contas[i].setSexo(sc.nextLine());

            System.out.println("Idade: ");
            contas[i].setIdade(sc.nextInt());

            sc.nextLine();
            System.out.println();
        }

        System.out.println("Deseja Sacar? ");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Em qual conta deseja sacar? (0, 1 ou 2): ");
            int indice = sc.nextInt();
            
            if (indice >= 0 && indice < contas.length) {
                System.out.println("Valor do saque: ");
                double vlr = sc.nextDouble();

                contas[indice].saque(vlr, contas);
            }else {
                System.out.println("Índice da conta inválido!");
            }
            sc.nextLine();
        }
        System.out.println("Deseja Depositar? ");
        String resp = sc.nextLine();

        if (resp.equalsIgnoreCase("Sim")) {
            System.out.println("Em qual conta deseja depositar? (0, 1 ou 2): ");
            int indice = sc.nextInt();
            
            if (indice >= 0 && indice < contas.length) {
                System.out.println("Valor do deposito: ");
                double v = sc.nextDouble();

                contas[indice].deposito(v, contas);
            }else {
                System.out.println("Índice da conta inválido!");
            }
            sc.nextLine();
        }
        sc.close();   
    }
}
