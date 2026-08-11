public class Aluno {
    private String nome;
    private double nota1, nota2, nota3, m1, m2, m3;

    public void Notas(float n1, float n2, float n3) {
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }

    public void calcularM1() {
        m1 = (this.nota1 * 30) / 30;
    }
    public void calcularM2() {
        m2 = (this.nota2 * 35) / 35;
    }
    public void calcularM3() {
        m3 = (this.nota3 * 35) / 35;
    }

    public String getNome() {
        return nome;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNota3() {
        return nota3;
    }

    public void setNome(String n) {
        this.nome = n;
    }
    public void setNota1(double n1) {
        this.nota1 = n1;
    }
    public void setNota2(double n2) {
        this.nota2 = n2;
    }
    public void setNota3(double n3) {
        this.nota3 = n3;
    }

    public double notaFinal() {
        return this.m1 + this.m2 + this.m3;
    }
}
