//Objetivo: Converter graus Fahrenheit em graus Celcius.

import java.util.Scanner;

public class Celcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f;
        System.out.println("Fahrenheit: ");
        f = sc.nextDouble();

        double c = 5.0 / 9.0 * (f - 32);

        System.out.println("Celcius: " + c);
        sc.close();
    } 
}
