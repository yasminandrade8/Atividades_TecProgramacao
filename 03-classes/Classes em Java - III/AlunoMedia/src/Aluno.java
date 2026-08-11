public class Aluno {
    private String nome, matricula;
    private double nota1, nota2, notaReavaliacao;

    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNotaReavaliacao() {
        return notaReavaliacao;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;    
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNotaReavaliacao(double notaReavaliacao) {
        this.notaReavaliacao = notaReavaliacao;
    }


    public double calcularMedia() {
        return (nota1 + nota2) / 2; 
    }
    
    public double calcularMediaFinal() {
        if (calcularMedia() >= 6) {
            return calcularMedia();
        } else {
            return (calcularMedia() + notaReavaliacao) / 2;
        }
    }

    public String status() {
        if (calcularMediaFinal() >= 6) {
            return "Aprovado";
        } else {
           return "Reprovado";
        }
    }

    public void exibir() {
        System.out.println("Nome do aluno: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nota P1: " + getNota1());
        System.out.println("Nota P2: " + getNota2());
        System.out.printf("Media Final: %.2f %n" , calcularMediaFinal());
    }
}
