//Objetivo: Converter graus Celcius em graus Fahrenheit.

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("Celcius: ");
        c = sc.nextInt();

        int f = (9 * c + 160) / 5;

        System.out.println("Fahrenheit: " + f);
        sc.close();
    }
}
