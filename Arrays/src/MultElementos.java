//Objetivo: Criar duas coleções (A e B) com 10 elementos, sendo B a multiplicação 
//          por 2 dos vetores de A. Após a inserção mostrar o vetor.

public class MultElementos {
    public static void main(String[] args) {
        int [] a = new int[10];
        int [] b = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
            b[i] = a[i] * 2;
        }

        System.out.println("COLEÇÃO A \t\t COLEÇÃO B");
        for(int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + a[i] + "\t\t" + "Posição " + i + ": " + b[i]);
        }
    }
}
