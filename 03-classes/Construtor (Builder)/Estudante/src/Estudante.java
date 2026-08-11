public class Estudante {
    private String nome;
    private int idade;
    private double media;

    public Estudante(String nome, int idade, double media) {
        this.nome = nome;
        this.idade = idade;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    
    public void exibir() {
        System.out.println("Nome do aluno: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Média: " + getMedia());
    }
    public void calcularMedia() {
        if(this.media >= 7) {
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado.");
        }
    }
}
