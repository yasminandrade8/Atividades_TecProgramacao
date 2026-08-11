//Objetivo: Ler os dados de um funcionário. Em seguida exibir esses dados (nome e salário líquido), 
//             depois fazer um aumento do salario baseado em uma porcentagem.

import java.util.Scanner;

public class InformacaoFuncionario {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("Funcionario: ");
        f.nome = sc.nextLine();
        System.out.println("Digite seu salario bruto: ");
        f.salarioBruto = sc.nextDouble();
        System.out.println("Digite o desconto: ");
        f.desconto = sc.nextDouble();
        
        sc.nextLine();

        System.out.println("Aumentar salario? ");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Deseja aumentar o salário em qual porcentagem? ");
            double vlr = sc.nextDouble();
            f.aumentarSalario(vlr);
        }

        f.exibir();
        f.exibirDados();
        sc.close();
    }
}