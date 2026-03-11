//Objetivo: Criar uma coleção com 10 elementos, após a inserção mostrar o vetor.

public class DezElementoss {
    public static void main(String[] args) throws Exception {
        int [] elemento = new int[10];

        for (int i = 0; i < 10; i++) {
            elemento[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + elemento[i]);
        }
    }
}
