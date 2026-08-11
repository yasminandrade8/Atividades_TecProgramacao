//Objetivo: Apresentar um valor de conversão de graus Celcius em Fahrenheit, de 10 em 10 graus,
//          iniciando a contagem em 10 graus Celscius e finalizando em 100 graus Celcius.

import java.util.Scanner;

public class Graus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("   CELSIUS    |    FAHRENHEIT    ");
        
        for (int c = 10; c<= 100; c += 10) {
            double f =  (9.0 * c + 160.0) / 5;  

            System.out.printf("     %3d°C    |      %.1f°F%n", c, f);
        }
        sc.close();
    }
}
