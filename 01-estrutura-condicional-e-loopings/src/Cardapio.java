//Objetivo: Ler o código do pedido, a quantidade e calcular o valor a ser pago por aquele lanche.

import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do seu pedido separados por vírgula: ");
        String entrada = sc.nextLine();

        System.out.println("Digite a quantidade do seu pedido: ");
        int qtd = sc.nextInt();

        double total = 0;
        for (String pedido : entrada.split(",")) {
            int codigo = Integer.parseInt(pedido.trim());
            double preco = 0;
            String item = "";
                
            if (codigo == 100) {
                preco = 1.20;
                item = "Cachorro quente";

            } else if (codigo == 101) {
                preco = 1.30;
                item = "Bauru simples";

            } else if (codigo == 102) {
                preco = 1.50;
                item = "Bauru com ovo";

            } else if (codigo == 103) {
                preco = 1.20;
                item = "Hambúrger";

            } else if (codigo == 104) {
                preco = 1.30;
                item = "Cheeseburguer";

            } else if (codigo == 105) {
                preco = 1.00;
                item = "Refrigerante";
            }

            if (preco > 0) {
                double subtotal = preco * qtd;
                total += subtotal;
                System.out.printf("Pedido: %s | Subtotal: R$ %.2f%n", item, subtotal);
            } else {
                System.out.println("O código " + codigo + " não está no nosso cardápio de hoje!");
            }
        }
        System.out.printf("%nTotal do pedido: R$ %.2f ", total);
        sc.close();
    }
}
