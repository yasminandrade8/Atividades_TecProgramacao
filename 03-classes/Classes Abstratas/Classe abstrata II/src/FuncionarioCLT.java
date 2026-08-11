public class FuncionarioCLT extends Funcionario {
    private double salarioM;
    private int diasTrabalhados;

    public FuncionarioCLT(String nome, String matricula, double salarioM, int diasTrabalados) {
        super(nome, matricula);
        this.salarioM = salarioM;
        this.diasTrabalhados = diasTrabalados;
    }
    @Override
    public double calcularSalario() {
        return (salarioM / 30) * diasTrabalhados;
    }

    public void exibir() {
        System.out.println("** Funcionário CLT **");
        System.out.println("Nome: %s \nMatricula: %s \nSalário Mensal: %.2f \nDias Trabalhados: %d \nSalário Fixo: %.2f"
            .formatted(getNome(), getMatricula(), getSalarioM(), getDiasTrabalhados(), calcularSalario())
        );
    }
    
    public void setSalarioM(double salarioM) {
        this.salarioM = salarioM;
    }
    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public double getSalarioM() {
        return salarioM;
    }
    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }
}
