//Objetivo: O programa receberá 2 números e terá que apresentar a multiplicação de ambos.

import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b, x;
        System.out.println("Primeiro número: ");
        a = sc.nextInt();
        System.out.println("Segundo número: ");
        b = sc.nextInt();
        
        x = a * b;

        System.out.println("O resultado é " + x);
        sc.close();
    }
}
