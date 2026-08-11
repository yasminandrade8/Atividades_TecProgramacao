import java.util.Scanner;

public class TestaLivro {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Livro l = new Livro();

        System.out.println("Nome do livro: ");
        l.setTitulo(sc.nextLine());
        System.out.println("Autor: ");
        l.setAutor(sc.nextLine());
        System.out.println("Ano de lançamento: ");
        l.setAno(sc.nextInt());

        l.Exibir();
        sc.close();
    }
}
