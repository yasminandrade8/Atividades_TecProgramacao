public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro() {}

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAno() {
        return ano;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }

    public void Exibir() {
        System.out.println("Livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de lançamento: " + getAno());
    }
}
