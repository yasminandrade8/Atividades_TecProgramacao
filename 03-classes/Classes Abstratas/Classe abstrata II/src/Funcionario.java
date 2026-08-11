public abstract class Funcionario {
    protected String nome, matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public abstract double calcularSalario();
    public abstract void exibir();
    
    public void setNome(String nome) {
        this.nome  = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
}
