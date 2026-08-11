public class TestaLivro {
    public static void main(String[] args) throws Exception {
        Livro l = new Livro("Frankstein", "Mary Shelley", 1818);

        System.out.println("Livro: " + l.getTitulo());
        System.out.println("Autor: " + l.getAutor());
        System.out.println("Ano de publicação: " + l.getAno());

    }
}
