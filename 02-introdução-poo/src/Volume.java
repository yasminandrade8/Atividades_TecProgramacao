//Objetivo: Calcular o volume de uma lata de óleo.

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        double r;
        System.out.println("Altura: ");
        a = sc.nextInt();
        System.out.println("Raio: ");
        r = sc.nextDouble();

        double v = 3.14159 * (r * r) * a;

        System.out.println("O volume é: " + v);
        sc.close();
    }
}
