//Objetivo: Calcular a área de uma circunferência.

import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println("Raio da circunferência: ");
        r = sc.nextDouble();
        
        double a = 3.14159 * (r * r);

        System.out.println("A área da circunferência é: " + a);
        sc.close();    
    }
}
